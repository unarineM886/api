
package org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LimitResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="LimitResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="Errors" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}Errors" minOccurs="0"/>
 *         <element name="Limits" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}Limits" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitResponse", propOrder = {
    "errors",
    "limits"
})
public class LimitResponse {

    @XmlElementRef(name = "Errors", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<Errors> errors;
    @XmlElementRef(name = "Limits", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<Limits> limits;

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Errors }{@code >}
     *     
     */
    public JAXBElement<Errors> getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Errors }{@code >}
     *     
     */
    public void setErrors(JAXBElement<Errors> value) {
        this.errors = value;
    }

    /**
     * Gets the value of the limits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Limits }{@code >}
     *     
     */
    public JAXBElement<Limits> getLimits() {
        return limits;
    }

    /**
     * Sets the value of the limits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Limits }{@code >}
     *     
     */
    public void setLimits(JAXBElement<Limits> value) {
        this.limits = value;
    }

}
