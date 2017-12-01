
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for togetherHtQuoteData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="togetherHtQuoteData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customer" type="{http://ws.together.co.uk/}togetherHtCustomerWs" minOccurs="0"/>
 *         &lt;element name="htCycObject" type="{http://ws.together.co.uk/}togetherHtCycObjectWs" minOccurs="0"/>
 *         &lt;element name="htItmObject" type="{http://ws.together.co.uk/}togetherHtItmObjectWs" minOccurs="0"/>
 *         &lt;element name="htPreviousClaimObject" type="{http://ws.together.co.uk/}togetherHtPrevClaObjectWs" minOccurs="0"/>
 *         &lt;element name="jointCustomer" type="{http://ws.together.co.uk/}togetherHtJointCustomerWs" minOccurs="0"/>
 *         &lt;element name="object" type="{http://ws.together.co.uk/}togetherHtHomObjectWs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "togetherHtQuoteData", propOrder = {
    "customer",
    "htCycObject",
    "htItmObject",
    "htPreviousClaimObject",
    "jointCustomer",
    "object"
})
public class TogetherHtQuoteData {

    protected TogetherHtCustomerWs customer;
    protected TogetherHtCycObjectWs htCycObject;
    protected TogetherHtItmObjectWs htItmObject;
    protected TogetherHtPrevClaObjectWs htPreviousClaimObject;
    protected TogetherHtJointCustomerWs jointCustomer;
    protected TogetherHtHomObjectWs object;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link TogetherHtCustomerWs }
     *     
     */
    public TogetherHtCustomerWs getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TogetherHtCustomerWs }
     *     
     */
    public void setCustomer(TogetherHtCustomerWs value) {
        this.customer = value;
    }

    /**
     * Gets the value of the htCycObject property.
     * 
     * @return
     *     possible object is
     *     {@link TogetherHtCycObjectWs }
     *     
     */
    public TogetherHtCycObjectWs getHtCycObject() {
        return htCycObject;
    }

    /**
     * Sets the value of the htCycObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link TogetherHtCycObjectWs }
     *     
     */
    public void setHtCycObject(TogetherHtCycObjectWs value) {
        this.htCycObject = value;
    }

    /**
     * Gets the value of the htItmObject property.
     * 
     * @return
     *     possible object is
     *     {@link TogetherHtItmObjectWs }
     *     
     */
    public TogetherHtItmObjectWs getHtItmObject() {
        return htItmObject;
    }

    /**
     * Sets the value of the htItmObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link TogetherHtItmObjectWs }
     *     
     */
    public void setHtItmObject(TogetherHtItmObjectWs value) {
        this.htItmObject = value;
    }

    /**
     * Gets the value of the htPreviousClaimObject property.
     * 
     * @return
     *     possible object is
     *     {@link TogetherHtPrevClaObjectWs }
     *     
     */
    public TogetherHtPrevClaObjectWs getHtPreviousClaimObject() {
        return htPreviousClaimObject;
    }

    /**
     * Sets the value of the htPreviousClaimObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link TogetherHtPrevClaObjectWs }
     *     
     */
    public void setHtPreviousClaimObject(TogetherHtPrevClaObjectWs value) {
        this.htPreviousClaimObject = value;
    }

    /**
     * Gets the value of the jointCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link TogetherHtJointCustomerWs }
     *     
     */
    public TogetherHtJointCustomerWs getJointCustomer() {
        return jointCustomer;
    }

    /**
     * Sets the value of the jointCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link TogetherHtJointCustomerWs }
     *     
     */
    public void setJointCustomer(TogetherHtJointCustomerWs value) {
        this.jointCustomer = value;
    }

    /**
     * Gets the value of the object property.
     * 
     * @return
     *     possible object is
     *     {@link TogetherHtHomObjectWs }
     *     
     */
    public TogetherHtHomObjectWs getObject() {
        return object;
    }

    /**
     * Sets the value of the object property.
     * 
     * @param value
     *     allowed object is
     *     {@link TogetherHtHomObjectWs }
     *     
     */
    public void setObject(TogetherHtHomObjectWs value) {
        this.object = value;
    }

}
