
package com.uia.iwounder.dto;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for claCause.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="claCause">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AD_AT_HOME__STANDARD_COVER_"/>
 *     &lt;enumeration value="ESCAPE_OF_WATER__D_T_FREEZING"/>
 *     &lt;enumeration value="ESCAPE_OF_OIL"/>
 *     &lt;enumeration value="EXPLOSION"/>
 *     &lt;enumeration value="FALLING_ARIELS"/>
 *     &lt;enumeration value="FALLING_TREES"/>
 *     &lt;enumeration value="FIRE"/>
 *     &lt;enumeration value="FLOOD"/>
 *     &lt;enumeration value="FOOD_IN_FREEZER"/>
 *     &lt;enumeration value="LOSS"/>
 *     &lt;enumeration value="LOSS_OF_METERED_WATER_OR_OIL"/>
 *     &lt;enumeration value="AD_AT_HOME__EXTENDED_COVER_"/>
 *     &lt;enumeration value="MALICIOUS_DAMAGE"/>
 *     &lt;enumeration value="OWNERS_LIABILITY"/>
 *     &lt;enumeration value="PERSONAL_OR_OCCUPIERS_LIABILIT"/>
 *     &lt;enumeration value="PLANTS_IN_THE_GARDEN"/>
 *     &lt;enumeration value="REPLACEMENT_LOCKS"/>
 *     &lt;enumeration value="RIOT_AND_CIVIL_COMMOTION"/>
 *     &lt;enumeration value="SMOKE"/>
 *     &lt;enumeration value="STORM"/>
 *     &lt;enumeration value="SUBSIDENCE__LANDSLIP_OR_HEAVE"/>
 *     &lt;enumeration value="THEFT_FROM_HOME"/>
 *     &lt;enumeration value="AD_TO_TVS_AND_HOME_COMPUTER"/>
 *     &lt;enumeration value="THEFT_FROM_OUTBUILDING"/>
 *     &lt;enumeration value="THEFT_AWAY_FROM_HOME"/>
 *     &lt;enumeration value="LIGHTNING"/>
 *     &lt;enumeration value="AD_TO_UNDERGR_PIPES_AND_DRAINS"/>
 *     &lt;enumeration value="AD_AWAY_FROM_HOME"/>
 *     &lt;enumeration value="ARSON"/>
 *     &lt;enumeration value="COLLISSION"/>
 *     &lt;enumeration value="EARTHQUAKE"/>
 *     &lt;enumeration value="ESCAPE_OF_WATER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "claCause")
@XmlEnum
public enum ClaCause {

    @XmlEnumValue("AD_AT_HOME__STANDARD_COVER_")
    AD_AT_HOME_STANDARD_COVER("AD_AT_HOME__STANDARD_COVER_"),
    @XmlEnumValue("ESCAPE_OF_WATER__D_T_FREEZING")
    ESCAPE_OF_WATER_D_T_FREEZING("ESCAPE_OF_WATER__D_T_FREEZING"),
    ESCAPE_OF_OIL("ESCAPE_OF_OIL"),
    EXPLOSION("EXPLOSION"),
    FALLING_ARIELS("FALLING_ARIELS"),
    FALLING_TREES("FALLING_TREES"),
    FIRE("FIRE"),
    FLOOD("FLOOD"),
    FOOD_IN_FREEZER("FOOD_IN_FREEZER"),
    LOSS("LOSS"),
    LOSS_OF_METERED_WATER_OR_OIL("LOSS_OF_METERED_WATER_OR_OIL"),
    @XmlEnumValue("AD_AT_HOME__EXTENDED_COVER_")
    AD_AT_HOME_EXTENDED_COVER("AD_AT_HOME__EXTENDED_COVER_"),
    MALICIOUS_DAMAGE("MALICIOUS_DAMAGE"),
    OWNERS_LIABILITY("OWNERS_LIABILITY"),
    PERSONAL_OR_OCCUPIERS_LIABILIT("PERSONAL_OR_OCCUPIERS_LIABILIT"),
    PLANTS_IN_THE_GARDEN("PLANTS_IN_THE_GARDEN"),
    REPLACEMENT_LOCKS("REPLACEMENT_LOCKS"),
    RIOT_AND_CIVIL_COMMOTION("RIOT_AND_CIVIL_COMMOTION"),
    SMOKE("SMOKE"),
    STORM("STORM"),
    @XmlEnumValue("SUBSIDENCE__LANDSLIP_OR_HEAVE")
    SUBSIDENCE_LANDSLIP_OR_HEAVE("SUBSIDENCE__LANDSLIP_OR_HEAVE"),
    THEFT_FROM_HOME("THEFT_FROM_HOME"),
    AD_TO_TVS_AND_HOME_COMPUTER("AD_TO_TVS_AND_HOME_COMPUTER"),
    THEFT_FROM_OUTBUILDING("THEFT_FROM_OUTBUILDING"),
    THEFT_AWAY_FROM_HOME("THEFT_AWAY_FROM_HOME"),
    LIGHTNING("LIGHTNING"),
    AD_TO_UNDERGR_PIPES_AND_DRAINS("AD_TO_UNDERGR_PIPES_AND_DRAINS"),
    AD_AWAY_FROM_HOME("AD_AWAY_FROM_HOME"),
    ARSON("ARSON"),
    COLLISSION("COLLISSION"),
    EARTHQUAKE("EARTHQUAKE"),
    ESCAPE_OF_WATER("ESCAPE_OF_WATER");
    private final String value;

    ClaCause(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClaCause fromValue(String v) {
        for (ClaCause c: ClaCause.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
