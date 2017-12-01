import groovy.json.*

String response = payload.text;
message.setInvocationProperty('result' ,'fail');

if(response.startsWith("{")){
//Convert response to Json object
    def jsonData = new JsonSlurper().parseText(response);
	if (jsonData.result.referrals.empty && jsonData.result.declines.empty && jsonData.result.endorsements.empty){
		message.setInvocationProperty('result' ,'success');
	}
}else{
log.error("Response Received at - [" +paletteName+ "] : " +response);
}

//reset payload as initial request
payload = flowVars['request'];
