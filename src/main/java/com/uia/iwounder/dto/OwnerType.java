
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ownerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ownerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MORTGAGED_AND_OCCUPIED_BY_YOU"/>
 *     &lt;enumeration value="OWNED_AND_OCCUPIED_BY_YOU"/>
 *     &lt;enumeration value="OWNED__SHARED_EQUITY"/>
 *     &lt;enumeration value="RENTED_PRIVATE_LANDLORD"/>
 *     &lt;enumeration value="RENTED_COUNCIL_OR_HOUSING_ASS_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ownerType")
@XmlEnum
public enum OwnerType {

    MORTGAGED_AND_OCCUPIED_BY_YOU("MORTGAGED_AND_OCCUPIED_BY_YOU"),
    OWNED_AND_OCCUPIED_BY_YOU("OWNED_AND_OCCUPIED_BY_YOU"),
    @XmlEnumValue("OWNED__SHARED_EQUITY")
    OWNED_SHARED_EQUITY("OWNED__SHARED_EQUITY"),
    RENTED_PRIVATE_LANDLORD("RENTED_PRIVATE_LANDLORD"),
    @XmlEnumValue("RENTED_COUNCIL_OR_HOUSING_ASS_")
    RENTED_COUNCIL_OR_HOUSING_ASS("RENTED_COUNCIL_OR_HOUSING_ASS_");
    private final String value;

    OwnerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OwnerType fromValue(String v) {
        for (OwnerType c: OwnerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
