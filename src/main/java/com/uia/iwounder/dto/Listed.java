
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listed.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="listed">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GRADE_I_LISTED"/>
 *     &lt;enumeration value="GRADE_II_LISTED"/>
 *     &lt;enumeration value="NOT_LISTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "listed")
@XmlEnum
public enum Listed {

    GRADE_I_LISTED,
    GRADE_II_LISTED,
    NOT_LISTED;

    public String value() {
        return name();
    }

    public static Listed fromValue(String v) {
        return valueOf(v);
    }

}
