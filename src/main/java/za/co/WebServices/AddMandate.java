
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
import org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.MandateOptionsMandateDebitFrequency;
import org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.MandateOptionsMandatePublicHolidayOption;
import org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.MandateOptionsTitle;


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
 *         <element name="MandateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MandateAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="IsConsumer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TradingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="RegistrationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="RegisteredName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DebitFrequency" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}MandateOptions.MandateDebitFrequency" minOccurs="0"/>
 *         <element name="CommencementMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="CommencementDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AgreementDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AgreementReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CancellationNoticePeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="PublicHolidayOption" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}MandateOptions.MandatePublicHolidayOption" minOccurs="0"/>
 *         <element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Field1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Field2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Field3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Field4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Field5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Field6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Field7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Field8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="Field9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AllowVariableDebitAmounts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="BankDetailType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="BankAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BankAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="BankAccountType" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}MandateOptions.BankAccountType" minOccurs="0"/>
 *         <element name="CreditCardToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CreditCardType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ExpiryMonth" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="ExpiryYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="IsIdNumber" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="Title" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}MandateOptions.Title" minOccurs="0"/>
 *         <element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DecemberDebitDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DebitMasterfileGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PhysicalAddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PhysicalAddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PhysicalAddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PhysicalSuburb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PhysicalCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PhysicalProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="PhysicalPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="MandateActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="RequestAVS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="AVSCheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="IncludeDebiCheck" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="DebiCheckMandateTemplateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DebiCheckCollectionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="DebiCheckFirstCollectionDiffers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         <element name="DebiCheckFirstCollectionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DebiCheckFirstCollectionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         <element name="DebiCheckCollectionDayCode" type="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}DebiCheckOptions.CollectionFrequencyDayCodes" minOccurs="0"/>
 *         <element name="AddToMasterFile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "mandateName",
    "mandateAmount",
    "isConsumer",
    "firstName",
    "surname",
    "tradingName",
    "registrationNumber",
    "registeredName",
    "mobileNumber",
    "debitFrequency",
    "commencementMonth",
    "commencementDay",
    "agreementDate",
    "agreementReferenceNumber",
    "cancellationNoticePeriod",
    "publicHolidayOption",
    "notes",
    "field1",
    "field2",
    "field3",
    "field4",
    "field5",
    "field6",
    "field7",
    "field8",
    "field9",
    "allowVariableDebitAmounts",
    "bankDetailType",
    "bankAccountName",
    "bankAccountNumber",
    "branchCode",
    "bankAccountType",
    "creditCardToken",
    "creditCardType",
    "expiryMonth",
    "expiryYear",
    "isIdNumber",
    "title",
    "emailAddress",
    "phoneNumber",
    "dateOfBirth",
    "decemberDebitDay",
    "debitMasterfileGroup",
    "physicalAddressLine1",
    "physicalAddressLine2",
    "physicalAddressLine3",
    "physicalSuburb",
    "physicalCity",
    "physicalProvince",
    "physicalPostalCode",
    "mandateActive",
    "requestAVS",
    "avsCheckNumber",
    "includeDebiCheck",
    "debiCheckMandateTemplateId",
    "debiCheckCollectionAmount",
    "debiCheckFirstCollectionDiffers",
    "debiCheckFirstCollectionDate",
    "debiCheckFirstCollectionAmount",
    "debiCheckCollectionDayCode",
    "addToMasterFile"
})
@XmlRootElement(name = "AddMandate")
public class AddMandate {

