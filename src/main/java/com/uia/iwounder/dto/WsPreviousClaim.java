
package com.uia.iwounder.dto;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for wsPreviousClaim complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsPreviousClaim">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cause" type="{http://ws.together.co.uk/}claCause" minOccurs="0"/>
 *         &lt;element name="claimDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="claimValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="type" type="{http://ws.together.co.uk/}claType" minOccurs="0"/>
 *         &lt;element name="wasAtThisAddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsPreviousClaim", propOrder = {
    "cause",
    "claimDate",
    "claimValue",
    "type",
    "wasAtThisAddress"
})
public class WsPreviousClaim {

    @XmlSchemaType(name = "string")
    protected ClaCause cause;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar claimDate;
    protected BigDecimal claimValue;
    @XmlSchemaType(name = "string")
    protected ClaType type;
    protected boolean wasAtThisAddress;

    /**
     * Gets the value of the cause property.
     * 
     * @return
     *     possible object is
     *     {@link ClaCause }
     *     
     */
    public ClaCause getCause() {
        return cause;
    }

    /**
     * Sets the value of the cause property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaCause }
     *     
     */
    public void setCause(ClaCause value) {
        this.cause = value;
    }

    /**
     * Gets the value of the claimDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getClaimDate() {
        return claimDate;
    }

    /**
     * Sets the value of the claimDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setClaimDate(XMLGregorianCalendar value) {
        this.claimDate = value;
    }

    /**
     * Gets the value of the claimValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClaimValue() {
        return claimValue;
    }

    /**
     * Sets the value of the claimValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClaimValue(BigDecimal value) {
        this.claimValue = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ClaType }
     *     
     */
    public ClaType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaType }
     *     
     */
    public void setType(ClaType value) {
        this.type = value;
    }

    /**
     * Gets the value of the wasAtThisAddress property.
     * 
     */
    public boolean isWasAtThisAddress() {
        return wasAtThisAddress;
    }

    /**
     * Sets the value of the wasAtThisAddress property.
     * 
     */
    public void setWasAtThisAddress(boolean value) {
        this.wasAtThisAddress = value;
    }

}
