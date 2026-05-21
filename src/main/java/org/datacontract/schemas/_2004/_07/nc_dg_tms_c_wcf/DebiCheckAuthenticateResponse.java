
package org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebiCheckAuthenticateResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DebiCheckAuthenticateResponse">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}NIWSResponseContainer">
 *       <sequence>
 *         <element name="BankResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BankservResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ClientResponseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ContractReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Messages" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebiCheckAuthenticateResponse", propOrder = {
    "bankResponseCode",
    "bankservResponseCode",
    "clientResponseCode",
    "contractReference",
    "messages",
    "status"
})
public class DebiCheckAuthenticateResponse
    extends NIWSResponseContainer
{

    @XmlElementRef(name = "BankResponseCode", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankResponseCode;
    @XmlElementRef(name = "BankservResponseCode", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankservResponseCode;
    @XmlElementRef(name = "ClientResponseCode", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientResponseCode;
    @XmlElementRef(name = "ContractReference", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractReference;
    @XmlElementRef(name = "Messages", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> messages;
    @XmlElementRef(name = "Status", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;

    /**
     * Gets the value of the bankResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankResponseCode() {
        return bankResponseCode;
    }

    /**
     * Sets the value of the bankResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankResponseCode(JAXBElement<String> value) {
        this.bankResponseCode = value;
    }

    /**
     * Gets the value of the bankservResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankservResponseCode() {
        return bankservResponseCode;
    }

    /**
     * Sets the value of the bankservResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankservResponseCode(JAXBElement<String> value) {
        this.bankservResponseCode = value;
    }

    /**
     * Gets the value of the clientResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientResponseCode() {
        return clientResponseCode;
    }

    /**
     * Sets the value of the clientResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientResponseCode(JAXBElement<String> value) {
        this.clientResponseCode = value;
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
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setMessages(JAXBElement<ArrayOfstring> value) {
        this.messages = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

}
