
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for customerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="customerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="person"/>
 *     &lt;enumeration value="company"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "customerType")
@XmlEnum
public enum CustomerType {

    @XmlEnumValue("person")
    PERSON("person"),
    @XmlEnumValue("company")
    COMPANY("company");
    private final String value;

    CustomerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerType fromValue(String v) {
        for (CustomerType c: CustomerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
