
package com.uia.iwounder.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.uia.iwounder.dto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SetBestPrice_QNAME = new QName("http://ws.together.co.uk/", "setBestPrice");
    private final static QName _SetBestPriceResponse_QNAME = new QName("http://ws.together.co.uk/", "setBestPriceResponse");
    private final static QName _GetQuoteResponse_QNAME = new QName("http://ws.together.co.uk/", "getQuoteResponse");
    private final static QName _String_QNAME = new QName("http://ws.together.co.uk/", "String");
    private final static QName _GetQuote_QNAME = new QName("http://ws.together.co.uk/", "getQuote");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.uia.iwounder.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetBestPriceResponse }
     * 
     */
    public SetBestPriceResponse createSetBestPriceResponse() {
        return new SetBestPriceResponse();
    }

    /**
     * Create an instance of {@link SetBestPrice }
     * 
     */
    public SetBestPrice createSetBestPrice() {
        return new SetBestPrice();
    }

    /**
     * Create an instance of {@link GetQuote }
     * 
     */
    public GetQuote createGetQuote() {
        return new GetQuote();
    }

    /**
     * Create an instance of {@link GetQuoteResponse }
     * 
     */
    public GetQuoteResponse createGetQuoteResponse() {
        return new GetQuoteResponse();
    }

    /**
     * Create an instance of {@link TogetherHtBestPrice }
     * 
     */
    public TogetherHtBestPrice createTogetherHtBestPrice() {
        return new TogetherHtBestPrice();
    }

    /**
     * Create an instance of {@link TogetherHtCycObjectWs }
     * 
     */
    public TogetherHtCycObjectWs createTogetherHtCycObjectWs() {
        return new TogetherHtCycObjectWs();
    }

    /**
     * Create an instance of {@link WsPreviousClaim }
     * 
     */
    public WsPreviousClaim createWsPreviousClaim() {
        return new WsPreviousClaim();
    }

    /**
     * Create an instance of {@link TogetherHtCustomerWs }
     * 
     */
    public TogetherHtCustomerWs createTogetherHtCustomerWs() {
        return new TogetherHtCustomerWs();
    }

    /**
     * Create an instance of {@link TogetherHtQuoteData }
     * 
     */
    public TogetherHtQuoteData createTogetherHtQuoteData() {
        return new TogetherHtQuoteData();
    }

    /**
     * Create an instance of {@link TogetherHtHomObjectWs }
     * 
     */
    public TogetherHtHomObjectWs createTogetherHtHomObjectWs() {
        return new TogetherHtHomObjectWs();
    }

    /**
     * Create an instance of {@link WsPreviousClaims }
     * 
     */
    public WsPreviousClaims createWsPreviousClaims() {
        return new WsPreviousClaims();
    }

    /**
     * Create an instance of {@link TogetherHtBestPriceResponse }
     * 
     */
    public TogetherHtBestPriceResponse createTogetherHtBestPriceResponse() {
        return new TogetherHtBestPriceResponse();
    }

    /**
     * Create an instance of {@link TogetherPedalCycle }
     * 
     */
    public TogetherPedalCycle createTogetherPedalCycle() {
        return new TogetherPedalCycle();
    }

    /**
     * Create an instance of {@link TogetherHtItmObjectWs }
     * 
     */
    public TogetherHtItmObjectWs createTogetherHtItmObjectWs() {
        return new TogetherHtItmObjectWs();
    }

    /**
     * Create an instance of {@link TogetherHtPrevClaObjectWs }
     * 
     */
    public TogetherHtPrevClaObjectWs createTogetherHtPrevClaObjectWs() {
        return new TogetherHtPrevClaObjectWs();
    }

    /**
     * Create an instance of {@link ArrayOfPedalCycles }
     * 
     */
    public ArrayOfPedalCycles createArrayOfPedalCycles() {
        return new ArrayOfPedalCycles();
    }

    /**
     * Create an instance of {@link TogetherHtTier }
     * 
     */
    public TogetherHtTier createTogetherHtTier() {
        return new TogetherHtTier();
    }

    /**
     * Create an instance of {@link TogetherSpecifiedItem }
     * 
     */
    public TogetherSpecifiedItem createTogetherSpecifiedItem() {
        return new TogetherSpecifiedItem();
    }

    /**
     * Create an instance of {@link ArrayOfSpecifiedItems }
     * 
     */
    public ArrayOfSpecifiedItems createArrayOfSpecifiedItems() {
        return new ArrayOfSpecifiedItems();
    }

    /**
     * Create an instance of {@link TogetherHtJointCustomerWs }
     * 
     */
    public TogetherHtJointCustomerWs createTogetherHtJointCustomerWs() {
        return new TogetherHtJointCustomerWs();
    }

    /**
     * Create an instance of {@link TogetherHtQuoteResponse }
     * 
     */
    public TogetherHtQuoteResponse createTogetherHtQuoteResponse() {
        return new TogetherHtQuoteResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBestPrice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.together.co.uk/", name = "setBestPrice")
    public JAXBElement<SetBestPrice> createSetBestPrice(SetBestPrice value) {
        return new JAXBElement<SetBestPrice>(_SetBestPrice_QNAME, SetBestPrice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetBestPriceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.together.co.uk/", name = "setBestPriceResponse")
    public JAXBElement<SetBestPriceResponse> createSetBestPriceResponse(SetBestPriceResponse value) {
        return new JAXBElement<SetBestPriceResponse>(_SetBestPriceResponse_QNAME, SetBestPriceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuoteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.together.co.uk/", name = "getQuoteResponse")
    public JAXBElement<GetQuoteResponse> createGetQuoteResponse(GetQuoteResponse value) {
        return new JAXBElement<GetQuoteResponse>(_GetQuoteResponse_QNAME, GetQuoteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.together.co.uk/", name = "String")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQuote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.together.co.uk/", name = "getQuote")
    public JAXBElement<GetQuote> createGetQuote(GetQuote value) {
        return new JAXBElement<GetQuote>(_GetQuote_QNAME, GetQuote.class, null, value);
    }

}
