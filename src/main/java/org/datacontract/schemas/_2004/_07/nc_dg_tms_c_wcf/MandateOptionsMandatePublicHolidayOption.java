
package org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for MandateOptions.MandatePublicHolidayOption</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="MandateOptions.MandatePublicHolidayOption">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="PrecedingOrdinaryBusinessDay"/>
 *     <enumeration value="VeryNextOrdinaryBusinessDay"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MandateOptions.MandatePublicHolidayOption")
@XmlEnum
public enum MandateOptionsMandatePublicHolidayOption {

    @XmlEnumValue("PrecedingOrdinaryBusinessDay")
    PRECEDING_ORDINARY_BUSINESS_DAY("PrecedingOrdinaryBusinessDay"),
    @XmlEnumValue("VeryNextOrdinaryBusinessDay")
    VERY_NEXT_ORDINARY_BUSINESS_DAY("VeryNextOrdinaryBusinessDay");
    private final String value;

    MandateOptionsMandatePublicHolidayOption(String v) {
        value = v;
    }

    /**
     * Gets the value associated to the enum constant.
     * 
     * @return
     *     The value linked to the enum.
     */
    public String value() {
        return value;
    }

    /**
     * Gets the enum associated to the value passed as parameter.
     * 
     * @param v
     *     The value to get the enum from.
     * @return
     *     The enum which corresponds to the value, if it exists.
     * @throws IllegalArgumentException
     *     If no value matches in the enum declaration.
     */
    public static MandateOptionsMandatePublicHolidayOption fromValue(String v) {
        for (MandateOptionsMandatePublicHolidayOption c: MandateOptionsMandatePublicHolidayOption.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
