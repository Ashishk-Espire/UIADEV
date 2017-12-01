
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for togetherHtCustomerWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="togetherHtCustomerWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="custType" type="{http://ws.together.co.uk/}customerType" minOccurs="0"/>
 *         &lt;element name="customerTitle" type="{http://ws.together.co.uk/}customerTitle" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://ws.together.co.uk/}gender" minOccurs="0"/>
 *         &lt;element name="maritalState" type="{http://ws.together.co.uk/}maritalState" minOccurs="0"/>
 *         &lt;element name="occupationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "togetherHtCustomerWs", propOrder = {
    "birthDate",
    "custType",
    "customerTitle",
    "emailAddress",
    "forename",
    "gender",
    "maritalState",
    "occupationCode",
    "phoneNo",
    "surname"
})
@XmlSeeAlso({
    TogetherHtJointCustomerWs.class
})
public class TogetherHtCustomerWs {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    @XmlSchemaType(name = "string")
    protected CustomerType custType;
    @XmlSchemaType(name = "string")
    protected CustomerTitle customerTitle;
    protected String emailAddress;
    protected String forename;
    @XmlSchemaType(name = "string")
    protected Gender gender;
    @XmlSchemaType(name = "string")
    protected MaritalState maritalState;
    protected String occupationCode;
    protected String phoneNo;
    protected String surname;

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the custType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerType }
     *     
     */
    public CustomerType getCustType() {
        return custType;
    }

    /**
     * Sets the value of the custType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType }
     *     
     */
    public void setCustType(CustomerType value) {
        this.custType = value;
    }

    /**
     * Gets the value of the customerTitle property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerTitle }
     *     
     */
    public CustomerTitle getCustomerTitle() {
        return customerTitle;
    }

    /**
     * Sets the value of the customerTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerTitle }
     *     
     */
    public void setCustomerTitle(CustomerTitle value) {
        this.customerTitle = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the forename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForename() {
        return forename;
    }

    /**
     * Sets the value of the forename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForename(String value) {
        this.forename = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link Gender }
     *     
     */
    public Gender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gender }
     *     
     */
    public void setGender(Gender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the maritalState property.
     * 
     * @return
     *     possible object is
     *     {@link MaritalState }
     *     
     */
    public MaritalState getMaritalState() {
        return maritalState;
    }

    /**
     * Sets the value of the maritalState property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritalState }
     *     
     */
    public void setMaritalState(MaritalState value) {
        this.maritalState = value;
    }

    /**
     * Gets the value of the occupationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupationCode() {
        return occupationCode;
    }

    /**
     * Sets the value of the occupationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupationCode(String value) {
        this.occupationCode = value;
    }

    /**
     * Gets the value of the phoneNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * Sets the value of the phoneNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNo(String value) {
        this.phoneNo = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

}
