
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
 *         <element name="RetrieveSpecificBatchStatusResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "retrieveSpecificBatchStatusResult"
})
@XmlRootElement(name = "RetrieveSpecificBatchStatusResponse")
public class RetrieveSpecificBatchStatusResponse {

    @XmlElementRef(name = "RetrieveSpecificBatchStatusResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> retrieveSpecificBatchStatusResult;

    /**
     * Gets the value of the retrieveSpecificBatchStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRetrieveSpecificBatchStatusResult() {
        return retrieveSpecificBatchStatusResult;
    }

    /**
     * Sets the value of the retrieveSpecificBatchStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRetrieveSpecificBatchStatusResult(JAXBElement<String> value) {
        this.retrieveSpecificBatchStatusResult = value;
    }

}
