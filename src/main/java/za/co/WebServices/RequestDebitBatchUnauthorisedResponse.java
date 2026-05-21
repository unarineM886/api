
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
 *         <element name="RequestDebitBatchUnauthorisedResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "requestDebitBatchUnauthorisedResult"
})
@XmlRootElement(name = "RequestDebitBatchUnauthorisedResponse")
public class RequestDebitBatchUnauthorisedResponse {

    @XmlElementRef(name = "RequestDebitBatchUnauthorisedResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestDebitBatchUnauthorisedResult;

    /**
     * Gets the value of the requestDebitBatchUnauthorisedResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestDebitBatchUnauthorisedResult() {
        return requestDebitBatchUnauthorisedResult;
    }

    /**
     * Sets the value of the requestDebitBatchUnauthorisedResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestDebitBatchUnauthorisedResult(JAXBElement<String> value) {
        this.requestDebitBatchUnauthorisedResult = value;
    }

}
