
package com.uia.iwounder.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfPedalCycles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfPedalCycles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pedalCycle" type="{http://ws.together.co.uk/}togetherPedalCycle" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfPedalCycles", propOrder = {
    "pedalCycle"
})
public class ArrayOfPedalCycles {

    @XmlElement(nillable = true)
    protected List<TogetherPedalCycle> pedalCycle;

    /**
     * Gets the value of the pedalCycle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pedalCycle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPedalCycle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TogetherPedalCycle }
     * 
     * 
     */
    public List<TogetherPedalCycle> getPedalCycle() {
        if (pedalCycle == null) {
            pedalCycle = new ArrayList<TogetherPedalCycle>();
        }
        return this.pedalCycle;
    }

}
