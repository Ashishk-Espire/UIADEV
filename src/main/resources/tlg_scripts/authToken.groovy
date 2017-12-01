import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import groovy.json.*;

/* This block of code generates the authentication code , which will be used in the SOAP request.*/

String payloadText = payload; // Keeping original payload in a variable .
def transactionNumber;

if("payload".equals(lookIn)){
	def jsonData = new JsonSlurper().parseText(payloadText);
 	transactionNumber = jsonData.transNo;
}
else if("flowVar".equals(lookIn)){
	transactionNumber = transNo;
}

byte[] secretKey = hmacKey.getBytes();

Mac sha256_HMAC =Mac.getInstance("HmacSHA256");
SecretKeySpec secret_key = new SecretKeySpec(secretKey, sha256_HMAC.getAlgorithm());
sha256_HMAC.init(secret_key);
String authFields = enterpriseID + clientID + transactionNumber; // enterpriseID , clientID and secret_key are populated by script variables using property files.


byte[] authToken= sha256_HMAC.doFinal(authFields.getBytes("UTF-8"));
def authTokenString = encodeHex(authToken);
message.setInvocationProperty('authToken' ,authTokenString);

return payloadText;


//Method to return hexencoded value from array of bytes.
public String encodeHex(byte[] passwordBytes){
  StringBuffer sb = new StringBuffer();

  for(byte b:passwordBytes){

  String hex=Integer.toHexString(0xff & b);
   if(hex.length()==1) sb.append('0');
   sb.append(hex)
  } 
  return sb.toString();
}
