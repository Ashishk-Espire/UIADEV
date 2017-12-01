
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for volXs.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="volXs">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VOLUNTARY_XS_0"/>
 *     &lt;enumeration value="VOLUNTARY_XS_100"/>
 *     &lt;enumeration value="VOLUNTARY_XS_150"/>
 *     &lt;enumeration value="VOLUNTARY_XS_200"/>
 *     &lt;enumeration value="VOLUNTARY_XS_250"/>
 *     &lt;enumeration value="VOLUNTARY_XS_350"/>
 *     &lt;enumeration value="VOLUNTARY_XS_450"/>
 *     &lt;enumeration value="VOLUNTARY_XS_50"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "volXs")
@XmlEnum
public enum VolXs {

    VOLUNTARY_XS_0,
    VOLUNTARY_XS_100,
    VOLUNTARY_XS_150,
    VOLUNTARY_XS_200,
    VOLUNTARY_XS_250,
    VOLUNTARY_XS_350,
    VOLUNTARY_XS_450,
    VOLUNTARY_XS_50;

    public String value() {
        return name();
    }

    public static VolXs fromValue(String v) {
        return valueOf(v);
    }

}
