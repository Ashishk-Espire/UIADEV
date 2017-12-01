
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for togetherHtPrevClaObjectWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="togetherHtPrevClaObjectWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="previousClaims" type="{http://ws.together.co.uk/}wsPreviousClaims" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "togetherHtPrevClaObjectWs", propOrder = {
    "previousClaims"
})

public class TogetherHtPrevClaObjectWs {

    protected WsPreviousClaims previousClaims;

    /**
     * Gets the value of the previousClaims property.
     * 
     * @return
     *     possible object is
     *     {@link WsPreviousClaims }
     *     
     */
    public WsPreviousClaims getPreviousClaims() {
        return previousClaims;
    }

    /**
     * Sets the value of the previousClaims property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsPreviousClaims }
     *     
     */
    public void setPreviousClaims(WsPreviousClaims value) {
        this.previousClaims = value;
    }

}
