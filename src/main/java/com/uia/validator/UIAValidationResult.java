package com.uia.validator;

import org.mule.extension.validation.api.ValidationResult;

public class UIAValidationResult implements ValidationResult {
	
	private String errorMessage = null;
	private Boolean isError = false;

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return errorMessage;
	}

	@Override
	public boolean isError() {
		// TODO Auto-generated method stub
		return isError;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getIsError() {
		return isError;
	}

	public void setIsError(Boolean isError) {
		this.isError = isError;
	}
	
	

}
