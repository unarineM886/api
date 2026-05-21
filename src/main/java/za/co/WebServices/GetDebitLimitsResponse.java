
package za.co.WebServices;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.LimitResponse;


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
 *         <element name="GetDebitLimitsResult" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}LimitResponse" minOccurs="0"/>
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
    "getDebitLimitsResult"
})
@XmlRootElement(name = "GetDebitLimitsResponse")
public class GetDebitLimitsResponse {

    @XmlElementRef(name = "GetDebitLimitsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<LimitResponse> getDebitLimitsResult;

    /**
     * Gets the value of the getDebitLimitsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LimitResponse }{@code >}
     *     
     */
    public JAXBElement<LimitResponse> getGetDebitLimitsResult() {
        return getDebitLimitsResult;
    }

    /**
     * Sets the value of the getDebitLimitsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LimitResponse }{@code >}
     *     
     */
    public void setGetDebitLimitsResult(JAXBElement<LimitResponse> value) {
        this.getDebitLimitsResult = value;
    }

}
