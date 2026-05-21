
package org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for DebiCheckOptions.CancellationReasonCodes</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="DebiCheckOptions.CancellationReasonCodes">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="AGNT"/>
 *     <enumeration value="CURR"/>
 *     <enumeration value="CUST"/>
 *     <enumeration value="CUTA"/>
 *     <enumeration value="DUPL"/>
 *     <enumeration value="FRAD"/>
 *     <enumeration value="UPAY"/>
 *     <enumeration value="FRTR"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "DebiCheckOptions.CancellationReasonCodes")
@XmlEnum
public enum DebiCheckOptionsCancellationReasonCodes {

    AGNT,
    CURR,
    CUST,
    CUTA,
    DUPL,
    FRAD,
    UPAY,
    FRTR;

    public String value() {
        return name();
    }

    public static DebiCheckOptionsCancellationReasonCodes fromValue(String v) {
        return valueOf(v);
    }

}
