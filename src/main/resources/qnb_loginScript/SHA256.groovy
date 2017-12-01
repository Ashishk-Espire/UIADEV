import java.security.MessageDigest;

String password = inputpassword;


//String randomString = getRandomString(5)

// Set this in a flow variable and later dump in the database

//password = password + randomString ;

byte[] passwordBytes =  getSha256(password);

String hexencoded =  encodeHex( passwordBytes)

return hexencoded;

public byte[] getSha256(String password){
   MessageDigest md = MessageDigest.getInstance("SHA-256");
   md.update(password.getBytes());

   byte[] passwordBytes=md.digest();
   return  passwordBytes;
}

public String encodeHex(byte[] passwordBytes){
  StringBuffer sb = new StringBuffer();

  for(byte b:passwordBytes){

  String hex=Integer.toHexString(0xff & b);
   if(hex.length()==1) sb.append('0');
   sb.append(hex)
  } 
  return sb.toString();
}

public String getRandomString(int length){

  char[] letterArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();

  StringBuffer random = new StringBuffer();                     

  for(int i=0;i<length;i++){
    int rand = (Math.random()*64);
    random.append(letterArray[rand]);
  }
 
 return random.toString(); 
}