
package org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AVSRealtimeQueryResponse complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="AVSRealtimeQueryResponse">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}NIWSResponseContainer">
 *       <sequence>
 *         <element name="AcceptsCredits" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}AVSOptions.MatchIndicator" minOccurs="0"/>
 *         <element name="AcceptsDebits" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}AVSOptions.MatchIndicator" minOccurs="0"/>
 *         <element name="AccountActive" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}AVSOptions.MatchIndicator" minOccurs="0"/>
 *         <element name="AccountDormant" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}AVSOptions.MatchIndicator" minOccurs="0"/>
 *         <element name="BankAccountNumberValid" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}AVSOptions.MatchIndicator" minOccurs="0"/>
 *         <element name="EmailMatch" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}AVSOptions.MatchIndicator" minOccurs="0"/>
 *         <element name="FileToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IdNumberMatch" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}AVSOptions.MatchIndicator" minOccurs="0"/>
 *         <element name="InitialMatch" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}AVSOptions.MatchIndicator" minOccurs="0"/>
 *         <element name="LastNameMatch" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}AVSOptions.MatchIndicator" minOccurs="0"/>
 *         <element name="Messages" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="OfflineRequest" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="PeriodActive" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}AVSOptions.MatchIndicator" minOccurs="0"/>
 *         <element name="PhoneNumberMatch" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}AVSOptions.MatchIndicator" minOccurs="0"/>
 *         <element name="TaxRefMatch" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}AVSOptions.MatchIndicator" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AVSRealtimeQueryResponse", propOrder = {
    "acceptsCredits",
    "acceptsDebits",
    "accountActive",
    "accountDormant",
    "bankAccountNumberValid",
    "emailMatch",
    "fileToken",
    "idNumberMatch",
    "initialMatch",
    "lastNameMatch",
    "messages",
    "offlineRequest",
    "periodActive",
    "phoneNumberMatch",
    "taxRefMatch"
})
public class AVSRealtimeQueryResponse
    extends NIWSResponseContainer
{

    @XmlElementRef(name = "AcceptsCredits", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<AVSOptionsMatchIndicator> acceptsCredits;
    @XmlElementRef(name = "AcceptsDebits", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<AVSOptionsMatchIndicator> acceptsDebits;
    @XmlElementRef(name = "AccountActive", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<AVSOptionsMatchIndicator> accountActive;
    @XmlElementRef(name = "AccountDormant", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<AVSOptionsMatchIndicator> accountDormant;
    @XmlElementRef(name = "BankAccountNumberValid", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<AVSOptionsMatchIndicator> bankAccountNumberValid;
    @XmlElementRef(name = "EmailMatch", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<AVSOptionsMatchIndicator> emailMatch;
    @XmlElementRef(name = "FileToken", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fileToken;
    @XmlElementRef(name = "IdNumberMatch", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<AVSOptionsMatchIndicator> idNumberMatch;
    @XmlElementRef(name = "InitialMatch", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<AVSOptionsMatchIndicator> initialMatch;
    @XmlElementRef(name = "LastNameMatch", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<AVSOptionsMatchIndicator> lastNameMatch;
    @XmlElementRef(name = "Messages", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> messages;
    @XmlElement(name = "OfflineRequest")
    protected Boolean offlineRequest;
    @XmlElementRef(name = "PeriodActive", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<AVSOptionsMatchIndicator> periodActive;
    @XmlElementRef(name = "PhoneNumberMatch", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<AVSOptionsMatchIndicator> phoneNumberMatch;
    @XmlElementRef(name = "TaxRefMatch", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<AVSOptionsMatchIndicator> taxRefMatch;

    /**
     * Gets the value of the acceptsCredits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public JAXBElement<AVSOptionsMatchIndicator> getAcceptsCredits() {
        return acceptsCredits;
    }

    /**
     * Sets the value of the acceptsCredits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public void setAcceptsCredits(JAXBElement<AVSOptionsMatchIndicator> value) {
        this.acceptsCredits = value;
    }

    /**
     * Gets the value of the acceptsDebits property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public JAXBElement<AVSOptionsMatchIndicator> getAcceptsDebits() {
        return acceptsDebits;
    }

    /**
     * Sets the value of the acceptsDebits property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public void setAcceptsDebits(JAXBElement<AVSOptionsMatchIndicator> value) {
        this.acceptsDebits = value;
    }

    /**
     * Gets the value of the accountActive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public JAXBElement<AVSOptionsMatchIndicator> getAccountActive() {
        return accountActive;
    }

    /**
     * Sets the value of the accountActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public void setAccountActive(JAXBElement<AVSOptionsMatchIndicator> value) {
        this.accountActive = value;
    }

    /**
     * Gets the value of the accountDormant property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public JAXBElement<AVSOptionsMatchIndicator> getAccountDormant() {
        return accountDormant;
    }

    /**
     * Sets the value of the accountDormant property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public void setAccountDormant(JAXBElement<AVSOptionsMatchIndicator> value) {
        this.accountDormant = value;
    }

    /**
     * Gets the value of the bankAccountNumberValid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public JAXBElement<AVSOptionsMatchIndicator> getBankAccountNumberValid() {
        return bankAccountNumberValid;
    }

    /**
     * Sets the value of the bankAccountNumberValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public void setBankAccountNumberValid(JAXBElement<AVSOptionsMatchIndicator> value) {
        this.bankAccountNumberValid = value;
    }

    /**
     * Gets the value of the emailMatch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public JAXBElement<AVSOptionsMatchIndicator> getEmailMatch() {
        return emailMatch;
    }

    /**
     * Sets the value of the emailMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public void setEmailMatch(JAXBElement<AVSOptionsMatchIndicator> value) {
        this.emailMatch = value;
    }

    /**
     * Gets the value of the fileToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileToken() {
        return fileToken;
    }

    /**
     * Sets the value of the fileToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileToken(JAXBElement<String> value) {
        this.fileToken = value;
    }

    /**
     * Gets the value of the idNumberMatch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public JAXBElement<AVSOptionsMatchIndicator> getIdNumberMatch() {
        return idNumberMatch;
    }

    /**
     * Sets the value of the idNumberMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public void setIdNumberMatch(JAXBElement<AVSOptionsMatchIndicator> value) {
        this.idNumberMatch = value;
    }

    /**
     * Gets the value of the initialMatch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public JAXBElement<AVSOptionsMatchIndicator> getInitialMatch() {
        return initialMatch;
    }

    /**
     * Sets the value of the initialMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public void setInitialMatch(JAXBElement<AVSOptionsMatchIndicator> value) {
        this.initialMatch = value;
    }

    /**
     * Gets the value of the lastNameMatch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public JAXBElement<AVSOptionsMatchIndicator> getLastNameMatch() {
        return lastNameMatch;
    }

    /**
     * Sets the value of the lastNameMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public void setLastNameMatch(JAXBElement<AVSOptionsMatchIndicator> value) {
        this.lastNameMatch = value;
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
     * Gets the value of the offlineRequest property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfflineRequest() {
        return offlineRequest;
    }

    /**
     * Sets the value of the offlineRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfflineRequest(Boolean value) {
        this.offlineRequest = value;
    }

    /**
     * Gets the value of the periodActive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public JAXBElement<AVSOptionsMatchIndicator> getPeriodActive() {
        return periodActive;
    }

    /**
     * Sets the value of the periodActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public void setPeriodActive(JAXBElement<AVSOptionsMatchIndicator> value) {
        this.periodActive = value;
    }

    /**
     * Gets the value of the phoneNumberMatch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public JAXBElement<AVSOptionsMatchIndicator> getPhoneNumberMatch() {
        return phoneNumberMatch;
    }

    /**
     * Sets the value of the phoneNumberMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public void setPhoneNumberMatch(JAXBElement<AVSOptionsMatchIndicator> value) {
        this.phoneNumberMatch = value;
    }

    /**
     * Gets the value of the taxRefMatch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public JAXBElement<AVSOptionsMatchIndicator> getTaxRefMatch() {
        return taxRefMatch;
    }

    /**
     * Sets the value of the taxRefMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     *     
     */
    public void setTaxRefMatch(JAXBElement<AVSOptionsMatchIndicator> value) {
        this.taxRefMatch = value;
    }

}
