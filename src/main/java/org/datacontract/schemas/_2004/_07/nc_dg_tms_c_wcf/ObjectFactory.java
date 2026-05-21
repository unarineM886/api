
package org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf;

import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _LimitResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "LimitResponse");
    private static final QName _Errors_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "Errors");
    private static final QName _Limits_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "Limits");
    private static final QName _MerchantStatementSourceStatusResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "MerchantStatementSourceStatusResponse");
    private static final QName _MandateOptionsMandateDebitFrequency_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "MandateOptions.MandateDebitFrequency");
    private static final QName _MandateOptionsMandatePublicHolidayOption_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "MandateOptions.MandatePublicHolidayOption");
    private static final QName _MandateOptionsBankAccountType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "MandateOptions.BankAccountType");
    private static final QName _MandateOptionsTitle_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "MandateOptions.Title");
    private static final QName _DebiCheckOptionsCollectionFrequencyDayCodes_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "DebiCheckOptions.CollectionFrequencyDayCodes");
    private static final QName _AddMandateResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "AddMandateResponse");
    private static final QName _NIWSResponseContainer_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "NIWSResponseContainer");
    private static final QName _GetAvailableBalanceResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "GetAvailableBalanceResponse");
    private static final QName _DebiCheckAuthenticateResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "DebiCheckAuthenticateResponse");
    private static final QName _DebiCheckOptionsCancellationReasonCodes_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "DebiCheckOptions.CancellationReasonCodes");
    private static final QName _DebiCheckAuthenticationCurrentStatusResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "DebiCheckAuthenticationCurrentStatusResponse");
    private static final QName _AccountFundsTransferResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "AccountFundsTransferResponse");
    private static final QName _AVSRealtimeQueryResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "AVSRealtimeQueryResponse");
    private static final QName _AVSOptionsMatchIndicator_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "AVSOptions.MatchIndicator");
    private static final QName _DebiCheckAmendmentResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "DebiCheckAmendmentResponse");
    private static final QName _DebiCheckMandateTemplateDetail_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "DebiCheckMandateTemplateDetail");
    private static final QName _RetrieveProofOfPaymentResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "RetrieveProofOfPaymentResponse");
    private static final QName _RetrieveBlockedAccountsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "RetrieveBlockedAccountsResponse");
    private static final QName _ArrayOfBlockedAccount_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "ArrayOfBlockedAccount");
    private static final QName _BlockedAccount_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "BlockedAccount");
    private static final QName _BlockedAccountAccountName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "AccountName");
    private static final QName _BlockedAccountAccountNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "AccountNumber");
    private static final QName _BlockedAccountActionDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "ActionDate");
    private static final QName _BlockedAccountBlackListType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "BlackListType");
    private static final QName _BlockedAccountDateBlocked_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "DateBlocked");
    private static final QName _BlockedAccountDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "Description");
    private static final QName _BlockedAccountUnpaidCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "UnpaidCode");
    private static final QName _NIWSResponseContainerErrorCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "ErrorCode");
    private static final QName _RetrieveBlockedAccountsResponseBlockedAccounts_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "BlockedAccounts");
    private static final QName _RetrieveProofOfPaymentResponseProofOfPaymentPDF_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "ProofOfPaymentPDF");
    private static final QName _DebiCheckMandateTemplateDetailAdjustmentAmount_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "AdjustmentAmount");
    private static final QName _DebiCheckMandateTemplateDetailAdjustmentCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "AdjustmentCategory");
    private static final QName _DebiCheckMandateTemplateDetailAdjustmentRuleIndicator_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "AdjustmentRuleIndicator");
    private static final QName _DebiCheckMandateTemplateDetailAdjustmentType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "AdjustmentType");
    private static final QName _DebiCheckMandateTemplateDetailAuthenticationType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "AuthenticationType");
    private static final QName _DebiCheckMandateTemplateDetailCollectionFrequency_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "CollectionFrequency");
    private static final QName _DebiCheckMandateTemplateDetailCollectionFrequencyDayCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "CollectionFrequencyDayCode");
    private static final QName _DebiCheckMandateTemplateDetailDebitEntryClassCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "DebitEntryClassCode");
    private static final QName _DebiCheckMandateTemplateDetailDebitValueType_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "DebitValueType");
    private static final QName _DebiCheckMandateTemplateDetailDebtorAuthCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "DebtorAuthCode");
    private static final QName _DebiCheckMandateTemplateDetailDebtorAuthenticationRequired_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "DebtorAuthenticationRequired");
    private static final QName _DebiCheckMandateTemplateDetailInitiationDayOptions_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "InitiationDayOptions");
    private static final QName _DebiCheckMandateTemplateDetailInstallmentOccurrence_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "InstallmentOccurrence");
    private static final QName _DebiCheckMandateTemplateDetailRMS_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "RMS");
    private static final QName _DebiCheckMandateTemplateDetailTemplateId_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "TemplateId");
    private static final QName _DebiCheckMandateTemplateDetailTemplateName_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "TemplateName");
    private static final QName _DebiCheckMandateTemplateDetailTrackingDayCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "TrackingDayCode");
    private static final QName _DebiCheckMandateTemplateDetailTrackingIndicator_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "TrackingIndicator");
    private static final QName _DebiCheckAmendmentResponseContractReference_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "ContractReference");
    private static final QName _DebiCheckAmendmentResponseMessages_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "Messages");
    private static final QName _AVSRealtimeQueryResponseAcceptsCredits_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "AcceptsCredits");
    private static final QName _AVSRealtimeQueryResponseAcceptsDebits_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "AcceptsDebits");
    private static final QName _AVSRealtimeQueryResponseAccountActive_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "AccountActive");
    private static final QName _AVSRealtimeQueryResponseAccountDormant_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "AccountDormant");
    private static final QName _AVSRealtimeQueryResponseBankAccountNumberValid_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "BankAccountNumberValid");
    private static final QName _AVSRealtimeQueryResponseEmailMatch_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "EmailMatch");
    private static final QName _AVSRealtimeQueryResponseFileToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "FileToken");
    private static final QName _AVSRealtimeQueryResponseIdNumberMatch_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "IdNumberMatch");
    private static final QName _AVSRealtimeQueryResponseInitialMatch_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "InitialMatch");
    private static final QName _AVSRealtimeQueryResponseLastNameMatch_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "LastNameMatch");
    private static final QName _AVSRealtimeQueryResponsePeriodActive_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "PeriodActive");
    private static final QName _AVSRealtimeQueryResponsePhoneNumberMatch_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "PhoneNumberMatch");
    private static final QName _AVSRealtimeQueryResponseTaxRefMatch_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "TaxRefMatch");
    private static final QName _AccountFundsTransferResponseRequestTrace_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "RequestTrace");
    private static final QName _DebiCheckAuthenticationCurrentStatusResponseCancellationReason_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "CancellationReason");
    private static final QName _DebiCheckAuthenticationCurrentStatusResponseDateCancelled_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "DateCancelled");
    private static final QName _DebiCheckAuthenticationCurrentStatusResponseStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "Status");
    private static final QName _DebiCheckAuthenticationCurrentStatusResponseUpdateDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "UpdateDate");
    private static final QName _DebiCheckAuthenticationCurrentStatusResponseBankservResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "BankservResponse");
    private static final QName _DebiCheckAuthenticationCurrentStatusResponseBankResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "BankResponse");
    private static final QName _DebiCheckAuthenticationCurrentStatusResponseClientResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "ClientResponse");
    private static final QName _DebiCheckAuthenticateResponseBankResponseCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "BankResponseCode");
    private static final QName _DebiCheckAuthenticateResponseBankservResponseCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "BankservResponseCode");
    private static final QName _DebiCheckAuthenticateResponseClientResponseCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "ClientResponseCode");
    private static final QName _AddMandateResponseMandateUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "MandateUrl");
    private static final QName _AddMandateResponseWarnings_QNAME = new QName("http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", "Warnings");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LimitResponse }
     * 
     * @return
     *     the new instance of {@link LimitResponse }
     */
    public LimitResponse createLimitResponse() {
        return new LimitResponse();
    }

    /**
     * Create an instance of {@link MerchantStatementSourceStatusResponse }
     * 
     * @return
     *     the new instance of {@link MerchantStatementSourceStatusResponse }
     */
    public MerchantStatementSourceStatusResponse createMerchantStatementSourceStatusResponse() {
        return new MerchantStatementSourceStatusResponse();
    }

    /**
     * Create an instance of {@link AddMandateResponse }
     * 
     * @return
     *     the new instance of {@link AddMandateResponse }
     */
    public AddMandateResponse createAddMandateResponse() {
        return new AddMandateResponse();
    }

    /**
     * Create an instance of {@link GetAvailableBalanceResponse }
     * 
     * @return
     *     the new instance of {@link GetAvailableBalanceResponse }
     */
    public GetAvailableBalanceResponse createGetAvailableBalanceResponse() {
        return new GetAvailableBalanceResponse();
    }

    /**
     * Create an instance of {@link DebiCheckAuthenticateResponse }
     * 
     * @return
     *     the new instance of {@link DebiCheckAuthenticateResponse }
     */
    public DebiCheckAuthenticateResponse createDebiCheckAuthenticateResponse() {
        return new DebiCheckAuthenticateResponse();
    }

    /**
     * Create an instance of {@link DebiCheckAuthenticationCurrentStatusResponse }
     * 
     * @return
     *     the new instance of {@link DebiCheckAuthenticationCurrentStatusResponse }
     */
    public DebiCheckAuthenticationCurrentStatusResponse createDebiCheckAuthenticationCurrentStatusResponse() {
        return new DebiCheckAuthenticationCurrentStatusResponse();
    }

    /**
     * Create an instance of {@link AccountFundsTransferResponse }
     * 
     * @return
     *     the new instance of {@link AccountFundsTransferResponse }
     */
    public AccountFundsTransferResponse createAccountFundsTransferResponse() {
        return new AccountFundsTransferResponse();
    }

    /**
     * Create an instance of {@link AVSRealtimeQueryResponse }
     * 
     * @return
     *     the new instance of {@link AVSRealtimeQueryResponse }
     */
    public AVSRealtimeQueryResponse createAVSRealtimeQueryResponse() {
        return new AVSRealtimeQueryResponse();
    }

    /**
     * Create an instance of {@link DebiCheckAmendmentResponse }
     * 
     * @return
     *     the new instance of {@link DebiCheckAmendmentResponse }
     */
    public DebiCheckAmendmentResponse createDebiCheckAmendmentResponse() {
        return new DebiCheckAmendmentResponse();
    }

    /**
     * Create an instance of {@link DebiCheckMandateTemplateDetail }
     * 
     * @return
     *     the new instance of {@link DebiCheckMandateTemplateDetail }
     */
    public DebiCheckMandateTemplateDetail createDebiCheckMandateTemplateDetail() {
        return new DebiCheckMandateTemplateDetail();
    }

    /**
     * Create an instance of {@link RetrieveProofOfPaymentResponse }
     * 
     * @return
     *     the new instance of {@link RetrieveProofOfPaymentResponse }
     */
    public RetrieveProofOfPaymentResponse createRetrieveProofOfPaymentResponse() {
        return new RetrieveProofOfPaymentResponse();
    }

    /**
     * Create an instance of {@link RetrieveBlockedAccountsResponse }
     * 
     * @return
     *     the new instance of {@link RetrieveBlockedAccountsResponse }
     */
    public RetrieveBlockedAccountsResponse createRetrieveBlockedAccountsResponse() {
        return new RetrieveBlockedAccountsResponse();
    }

    /**
     * Create an instance of {@link Errors }
     * 
     * @return
     *     the new instance of {@link Errors }
     */
    public Errors createErrors() {
        return new Errors();
    }

    /**
     * Create an instance of {@link Limits }
     * 
     * @return
     *     the new instance of {@link Limits }
     */
    public Limits createLimits() {
        return new Limits();
    }

    /**
     * Create an instance of {@link NIWSResponseContainer }
     * 
     * @return
     *     the new instance of {@link NIWSResponseContainer }
     */
    public NIWSResponseContainer createNIWSResponseContainer() {
        return new NIWSResponseContainer();
    }

    /**
     * Create an instance of {@link ArrayOfBlockedAccount }
     * 
     * @return
     *     the new instance of {@link ArrayOfBlockedAccount }
     */
    public ArrayOfBlockedAccount createArrayOfBlockedAccount() {
        return new ArrayOfBlockedAccount();
    }

    /**
     * Create an instance of {@link BlockedAccount }
     * 
     * @return
     *     the new instance of {@link BlockedAccount }
     */
    public BlockedAccount createBlockedAccount() {
        return new BlockedAccount();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LimitResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LimitResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "LimitResponse")
    public JAXBElement<LimitResponse> createLimitResponse(LimitResponse value) {
        return new JAXBElement<>(_LimitResponse_QNAME, LimitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Errors }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Errors }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "Errors")
    public JAXBElement<Errors> createErrors(Errors value) {
        return new JAXBElement<>(_Errors_QNAME, Errors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Limits }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Limits }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "Limits")
    public JAXBElement<Limits> createLimits(Limits value) {
        return new JAXBElement<>(_Limits_QNAME, Limits.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MerchantStatementSourceStatusResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MerchantStatementSourceStatusResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "MerchantStatementSourceStatusResponse")
    public JAXBElement<MerchantStatementSourceStatusResponse> createMerchantStatementSourceStatusResponse(MerchantStatementSourceStatusResponse value) {
        return new JAXBElement<>(_MerchantStatementSourceStatusResponse_QNAME, MerchantStatementSourceStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MandateOptionsMandateDebitFrequency }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MandateOptionsMandateDebitFrequency }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "MandateOptions.MandateDebitFrequency")
    public JAXBElement<MandateOptionsMandateDebitFrequency> createMandateOptionsMandateDebitFrequency(MandateOptionsMandateDebitFrequency value) {
        return new JAXBElement<>(_MandateOptionsMandateDebitFrequency_QNAME, MandateOptionsMandateDebitFrequency.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MandateOptionsMandatePublicHolidayOption }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MandateOptionsMandatePublicHolidayOption }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "MandateOptions.MandatePublicHolidayOption")
    public JAXBElement<MandateOptionsMandatePublicHolidayOption> createMandateOptionsMandatePublicHolidayOption(MandateOptionsMandatePublicHolidayOption value) {
        return new JAXBElement<>(_MandateOptionsMandatePublicHolidayOption_QNAME, MandateOptionsMandatePublicHolidayOption.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MandateOptionsBankAccountType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MandateOptionsBankAccountType }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "MandateOptions.BankAccountType")
    public JAXBElement<MandateOptionsBankAccountType> createMandateOptionsBankAccountType(MandateOptionsBankAccountType value) {
        return new JAXBElement<>(_MandateOptionsBankAccountType_QNAME, MandateOptionsBankAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MandateOptionsTitle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MandateOptionsTitle }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "MandateOptions.Title")
    public JAXBElement<MandateOptionsTitle> createMandateOptionsTitle(MandateOptionsTitle value) {
        return new JAXBElement<>(_MandateOptionsTitle_QNAME, MandateOptionsTitle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebiCheckOptionsCollectionFrequencyDayCodes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DebiCheckOptionsCollectionFrequencyDayCodes }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "DebiCheckOptions.CollectionFrequencyDayCodes")
    public JAXBElement<DebiCheckOptionsCollectionFrequencyDayCodes> createDebiCheckOptionsCollectionFrequencyDayCodes(DebiCheckOptionsCollectionFrequencyDayCodes value) {
        return new JAXBElement<>(_DebiCheckOptionsCollectionFrequencyDayCodes_QNAME, DebiCheckOptionsCollectionFrequencyDayCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddMandateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddMandateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "AddMandateResponse")
    public JAXBElement<AddMandateResponse> createAddMandateResponse(AddMandateResponse value) {
        return new JAXBElement<>(_AddMandateResponse_QNAME, AddMandateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NIWSResponseContainer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NIWSResponseContainer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "NIWSResponseContainer")
    public JAXBElement<NIWSResponseContainer> createNIWSResponseContainer(NIWSResponseContainer value) {
        return new JAXBElement<>(_NIWSResponseContainer_QNAME, NIWSResponseContainer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAvailableBalanceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAvailableBalanceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "GetAvailableBalanceResponse")
    public JAXBElement<GetAvailableBalanceResponse> createGetAvailableBalanceResponse(GetAvailableBalanceResponse value) {
        return new JAXBElement<>(_GetAvailableBalanceResponse_QNAME, GetAvailableBalanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebiCheckAuthenticateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DebiCheckAuthenticateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "DebiCheckAuthenticateResponse")
    public JAXBElement<DebiCheckAuthenticateResponse> createDebiCheckAuthenticateResponse(DebiCheckAuthenticateResponse value) {
        return new JAXBElement<>(_DebiCheckAuthenticateResponse_QNAME, DebiCheckAuthenticateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebiCheckOptionsCancellationReasonCodes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DebiCheckOptionsCancellationReasonCodes }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "DebiCheckOptions.CancellationReasonCodes")
    public JAXBElement<DebiCheckOptionsCancellationReasonCodes> createDebiCheckOptionsCancellationReasonCodes(DebiCheckOptionsCancellationReasonCodes value) {
        return new JAXBElement<>(_DebiCheckOptionsCancellationReasonCodes_QNAME, DebiCheckOptionsCancellationReasonCodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebiCheckAuthenticationCurrentStatusResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DebiCheckAuthenticationCurrentStatusResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "DebiCheckAuthenticationCurrentStatusResponse")
    public JAXBElement<DebiCheckAuthenticationCurrentStatusResponse> createDebiCheckAuthenticationCurrentStatusResponse(DebiCheckAuthenticationCurrentStatusResponse value) {
        return new JAXBElement<>(_DebiCheckAuthenticationCurrentStatusResponse_QNAME, DebiCheckAuthenticationCurrentStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountFundsTransferResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountFundsTransferResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "AccountFundsTransferResponse")
    public JAXBElement<AccountFundsTransferResponse> createAccountFundsTransferResponse(AccountFundsTransferResponse value) {
        return new JAXBElement<>(_AccountFundsTransferResponse_QNAME, AccountFundsTransferResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AVSRealtimeQueryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AVSRealtimeQueryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "AVSRealtimeQueryResponse")
    public JAXBElement<AVSRealtimeQueryResponse> createAVSRealtimeQueryResponse(AVSRealtimeQueryResponse value) {
        return new JAXBElement<>(_AVSRealtimeQueryResponse_QNAME, AVSRealtimeQueryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "AVSOptions.MatchIndicator")
    public JAXBElement<AVSOptionsMatchIndicator> createAVSOptionsMatchIndicator(AVSOptionsMatchIndicator value) {
        return new JAXBElement<>(_AVSOptionsMatchIndicator_QNAME, AVSOptionsMatchIndicator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebiCheckAmendmentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DebiCheckAmendmentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "DebiCheckAmendmentResponse")
    public JAXBElement<DebiCheckAmendmentResponse> createDebiCheckAmendmentResponse(DebiCheckAmendmentResponse value) {
        return new JAXBElement<>(_DebiCheckAmendmentResponse_QNAME, DebiCheckAmendmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebiCheckMandateTemplateDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DebiCheckMandateTemplateDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "DebiCheckMandateTemplateDetail")
    public JAXBElement<DebiCheckMandateTemplateDetail> createDebiCheckMandateTemplateDetail(DebiCheckMandateTemplateDetail value) {
        return new JAXBElement<>(_DebiCheckMandateTemplateDetail_QNAME, DebiCheckMandateTemplateDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveProofOfPaymentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveProofOfPaymentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "RetrieveProofOfPaymentResponse")
    public JAXBElement<RetrieveProofOfPaymentResponse> createRetrieveProofOfPaymentResponse(RetrieveProofOfPaymentResponse value) {
        return new JAXBElement<>(_RetrieveProofOfPaymentResponse_QNAME, RetrieveProofOfPaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetrieveBlockedAccountsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetrieveBlockedAccountsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "RetrieveBlockedAccountsResponse")
    public JAXBElement<RetrieveBlockedAccountsResponse> createRetrieveBlockedAccountsResponse(RetrieveBlockedAccountsResponse value) {
        return new JAXBElement<>(_RetrieveBlockedAccountsResponse_QNAME, RetrieveBlockedAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBlockedAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBlockedAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "ArrayOfBlockedAccount")
    public JAXBElement<ArrayOfBlockedAccount> createArrayOfBlockedAccount(ArrayOfBlockedAccount value) {
        return new JAXBElement<>(_ArrayOfBlockedAccount_QNAME, ArrayOfBlockedAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockedAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BlockedAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "BlockedAccount")
    public JAXBElement<BlockedAccount> createBlockedAccount(BlockedAccount value) {
        return new JAXBElement<>(_BlockedAccount_QNAME, BlockedAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "AccountName", scope = BlockedAccount.class)
    public JAXBElement<String> createBlockedAccountAccountName(String value) {
        return new JAXBElement<>(_BlockedAccountAccountName_QNAME, String.class, BlockedAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "AccountNumber", scope = BlockedAccount.class)
    public JAXBElement<String> createBlockedAccountAccountNumber(String value) {
        return new JAXBElement<>(_BlockedAccountAccountNumber_QNAME, String.class, BlockedAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "ActionDate", scope = BlockedAccount.class)
    public JAXBElement<String> createBlockedAccountActionDate(String value) {
        return new JAXBElement<>(_BlockedAccountActionDate_QNAME, String.class, BlockedAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "BlackListType", scope = BlockedAccount.class)
    public JAXBElement<String> createBlockedAccountBlackListType(String value) {
        return new JAXBElement<>(_BlockedAccountBlackListType_QNAME, String.class, BlockedAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "DateBlocked", scope = BlockedAccount.class)
    public JAXBElement<String> createBlockedAccountDateBlocked(String value) {
        return new JAXBElement<>(_BlockedAccountDateBlocked_QNAME, String.class, BlockedAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "Description", scope = BlockedAccount.class)
    public JAXBElement<String> createBlockedAccountDescription(String value) {
        return new JAXBElement<>(_BlockedAccountDescription_QNAME, String.class, BlockedAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "UnpaidCode", scope = BlockedAccount.class)
    public JAXBElement<String> createBlockedAccountUnpaidCode(String value) {
        return new JAXBElement<>(_BlockedAccountUnpaidCode_QNAME, String.class, BlockedAccount.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "ErrorCode", scope = NIWSResponseContainer.class)
    public JAXBElement<String> createNIWSResponseContainerErrorCode(String value) {
        return new JAXBElement<>(_NIWSResponseContainerErrorCode_QNAME, String.class, NIWSResponseContainer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "ErrorCode", scope = Errors.class)
    public JAXBElement<String> createErrorsErrorCode(String value) {
        return new JAXBElement<>(_NIWSResponseContainerErrorCode_QNAME, String.class, Errors.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfBlockedAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfBlockedAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "BlockedAccounts", scope = RetrieveBlockedAccountsResponse.class)
    public JAXBElement<ArrayOfBlockedAccount> createRetrieveBlockedAccountsResponseBlockedAccounts(ArrayOfBlockedAccount value) {
        return new JAXBElement<>(_RetrieveBlockedAccountsResponseBlockedAccounts_QNAME, ArrayOfBlockedAccount.class, RetrieveBlockedAccountsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "ErrorCode", scope = RetrieveProofOfPaymentResponse.class)
    public JAXBElement<String> createRetrieveProofOfPaymentResponseErrorCode(String value) {
        return new JAXBElement<>(_NIWSResponseContainerErrorCode_QNAME, String.class, RetrieveProofOfPaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "ProofOfPaymentPDF", scope = RetrieveProofOfPaymentResponse.class)
    public JAXBElement<String> createRetrieveProofOfPaymentResponseProofOfPaymentPDF(String value) {
        return new JAXBElement<>(_RetrieveProofOfPaymentResponseProofOfPaymentPDF_QNAME, String.class, RetrieveProofOfPaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "AdjustmentAmount", scope = DebiCheckMandateTemplateDetail.class)
    public JAXBElement<String> createDebiCheckMandateTemplateDetailAdjustmentAmount(String value) {
        return new JAXBElement<>(_DebiCheckMandateTemplateDetailAdjustmentAmount_QNAME, String.class, DebiCheckMandateTemplateDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "AdjustmentCategory", scope = DebiCheckMandateTemplateDetail.class)
    public JAXBElement<String> createDebiCheckMandateTemplateDetailAdjustmentCategory(String value) {
        return new JAXBElement<>(_DebiCheckMandateTemplateDetailAdjustmentCategory_QNAME, String.class, DebiCheckMandateTemplateDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "AdjustmentRuleIndicator", scope = DebiCheckMandateTemplateDetail.class)
    public JAXBElement<String> createDebiCheckMandateTemplateDetailAdjustmentRuleIndicator(String value) {
        return new JAXBElement<>(_DebiCheckMandateTemplateDetailAdjustmentRuleIndicator_QNAME, String.class, DebiCheckMandateTemplateDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "AdjustmentType", scope = DebiCheckMandateTemplateDetail.class)
    public JAXBElement<String> createDebiCheckMandateTemplateDetailAdjustmentType(String value) {
        return new JAXBElement<>(_DebiCheckMandateTemplateDetailAdjustmentType_QNAME, String.class, DebiCheckMandateTemplateDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "AuthenticationType", scope = DebiCheckMandateTemplateDetail.class)
    public JAXBElement<String> createDebiCheckMandateTemplateDetailAuthenticationType(String value) {
        return new JAXBElement<>(_DebiCheckMandateTemplateDetailAuthenticationType_QNAME, String.class, DebiCheckMandateTemplateDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "CollectionFrequency", scope = DebiCheckMandateTemplateDetail.class)
    public JAXBElement<String> createDebiCheckMandateTemplateDetailCollectionFrequency(String value) {
        return new JAXBElement<>(_DebiCheckMandateTemplateDetailCollectionFrequency_QNAME, String.class, DebiCheckMandateTemplateDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "CollectionFrequencyDayCode", scope = DebiCheckMandateTemplateDetail.class)
    public JAXBElement<String> createDebiCheckMandateTemplateDetailCollectionFrequencyDayCode(String value) {
        return new JAXBElement<>(_DebiCheckMandateTemplateDetailCollectionFrequencyDayCode_QNAME, String.class, DebiCheckMandateTemplateDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "DebitEntryClassCode", scope = DebiCheckMandateTemplateDetail.class)
    public JAXBElement<String> createDebiCheckMandateTemplateDetailDebitEntryClassCode(String value) {
        return new JAXBElement<>(_DebiCheckMandateTemplateDetailDebitEntryClassCode_QNAME, String.class, DebiCheckMandateTemplateDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "DebitValueType", scope = DebiCheckMandateTemplateDetail.class)
    public JAXBElement<String> createDebiCheckMandateTemplateDetailDebitValueType(String value) {
        return new JAXBElement<>(_DebiCheckMandateTemplateDetailDebitValueType_QNAME, String.class, DebiCheckMandateTemplateDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "DebtorAuthCode", scope = DebiCheckMandateTemplateDetail.class)
    public JAXBElement<String> createDebiCheckMandateTemplateDetailDebtorAuthCode(String value) {
        return new JAXBElement<>(_DebiCheckMandateTemplateDetailDebtorAuthCode_QNAME, String.class, DebiCheckMandateTemplateDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "DebtorAuthenticationRequired", scope = DebiCheckMandateTemplateDetail.class)
    public JAXBElement<String> createDebiCheckMandateTemplateDetailDebtorAuthenticationRequired(String value) {
        return new JAXBElement<>(_DebiCheckMandateTemplateDetailDebtorAuthenticationRequired_QNAME, String.class, DebiCheckMandateTemplateDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "InitiationDayOptions", scope = DebiCheckMandateTemplateDetail.class)
    public JAXBElement<ArrayOfstring> createDebiCheckMandateTemplateDetailInitiationDayOptions(ArrayOfstring value) {
        return new JAXBElement<>(_DebiCheckMandateTemplateDetailInitiationDayOptions_QNAME, ArrayOfstring.class, DebiCheckMandateTemplateDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "InstallmentOccurrence", scope = DebiCheckMandateTemplateDetail.class)
    public JAXBElement<String> createDebiCheckMandateTemplateDetailInstallmentOccurrence(String value) {
        return new JAXBElement<>(_DebiCheckMandateTemplateDetailInstallmentOccurrence_QNAME, String.class, DebiCheckMandateTemplateDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "RMS", scope = DebiCheckMandateTemplateDetail.class)
    public JAXBElement<String> createDebiCheckMandateTemplateDetailRMS(String value) {
        return new JAXBElement<>(_DebiCheckMandateTemplateDetailRMS_QNAME, String.class, DebiCheckMandateTemplateDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "TemplateId", scope = DebiCheckMandateTemplateDetail.class)
    public JAXBElement<String> createDebiCheckMandateTemplateDetailTemplateId(String value) {
        return new JAXBElement<>(_DebiCheckMandateTemplateDetailTemplateId_QNAME, String.class, DebiCheckMandateTemplateDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "TemplateName", scope = DebiCheckMandateTemplateDetail.class)
    public JAXBElement<String> createDebiCheckMandateTemplateDetailTemplateName(String value) {
        return new JAXBElement<>(_DebiCheckMandateTemplateDetailTemplateName_QNAME, String.class, DebiCheckMandateTemplateDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "TrackingDayCode", scope = DebiCheckMandateTemplateDetail.class)
    public JAXBElement<String> createDebiCheckMandateTemplateDetailTrackingDayCode(String value) {
        return new JAXBElement<>(_DebiCheckMandateTemplateDetailTrackingDayCode_QNAME, String.class, DebiCheckMandateTemplateDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "TrackingIndicator", scope = DebiCheckMandateTemplateDetail.class)
    public JAXBElement<String> createDebiCheckMandateTemplateDetailTrackingIndicator(String value) {
        return new JAXBElement<>(_DebiCheckMandateTemplateDetailTrackingIndicator_QNAME, String.class, DebiCheckMandateTemplateDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "ContractReference", scope = DebiCheckAmendmentResponse.class)
    public JAXBElement<String> createDebiCheckAmendmentResponseContractReference(String value) {
        return new JAXBElement<>(_DebiCheckAmendmentResponseContractReference_QNAME, String.class, DebiCheckAmendmentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "Messages", scope = DebiCheckAmendmentResponse.class)
    public JAXBElement<ArrayOfstring> createDebiCheckAmendmentResponseMessages(ArrayOfstring value) {
        return new JAXBElement<>(_DebiCheckAmendmentResponseMessages_QNAME, ArrayOfstring.class, DebiCheckAmendmentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "AcceptsCredits", scope = AVSRealtimeQueryResponse.class)
    public JAXBElement<AVSOptionsMatchIndicator> createAVSRealtimeQueryResponseAcceptsCredits(AVSOptionsMatchIndicator value) {
        return new JAXBElement<>(_AVSRealtimeQueryResponseAcceptsCredits_QNAME, AVSOptionsMatchIndicator.class, AVSRealtimeQueryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "AcceptsDebits", scope = AVSRealtimeQueryResponse.class)
    public JAXBElement<AVSOptionsMatchIndicator> createAVSRealtimeQueryResponseAcceptsDebits(AVSOptionsMatchIndicator value) {
        return new JAXBElement<>(_AVSRealtimeQueryResponseAcceptsDebits_QNAME, AVSOptionsMatchIndicator.class, AVSRealtimeQueryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "AccountActive", scope = AVSRealtimeQueryResponse.class)
    public JAXBElement<AVSOptionsMatchIndicator> createAVSRealtimeQueryResponseAccountActive(AVSOptionsMatchIndicator value) {
        return new JAXBElement<>(_AVSRealtimeQueryResponseAccountActive_QNAME, AVSOptionsMatchIndicator.class, AVSRealtimeQueryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "AccountDormant", scope = AVSRealtimeQueryResponse.class)
    public JAXBElement<AVSOptionsMatchIndicator> createAVSRealtimeQueryResponseAccountDormant(AVSOptionsMatchIndicator value) {
        return new JAXBElement<>(_AVSRealtimeQueryResponseAccountDormant_QNAME, AVSOptionsMatchIndicator.class, AVSRealtimeQueryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "BankAccountNumberValid", scope = AVSRealtimeQueryResponse.class)
    public JAXBElement<AVSOptionsMatchIndicator> createAVSRealtimeQueryResponseBankAccountNumberValid(AVSOptionsMatchIndicator value) {
        return new JAXBElement<>(_AVSRealtimeQueryResponseBankAccountNumberValid_QNAME, AVSOptionsMatchIndicator.class, AVSRealtimeQueryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "EmailMatch", scope = AVSRealtimeQueryResponse.class)
    public JAXBElement<AVSOptionsMatchIndicator> createAVSRealtimeQueryResponseEmailMatch(AVSOptionsMatchIndicator value) {
        return new JAXBElement<>(_AVSRealtimeQueryResponseEmailMatch_QNAME, AVSOptionsMatchIndicator.class, AVSRealtimeQueryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "FileToken", scope = AVSRealtimeQueryResponse.class)
    public JAXBElement<String> createAVSRealtimeQueryResponseFileToken(String value) {
        return new JAXBElement<>(_AVSRealtimeQueryResponseFileToken_QNAME, String.class, AVSRealtimeQueryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "IdNumberMatch", scope = AVSRealtimeQueryResponse.class)
    public JAXBElement<AVSOptionsMatchIndicator> createAVSRealtimeQueryResponseIdNumberMatch(AVSOptionsMatchIndicator value) {
        return new JAXBElement<>(_AVSRealtimeQueryResponseIdNumberMatch_QNAME, AVSOptionsMatchIndicator.class, AVSRealtimeQueryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "InitialMatch", scope = AVSRealtimeQueryResponse.class)
    public JAXBElement<AVSOptionsMatchIndicator> createAVSRealtimeQueryResponseInitialMatch(AVSOptionsMatchIndicator value) {
        return new JAXBElement<>(_AVSRealtimeQueryResponseInitialMatch_QNAME, AVSOptionsMatchIndicator.class, AVSRealtimeQueryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "LastNameMatch", scope = AVSRealtimeQueryResponse.class)
    public JAXBElement<AVSOptionsMatchIndicator> createAVSRealtimeQueryResponseLastNameMatch(AVSOptionsMatchIndicator value) {
        return new JAXBElement<>(_AVSRealtimeQueryResponseLastNameMatch_QNAME, AVSOptionsMatchIndicator.class, AVSRealtimeQueryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "Messages", scope = AVSRealtimeQueryResponse.class)
    public JAXBElement<ArrayOfstring> createAVSRealtimeQueryResponseMessages(ArrayOfstring value) {
        return new JAXBElement<>(_DebiCheckAmendmentResponseMessages_QNAME, ArrayOfstring.class, AVSRealtimeQueryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "PeriodActive", scope = AVSRealtimeQueryResponse.class)
    public JAXBElement<AVSOptionsMatchIndicator> createAVSRealtimeQueryResponsePeriodActive(AVSOptionsMatchIndicator value) {
        return new JAXBElement<>(_AVSRealtimeQueryResponsePeriodActive_QNAME, AVSOptionsMatchIndicator.class, AVSRealtimeQueryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "PhoneNumberMatch", scope = AVSRealtimeQueryResponse.class)
    public JAXBElement<AVSOptionsMatchIndicator> createAVSRealtimeQueryResponsePhoneNumberMatch(AVSOptionsMatchIndicator value) {
        return new JAXBElement<>(_AVSRealtimeQueryResponsePhoneNumberMatch_QNAME, AVSOptionsMatchIndicator.class, AVSRealtimeQueryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AVSOptionsMatchIndicator }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "TaxRefMatch", scope = AVSRealtimeQueryResponse.class)
    public JAXBElement<AVSOptionsMatchIndicator> createAVSRealtimeQueryResponseTaxRefMatch(AVSOptionsMatchIndicator value) {
        return new JAXBElement<>(_AVSRealtimeQueryResponseTaxRefMatch_QNAME, AVSOptionsMatchIndicator.class, AVSRealtimeQueryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "RequestTrace", scope = AccountFundsTransferResponse.class)
    public JAXBElement<String> createAccountFundsTransferResponseRequestTrace(String value) {
        return new JAXBElement<>(_AccountFundsTransferResponseRequestTrace_QNAME, String.class, AccountFundsTransferResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "CancellationReason", scope = DebiCheckAuthenticationCurrentStatusResponse.class)
    public JAXBElement<String> createDebiCheckAuthenticationCurrentStatusResponseCancellationReason(String value) {
        return new JAXBElement<>(_DebiCheckAuthenticationCurrentStatusResponseCancellationReason_QNAME, String.class, DebiCheckAuthenticationCurrentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "ContractReference", scope = DebiCheckAuthenticationCurrentStatusResponse.class)
    public JAXBElement<String> createDebiCheckAuthenticationCurrentStatusResponseContractReference(String value) {
        return new JAXBElement<>(_DebiCheckAmendmentResponseContractReference_QNAME, String.class, DebiCheckAuthenticationCurrentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "DateCancelled", scope = DebiCheckAuthenticationCurrentStatusResponse.class)
    public JAXBElement<String> createDebiCheckAuthenticationCurrentStatusResponseDateCancelled(String value) {
        return new JAXBElement<>(_DebiCheckAuthenticationCurrentStatusResponseDateCancelled_QNAME, String.class, DebiCheckAuthenticationCurrentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "Status", scope = DebiCheckAuthenticationCurrentStatusResponse.class)
    public JAXBElement<String> createDebiCheckAuthenticationCurrentStatusResponseStatus(String value) {
        return new JAXBElement<>(_DebiCheckAuthenticationCurrentStatusResponseStatus_QNAME, String.class, DebiCheckAuthenticationCurrentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "UpdateDate", scope = DebiCheckAuthenticationCurrentStatusResponse.class)
    public JAXBElement<String> createDebiCheckAuthenticationCurrentStatusResponseUpdateDate(String value) {
        return new JAXBElement<>(_DebiCheckAuthenticationCurrentStatusResponseUpdateDate_QNAME, String.class, DebiCheckAuthenticationCurrentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "BankservResponse", scope = DebiCheckAuthenticationCurrentStatusResponse.class)
    public JAXBElement<String> createDebiCheckAuthenticationCurrentStatusResponseBankservResponse(String value) {
        return new JAXBElement<>(_DebiCheckAuthenticationCurrentStatusResponseBankservResponse_QNAME, String.class, DebiCheckAuthenticationCurrentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "BankResponse", scope = DebiCheckAuthenticationCurrentStatusResponse.class)
    public JAXBElement<String> createDebiCheckAuthenticationCurrentStatusResponseBankResponse(String value) {
        return new JAXBElement<>(_DebiCheckAuthenticationCurrentStatusResponseBankResponse_QNAME, String.class, DebiCheckAuthenticationCurrentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "ClientResponse", scope = DebiCheckAuthenticationCurrentStatusResponse.class)
    public JAXBElement<String> createDebiCheckAuthenticationCurrentStatusResponseClientResponse(String value) {
        return new JAXBElement<>(_DebiCheckAuthenticationCurrentStatusResponseClientResponse_QNAME, String.class, DebiCheckAuthenticationCurrentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "BankResponseCode", scope = DebiCheckAuthenticateResponse.class)
    public JAXBElement<String> createDebiCheckAuthenticateResponseBankResponseCode(String value) {
        return new JAXBElement<>(_DebiCheckAuthenticateResponseBankResponseCode_QNAME, String.class, DebiCheckAuthenticateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "BankservResponseCode", scope = DebiCheckAuthenticateResponse.class)
    public JAXBElement<String> createDebiCheckAuthenticateResponseBankservResponseCode(String value) {
        return new JAXBElement<>(_DebiCheckAuthenticateResponseBankservResponseCode_QNAME, String.class, DebiCheckAuthenticateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "ClientResponseCode", scope = DebiCheckAuthenticateResponse.class)
    public JAXBElement<String> createDebiCheckAuthenticateResponseClientResponseCode(String value) {
        return new JAXBElement<>(_DebiCheckAuthenticateResponseClientResponseCode_QNAME, String.class, DebiCheckAuthenticateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "ContractReference", scope = DebiCheckAuthenticateResponse.class)
    public JAXBElement<String> createDebiCheckAuthenticateResponseContractReference(String value) {
        return new JAXBElement<>(_DebiCheckAmendmentResponseContractReference_QNAME, String.class, DebiCheckAuthenticateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "Messages", scope = DebiCheckAuthenticateResponse.class)
    public JAXBElement<ArrayOfstring> createDebiCheckAuthenticateResponseMessages(ArrayOfstring value) {
        return new JAXBElement<>(_DebiCheckAmendmentResponseMessages_QNAME, ArrayOfstring.class, DebiCheckAuthenticateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "Status", scope = DebiCheckAuthenticateResponse.class)
    public JAXBElement<String> createDebiCheckAuthenticateResponseStatus(String value) {
        return new JAXBElement<>(_DebiCheckAuthenticationCurrentStatusResponseStatus_QNAME, String.class, DebiCheckAuthenticateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "Errors", scope = AddMandateResponse.class)
    public JAXBElement<ArrayOfstring> createAddMandateResponseErrors(ArrayOfstring value) {
        return new JAXBElement<>(_Errors_QNAME, ArrayOfstring.class, AddMandateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "MandateUrl", scope = AddMandateResponse.class)
    public JAXBElement<String> createAddMandateResponseMandateUrl(String value) {
        return new JAXBElement<>(_AddMandateResponseMandateUrl_QNAME, String.class, AddMandateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "Warnings", scope = AddMandateResponse.class)
    public JAXBElement<ArrayOfstring> createAddMandateResponseWarnings(ArrayOfstring value) {
        return new JAXBElement<>(_AddMandateResponseWarnings_QNAME, ArrayOfstring.class, AddMandateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "ErrorCode", scope = MerchantStatementSourceStatusResponse.class)
    public JAXBElement<String> createMerchantStatementSourceStatusResponseErrorCode(String value) {
        return new JAXBElement<>(_NIWSResponseContainerErrorCode_QNAME, String.class, MerchantStatementSourceStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Errors }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Errors }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "Errors", scope = LimitResponse.class)
    public JAXBElement<Errors> createLimitResponseErrors(Errors value) {
        return new JAXBElement<>(_Errors_QNAME, Errors.class, LimitResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Limits }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Limits }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NC.DG.TMS.C.WCF.NIWS", name = "Limits", scope = LimitResponse.class)
    public JAXBElement<Limits> createLimitResponseLimits(Limits value) {
        return new JAXBElement<>(_Limits_QNAME, Limits.class, LimitResponse.class, value);
    }

}
