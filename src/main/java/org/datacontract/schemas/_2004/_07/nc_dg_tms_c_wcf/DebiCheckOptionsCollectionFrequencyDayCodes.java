
package org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for DebiCheckOptions.CollectionFrequencyDayCodes</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DebiCheckOptions.CollectionFrequencyDayCodes">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="WEEK_01"/>
 *     <enumeration value="WEEK_02"/>
 *     <enumeration value="WEEK_03"/>
 *     <enumeration value="WEEK_04"/>
 *     <enumeration value="WEEK_05"/>
 *     <enumeration value="WEEK_06"/>
 *     <enumeration value="WEEK_07"/>
 *     <enumeration value="FRTN_01"/>
 *     <enumeration value="FRTN_02"/>
 *     <enumeration value="FRTN_03"/>
 *     <enumeration value="FRTN_04"/>
 *     <enumeration value="FRTN_05"/>
 *     <enumeration value="FRTN_06"/>
 *     <enumeration value="FRTN_07"/>
 *     <enumeration value="FRTN_08"/>
 *     <enumeration value="FRTN_09"/>
 *     <enumeration value="FRTN_10"/>
 *     <enumeration value="FRTN_11"/>
 *     <enumeration value="FRTN_12"/>
 *     <enumeration value="FRTN_13"/>
 *     <enumeration value="FRTN_14"/>
 *     <enumeration value="MNTH_01"/>
 *     <enumeration value="MNTH_02"/>
 *     <enumeration value="MNTH_03"/>
 *     <enumeration value="MNTH_04"/>
 *     <enumeration value="MNTH_05"/>
 *     <enumeration value="MNTH_06"/>
 *     <enumeration value="MNTH_07"/>
 *     <enumeration value="MNTH_08"/>
 *     <enumeration value="MNTH_09"/>
 *     <enumeration value="MNTH_10"/>
 *     <enumeration value="MNTH_11"/>
 *     <enumeration value="MNTH_12"/>
 *     <enumeration value="MNTH_13"/>
 *     <enumeration value="MNTH_14"/>
 *     <enumeration value="MNTH_15"/>
 *     <enumeration value="MNTH_16"/>
 *     <enumeration value="MNTH_17"/>
 *     <enumeration value="MNTH_18"/>
 *     <enumeration value="MNTH_19"/>
 *     <enumeration value="MNTH_20"/>
 *     <enumeration value="MNTH_21"/>
 *     <enumeration value="MNTH_22"/>
 *     <enumeration value="MNTH_23"/>
 *     <enumeration value="MNTH_24"/>
 *     <enumeration value="MNTH_25"/>
 *     <enumeration value="MNTH_26"/>
 *     <enumeration value="MNTH_27"/>
 *     <enumeration value="MNTH_28"/>
 *     <enumeration value="MNTH_29"/>
 *     <enumeration value="MNTH_30"/>
 *     <enumeration value="MNTH_31"/>
 *     <enumeration value="QURT_01"/>
 *     <enumeration value="QURT_02"/>
 *     <enumeration value="QURT_03"/>
 *     <enumeration value="QURT_04"/>
 *     <enumeration value="QURT_05"/>
 *     <enumeration value="QURT_06"/>
 *     <enumeration value="QURT_07"/>
 *     <enumeration value="QURT_08"/>
 *     <enumeration value="QURT_09"/>
 *     <enumeration value="QURT_10"/>
 *     <enumeration value="QURT_11"/>
 *     <enumeration value="QURT_12"/>
 *     <enumeration value="QURT_13"/>
 *     <enumeration value="QURT_14"/>
 *     <enumeration value="QURT_15"/>
 *     <enumeration value="QURT_16"/>
 *     <enumeration value="QURT_17"/>
 *     <enumeration value="QURT_18"/>
 *     <enumeration value="QURT_19"/>
 *     <enumeration value="QURT_20"/>
 *     <enumeration value="QURT_21"/>
 *     <enumeration value="QURT_22"/>
 *     <enumeration value="QURT_23"/>
 *     <enumeration value="QURT_24"/>
 *     <enumeration value="QURT_25"/>
 *     <enumeration value="QURT_26"/>
 *     <enumeration value="QURT_27"/>
 *     <enumeration value="QURT_28"/>
 *     <enumeration value="QURT_29"/>
 *     <enumeration value="QURT_30"/>
 *     <enumeration value="QURT_31"/>
 *     <enumeration value="MIAN_01"/>
 *     <enumeration value="MIAN_02"/>
 *     <enumeration value="MIAN_03"/>
 *     <enumeration value="MIAN_04"/>
 *     <enumeration value="MIAN_05"/>
 *     <enumeration value="MIAN_06"/>
 *     <enumeration value="MIAN_07"/>
 *     <enumeration value="MIAN_08"/>
 *     <enumeration value="MIAN_09"/>
 *     <enumeration value="MIAN_10"/>
 *     <enumeration value="MIAN_11"/>
 *     <enumeration value="MIAN_12"/>
 *     <enumeration value="MIAN_13"/>
 *     <enumeration value="MIAN_14"/>
 *     <enumeration value="MIAN_15"/>
 *     <enumeration value="MIAN_16"/>
 *     <enumeration value="MIAN_17"/>
 *     <enumeration value="MIAN_18"/>
 *     <enumeration value="MIAN_19"/>
 *     <enumeration value="MIAN_20"/>
 *     <enumeration value="MIAN_21"/>
 *     <enumeration value="MIAN_22"/>
 *     <enumeration value="MIAN_23"/>
 *     <enumeration value="MIAN_24"/>
 *     <enumeration value="MIAN_25"/>
 *     <enumeration value="MIAN_26"/>
 *     <enumeration value="MIAN_27"/>
 *     <enumeration value="MIAN_28"/>
 *     <enumeration value="MIAN_29"/>
 *     <enumeration value="MIAN_30"/>
 *     <enumeration value="MIAN_31"/>
 *     <enumeration value="YEAR_01"/>
 *     <enumeration value="ADHO_01"/>
 *     <enumeration value="ADHO_02"/>
 *     <enumeration value="ADHO_03"/>
 *     <enumeration value="ADHO_04"/>
 *     <enumeration value="ADHO_05"/>
 *     <enumeration value="ADHO_06"/>
 *     <enumeration value="ADHO_07"/>
 *     <enumeration value="ADHO_08"/>
 *     <enumeration value="ADHO_09"/>
 *     <enumeration value="ADHO_10"/>
 *     <enumeration value="ADHO_11"/>
 *     <enumeration value="ADHO_12"/>
 *     <enumeration value="ADHO_13"/>
 *     <enumeration value="ADHO_14"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DebiCheckOptions.CollectionFrequencyDayCodes")
