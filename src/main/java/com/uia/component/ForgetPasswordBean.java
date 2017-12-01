package com.uia.component;

import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.context.annotation.Scope;

@Scope("singleton")
public class ForgetPasswordBean implements Serializable {
	
	private static String SUCCESS = "SUCCESS";
	private static String FAILURE = "FAILURE";
	private static long passwordExpireMinute = 10l;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Map<String, Long> passwordTokenMap = new ConcurrentHashMap<String, Long>();
	private Map<String, String> passwordEmailMap = new ConcurrentHashMap<String, String>();

	public Map<String, Long> getPasswordTokenMap() {
		return this.passwordTokenMap;
	}

	public void setPasswordTokenMap(Map<String, Long> passwordTokenMap) {
		this.passwordTokenMap = passwordTokenMap;
	}

	public Map<String, String> getPasswordEmailMap() {
		return passwordEmailMap;
	}

	public void setPasswordEmailMap(Map<String, String> passwordEmailMap) {
		this.passwordEmailMap = passwordEmailMap;
	}

	public void populatePasswordTokenMap(String token, String email) {
		getPasswordTokenMap().put(token, java.lang.System.currentTimeMillis());
		getPasswordEmailMap().put(token,email);

		/*System.out
				.println("size of getPasswordTokenMap and entryset " + getPasswordTokenMap().size() + ": " + getPasswordTokenMap().entrySet());
		System.out
		.println("size of getPasswordEmailMap and entryset " + getPasswordEmailMap().size() + ": " + getPasswordEmailMap().entrySet());*/
	}
	
	public String validatePasswordToken(String passwordToken, String email) throws JSONException{
		//logger.info("in passwordToken passwordToken and email" + passwordToken +" : " +email);
		JSONObject resultMessage =  new JSONObject();
		StringBuilder resultStatus = new StringBuilder();
		StringBuilder timedifferenceResultMessage = new StringBuilder();
		StringBuilder emailResultMessage = new StringBuilder();
		
		long timeDifference = calculateTimeDifferenceInMinute(passwordToken);
		boolean validEmail = validateTokenWithEmail(passwordToken,email);
		
		if(timeDifference > passwordExpireMinute){
			timedifferenceResultMessage.append("Password Token has been expired, you need to reset password wethin 10 minute of token generation; ");
			resultStatus.append(FAILURE);
		} else {
			timedifferenceResultMessage.append("Password Token is live; ");
			resultStatus.append(SUCCESS);
		}
		
		if(validEmail == false){
			emailResultMessage.append("Password Token not matching with Username (Email)");
			resultStatus.delete(0, resultStatus.length());
			resultStatus.append(FAILURE);
		} else {
			timedifferenceResultMessage.append("Valid Username (Email)");
		}
		
		resultMessage.append("result_status", resultStatus.toString());
		resultMessage.append("result_message", timedifferenceResultMessage.append(" : ").append(emailResultMessage));
		
		//logger.info("The validatetoken result "+resultMessage.toString());
		return resultMessage.toString().replace("[", "").replace("]", "");
	}

	public long calculateTimeDifferenceInMinute(String passwordToken) {
		//logger.info("passwordToken " + passwordToken);
		long minute = passwordExpireMinute+1;

		if (null != passwordToken && null != passwordTokenMap && null != passwordTokenMap.get(passwordToken)) {
			long passwordTokenGenerationtime = passwordTokenMap.get(passwordToken);
			long currentMillisecond = java.lang.System.currentTimeMillis();
			if (passwordTokenGenerationtime > 0) {
				long timeDifference = currentMillisecond - passwordTokenGenerationtime;
				long second = timeDifference / 1000;
				minute = second / 60;
			}
		}
		//logger.info("minute " + minute);
		return minute;
	}
	
	public boolean validateTokenWithEmail(String passwordToken, String email){
		//logger.info("in validateTokenWithEmail passwordToken and email" + passwordToken +" : " +email);
		
		boolean validEmail = false;
		
		if (null != passwordToken && null != passwordEmailMap && null != passwordEmailMap.get(passwordToken)) {
			String toeknEmail = passwordEmailMap.get(passwordToken);
			//logger.info("token email" + passwordToken +" : " +toeknEmail);
			if (null!=email && null!=toeknEmail && email.equals(toeknEmail)) {
				validEmail = true;
			}
		}
		//logger.info("validEmail" + validEmail);
		return validEmail;
	}

	@Override
	public String toString() {
		return "ForgetPasswordBean [passwordTokenMap=" + passwordTokenMap + "]";
	}

	
}
