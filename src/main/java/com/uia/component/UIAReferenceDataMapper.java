package com.uia.component;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONObject;
import org.mule.api.MuleEventContext;
import org.mule.api.MuleMessage;
import org.mule.api.lifecycle.Callable;

public class UIAReferenceDataMapper implements Callable {

	private final String UIACACHEBEAN = "uiaCacheBean";
	private final String QUOTE_KEY = "quoteKey";
	private final String QUOTE_VALUE = "quoteValue";
	private final String QUOTE_ARRAY = "quoteArray";

	private final String ID = "id";
	private final String DESCRIPTION = "description";
	
	
	
	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {

		JSONArray jsonArr = null;
		String payload = "";
		String quoteArray = null;
		Logger logger = LogManager.getLogger(UIAReferenceDataMapper.class);

		MuleMessage muelMessage = eventContext.getMessage();
		String quoteKey = muelMessage.getInvocationProperty(QUOTE_KEY);
		String quoteValue = muelMessage.getInvocationProperty(QUOTE_VALUE);

		if (null != muelMessage.getInvocationProperty(QUOTE_ARRAY)) {
			quoteArray = muelMessage.getInvocationProperty(QUOTE_ARRAY).toString();
		}

		 logger.info("In UIADataWeaveMapper quoteKey: -----" +
		 quoteKey);
		 logger.info("In UIADataWeaveMapper quoteValue: -----" +
		 quoteValue);
		 logger.info("In UIADataWeaveMapper quoteArray: -----" +
		 quoteArray);

		if (null != quoteKey && null != quoteValue && null != quoteArray) {

			jsonArr = new JSONArray(quoteArray);
			
			logger.info("in gettitn main data jsonArr "+jsonArr.toString());

			for (int i = 0; i < jsonArr.length(); i++) {
				JSONObject jsonObj = jsonArr.getJSONObject(i);
				
				logger.info("in gettitn main data jsonObj "+jsonObj.toString());

				if (jsonObj.getString(DESCRIPTION).equalsIgnoreCase(quoteValue)) {
					payload = jsonObj.getString(ID);
				}

				// logger.info(jsonObj);
			}
		}

		muelMessage.setPayload(payload);
		return muelMessage;

	}
	

	/*@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {

		JSONArray jsonArr = null;
		String payload = "";
		String quoteArray = null;


		MuleMessage muelMessage = eventContext.getMessage();
		String quoteKey = muelMessage.getInvocationProperty(QUOTE_KEY);
		String quoteValue = muelMessage.getInvocationProperty(QUOTE_VALUE);

		if (null != muelMessage.getInvocationProperty(QUOTE_ARRAY)) {
			quoteArray = muelMessage.getInvocationProperty(QUOTE_ARRAY).toString();
		}

		 logger.info("In UIADataWeaveMapper quoteKey: -----" +
		 quoteKey);
		 logger.info("In UIADataWeaveMapper quoteValue: -----" +
		 quoteValue);
		 logger.info("In UIADataWeaveMapper quoteArray: -----" +
		 quoteArray);

		if (null != quoteKey && null != quoteValue && null != quoteArray) {

			jsonArr = new JSONArray(quoteArray);

			for (int i = 0; i < jsonArr.length(); i++) {
				JSONObject jsonObj = jsonArr.getJSONObject(i);
				
				logger.info("in gettitn main data "+jsonObj.toString());

				if (jsonObj.getString(DESCRIPTION).equalsIgnoreCase(quoteValue)) {
					payload = jsonObj.getString(ID);
				}

				// logger.info(jsonObj);
			}
		}

		muelMessage.setPayload(payload);
		return muelMessage;

	}*/

}
