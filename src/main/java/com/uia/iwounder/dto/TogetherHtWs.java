
package com.uia.iwounder.dto;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TogetherHtWs", targetNamespace = "http://ws.together.co.uk/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TogetherHtWs {


    /**
     * 
     * @param arg0
     * @return
     *     returns com.uia.iwounder.dto.TogetherHtQuoteResponse
     * @throws WsException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getQuote", targetNamespace = "http://ws.together.co.uk/", className = "com.uia.iwounder.dto.GetQuote")
    @ResponseWrapper(localName = "getQuoteResponse", targetNamespace = "http://ws.together.co.uk/", className = "com.uia.iwounder.dto.GetQuoteResponse")
    public TogetherHtQuoteResponse getQuote(
        @WebParam(name = "arg0", targetNamespace = "")
        TogetherHtQuoteData arg0)
        throws WsException
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns com.uia.iwounder.dto.TogetherHtBestPriceResponse
     * @throws WsException
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "setBestPrice", targetNamespace = "http://ws.together.co.uk/", className = "com.uia.iwounder.dto.SetBestPrice")
    @ResponseWrapper(localName = "setBestPriceResponse", targetNamespace = "http://ws.together.co.uk/", className = "com.uia.iwounder.dto.SetBestPriceResponse")
    public TogetherHtBestPriceResponse setBestPrice(
        @WebParam(name = "arg0", targetNamespace = "")
        TogetherHtBestPrice arg0)
        throws WsException
    ;

}
