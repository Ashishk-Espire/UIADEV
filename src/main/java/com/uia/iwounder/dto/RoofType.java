
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for roofType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="roofType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SLATE"/>
 *     &lt;enumeration value="TILE"/>
 *     &lt;enumeration value="CONCRETE"/>
 *     &lt;enumeration value="TIMBER"/>
 *     &lt;enumeration value="ASBESTOS"/>
 *     &lt;enumeration value="THATCH"/>
 *     &lt;enumeration value="MORE_THAN_50_PERCENT_FLAT_FELT"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "roofType")
@XmlEnum
public enum RoofType {

    SLATE,
    TILE,
    CONCRETE,
    TIMBER,
    ASBESTOS,
    THATCH,
    MORE_THAN_50_PERCENT_FLAT_FELT,
    OTHER;

    public String value() {
        return name();
    }

    public static RoofType fromValue(String v) {
        return valueOf(v);
    }

}
