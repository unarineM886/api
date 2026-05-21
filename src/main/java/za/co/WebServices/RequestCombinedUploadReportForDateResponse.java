
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
 *         <element name="RequestCombinedUploadReportForDateResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "requestCombinedUploadReportForDateResult"
})
@XmlRootElement(name = "RequestCombinedUploadReportForDateResponse")
public class RequestCombinedUploadReportForDateResponse {

    @XmlElementRef(name = "RequestCombinedUploadReportForDateResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestCombinedUploadReportForDateResult;

    /**
     * Gets the value of the requestCombinedUploadReportForDateResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestCombinedUploadReportForDateResult() {
        return requestCombinedUploadReportForDateResult;
    }

    /**
     * Sets the value of the requestCombinedUploadReportForDateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestCombinedUploadReportForDateResult(JAXBElement<String> value) {
        this.requestCombinedUploadReportForDateResult = value;
    }

}
