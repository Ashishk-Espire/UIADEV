
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for alarmType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="alarmType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_ALARM"/>
 *     &lt;enumeration value="NACOSS"/>
 *     &lt;enumeration value="AISC_OR_SSAIB"/>
 *     &lt;enumeration value="NON_APPROVED"/>
 *     &lt;enumeration value="NSI"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "alarmType")
@XmlEnum
public enum AlarmType {

    NO_ALARM,
    NACOSS,
    AISC_OR_SSAIB,
    NON_APPROVED,
    NSI,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static AlarmType fromValue(String v) {
        return valueOf(v);
    }

}
