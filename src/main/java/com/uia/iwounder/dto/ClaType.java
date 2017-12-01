
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for claType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="claType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUILDINGS"/>
 *     &lt;enumeration value="CONTENTS"/>
 *     &lt;enumeration value="SPECIFIED_ITEMS"/>
 *     &lt;enumeration value="UNSPECIFIED_ITEMS"/>
 *     &lt;enumeration value="CYCLE_COVER"/>
 *     &lt;enumeration value="MONEY_AND_CREDIT_CARDS"/>
 *     &lt;enumeration value="SPORT_AND_CAMPING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "claType")
@XmlEnum
public enum ClaType {

    BUILDINGS,
    CONTENTS,
    SPECIFIED_ITEMS,
    UNSPECIFIED_ITEMS,
    CYCLE_COVER,
    MONEY_AND_CREDIT_CARDS,
    SPORT_AND_CAMPING;

    public String value() {
        return name();
    }

    public static ClaType fromValue(String v) {
        return valueOf(v);
    }

}
