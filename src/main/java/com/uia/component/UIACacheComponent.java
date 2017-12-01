package com.uia.component;

import java.io.Serializable;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class UIACacheComponent implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String referenceDataCache = "NOTDONE";

	private String lovsData;

	private String referenceData;

	private String wsData;
	
	private String brandData;
	
	private final String ID = "id";
	private final String DESCRIPTION = "description";
	
	private final String LOVS_DATA = "LOVS_DATA";
	private final String REF_DATA = "REF_DATA";
	private final String WS_DATA = "WS_DATA";
	private final String BRAND_DATA = "BRAND_DATA";

	public String getReferenceDataCache() {
		return referenceDataCache;
	}

	public void setReferenceDataCache(String referenceDataCache) {
		this.referenceDataCache = referenceDataCache;
	}

	public String getLovsData() {
		return lovsData;
	}

	public void setLovsData(String lovsData) {
		this.lovsData = lovsData;
	}

	public String getReferenceData() {
		return referenceData;
	}

	public void setReferenceData(String referenceData) {
		this.referenceData = referenceData;
	}

	public String getWsData() {
		return wsData;
	}

	public void setWsData(String wsData) {
		this.wsData = wsData;
	}
	
	public String getBrandData() {
		return brandData;
	}

	public void setBrandData(String brandData) {
		this.brandData = brandData;
	}

	public String getId(String keyType, String key, String description) throws JSONException {
		String payload = getLovsData();
		switch(keyType){
		case LOVS_DATA :
			payload = getLovsData();
			break;
		case WS_DATA :
			payload = getWsData();
			break;
		case REF_DATA :
			payload = getReferenceData();
			break;
		case BRAND_DATA : 
			payload = getBrandData();
			break;
		default :
			payload = getLovsData();
		 
		}
		//logger.info("comming into getLovsData " +keyType + " : " +key + " : "+description + " : "+payload);
		String id = "";
		JSONArray jsonArr1 = null;
		JSONArray jsonArr2 = null;
		JSONObject jsonObj1 = null;
		jsonArr1 = new JSONArray(payload);
		if (null != jsonArr1 && jsonArr1.length() > 0) {
			JSONObject jsonObj2 = null;
			for (int i = 0; i < jsonArr1.length(); i++) {
				jsonObj2 = jsonArr1.getJSONObject(i);
				if (jsonObj2.has(key)) {
					jsonObj1 = jsonObj2;
					//logger.info("caught the json" + jsonObj1.toString());
					break;

				}
			}
		} 
		
		if(null!= jsonObj1){
			jsonArr2 = jsonObj1.getJSONArray(key);
			//logger.info("caught the json got array" + jsonArr2.toString());
			JSONObject jsonObj3 = null;
			for (int i = 0; i < jsonArr2.length(); i++) {
				jsonObj3 = jsonArr2.getJSONObject(i);
				//logger.info("jsonObj3 is "+jsonObj3.toString());
				if (jsonObj3.getString(DESCRIPTION).equalsIgnoreCase(description)) {
					id = jsonObj3.getString(ID);
					//logger.info("description id is " + id);
					break;
				}
			}
		}

		return id;
	}

}
