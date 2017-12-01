
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for togetherHtHomObjectWs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="togetherHtHomObjectWs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="addressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alarmType" type="{http://ws.together.co.uk/}alarmType" minOccurs="0"/>
 *         &lt;element name="buildingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buildingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buildingsAD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="buildingsCover" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="buildingsVolExcess" type="{http://ws.together.co.uk/}volXs" minOccurs="0"/>
 *         &lt;element name="busUse" type="{http://ws.together.co.uk/}busUse" minOccurs="0"/>
 *         &lt;element name="contentsAD" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contentsCover" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="contentsVolExcess" type="{http://ws.together.co.uk/}volXs" minOccurs="0"/>
 *         &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coverStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="doorLock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="extProp" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="homeEmergencyCover" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="legalCover" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="listed" type="{http://ws.together.co.uk/}listed" minOccurs="0"/>
 *         &lt;element name="nativeQuoteReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noBeds" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ownerType" type="{http://ws.together.co.uk/}ownerType" minOccurs="0"/>
 *         &lt;element name="postcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prevPay" type="{http://ws.together.co.uk/}prevPay" minOccurs="0"/>
 *         &lt;element name="propType" type="{http://ws.together.co.uk/}propType" minOccurs="0"/>
 *         &lt;element name="roofType" type="{http://ws.together.co.uk/}roofType" minOccurs="0"/>
 *         &lt;element name="smokeAl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="smokers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="town" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unspecItems" type="{http://ws.together.co.uk/}unspecSi" minOccurs="0"/>
 *         &lt;element name="uprn" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="wallType" type="{http://ws.together.co.uk/}wallType" minOccurs="0"/>
 *         &lt;element name="winLock" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="yearBuilt" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "togetherHtHomObjectWs", propOrder = {
    "addressLine1",
    "addressLine2",
    "alarmType",
    "buildingName",
    "buildingNumber",
    "buildingsAD",
    "buildingsCover",
    "buildingsVolExcess",
    "busUse",
    "contentsAD",
    "contentsCover",
    "contentsVolExcess",
    "county",
    "coverStartDate",
    "doorLock",
    "extProp",
    "homeEmergencyCover",
    "legalCover",
    "listed",
    "nativeQuoteReference",
    "noBeds",
    "ownerType",
    "postcode",
    "prevPay",
    "propType",
    "roofType",
    "smokeAl",
    "smokers",
    "town",
    "unspecItems",
    "uprn",
    "wallType",
    "winLock",
    "yearBuilt"
})
public class TogetherHtHomObjectWs {

    protected String addressLine1;
    protected String addressLine2;
    @XmlSchemaType(name = "string")
    protected AlarmType alarmType;
    protected String buildingName;
    protected String buildingNumber;
    protected Boolean buildingsAD;
    protected Boolean buildingsCover;
    @XmlSchemaType(name = "string")
    protected VolXs buildingsVolExcess;
    @XmlSchemaType(name = "string")
    protected BusUse busUse;
    protected Boolean contentsAD;
    protected Boolean contentsCover;
    @XmlSchemaType(name = "string")
    protected VolXs contentsVolExcess;
    protected String county;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar coverStartDate;
    protected Boolean doorLock;
    protected Boolean extProp;
    protected Boolean homeEmergencyCover;
    protected Boolean legalCover;
    @XmlSchemaType(name = "string")
    protected Listed listed;
    protected String nativeQuoteReference;
    @XmlElement(required = false, nillable = true,defaultValue="0")
    protected Long noBeds;
    @XmlSchemaType(name = "string")
    protected OwnerType ownerType;
    protected String postcode;
    @XmlSchemaType(name = "string")
    protected PrevPay prevPay;
    @XmlSchemaType(name = "string")
    protected PropType propType;
    @XmlSchemaType(name = "string")
    protected RoofType roofType;
    protected Boolean smokeAl;
    protected Boolean smokers;
    protected String town;
    @XmlSchemaType(name = "string")
    protected UnspecSi unspecItems;
    @XmlSchemaType(name = "long")
    @XmlElement(required = false, nillable = true,defaultValue="0")
    protected Long uprn;
    @XmlSchemaType(name = "string")
    protected WallType wallType;
    protected Boolean winLock;
    @XmlElement(required = false, nillable = true,defaultValue="0")
    protected Long yearBuilt;

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the alarmType property.
     * 
     * @return
     *     possible object is
     *     {@link AlarmType }
     *     
     */
    public AlarmType getAlarmType() {
        return alarmType;
    }

    /**
     * Sets the value of the alarmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlarmType }
     *     
     */
    public void setAlarmType(AlarmType value) {
        this.alarmType = value;
    }

    /**
     * Gets the value of the buildingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * Sets the value of the buildingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingName(String value) {
        this.buildingName = value;
    }

    /**
     * Gets the value of the buildingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Sets the value of the buildingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingNumber(String value) {
        this.buildingNumber = value;
    }

    /**
     * Gets the value of the buildingsAD property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuildingsAD() {
        return buildingsAD;
    }

    /**
     * Sets the value of the buildingsAD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuildingsAD(Boolean value) {
        this.buildingsAD = value;
    }

    /**
     * Gets the value of the buildingsCover property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuildingsCover() {
        return buildingsCover;
    }

    /**
     * Sets the value of the buildingsCover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuildingsCover(Boolean value) {
        this.buildingsCover = value;
    }

    /**
     * Gets the value of the buildingsVolExcess property.
     * 
     * @return
     *     possible object is
     *     {@link VolXs }
     *     
     */
    public VolXs getBuildingsVolExcess() {
        return buildingsVolExcess;
    }

    /**
     * Sets the value of the buildingsVolExcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolXs }
     *     
     */
    public void setBuildingsVolExcess(VolXs value) {
        this.buildingsVolExcess = value;
    }

    /**
     * Gets the value of the busUse property.
     * 
     * @return
     *     possible object is
     *     {@link BusUse }
     *     
     */
    public BusUse getBusUse() {
        return busUse;
    }

    /**
     * Sets the value of the busUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusUse }
     *     
     */
    public void setBusUse(BusUse value) {
        this.busUse = value;
    }

    /**
     * Gets the value of the contentsAD property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContentsAD() {
        return contentsAD;
    }

    /**
     * Sets the value of the contentsAD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContentsAD(Boolean value) {
        this.contentsAD = value;
    }

    /**
     * Gets the value of the contentsCover property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContentsCover() {
        return contentsCover;
    }

    /**
     * Sets the value of the contentsCover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContentsCover(Boolean value) {
        this.contentsCover = value;
    }

    /**
     * Gets the value of the contentsVolExcess property.
     * 
     * @return
     *     possible object is
     *     {@link VolXs }
     *     
     */
    public VolXs getContentsVolExcess() {
        return contentsVolExcess;
    }

    /**
     * Sets the value of the contentsVolExcess property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolXs }
     *     
     */
    public void setContentsVolExcess(VolXs value) {
        this.contentsVolExcess = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the coverStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCoverStartDate() {
        return coverStartDate;
    }

    /**
     * Sets the value of the coverStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCoverStartDate(XMLGregorianCalendar value) {
        this.coverStartDate = value;
    }

    /**
     * Gets the value of the doorLock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoorLock() {
        return doorLock;
    }

    /**
     * Sets the value of the doorLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoorLock(Boolean value) {
        this.doorLock = value;
    }

    /**
     * Gets the value of the extProp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtProp() {
        return extProp;
    }

    /**
     * Sets the value of the extProp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtProp(Boolean value) {
        this.extProp = value;
    }

    /**
     * Gets the value of the homeEmergencyCover property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHomeEmergencyCover() {
        return homeEmergencyCover;
    }

    /**
     * Sets the value of the homeEmergencyCover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHomeEmergencyCover(Boolean value) {
        this.homeEmergencyCover = value;
    }

    /**
     * Gets the value of the legalCover property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLegalCover() {
        return legalCover;
    }

    /**
     * Sets the value of the legalCover property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLegalCover(Boolean value) {
        this.legalCover = value;
    }

    /**
     * Gets the value of the listed property.
     * 
     * @return
     *     possible object is
     *     {@link Listed }
     *     
     */
    public Listed getListed() {
        return listed;
    }

    /**
     * Sets the value of the listed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Listed }
     *     
     */
    public void setListed(Listed value) {
        this.listed = value;
    }

    /**
     * Gets the value of the nativeQuoteReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNativeQuoteReference() {
        return nativeQuoteReference;
    }

    /**
     * Sets the value of the nativeQuoteReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNativeQuoteReference(String value) {
        this.nativeQuoteReference = value;
    }

    /**
     * Gets the value of the noBeds property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNoBeds() {
        return noBeds;
    }

    /**
     * Sets the value of the noBeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNoBeds(Long value) {
        this.noBeds = value;
    }

    /**
     * Gets the value of the ownerType property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerType }
     *     
     */
    public OwnerType getOwnerType() {
        return ownerType;
    }

    /**
     * Sets the value of the ownerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerType }
     *     
     */
    public void setOwnerType(OwnerType value) {
        this.ownerType = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the prevPay property.
     * 
     * @return
     *     possible object is
     *     {@link PrevPay }
     *     
     */
    public PrevPay getPrevPay() {
        return prevPay;
    }

    /**
     * Sets the value of the prevPay property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrevPay }
     *     
     */
    public void setPrevPay(PrevPay value) {
        this.prevPay = value;
    }

    /**
     * Gets the value of the propType property.
     * 
     * @return
     *     possible object is
     *     {@link PropType }
     *     
     */
    public PropType getPropType() {
        return propType;
    }

    /**
     * Sets the value of the propType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropType }
     *     
     */
    public void setPropType(PropType value) {
        this.propType = value;
    }

    /**
     * Gets the value of the roofType property.
     * 
     * @return
     *     possible object is
     *     {@link RoofType }
     *     
     */
    public RoofType getRoofType() {
        return roofType;
    }

    /**
     * Sets the value of the roofType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoofType }
     *     
     */
    public void setRoofType(RoofType value) {
        this.roofType = value;
    }

    /**
     * Gets the value of the smokeAl property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmokeAl() {
        return smokeAl;
    }

    /**
     * Sets the value of the smokeAl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokeAl(Boolean value) {
        this.smokeAl = value;
    }

    /**
     * Gets the value of the smokers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmokers() {
        return smokers;
    }

    /**
     * Sets the value of the smokers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokers(Boolean value) {
        this.smokers = value;
    }

    /**
     * Gets the value of the town property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTown() {
        return town;
    }

    /**
     * Sets the value of the town property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTown(String value) {
        this.town = value;
    }

    /**
     * Gets the value of the unspecItems property.
     * 
     * @return
     *     possible object is
     *     {@link UnspecSi }
     *     
     */
    public UnspecSi getUnspecItems() {
        return unspecItems;
    }

    /**
     * Sets the value of the unspecItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnspecSi }
     *     
     */
    public void setUnspecItems(UnspecSi value) {
        this.unspecItems = value;
    }

    /**
     * Gets the value of the uprn property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUprn() {
        return uprn;
    }

    /**
     * Sets the value of the uprn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUprn(Long value) {
        this.uprn = value;
    }

    /**
     * Gets the value of the wallType property.
     * 
     * @return
     *     possible object is
     *     {@link WallType }
     *     
     */
    public WallType getWallType() {
        return wallType;
    }

    /**
     * Sets the value of the wallType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WallType }
     *     
     */
    public void setWallType(WallType value) {
        this.wallType = value;
    }

    /**
     * Gets the value of the winLock property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWinLock() {
        return winLock;
    }

    /**
     * Sets the value of the winLock property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWinLock(Boolean value) {
        this.winLock = value;
    }

    /**
     * Gets the value of the yearBuilt property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getYearBuilt() {
        return yearBuilt;
    }

    /**
     * Sets the value of the yearBuilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setYearBuilt(Long value) {
        this.yearBuilt = value;
    }

}
