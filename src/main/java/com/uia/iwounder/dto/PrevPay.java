
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for prevPay.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="prevPay">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO_INSURANCE_LAST_YEAR"/>
 *     &lt;enumeration value="YEARLY_PAYMENT"/>
 *     &lt;enumeration value="MONTHLY_PAYMENT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "prevPay")
@XmlEnum
public enum PrevPay {

    NO_INSURANCE_LAST_YEAR,
    YEARLY_PAYMENT,
    MONTHLY_PAYMENT;

    public String value() {
        return name();
    }

    public static PrevPay fromValue(String v) {
        return valueOf(v);
    }

}
