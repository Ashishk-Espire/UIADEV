
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for maritalState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="maritalState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MARRIED"/>
 *     &lt;enumeration value="UNMARRIED"/>
 *     &lt;enumeration value="LIVING_TOGETHER"/>
 *     &lt;enumeration value="WIDOW"/>
 *     &lt;enumeration value="DIVORCED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "maritalState")
@XmlEnum
public enum MaritalState {

    MARRIED,
    UNMARRIED,
    LIVING_TOGETHER,
    WIDOW,
    DIVORCED;

    public String value() {
        return name();
    }

    public static MaritalState fromValue(String v) {
        return valueOf(v);
    }

}
