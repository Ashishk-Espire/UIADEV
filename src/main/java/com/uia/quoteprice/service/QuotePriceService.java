package com.uia.quoteprice.service;

import javax.jws.WebService;

import org.codehaus.jettison.json.JSONException;

import com.uia.iwounder.dto.GetQuote;

@WebService
public interface QuotePriceService {
	public Object getQuote(GetQuote getQuote)  throws JSONException;
}
