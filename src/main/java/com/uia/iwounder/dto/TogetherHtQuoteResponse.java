
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for togetherHtQuoteResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="togetherHtQuoteResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bronze" type="{http://ws.together.co.uk/}togetherHtTier" minOccurs="0"/>
 *         &lt;element name="deeplinkUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="errorText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gold" type="{http://ws.together.co.uk/}togetherHtTier" minOccurs="0"/>
 *         &lt;element name="quoteReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="quoteValidUntil" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sessionRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="silver" type="{http://ws.together.co.uk/}togetherHtTier" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "togetherHtQuoteResponse", propOrder = {
    "bronze",
    "deeplinkUrl",
    "errorText",
    "gold",
    "quoteReference",
    "quoteValidUntil",
    "sessionRef",
    "silver"
})
public class TogetherHtQuoteResponse {

    protected TogetherHtTier bronze;
    protected String deeplinkUrl;
    protected String errorText;
    protected TogetherHtTier gold;
    protected String quoteReference;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar quoteValidUntil;
    protected String sessionRef;
    protected TogetherHtTier silver;

    /**
     * Gets the value of the bronze property.
     * 
     * @return
     *     possible object is
     *     {@link TogetherHtTier }
     *     
     */
    public TogetherHtTier getBronze() {
        return bronze;
    }

    /**
     * Sets the value of the bronze property.
     * 
     * @param value
     *     allowed object is
     *     {@link TogetherHtTier }
     *     
     */
    public void setBronze(TogetherHtTier value) {
        this.bronze = value;
    }

    /**
     * Gets the value of the deeplinkUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeeplinkUrl() {
        return deeplinkUrl;
    }

    /**
     * Sets the value of the deeplinkUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeeplinkUrl(String value) {
        this.deeplinkUrl = value;
    }

    /**
     * Gets the value of the errorText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Sets the value of the errorText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorText(String value) {
        this.errorText = value;
    }

    /**
     * Gets the value of the gold property.
     * 
     * @return
     *     possible object is
     *     {@link TogetherHtTier }
     *     
     */
    public TogetherHtTier getGold() {
        return gold;
    }

    /**
     * Sets the value of the gold property.
     * 
     * @param value
     *     allowed object is
     *     {@link TogetherHtTier }
     *     
     */
    public void setGold(TogetherHtTier value) {
        this.gold = value;
    }

    /**
     * Gets the value of the quoteReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuoteReference() {
        return quoteReference;
    }

    /**
     * Sets the value of the quoteReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuoteReference(String value) {
        this.quoteReference = value;
    }

    /**
     * Gets the value of the quoteValidUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getQuoteValidUntil() {
        return quoteValidUntil;
    }

    /**
     * Sets the value of the quoteValidUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setQuoteValidUntil(XMLGregorianCalendar value) {
        this.quoteValidUntil = value;
    }

    /**
     * Gets the value of the sessionRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionRef() {
        return sessionRef;
    }

    /**
     * Sets the value of the sessionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionRef(String value) {
        this.sessionRef = value;
    }

    /**
     * Gets the value of the silver property.
     * 
     * @return
     *     possible object is
     *     {@link TogetherHtTier }
     *     
     */
    public TogetherHtTier getSilver() {
        return silver;
    }

    /**
     * Sets the value of the silver property.
     * 
     * @param value
     *     allowed object is
     *     {@link TogetherHtTier }
     *     
     */
    public void setSilver(TogetherHtTier value) {
        this.silver = value;
    }

}