@XmlEnum
public enum DebiCheckOptionsCollectionFrequencyDayCodes {

    WEEK_01,
    WEEK_02,
    WEEK_03,
    WEEK_04,
    WEEK_05,
    WEEK_06,
    WEEK_07,
    FRTN_01,
    FRTN_02,
    FRTN_03,
    FRTN_04,
    FRTN_05,
    FRTN_06,
    FRTN_07,
    FRTN_08,
    FRTN_09,
    FRTN_10,
    FRTN_11,
    FRTN_12,
    FRTN_13,
    FRTN_14,
    MNTH_01,
    MNTH_02,
    MNTH_03,
    MNTH_04,
    MNTH_05,
    MNTH_06,
    MNTH_07,
    MNTH_08,
    MNTH_09,
    MNTH_10,
    MNTH_11,
    MNTH_12,
    MNTH_13,
    MNTH_14,
    MNTH_15,
    MNTH_16,
    MNTH_17,
    MNTH_18,
    MNTH_19,
    MNTH_20,
    MNTH_21,
    MNTH_22,
    MNTH_23,
    MNTH_24,
    MNTH_25,
    MNTH_26,
    MNTH_27,
    MNTH_28,
    MNTH_29,
    MNTH_30,
    MNTH_31,
    QURT_01,
    QURT_02,
    QURT_03,
    QURT_04,
    QURT_05,
    QURT_06,
    QURT_07,
    QURT_08,
    QURT_09,
    QURT_10,
    QURT_11,
    QURT_12,
    QURT_13,
    QURT_14,
    QURT_15,
    QURT_16,
    QURT_17,
    QURT_18,
    QURT_19,
    QURT_20,
    QURT_21,
    QURT_22,
    QURT_23,
    QURT_24,
    QURT_25,
    QURT_26,
    QURT_27,
    QURT_28,
    QURT_29,
    QURT_30,
    QURT_31,
    MIAN_01,
    MIAN_02,
    MIAN_03,
    MIAN_04,
    MIAN_05,
    MIAN_06,
    MIAN_07,
    MIAN_08,
    MIAN_09,
    MIAN_10,
    MIAN_11,
    MIAN_12,
    MIAN_13,
    MIAN_14,
    MIAN_15,
    MIAN_16,
    MIAN_17,
    MIAN_18,
    MIAN_19,
    MIAN_20,
    MIAN_21,
    MIAN_22,
    MIAN_23,
    MIAN_24,
    MIAN_25,
    MIAN_26,
    MIAN_27,
    MIAN_28,
    MIAN_29,
    MIAN_30,
    MIAN_31,
    YEAR_01,
    ADHO_01,
    ADHO_02,
    ADHO_03,
    ADHO_04,
    ADHO_05,
    ADHO_06,
    ADHO_07,
    ADHO_08,
    ADHO_09,
    ADHO_10,
    ADHO_11,
    ADHO_12,
    ADHO_13,
    ADHO_14;

    public String value() {
        return name();
    }

    public static DebiCheckOptionsCollectionFrequencyDayCodes fromValue(String v) {
        return valueOf(v);
    }

}
