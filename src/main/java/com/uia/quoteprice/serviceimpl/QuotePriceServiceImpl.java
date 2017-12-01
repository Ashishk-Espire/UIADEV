package com.uia.quoteprice.serviceimpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.uia.component.UIAReferenceDataMapper;
import com.uia.iwounder.dto.GetQuote;
import com.uia.quoteprice.service.QuotePriceService;

public class QuotePriceServiceImpl implements QuotePriceService {
	Logger logger = LogManager.getLogger(QuotePriceServiceImpl.class);

	@Override
	public Object getQuote(GetQuote getQuote) throws JSONException {
		// TODO Auto-generated method stub
		logger.info("The property type is " +getQuote.getArg0().getObject().getPropType());
		
		/*JSONArray jsonArr = null;
		JSONObject jsonObj = new JSONObject();
		//jsonObj.append("propType", getQuote.getArg0().getObject().getPropType());
		jsonObj.accumulate("propType", getQuote.getArg0().getObject().getPropType()); 
		jsonObj.put("wallType", getQuote.getArg0().getObject().getWallType());
		return jsonObj.toString();*/
		
		return getQuote;
	}

}
