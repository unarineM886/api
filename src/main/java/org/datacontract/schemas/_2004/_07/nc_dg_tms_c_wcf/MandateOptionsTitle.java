
package org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for MandateOptions.Title</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="MandateOptions.Title">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="Mr"/>
 *     <enumeration value="Mrs"/>
 *     <enumeration value="Miss"/>
 *     <enumeration value="Dr"/>
 *     <enumeration value="Prof"/>
 *     <enumeration value="Ms"/>
 *     <enumeration value="Rabbi"/>
 *     <enumeration value="Ds"/>
 *     <enumeration value="Adv"/>
 *     <enumeration value="NotSet"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "MandateOptions.Title")
@XmlEnum
public enum MandateOptionsTitle {

    @XmlEnumValue("Mr")
    MR("Mr"),
    @XmlEnumValue("Mrs")
    MRS("Mrs"),
    @XmlEnumValue("Miss")
    MISS("Miss"),
    @XmlEnumValue("Dr")
    DR("Dr"),
    @XmlEnumValue("Prof")
    PROF("Prof"),
    @XmlEnumValue("Ms")
    MS("Ms"),
    @XmlEnumValue("Rabbi")
    RABBI("Rabbi"),
    @XmlEnumValue("Ds")
    DS("Ds"),
    @XmlEnumValue("Adv")
    ADV("Adv"),
    @XmlEnumValue("NotSet")
    NOT_SET("NotSet");
    private final String value;

    MandateOptionsTitle(String v) {
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
    public static MandateOptionsTitle fromValue(String v) {
        for (MandateOptionsTitle c: MandateOptionsTitle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
