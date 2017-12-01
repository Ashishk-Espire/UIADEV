
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customerTitle.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="customerTitle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MR"/>
 *     &lt;enumeration value="MRS"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="MISS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "customerTitle")
@XmlEnum
public enum CustomerTitle {

    MR,
    MRS,
    MS,
    MISS;

    public String value() {
        return name();
    }

    public static CustomerTitle fromValue(String v) {
        return valueOf(v);
    }

}
