package com.uia.component;

import org.codehaus.jettison.json.JSONArray;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;


public class RetriveQuoteAgg implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		MuleMessage message = eventContext.getMessage();
		String payload;
		String newPayload = "{}";
		try {
			payload = message.getPayloadAsString();

			JSONArray jsonArr = new JSONArray(payload);
			
			if(null!=jsonArr && jsonArr.length()>0) {
				newPayload = jsonArr.get(0).toString();
				
			}

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return newPayload;
	}

}
