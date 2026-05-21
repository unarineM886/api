
package za.co.WebServices;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DebiCheckAuthenticationCurrentStatusResult" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}DebiCheckAuthenticationCurrentStatusResponse" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "debiCheckAuthenticationCurrentStatusResult"
})
@XmlRootElement(name = "DebiCheckAuthenticationCurrentStatusResponse")
public class DebiCheckAuthenticationCurrentStatusResponse {

    @XmlElementRef(name = "DebiCheckAuthenticationCurrentStatusResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.DebiCheckAuthenticationCurrentStatusResponse> debiCheckAuthenticationCurrentStatusResult;

    /**
     * Gets the value of the debiCheckAuthenticationCurrentStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.DebiCheckAuthenticationCurrentStatusResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.DebiCheckAuthenticationCurrentStatusResponse> getDebiCheckAuthenticationCurrentStatusResult() {
        return debiCheckAuthenticationCurrentStatusResult;
    }

    /**
     * Sets the value of the debiCheckAuthenticationCurrentStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.DebiCheckAuthenticationCurrentStatusResponse }{@code >}
     *     
     */
    public void setDebiCheckAuthenticationCurrentStatusResult(JAXBElement<org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.DebiCheckAuthenticationCurrentStatusResponse> value) {
        this.debiCheckAuthenticationCurrentStatusResult = value;
    }

}
