package com.uia.component;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;
import org.mule.api.transport.PropertyScope;

public class UPRNValidationComponent implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub
		MuleMessage muleMessage = eventContext.getMessage();
		String payload = muleMessage.getPayloadAsString();
		
		JSONObject jsonObject = null;
		JSONObject result = null;
		JSONArray referrals = null;
		JSONArray declines = null;
		JSONArray endorsements = null;
		
		boolean uprnValidationError = false;
		String errorMessage = "";
		
		if(null!=payload){
			
			jsonObject = new JSONObject(payload);

			if (null != jsonObject) {
				result = jsonObject.getJSONObject("result");
			}

			if (null != result) {
				//logger.info("results " + result.toString());
				referrals = (JSONArray) result.get("referrals");
				declines = (JSONArray) result.get("declines");
				endorsements = (JSONArray) result.get("endorsements");

				if (null != declines && declines.length() > 0) {
					uprnValidationError = true;
					errorMessage = "validation faliled due to declines";
				}
				if (null != referrals && referrals.length() > 0) {
					uprnValidationError = true;
					errorMessage = "validation faliled due to referrals";
				}
				if (null != endorsements && endorsements.length() > 0) {
					uprnValidationError = true;
					errorMessage = "validation faliled due to endorsements";
				}
			}
			
		}
		
		//uprnValidationError = true;
		
		if(uprnValidationError){
			muleMessage.setProperty("PROCEED", "NOT", PropertyScope.SESSION);
		} else{
			muleMessage.setProperty("PROCEED", "YES", PropertyScope.SESSION);
		}
		
		
		
		return muleMessage;
	}

}