    @XmlElementRef(name = "ServiceKey", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceKey;
    @XmlElementRef(name = "AccountReference", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountReference;
    @XmlElementRef(name = "MandateName", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mandateName;
    @XmlElement(name = "MandateAmount")
    protected BigDecimal mandateAmount;
    @XmlElement(name = "IsConsumer")
    protected Boolean isConsumer;
    @XmlElementRef(name = "FirstName", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstName;
    @XmlElementRef(name = "Surname", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> surname;
    @XmlElementRef(name = "TradingName", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tradingName;
    @XmlElementRef(name = "RegistrationNumber", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrationNumber;
    @XmlElementRef(name = "RegisteredName", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registeredName;
    @XmlElementRef(name = "MobileNumber", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mobileNumber;
    @XmlElement(name = "DebitFrequency")
    @XmlSchemaType(name = "string")
    protected MandateOptionsMandateDebitFrequency debitFrequency;
    @XmlElement(name = "CommencementMonth")
    protected Integer commencementMonth;
    @XmlElementRef(name = "CommencementDay", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> commencementDay;
    @XmlElementRef(name = "AgreementDate", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agreementDate;
    @XmlElementRef(name = "AgreementReferenceNumber", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> agreementReferenceNumber;
    @XmlElementRef(name = "CancellationNoticePeriod", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cancellationNoticePeriod;
    @XmlElementRef(name = "PublicHolidayOption", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<MandateOptionsMandatePublicHolidayOption> publicHolidayOption;
    @XmlElementRef(name = "Notes", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notes;
    @XmlElementRef(name = "Field1", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> field1;
    @XmlElementRef(name = "Field2", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> field2;
    @XmlElementRef(name = "Field3", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> field3;
    @XmlElementRef(name = "Field4", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> field4;
    @XmlElementRef(name = "Field5", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> field5;
    @XmlElementRef(name = "Field6", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> field6;
    @XmlElementRef(name = "Field7", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> field7;
    @XmlElementRef(name = "Field8", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> field8;
    @XmlElementRef(name = "Field9", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> field9;
    @XmlElementRef(name = "AllowVariableDebitAmounts", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> allowVariableDebitAmounts;
    @XmlElementRef(name = "BankDetailType", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> bankDetailType;
    @XmlElementRef(name = "BankAccountName", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankAccountName;
    @XmlElementRef(name = "BankAccountNumber", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankAccountNumber;
    @XmlElementRef(name = "BranchCode", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> branchCode;
    @XmlElementRef(name = "BankAccountType", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<MandateOptionsBankAccountType> bankAccountType;
    @XmlElementRef(name = "CreditCardToken", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creditCardToken;
    @XmlElementRef(name = "CreditCardType", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> creditCardType;
    @XmlElementRef(name = "ExpiryMonth", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> expiryMonth;
    @XmlElementRef(name = "ExpiryYear", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> expiryYear;
    @XmlElementRef(name = "IsIdNumber", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isIdNumber;
    @XmlElementRef(name = "Title", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<MandateOptionsTitle> title;
    @XmlElementRef(name = "EmailAddress", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailAddress;
    @XmlElementRef(name = "PhoneNumber", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> phoneNumber;
    @XmlElementRef(name = "DateOfBirth", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateOfBirth;
    @XmlElementRef(name = "DecemberDebitDay", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> decemberDebitDay;
    @XmlElementRef(name = "DebitMasterfileGroup", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> debitMasterfileGroup;
    @XmlElementRef(name = "PhysicalAddressLine1", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> physicalAddressLine1;
    @XmlElementRef(name = "PhysicalAddressLine2", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> physicalAddressLine2;
    @XmlElementRef(name = "PhysicalAddressLine3", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> physicalAddressLine3;
    @XmlElementRef(name = "PhysicalSuburb", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> physicalSuburb;
    @XmlElementRef(name = "PhysicalCity", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> physicalCity;
    @XmlElementRef(name = "PhysicalProvince", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> physicalProvince;
    @XmlElementRef(name = "PhysicalPostalCode", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> physicalPostalCode;
    @XmlElementRef(name = "MandateActive", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> mandateActive;
    @XmlElementRef(name = "RequestAVS", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> requestAVS;
    @XmlElementRef(name = "AVSCheckNumber", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> avsCheckNumber;
    @XmlElement(name = "IncludeDebiCheck")
    protected Boolean includeDebiCheck;
    @XmlElementRef(name = "DebiCheckMandateTemplateId", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> debiCheckMandateTemplateId;
    @XmlElementRef(name = "DebiCheckCollectionAmount", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> debiCheckCollectionAmount;
    @XmlElementRef(name = "DebiCheckFirstCollectionDiffers", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> debiCheckFirstCollectionDiffers;
    @XmlElementRef(name = "DebiCheckFirstCollectionDate", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> debiCheckFirstCollectionDate;
    @XmlElementRef(name = "DebiCheckFirstCollectionAmount", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> debiCheckFirstCollectionAmount;
    @XmlElementRef(name = "DebiCheckCollectionDayCode", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<DebiCheckOptionsCollectionFrequencyDayCodes> debiCheckCollectionDayCode;
    @XmlElementRef(name = "AddToMasterFile", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> addToMasterFile;

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
     * Gets the value of the mandateName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMandateName() {
        return mandateName;
    }

    /**
     * Sets the value of the mandateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMandateName(JAXBElement<String> value) {
        this.mandateName = value;
    }

    /**
     * Gets the value of the mandateAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMandateAmount() {
        return mandateAmount;
    }

    /**
     * Sets the value of the mandateAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMandateAmount(BigDecimal value) {
        this.mandateAmount = value;
    }

    /**
     * Gets the value of the isConsumer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsConsumer() {
        return isConsumer;
    }

    /**
     * Sets the value of the isConsumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConsumer(Boolean value) {
        this.isConsumer = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstName(JAXBElement<String> value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSurname(JAXBElement<String> value) {
        this.surname = value;
    }

    /**
     * Gets the value of the tradingName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTradingName() {
        return tradingName;
    }

    /**
     * Sets the value of the tradingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTradingName(JAXBElement<String> value) {
        this.tradingName = value;
    }

    /**
     * Gets the value of the registrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * Sets the value of the registrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationNumber(JAXBElement<String> value) {
        this.registrationNumber = value;
    }

    /**
     * Gets the value of the registeredName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegisteredName() {
        return registeredName;
    }

    /**
     * Sets the value of the registeredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegisteredName(JAXBElement<String> value) {
        this.registeredName = value;
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
     * Gets the value of the debitFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link MandateOptionsMandateDebitFrequency }
     *     
     */
    public MandateOptionsMandateDebitFrequency getDebitFrequency() {
        return debitFrequency;
    }

    /**
     * Sets the value of the debitFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link MandateOptionsMandateDebitFrequency }
     *     
     */
    public void setDebitFrequency(MandateOptionsMandateDebitFrequency value) {
        this.debitFrequency = value;
    }

    /**
     * Gets the value of the commencementMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCommencementMonth() {
        return commencementMonth;
    }

    /**
     * Sets the value of the commencementMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCommencementMonth(Integer value) {
        this.commencementMonth = value;
    }

    /**
     * Gets the value of the commencementDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommencementDay() {
        return commencementDay;
    }

    /**
     * Sets the value of the commencementDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommencementDay(JAXBElement<String> value) {
        this.commencementDay = value;
    }

    /**
     * Gets the value of the agreementDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgreementDate() {
        return agreementDate;
    }

    /**
     * Sets the value of the agreementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgreementDate(JAXBElement<String> value) {
        this.agreementDate = value;
    }

    /**
     * Gets the value of the agreementReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAgreementReferenceNumber() {
        return agreementReferenceNumber;
    }

    /**
     * Sets the value of the agreementReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAgreementReferenceNumber(JAXBElement<String> value) {
        this.agreementReferenceNumber = value;
    }

    /**
     * Gets the value of the cancellationNoticePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCancellationNoticePeriod() {
        return cancellationNoticePeriod;
    }

    /**
     * Sets the value of the cancellationNoticePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCancellationNoticePeriod(JAXBElement<Integer> value) {
        this.cancellationNoticePeriod = value;
    }

    /**
     * Gets the value of the publicHolidayOption property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MandateOptionsMandatePublicHolidayOption }{@code >}
     *     
     */
    public JAXBElement<MandateOptionsMandatePublicHolidayOption> getPublicHolidayOption() {
        return publicHolidayOption;
    }

    /**
     * Sets the value of the publicHolidayOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MandateOptionsMandatePublicHolidayOption }{@code >}
     *     
     */
    public void setPublicHolidayOption(JAXBElement<MandateOptionsMandatePublicHolidayOption> value) {
        this.publicHolidayOption = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotes(JAXBElement<String> value) {
        this.notes = value;
    }

    /**
     * Gets the value of the field1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getField1() {
        return field1;
    }

    /**
     * Sets the value of the field1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setField1(JAXBElement<String> value) {
        this.field1 = value;
    }

    /**
     * Gets the value of the field2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getField2() {
        return field2;
    }

    /**
     * Sets the value of the field2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setField2(JAXBElement<String> value) {
        this.field2 = value;
    }

    /**
     * Gets the value of the field3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getField3() {
        return field3;
    }

    /**
     * Sets the value of the field3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setField3(JAXBElement<String> value) {
        this.field3 = value;
    }

    /**
     * Gets the value of the field4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getField4() {
        return field4;
    }

    /**
     * Sets the value of the field4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setField4(JAXBElement<String> value) {
        this.field4 = value;
    }

    /**
     * Gets the value of the field5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getField5() {
        return field5;
    }

    /**
     * Sets the value of the field5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setField5(JAXBElement<String> value) {
        this.field5 = value;
    }

    /**
     * Gets the value of the field6 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getField6() {
        return field6;
    }

    /**
     * Sets the value of the field6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setField6(JAXBElement<String> value) {
        this.field6 = value;
    }

    /**
     * Gets the value of the field7 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getField7() {
        return field7;
    }

    /**
     * Sets the value of the field7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setField7(JAXBElement<String> value) {
        this.field7 = value;
    }

    /**
     * Gets the value of the field8 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getField8() {
        return field8;
    }

    /**
     * Sets the value of the field8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setField8(JAXBElement<String> value) {
        this.field8 = value;
    }

    /**
     * Gets the value of the field9 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getField9() {
        return field9;
    }

    /**
     * Sets the value of the field9 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setField9(JAXBElement<String> value) {
        this.field9 = value;
    }

    /**
     * Gets the value of the allowVariableDebitAmounts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAllowVariableDebitAmounts() {
        return allowVariableDebitAmounts;
    }

    /**
     * Sets the value of the allowVariableDebitAmounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAllowVariableDebitAmounts(JAXBElement<Boolean> value) {
        this.allowVariableDebitAmounts = value;
    }

    /**
     * Gets the value of the bankDetailType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBankDetailType() {
        return bankDetailType;
    }

    /**
     * Sets the value of the bankDetailType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBankDetailType(JAXBElement<Integer> value) {
        this.bankDetailType = value;
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
     * Gets the value of the bankAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MandateOptionsBankAccountType }{@code >}
     *     
     */
    public JAXBElement<MandateOptionsBankAccountType> getBankAccountType() {
        return bankAccountType;
    }

    /**
     * Sets the value of the bankAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MandateOptionsBankAccountType }{@code >}
     *     
     */
    public void setBankAccountType(JAXBElement<MandateOptionsBankAccountType> value) {
        this.bankAccountType = value;
    }

    /**
     * Gets the value of the creditCardToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditCardToken() {
        return creditCardToken;
    }

    /**
     * Sets the value of the creditCardToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditCardToken(JAXBElement<String> value) {
        this.creditCardToken = value;
    }

    /**
     * Gets the value of the creditCardType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCreditCardType() {
        return creditCardType;
    }

    /**
     * Sets the value of the creditCardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCreditCardType(JAXBElement<Integer> value) {
        this.creditCardType = value;
    }

    /**
     * Gets the value of the expiryMonth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExpiryMonth() {
        return expiryMonth;
    }

    /**
     * Sets the value of the expiryMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExpiryMonth(JAXBElement<Integer> value) {
        this.expiryMonth = value;
    }

    /**
     * Gets the value of the expiryYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getExpiryYear() {
        return expiryYear;
    }

    /**
     * Sets the value of the expiryYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setExpiryYear(JAXBElement<Integer> value) {
        this.expiryYear = value;
    }

    /**
     * Gets the value of the isIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsIdNumber() {
        return isIdNumber;
    }

    /**
     * Sets the value of the isIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsIdNumber(JAXBElement<Boolean> value) {
        this.isIdNumber = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MandateOptionsTitle }{@code >}
     *     
     */
    public JAXBElement<MandateOptionsTitle> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MandateOptionsTitle }{@code >}
     *     
     */
    public void setTitle(JAXBElement<MandateOptionsTitle> value) {
        this.title = value;
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
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhoneNumber(JAXBElement<String> value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateOfBirth(JAXBElement<String> value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the decemberDebitDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDecemberDebitDay() {
        return decemberDebitDay;
    }

    /**
     * Sets the value of the decemberDebitDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDecemberDebitDay(JAXBElement<String> value) {
        this.decemberDebitDay = value;
    }

    /**
     * Gets the value of the debitMasterfileGroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDebitMasterfileGroup() {
        return debitMasterfileGroup;
    }

    /**
     * Sets the value of the debitMasterfileGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDebitMasterfileGroup(JAXBElement<String> value) {
        this.debitMasterfileGroup = value;
    }

    /**
     * Gets the value of the physicalAddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhysicalAddressLine1() {
        return physicalAddressLine1;
    }

    /**
     * Sets the value of the physicalAddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhysicalAddressLine1(JAXBElement<String> value) {
        this.physicalAddressLine1 = value;
    }

    /**
     * Gets the value of the physicalAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhysicalAddressLine2() {
        return physicalAddressLine2;
    }

    /**
     * Sets the value of the physicalAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhysicalAddressLine2(JAXBElement<String> value) {
        this.physicalAddressLine2 = value;
    }

    /**
     * Gets the value of the physicalAddressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhysicalAddressLine3() {
        return physicalAddressLine3;
    }

    /**
     * Sets the value of the physicalAddressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhysicalAddressLine3(JAXBElement<String> value) {
        this.physicalAddressLine3 = value;
    }

    /**
     * Gets the value of the physicalSuburb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhysicalSuburb() {
        return physicalSuburb;
    }

    /**
     * Sets the value of the physicalSuburb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhysicalSuburb(JAXBElement<String> value) {
        this.physicalSuburb = value;
    }

    /**
     * Gets the value of the physicalCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhysicalCity() {
        return physicalCity;
    }

    /**
     * Sets the value of the physicalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhysicalCity(JAXBElement<String> value) {
        this.physicalCity = value;
    }

    /**
     * Gets the value of the physicalProvince property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhysicalProvince() {
        return physicalProvince;
    }

    /**
     * Sets the value of the physicalProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhysicalProvince(JAXBElement<String> value) {
        this.physicalProvince = value;
    }

    /**
     * Gets the value of the physicalPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPhysicalPostalCode() {
        return physicalPostalCode;
    }

    /**
     * Sets the value of the physicalPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPhysicalPostalCode(JAXBElement<String> value) {
        this.physicalPostalCode = value;
    }

    /**
     * Gets the value of the mandateActive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getMandateActive() {
        return mandateActive;
    }

    /**
     * Sets the value of the mandateActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setMandateActive(JAXBElement<Boolean> value) {
        this.mandateActive = value;
    }

    /**
     * Gets the value of the requestAVS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRequestAVS() {
        return requestAVS;
    }

    /**
     * Sets the value of the requestAVS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRequestAVS(JAXBElement<Boolean> value) {
        this.requestAVS = value;
    }

    /**
     * Gets the value of the avsCheckNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAVSCheckNumber() {
        return avsCheckNumber;
    }

    /**
     * Sets the value of the avsCheckNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAVSCheckNumber(JAXBElement<String> value) {
        this.avsCheckNumber = value;
    }

    /**
     * Gets the value of the includeDebiCheck property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeDebiCheck() {
        return includeDebiCheck;
    }

    /**
     * Sets the value of the includeDebiCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeDebiCheck(Boolean value) {
        this.includeDebiCheck = value;
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
     * Gets the value of the debiCheckCollectionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDebiCheckCollectionAmount() {
        return debiCheckCollectionAmount;
    }

    /**
     * Sets the value of the debiCheckCollectionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDebiCheckCollectionAmount(JAXBElement<BigDecimal> value) {
        this.debiCheckCollectionAmount = value;
    }

    /**
     * Gets the value of the debiCheckFirstCollectionDiffers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDebiCheckFirstCollectionDiffers() {
        return debiCheckFirstCollectionDiffers;
    }

    /**
     * Sets the value of the debiCheckFirstCollectionDiffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDebiCheckFirstCollectionDiffers(JAXBElement<Boolean> value) {
        this.debiCheckFirstCollectionDiffers = value;
    }

    /**
     * Gets the value of the debiCheckFirstCollectionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDebiCheckFirstCollectionDate() {
        return debiCheckFirstCollectionDate;
    }

    /**
     * Sets the value of the debiCheckFirstCollectionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDebiCheckFirstCollectionDate(JAXBElement<String> value) {
        this.debiCheckFirstCollectionDate = value;
    }

    /**
     * Gets the value of the debiCheckFirstCollectionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDebiCheckFirstCollectionAmount() {
        return debiCheckFirstCollectionAmount;
    }

    /**
     * Sets the value of the debiCheckFirstCollectionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDebiCheckFirstCollectionAmount(JAXBElement<BigDecimal> value) {
        this.debiCheckFirstCollectionAmount = value;
    }

    /**
     * Gets the value of the debiCheckCollectionDayCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DebiCheckOptionsCollectionFrequencyDayCodes }{@code >}
     *     
     */
    public JAXBElement<DebiCheckOptionsCollectionFrequencyDayCodes> getDebiCheckCollectionDayCode() {
        return debiCheckCollectionDayCode;
    }

    /**
     * Sets the value of the debiCheckCollectionDayCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DebiCheckOptionsCollectionFrequencyDayCodes }{@code >}
     *     
     */
    public void setDebiCheckCollectionDayCode(JAXBElement<DebiCheckOptionsCollectionFrequencyDayCodes> value) {
        this.debiCheckCollectionDayCode = value;
    }

    /**
     * Gets the value of the addToMasterFile property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAddToMasterFile() {
        return addToMasterFile;
    }

    /**
     * Sets the value of the addToMasterFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAddToMasterFile(JAXBElement<Boolean> value) {
        this.addToMasterFile = value;
    }

}
