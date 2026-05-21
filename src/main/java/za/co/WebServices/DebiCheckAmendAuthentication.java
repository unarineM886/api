
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
 *         <element name="ServiceKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ContractReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CollectionAmountInCents" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         <element name="MaximumCollectionAmountInCents" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
    "serviceKey",
    "contractReference",
    "collectionAmountInCents",
    "maximumCollectionAmountInCents"
})
@XmlRootElement(name = "DebiCheckAmendAuthentication")
public class DebiCheckAmendAuthentication {

    @XmlElementRef(name = "ServiceKey", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceKey;
    @XmlElementRef(name = "ContractReference", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractReference;
    @XmlElementRef(name = "CollectionAmountInCents", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> collectionAmountInCents;
    @XmlElementRef(name = "MaximumCollectionAmountInCents", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> maximumCollectionAmountInCents;

    /**
     * Gets the value of the serviceKey property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceKey() {
        return serviceKey;
    }

    /**
     * Sets the value of the serviceKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceKey(JAXBElement<String> value) {
        this.serviceKey = value;
    }

    /**
     * Gets the value of the contractReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractReference() {
        return contractReference;
    }

    /**
     * Sets the value of the contractReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractReference(JAXBElement<String> value) {
        this.contractReference = value;
    }

    /**
     * Gets the value of the collectionAmountInCents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCollectionAmountInCents() {
        return collectionAmountInCents;
    }

    /**
     * Sets the value of the collectionAmountInCents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCollectionAmountInCents(JAXBElement<Long> value) {
        this.collectionAmountInCents = value;
    }

    /**
     * Gets the value of the maximumCollectionAmountInCents property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMaximumCollectionAmountInCents() {
        return maximumCollectionAmountInCents;
    }

    /**
     * Sets the value of the maximumCollectionAmountInCents property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMaximumCollectionAmountInCents(JAXBElement<Long> value) {
        this.maximumCollectionAmountInCents = value;
    }

}
