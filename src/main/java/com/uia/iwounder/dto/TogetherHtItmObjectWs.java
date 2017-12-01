
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for togetherHtItmObjectWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="togetherHtItmObjectWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specifiedItems" type="{http://ws.together.co.uk/}arrayOfSpecifiedItems" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "togetherHtItmObjectWs", propOrder = {
    "specifiedItems"
})

public class TogetherHtItmObjectWs {

    protected ArrayOfSpecifiedItems specifiedItems;

    /**
     * Gets the value of the specifiedItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpecifiedItems }
     *     
     */
    public ArrayOfSpecifiedItems getSpecifiedItems() {
        return specifiedItems;
    }

    /**
     * Sets the value of the specifiedItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpecifiedItems }
     *     
     */
    public void setSpecifiedItems(ArrayOfSpecifiedItems value) {
        this.specifiedItems = value;
    }

}
