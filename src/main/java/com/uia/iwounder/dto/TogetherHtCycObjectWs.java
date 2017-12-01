
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for togetherHtCycObjectWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="togetherHtCycObjectWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pedalCycles" type="{http://ws.together.co.uk/}arrayOfPedalCycles" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "togetherHtCycObjectWs", propOrder = {
    "pedalCycles"
})

public class TogetherHtCycObjectWs {

    protected ArrayOfPedalCycles pedalCycles;

    /**
     * Gets the value of the pedalCycles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPedalCycles }
     *     
     */
    public ArrayOfPedalCycles getPedalCycles() {
        return pedalCycles;
    }

    /**
     * Sets the value of the pedalCycles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPedalCycles }
     *     
     */
    public void setPedalCycles(ArrayOfPedalCycles value) {
        this.pedalCycles = value;
    }

}
