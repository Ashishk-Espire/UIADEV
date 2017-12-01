
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for togetherHtTier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="togetherHtTier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="buildingsADStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buildingsExcessTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="contentsADStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="contentsExcessTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="homeEmergencyPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="homeEmergencyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="installAPR" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="installDeposit" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="installFirstPayment" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="installOtherPayments" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="installTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="installments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="legalCoverPrice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="legalCoverStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="premium" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="subsidenceExcess" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "togetherHtTier", propOrder = {
    "buildingsADStatus",
    "buildingsExcessTotal",
    "contentsADStatus",
    "contentsExcessTotal",
    "homeEmergencyPrice",
    "homeEmergencyStatus",
    "installAPR",
    "installDeposit",
    "installFirstPayment",
    "installOtherPayments",
    "installTotal",
    "installments",
    "legalCoverPrice",
    "legalCoverStatus",
    "premium",
    "subsidenceExcess"
})
public class TogetherHtTier {

    protected String buildingsADStatus;
    protected double buildingsExcessTotal;
    protected String contentsADStatus;
    protected double contentsExcessTotal;
    protected double homeEmergencyPrice;
    protected String homeEmergencyStatus;
    protected double installAPR;
    protected double installDeposit;
    protected double installFirstPayment;
    protected double installOtherPayments;
    protected double installTotal;
    protected int installments;
    protected double legalCoverPrice;
    protected String legalCoverStatus;
    protected double premium;
    protected double subsidenceExcess;

    /**
     * Gets the value of the buildingsADStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingsADStatus() {
        return buildingsADStatus;
    }

    /**
     * Sets the value of the buildingsADStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingsADStatus(String value) {
        this.buildingsADStatus = value;
    }

    /**
     * Gets the value of the buildingsExcessTotal property.
     * 
     */
    public double getBuildingsExcessTotal() {
        return buildingsExcessTotal;
    }

    /**
     * Sets the value of the buildingsExcessTotal property.
     * 
     */
    public void setBuildingsExcessTotal(double value) {
        this.buildingsExcessTotal = value;
    }

    /**
     * Gets the value of the contentsADStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentsADStatus() {
        return contentsADStatus;
    }

    /**
     * Sets the value of the contentsADStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentsADStatus(String value) {
        this.contentsADStatus = value;
    }

    /**
     * Gets the value of the contentsExcessTotal property.
     * 
     */
    public double getContentsExcessTotal() {
        return contentsExcessTotal;
    }

    /**
     * Sets the value of the contentsExcessTotal property.
     * 
     */
    public void setContentsExcessTotal(double value) {
        this.contentsExcessTotal = value;
    }

    /**
     * Gets the value of the homeEmergencyPrice property.
     * 
     */
    public double getHomeEmergencyPrice() {
        return homeEmergencyPrice;
    }

    /**
     * Sets the value of the homeEmergencyPrice property.
     * 
     */
    public void setHomeEmergencyPrice(double value) {
        this.homeEmergencyPrice = value;
    }

    /**
     * Gets the value of the homeEmergencyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomeEmergencyStatus() {
        return homeEmergencyStatus;
    }

    /**
     * Sets the value of the homeEmergencyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomeEmergencyStatus(String value) {
        this.homeEmergencyStatus = value;
    }

    /**
     * Gets the value of the installAPR property.
     * 
     */
    public double getInstallAPR() {
        return installAPR;
    }

    /**
     * Sets the value of the installAPR property.
     * 
     */
    public void setInstallAPR(double value) {
        this.installAPR = value;
    }

    /**
     * Gets the value of the installDeposit property.
     * 
     */
    public double getInstallDeposit() {
        return installDeposit;
    }

    /**
     * Sets the value of the installDeposit property.
     * 
     */
    public void setInstallDeposit(double value) {
        this.installDeposit = value;
    }

    /**
     * Gets the value of the installFirstPayment property.
     * 
     */
    public double getInstallFirstPayment() {
        return installFirstPayment;
    }

    /**
     * Sets the value of the installFirstPayment property.
     * 
     */
    public void setInstallFirstPayment(double value) {
        this.installFirstPayment = value;
    }

    /**
     * Gets the value of the installOtherPayments property.
     * 
     */
    public double getInstallOtherPayments() {
        return installOtherPayments;
    }

    /**
     * Sets the value of the installOtherPayments property.
     * 
     */
    public void setInstallOtherPayments(double value) {
        this.installOtherPayments = value;
    }

    /**
     * Gets the value of the installTotal property.
     * 
     */
    public double getInstallTotal() {
        return installTotal;
    }

    /**
     * Sets the value of the installTotal property.
     * 
     */
    public void setInstallTotal(double value) {
        this.installTotal = value;
    }

    /**
     * Gets the value of the installments property.
     * 
     */
    public int getInstallments() {
        return installments;
    }

    /**
     * Sets the value of the installments property.
     * 
     */
    public void setInstallments(int value) {
        this.installments = value;
    }

    /**
     * Gets the value of the legalCoverPrice property.
     * 
     */
    public double getLegalCoverPrice() {
        return legalCoverPrice;
    }

    /**
     * Sets the value of the legalCoverPrice property.
     * 
     */
    public void setLegalCoverPrice(double value) {
        this.legalCoverPrice = value;
    }

    /**
     * Gets the value of the legalCoverStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalCoverStatus() {
        return legalCoverStatus;
    }

    /**
     * Sets the value of the legalCoverStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalCoverStatus(String value) {
        this.legalCoverStatus = value;
    }

    /**
     * Gets the value of the premium property.
     * 
     */
    public double getPremium() {
        return premium;
    }

    /**
     * Sets the value of the premium property.
     * 
     */
    public void setPremium(double value) {
        this.premium = value;
    }

    /**
     * Gets the value of the subsidenceExcess property.
     * 
     */
    public double getSubsidenceExcess() {
        return subsidenceExcess;
    }

    /**
     * Sets the value of the subsidenceExcess property.
     * 
     */
    public void setSubsidenceExcess(double value) {
        this.subsidenceExcess = value;
    }

}
