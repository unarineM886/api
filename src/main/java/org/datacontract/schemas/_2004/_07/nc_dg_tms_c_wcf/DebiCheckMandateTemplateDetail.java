
package org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf;

import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DebiCheckMandateTemplateDetail complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="DebiCheckMandateTemplateDetail">
 *   <complexContent>
 *     <extension base="{http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS}NIWSResponseContainer">
 *       <sequence>
 *         <element name="AdjustmentAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AdjustmentCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AdjustmentRuleIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AdjustmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="AuthenticationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CollectionFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="CollectionFrequencyDayCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DebitEntryClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DebitValueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DebtorAuthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="DebtorAuthenticationRequired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="InitiationDayOptions" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         <element name="InstallmentOccurrence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="RMS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TemplateId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TemplateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TrackingDayCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="TrackingIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       </sequence>
 *     </extension>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebiCheckMandateTemplateDetail", propOrder = {
    "adjustmentAmount",
    "adjustmentCategory",
    "adjustmentRuleIndicator",
    "adjustmentType",
    "authenticationType",
    "collectionFrequency",
    "collectionFrequencyDayCode",
    "debitEntryClassCode",
    "debitValueType",
    "debtorAuthCode",
    "debtorAuthenticationRequired",
    "initiationDayOptions",
    "installmentOccurrence",
    "rms",
    "templateId",
    "templateName",
    "trackingDayCode",
    "trackingIndicator"
})
public class DebiCheckMandateTemplateDetail
    extends NIWSResponseContainer
{

    @XmlElementRef(name = "AdjustmentAmount", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adjustmentAmount;
    @XmlElementRef(name = "AdjustmentCategory", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adjustmentCategory;
    @XmlElementRef(name = "AdjustmentRuleIndicator", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adjustmentRuleIndicator;
    @XmlElementRef(name = "AdjustmentType", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adjustmentType;
    @XmlElementRef(name = "AuthenticationType", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> authenticationType;
    @XmlElementRef(name = "CollectionFrequency", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> collectionFrequency;
    @XmlElementRef(name = "CollectionFrequencyDayCode", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> collectionFrequencyDayCode;
    @XmlElementRef(name = "DebitEntryClassCode", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> debitEntryClassCode;
    @XmlElementRef(name = "DebitValueType", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> debitValueType;
    @XmlElementRef(name = "DebtorAuthCode", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> debtorAuthCode;
    @XmlElementRef(name = "DebtorAuthenticationRequired", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> debtorAuthenticationRequired;
    @XmlElementRef(name = "InitiationDayOptions", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> initiationDayOptions;
    @XmlElementRef(name = "InstallmentOccurrence", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> installmentOccurrence;
    @XmlElementRef(name = "RMS", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rms;
    @XmlElementRef(name = "TemplateId", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> templateId;
    @XmlElementRef(name = "TemplateName", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> templateName;
    @XmlElementRef(name = "TrackingDayCode", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trackingDayCode;
    @XmlElementRef(name = "TrackingIndicator", namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trackingIndicator;

    /**
     * Gets the value of the adjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdjustmentAmount() {
        return adjustmentAmount;
    }

    /**
     * Sets the value of the adjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdjustmentAmount(JAXBElement<String> value) {
        this.adjustmentAmount = value;
    }

    /**
     * Gets the value of the adjustmentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdjustmentCategory() {
        return adjustmentCategory;
    }

    /**
     * Sets the value of the adjustmentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdjustmentCategory(JAXBElement<String> value) {
        this.adjustmentCategory = value;
    }

    /**
     * Gets the value of the adjustmentRuleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdjustmentRuleIndicator() {
        return adjustmentRuleIndicator;
    }

    /**
     * Sets the value of the adjustmentRuleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdjustmentRuleIndicator(JAXBElement<String> value) {
        this.adjustmentRuleIndicator = value;
    }

    /**
     * Gets the value of the adjustmentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdjustmentType() {
        return adjustmentType;
    }

    /**
     * Sets the value of the adjustmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdjustmentType(JAXBElement<String> value) {
        this.adjustmentType = value;
    }

    /**
     * Gets the value of the authenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Sets the value of the authenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthenticationType(JAXBElement<String> value) {
        this.authenticationType = value;
    }

    /**
     * Gets the value of the collectionFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCollectionFrequency() {
        return collectionFrequency;
    }

    /**
     * Sets the value of the collectionFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCollectionFrequency(JAXBElement<String> value) {
        this.collectionFrequency = value;
    }

    /**
     * Gets the value of the collectionFrequencyDayCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCollectionFrequencyDayCode() {
        return collectionFrequencyDayCode;
    }

    /**
     * Sets the value of the collectionFrequencyDayCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCollectionFrequencyDayCode(JAXBElement<String> value) {
        this.collectionFrequencyDayCode = value;
    }

    /**
     * Gets the value of the debitEntryClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDebitEntryClassCode() {
        return debitEntryClassCode;
    }

    /**
     * Sets the value of the debitEntryClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDebitEntryClassCode(JAXBElement<String> value) {
        this.debitEntryClassCode = value;
    }

    /**
     * Gets the value of the debitValueType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDebitValueType() {
        return debitValueType;
    }

    /**
     * Sets the value of the debitValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDebitValueType(JAXBElement<String> value) {
        this.debitValueType = value;
    }

    /**
     * Gets the value of the debtorAuthCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDebtorAuthCode() {
        return debtorAuthCode;
    }

    /**
     * Sets the value of the debtorAuthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDebtorAuthCode(JAXBElement<String> value) {
        this.debtorAuthCode = value;
    }

    /**
     * Gets the value of the debtorAuthenticationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDebtorAuthenticationRequired() {
        return debtorAuthenticationRequired;
    }

    /**
     * Sets the value of the debtorAuthenticationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDebtorAuthenticationRequired(JAXBElement<String> value) {
        this.debtorAuthenticationRequired = value;
    }

    /**
     * Gets the value of the initiationDayOptions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getInitiationDayOptions() {
        return initiationDayOptions;
    }

    /**
     * Sets the value of the initiationDayOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setInitiationDayOptions(JAXBElement<ArrayOfstring> value) {
        this.initiationDayOptions = value;
    }

    /**
     * Gets the value of the installmentOccurrence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstallmentOccurrence() {
        return installmentOccurrence;
    }

    /**
     * Sets the value of the installmentOccurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstallmentOccurrence(JAXBElement<String> value) {
        this.installmentOccurrence = value;
    }

    /**
     * Gets the value of the rms property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRMS() {
        return rms;
    }

    /**
     * Sets the value of the rms property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRMS(JAXBElement<String> value) {
        this.rms = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTemplateId() {
        return templateId;
    }

    /**
     * Sets the value of the templateId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTemplateId(JAXBElement<String> value) {
        this.templateId = value;
    }

    /**
     * Gets the value of the templateName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTemplateName() {
        return templateName;
    }

    /**
     * Sets the value of the templateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTemplateName(JAXBElement<String> value) {
        this.templateName = value;
    }

    /**
     * Gets the value of the trackingDayCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrackingDayCode() {
        return trackingDayCode;
    }

    /**
     * Sets the value of the trackingDayCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrackingDayCode(JAXBElement<String> value) {
        this.trackingDayCode = value;
    }

    /**
     * Gets the value of the trackingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrackingIndicator() {
        return trackingIndicator;
    }

    /**
     * Sets the value of the trackingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrackingIndicator(JAXBElement<String> value) {
        this.trackingIndicator = value;
    }

}
