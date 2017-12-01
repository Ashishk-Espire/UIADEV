
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wallType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="wallType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BRICK"/>
 *     &lt;enumeration value="STONE"/>
 *     &lt;enumeration value="CONCRETE"/>
 *     &lt;enumeration value="TIMBER_FRAMED_BRICK_OR_STONE"/>
 *     &lt;enumeration value="TIMBER_FRAMED_OTHER_MATERIAL"/>
 *     &lt;enumeration value="TIMBER"/>
 *     &lt;enumeration value="WATTLE_AND_DAUB"/>
 *     &lt;enumeration value="COB"/>
 *     &lt;enumeration value="METAL"/>
 *     &lt;enumeration value="OTHER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "wallType")
@XmlEnum
public enum WallType {

    BRICK,
    STONE,
    CONCRETE,
    TIMBER_FRAMED_BRICK_OR_STONE,
    TIMBER_FRAMED_OTHER_MATERIAL,
    TIMBER,
    WATTLE_AND_DAUB,
    COB,
    METAL,
    OTHER;

    public String value() {
        return name();
    }

    public static WallType fromValue(String v) {
        return valueOf(v);
    }

}
