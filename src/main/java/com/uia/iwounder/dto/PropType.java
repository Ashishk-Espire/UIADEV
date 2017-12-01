
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="propType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FLAT_IN_CONVERTED_HOUSE"/>
 *     &lt;enumeration value="FLAT_IN_PURPOSE_BUILT_BLOCK"/>
 *     &lt;enumeration value="MAISONETTE"/>
 *     &lt;enumeration value="CONVERTED_BARN"/>
 *     &lt;enumeration value="MID_TERRACED_BUNGALOW"/>
 *     &lt;enumeration value="END_OF_TERRACE_BUNGALOW"/>
 *     &lt;enumeration value="SEMI_DETACHED_BUNGALOW"/>
 *     &lt;enumeration value="DETACHED_BUNGALOW"/>
 *     &lt;enumeration value="TWO_STOREY_MID_TERRACED_HOUSE"/>
 *     &lt;enumeration value="TWO_STOREY_END_OF_TERRACE_HOUSE"/>
 *     &lt;enumeration value="TWO_STOREY_SEMI_DETACHED_HOUSE"/>
 *     &lt;enumeration value="TWO_STOREY_DETACHED_HOUSE"/>
 *     &lt;enumeration value="THREE_STOREY_MID_TERRACED_HOUSE"/>
 *     &lt;enumeration value="THREE_STOREY_END_OF_TERRACE_HOUSE"/>
 *     &lt;enumeration value="THREE_STOREY_SEMI_DETACHED_HOUSE"/>
 *     &lt;enumeration value="THREE_STOREY_DETACHED_HOUSE"/>
 *     &lt;enumeration value="FOUR_STOREY_MID_TERRACED_HOUSE"/>
 *     &lt;enumeration value="FOUR_STOREY_END_OF_TERRACE_HOUSE"/>
 *     &lt;enumeration value="FOUR_STOREY_SEMI_DETACHED_HOUSE"/>
 *     &lt;enumeration value="FOUR_STOREY_DETACHED_HOUSE"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "propType")
@XmlEnum
public enum PropType {

    FLAT_IN_CONVERTED_HOUSE,
    FLAT_IN_PURPOSE_BUILT_BLOCK,
    MAISONETTE,
    CONVERTED_BARN,
    MID_TERRACED_BUNGALOW,
    END_OF_TERRACE_BUNGALOW,
    SEMI_DETACHED_BUNGALOW,
    DETACHED_BUNGALOW,
    TWO_STOREY_MID_TERRACED_HOUSE,
    TWO_STOREY_END_OF_TERRACE_HOUSE,
    TWO_STOREY_SEMI_DETACHED_HOUSE,
    TWO_STOREY_DETACHED_HOUSE,
    THREE_STOREY_MID_TERRACED_HOUSE,
    THREE_STOREY_END_OF_TERRACE_HOUSE,
    THREE_STOREY_SEMI_DETACHED_HOUSE,
    THREE_STOREY_DETACHED_HOUSE,
    FOUR_STOREY_MID_TERRACED_HOUSE,
    FOUR_STOREY_END_OF_TERRACE_HOUSE,
    FOUR_STOREY_SEMI_DETACHED_HOUSE,
    FOUR_STOREY_DETACHED_HOUSE,
    OTHER;

    public String value() {
        return name();
    }

    public static PropType fromValue(String v) {
        return valueOf(v);
    }

}
