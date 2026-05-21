
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
 *         <element name="RetrieveProofOfPaymentResult" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}RetrieveProofOfPaymentResponse" minOccurs="0"/>
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
    "retrieveProofOfPaymentResult"
})
@XmlRootElement(name = "RetrieveProofOfPaymentResponse")
public class RetrieveProofOfPaymentResponse {

    @XmlElementRef(name = "RetrieveProofOfPaymentResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.RetrieveProofOfPaymentResponse> retrieveProofOfPaymentResult;

    /**
     * Gets the value of the retrieveProofOfPaymentResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.RetrieveProofOfPaymentResponse }{@code >}
     *     
     */
    public JAXBElement<org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.RetrieveProofOfPaymentResponse> getRetrieveProofOfPaymentResult() {
        return retrieveProofOfPaymentResult;
    }

    /**
     * Sets the value of the retrieveProofOfPaymentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.RetrieveProofOfPaymentResponse }{@code >}
     *     
     */
    public void setRetrieveProofOfPaymentResult(JAXBElement<org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.RetrieveProofOfPaymentResponse> value) {
        this.retrieveProofOfPaymentResult = value;
    }

}
