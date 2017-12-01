package com.uia.component;

import java.util.List;

import org.codehaus.jettison.json.JSONObject;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

public class AddressComponent implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		// TODO Auto-generated method stub

		//JSONArray jsonArr = null;
		//JSONObject jsonObj = null;
		JSONObject newjsonObj = new JSONObject();

		String jsonString;

		MuleMessage muelMessage = eventContext.getMessage();

		Object payloadObj = muelMessage.getPayload();

		

		List objList = (java.util.ArrayList) payloadObj;

		for (Object object : objList) {
			jsonString = object.toString();
			jsonString = jsonString.replace("{", "").replace("}", "").replace("\"", "");
			if (jsonString.length() > 0) {
				String[] jsonWords = jsonString.split(",");

				for (String jsonWord : jsonWords) {
					String[] words = jsonWord.split(":");
					if (null != words && words.length >= 2) {
						newjsonObj.put(words[0], words[1]);
					}
				}

			}
		}
		
		/*
		if(null == newjsonObj.get("RMSUBBUILDINGNAME")){
			newjsonObj.put("RMSUBBUILDINGNAME", "null");
		}
		
		if(null == newjsonObj.get("RMBUILDINGNAME")){
			newjsonObj.put("RMBUILDINGNAME", "null");
		}
		
		if(null == newjsonObj.get("RMBUILDINGNUMBER")){
			newjsonObj.put("RMBUILDINGNUMBER", "null");
		}
		
		if(null == newjsonObj.get("RMTHOROUGHFARE")){
			newjsonObj.put("RMTHOROUGHFARE", "null");
		}
		
		if(null == newjsonObj.get("RMDOUBLEDEPENDENTLOCALITY")){
			newjsonObj.put("RMDOUBLEDEPENDENTLOCALITY", "null");
		}
		
		if(null == newjsonObj.get("RMDEPENDENTLOCALITY")){
			newjsonObj.put("RMDEPENDENTLOCALITY", "null");
		}
		
		if(null == newjsonObj.get("POSTCODE")){
			newjsonObj.put("POSTCODE", "null");
		}
		
		if(null == newjsonObj.get("UPRN")){
			newjsonObj.put("UPRN", "null");
		} 
		
		*/

		return newjsonObj.toString();
	}

}
