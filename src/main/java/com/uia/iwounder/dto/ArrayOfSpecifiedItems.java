
package com.uia.iwounder.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for arrayOfSpecifiedItems complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfSpecifiedItems">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specifiedItem" type="{http://ws.together.co.uk/}togetherSpecifiedItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfSpecifiedItems", propOrder = {
    "specifiedItem"
})
public class ArrayOfSpecifiedItems {

    @XmlElement(nillable = true)
    protected List<TogetherSpecifiedItem> specifiedItem;

    /**
     * Gets the value of the specifiedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifiedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifiedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TogetherSpecifiedItem }
     * 
     * 
     */
    public List<TogetherSpecifiedItem> getSpecifiedItem() {
        if (specifiedItem == null) {
            specifiedItem = new ArrayList<TogetherSpecifiedItem>();
        }
        return this.specifiedItem;
    }

}
