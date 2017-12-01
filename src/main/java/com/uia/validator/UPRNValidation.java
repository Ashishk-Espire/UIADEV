package com.uia.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.MuleMessage;
import org.mule.api.transport.PropertyScope;
import org.mule.extension.validation.api.ValidationResult;
import org.mule.extension.validation.api.Validator;

import com.uia.quoteprice.serviceimpl.QuotePriceServiceImpl;

public class UPRNValidation implements Validator {
	private static int countObj = 0;
	
	Logger logger = LogManager.getLogger(UPRNValidation.class);

	public UPRNValidation() {
		countObj++;
		logger.info(
				"Number of UPRNValidation objects : thread id " + countObj + ":" + Thread.currentThread().getId());
	}

	@Override
	public synchronized ValidationResult validate(MuleEvent event) {
		// TODO Auto-generated method stub

		UIAValidationResult validationResult = new UIAValidationResult();

		String errorMessage = null;
		boolean isError = false;

		JSONObject jsonObject = null;
		JSONObject result = null;
		JSONArray referrals = null;
		JSONArray declines = null;
		JSONArray endorsements = null;
		String payload = null;

		try {
			payload = event.getMessageAsString();
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
					isError = true;
					errorMessage = "validation faliled due to declines";
				}
				if (null != referrals && referrals.length() > 0) {
					isError = true;
					errorMessage = "validation faliled due to referrals";
				}
				if (null != endorsements && endorsements.length() > 0) {
					isError = true;
					errorMessage = "validation faliled due to endorsements";
				}
			}
			
			isError = true;
			errorMessage += " " + payload;
			validationResult.setIsError(isError);
			validationResult.setErrorMessage("{ 'errorMessage' : {"+payload + "}");

			event.setStopFurtherProcessing(true);

			MuleMessage message = event.getMessage();
			Object payLoad = message.getPayload();

			// String sessionVar = message.getProperty("PROCEED",
			// PropertyScope.SESSION);
			message.setProperty("PROCEED", "NOT", PropertyScope.SESSION);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		catch (MuleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		return validationResult;
	}

}
