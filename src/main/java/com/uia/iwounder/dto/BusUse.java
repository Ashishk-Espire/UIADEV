
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for busUse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="busUse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="SOLELY_AS_BUSINESS_PREMISES"/>
 *     &lt;enumeration value="NO_B_VISITORS__CLERICAL_ONLY"/>
 *     &lt;enumeration value="B_VISITORS__CLERICAL_ONLY_"/>
 *     &lt;enumeration value="USED_FOR_HAIRDRESSING_OR_BEAUTY_OR_M"/>
 *     &lt;enumeration value="USED_FOR_MANUFACTORING_OR_REPAIR"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "busUse")
@XmlEnum
public enum BusUse {

    NO("NO"),
    SOLELY_AS_BUSINESS_PREMISES("SOLELY_AS_BUSINESS_PREMISES"),
    @XmlEnumValue("NO_B_VISITORS__CLERICAL_ONLY")
    NO_B_VISITORS_CLERICAL_ONLY("NO_B_VISITORS__CLERICAL_ONLY"),
    @XmlEnumValue("B_VISITORS__CLERICAL_ONLY_")
    B_VISITORS_CLERICAL_ONLY("B_VISITORS__CLERICAL_ONLY_"),
    USED_FOR_HAIRDRESSING_OR_BEAUTY_OR_M("USED_FOR_HAIRDRESSING_OR_BEAUTY_OR_M"),
    USED_FOR_MANUFACTORING_OR_REPAIR("USED_FOR_MANUFACTORING_OR_REPAIR"),
    OTHER("OTHER");
    private final String value;

    BusUse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BusUse fromValue(String v) {
        for (BusUse c: BusUse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
