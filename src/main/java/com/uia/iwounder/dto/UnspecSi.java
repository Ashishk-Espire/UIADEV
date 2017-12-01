
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unspecSi.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="unspecSi">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUM_INSURED_10_000"/>
 *     &lt;enumeration value="SUM_INSURED_2_000"/>
 *     &lt;enumeration value="SUM_INSURED_5_000"/>
 *     &lt;enumeration value="SUM_INSURED_6_000"/>
 *     &lt;enumeration value="SUM_INSURED_7_000"/>
 *     &lt;enumeration value="SUM_INSURED_8_000"/>
 *     &lt;enumeration value="SUM_INSURED_9_000"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "unspecSi")
@XmlEnum
public enum UnspecSi {

    SUM_INSURED_10_000,
    SUM_INSURED_2_000,
    SUM_INSURED_5_000,
    SUM_INSURED_6_000,
    SUM_INSURED_7_000,
    SUM_INSURED_8_000,
    SUM_INSURED_9_000;

    public String value() {
        return name();
    }

    public static UnspecSi fromValue(String v) {
        return valueOf(v);
    }

}
