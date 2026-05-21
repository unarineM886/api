
package za.co.WebServices;

import java.math.BigDecimal;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.DebiCheckOptionsCollectionFrequencyDayCodes;
import org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.MandateOptionsBankAccountType;


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
 *         <element name="AccountReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DebiCheckMandateTemplateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IsIdNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="DebtorIdentification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BankAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BankAccountType" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}MandateOptions.BankAccountType" minOccurs="0"/>
 *         <element name="MobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CollectionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="FirstCollectionDiffers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="FirstCollectionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="FirstCollectionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="collectionDayCode" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}DebiCheckOptions.CollectionFrequencyDayCodes" minOccurs="0"/>
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
    "accountReference",
    "debiCheckMandateTemplateId",
    "isIdNumber",
    "debtorIdentification",
    "accountName",
    "bankAccountName",
    "branchCode",
    "bankAccountNumber",
    "bankAccountType",
    "mobileNumber",
    "emailAddress",
    "collectionAmount",
    "firstCollectionDiffers",
    "firstCollectionAmount",
    "firstCollectionDate",
    "collectionDayCode"
})
@XmlRootElement(name = "DebiCheckAuthenticate")
public class DebiCheckAuthenticate {

    @XmlElementRef(name = "ServiceKey", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceKey;
    @XmlElementRef(name = "AccountReference", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountReference;
    @XmlElementRef(name = "DebiCheckMandateTemplateId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> debiCheckMandateTemplateId;
    @XmlElement(name = "IsIdNumber")
    protected Boolean isIdNumber;
    @XmlElementRef(name = "DebtorIdentification", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> debtorIdentification;
    @XmlElementRef(name = "AccountName", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountName;
    @XmlElementRef(name = "BankAccountName", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankAccountName;
    @XmlElementRef(name = "BranchCode", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> branchCode;
    @XmlElementRef(name = "BankAccountNumber", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankAccountNumber;
    @XmlElement(name = "BankAccountType")
    @XmlSchemaType(name = "string")
    protected MandateOptionsBankAccountType bankAccountType;
    @XmlElementRef(name = "MobileNumber", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileNumber;
    @XmlElementRef(name = "EmailAddress", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailAddress;
    @XmlElement(name = "CollectionAmount")
    protected BigDecimal collectionAmount;
    @XmlElement(name = "FirstCollectionDiffers")
    protected Boolean firstCollectionDiffers;
    @XmlElementRef(name = "FirstCollectionAmount", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> firstCollectionAmount;
    @XmlElementRef(name = "FirstCollectionDate", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstCollectionDate;
    @XmlElementRef(name = "collectionDayCode", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<DebiCheckOptionsCollectionFrequencyDayCodes> collectionDayCode;

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
     * Gets the value of the accountReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountReference() {
        return accountReference;
    }

    /**
     * Sets the value of the accountReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountReference(JAXBElement<String> value) {
        this.accountReference = value;
    }

    /**
     * Gets the value of the debiCheckMandateTemplateId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDebiCheckMandateTemplateId() {
        return debiCheckMandateTemplateId;
    }

    /**
     * Sets the value of the debiCheckMandateTemplateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDebiCheckMandateTemplateId(JAXBElement<String> value) {
        this.debiCheckMandateTemplateId = value;
    }

    /**
     * Gets the value of the isIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsIdNumber() {
        return isIdNumber;
    }

    /**
     * Sets the value of the isIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIdNumber(Boolean value) {
        this.isIdNumber = value;
    }

    /**
     * Gets the value of the debtorIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDebtorIdentification() {
        return debtorIdentification;
    }

    /**
     * Sets the value of the debtorIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDebtorIdentification(JAXBElement<String> value) {
        this.debtorIdentification = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountName(JAXBElement<String> value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the bankAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankAccountName() {
        return bankAccountName;
    }

    /**
     * Sets the value of the bankAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankAccountName(JAXBElement<String> value) {
        this.bankAccountName = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBranchCode(JAXBElement<String> value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the bankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Sets the value of the bankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankAccountNumber(JAXBElement<String> value) {
        this.bankAccountNumber = value;
    }

    /**
     * Gets the value of the bankAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link MandateOptionsBankAccountType }
     *     
     */
    public MandateOptionsBankAccountType getBankAccountType() {
        return bankAccountType;
    }

    /**
     * Sets the value of the bankAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateOptionsBankAccountType }
     *     
     */
    public void setBankAccountType(MandateOptionsBankAccountType value) {
        this.bankAccountType = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMobileNumber(JAXBElement<String> value) {
        this.mobileNumber = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailAddress(JAXBElement<String> value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the collectionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCollectionAmount() {
        return collectionAmount;
    }

    /**
     * Sets the value of the collectionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCollectionAmount(BigDecimal value) {
        this.collectionAmount = value;
    }

    /**
     * Gets the value of the firstCollectionDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirstCollectionDiffers() {
        return firstCollectionDiffers;
    }

    /**
     * Sets the value of the firstCollectionDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirstCollectionDiffers(Boolean value) {
        this.firstCollectionDiffers = value;
    }

    /**
     * Gets the value of the firstCollectionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getFirstCollectionAmount() {
        return firstCollectionAmount;
    }

    /**
     * Sets the value of the firstCollectionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setFirstCollectionAmount(JAXBElement<BigDecimal> value) {
        this.firstCollectionAmount = value;
    }

    /**
     * Gets the value of the firstCollectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstCollectionDate() {
        return firstCollectionDate;
    }

    /**
     * Sets the value of the firstCollectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstCollectionDate(JAXBElement<String> value) {
        this.firstCollectionDate = value;
    }

    /**
     * Gets the value of the collectionDayCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DebiCheckOptionsCollectionFrequencyDayCodes }{@code >}
     *     
     */
    public JAXBElement<DebiCheckOptionsCollectionFrequencyDayCodes> getCollectionDayCode() {
        return collectionDayCode;
    }

    /**
     * Sets the value of the collectionDayCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DebiCheckOptionsCollectionFrequencyDayCodes }{@code >}
     *     
     */
    public void setCollectionDayCode(JAXBElement<DebiCheckOptionsCollectionFrequencyDayCodes> value) {
        this.collectionDayCode = value;
    }

}
