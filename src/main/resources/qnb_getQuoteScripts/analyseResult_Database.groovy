import groovy.json.*

String response = payload.get("fncResult").toString();

log.info("incoming payload "+response);
message.setInvocationProperty('result' ,'fail');

if(response.startsWith("{")){
//Convert response to Json object
    def jsonData = new JsonSlurper().parseText(response);
	if (jsonData.result.policy.policy_no != null){
		message.setInvocationProperty('result' ,'success');
		message.setInvocationProperty('policyNumber' ,jsonData.result.policy.policy_no);
	}
}else{
log.error("Response Received at - [" +paletteName+ "] : " +response);
}
