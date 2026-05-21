
package za.co.WebServices;

import java.math.BigDecimal;
import javax.xml.namespace.QName;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.DebiCheckAmendmentResponse;
import org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.DebiCheckMandateTemplateDetail;
import org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.DebiCheckOptionsCollectionFrequencyDayCodes;
import org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.LimitResponse;
import org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.MandateOptionsBankAccountType;
import org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.MandateOptionsMandatePublicHolidayOption;
import org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.MandateOptionsTitle;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the za.co.WebServices package. 
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

    private static final QName _GetPaymentLimitsServiceKey_QNAME = new QName("http://tempuri.org/", "ServiceKey");
    private static final QName _GetPaymentLimitsResponseGetPaymentLimitsResult_QNAME = new QName("http://tempuri.org/", "GetPaymentLimitsResult");
    private static final QName _GetDebitLimitsResponseGetDebitLimitsResult_QNAME = new QName("http://tempuri.org/", "GetDebitLimitsResult");
    private static final QName _AccountFundsReleaseDate_QNAME = new QName("http://tempuri.org/", "Date");
    private static final QName _AccountFundsReleaseResponseAccountFundsReleaseResult_QNAME = new QName("http://tempuri.org/", "AccountFundsReleaseResult");
    private static final QName _RequestActionDateInstruction_QNAME = new QName("http://tempuri.org/", "Instruction");
    private static final QName _RequestActionDateForwardActionDate_QNAME = new QName("http://tempuri.org/", "ForwardActionDate");
    private static final QName _RequestActionDateResponseRequestActionDateResult_QNAME = new QName("http://tempuri.org/", "RequestActionDateResult");
    private static final QName _RequestPresentationDateResponseRequestPresentationDateResult_QNAME = new QName("http://tempuri.org/", "RequestPresentationDateResult");
    private static final QName _RequestInterimMerchantStatementResponseRequestInterimMerchantStatementResult_QNAME = new QName("http://tempuri.org/", "RequestInterimMerchantStatementResult");
    private static final QName _RequestMerchantStatementFromActionDate_QNAME = new QName("http://tempuri.org/", "FromActionDate");
    private static final QName _RequestMerchantStatementResponseRequestMerchantStatementResult_QNAME = new QName("http://tempuri.org/", "RequestMerchantStatementResult");
    private static final QName _RetrieveMerchantStatementPollingId_QNAME = new QName("http://tempuri.org/", "PollingId");
    private static final QName _RetrieveMerchantStatementResponseRetrieveMerchantStatementResult_QNAME = new QName("http://tempuri.org/", "RetrieveMerchantStatementResult");
    private static final QName _RequestTransactionTypesResponseRequestTransactionTypesResult_QNAME = new QName("http://tempuri.org/", "RequestTransactionTypesResult");
    private static final QName _RetrieveTransactionTypesResponseRetrieveTransactionTypesResult_QNAME = new QName("http://tempuri.org/", "RetrieveTransactionTypesResult");
    private static final QName _LegacyCompactBatchFileUploadUserName_QNAME = new QName("http://tempuri.org/", "UserName");
    private static final QName _LegacyCompactBatchFileUploadPassword_QNAME = new QName("http://tempuri.org/", "Password");
    private static final QName _LegacyCompactBatchFileUploadPIN_QNAME = new QName("http://tempuri.org/", "PIN");
    private static final QName _LegacyCompactBatchFileUploadFile_QNAME = new QName("http://tempuri.org/", "File");
    private static final QName _LegacyCompactBatchFileUploadProcessAsLegacy_QNAME = new QName("http://tempuri.org/", "ProcessAsLegacy");
    private static final QName _LegacyCompactBatchFileUploadResponseLegacyCompactBatchFileUploadResult_QNAME = new QName("http://tempuri.org/", "LegacyCompactBatchFileUploadResult");
    private static final QName _LegacyBatchFileUploadResponseLegacyBatchFileUploadResult_QNAME = new QName("http://tempuri.org/", "LegacyBatchFileUploadResult");
    private static final QName _BatchFileUploadResponseBatchFileUploadResult_QNAME = new QName("http://tempuri.org/", "BatchFileUploadResult");
    private static final QName _RequestFileUploadReportFileToken_QNAME = new QName("http://tempuri.org/", "FileToken");
    private static final QName _RequestFileUploadReportResponseRequestFileUploadReportResult_QNAME = new QName("http://tempuri.org/", "RequestFileUploadReportResult");
    private static final QName _RequestCombinedUploadReportForDateResponseRequestCombinedUploadReportForDateResult_QNAME = new QName("http://tempuri.org/", "RequestCombinedUploadReportForDateResult");
    private static final QName _RequestCreditDataReportResponseRequestCreditDataReportResult_QNAME = new QName("http://tempuri.org/", "RequestCreditDataReportResult");
    private static final QName _RequestAVSReportResponseRequestAVSReportResult_QNAME = new QName("http://tempuri.org/", "RequestAVSReportResult");
    private static final QName _RequestPayNowInvoiceServiceKey_QNAME = new QName("http://tempuri.org/", "serviceKey");
    private static final QName _RequestPayNowInvoiceFileToken_QNAME = new QName("http://tempuri.org/", "fileToken");
    private static final QName _RequestPayNowInvoiceResponseRequestPayNowInvoiceResult_QNAME = new QName("http://tempuri.org/", "RequestPayNowInvoiceResult");
    private static final QName _IsValidServiceKeyMethodKey_QNAME = new QName("http://tempuri.org/", "MethodKey");
    private static final QName _IsValidServiceKeyInstructionCode_QNAME = new QName("http://tempuri.org/", "InstructionCode");
    private static final QName _IsValidServiceKeyResponseIsValidServiceKeyResult_QNAME = new QName("http://tempuri.org/", "IsValidServiceKeyResult");
    private static final QName _AccountServiceKeysAccountNo_QNAME = new QName("http://tempuri.org/", "AccountNo");
    private static final QName _AccountServiceKeysResponseAccountServiceKeysResult_QNAME = new QName("http://tempuri.org/", "AccountServiceKeysResult");
    private static final QName _MerchantStatementSourceStatusResponseMerchantStatementSourceStatusResult_QNAME = new QName("http://tempuri.org/", "MerchantStatementSourceStatusResult");
    private static final QName _RequestDebitBatchUnauthorisedResponseRequestDebitBatchUnauthorisedResult_QNAME = new QName("http://tempuri.org/", "RequestDebitBatchUnauthorisedResult");
    private static final QName _RetrieveBatchStatusResponseRetrieveBatchStatusResult_QNAME = new QName("http://tempuri.org/", "RetrieveBatchStatusResult");
    private static final QName _RetrieveSpecificBatchStatusBatchName_QNAME = new QName("http://tempuri.org/", "BatchName");
    private static final QName _RetrieveSpecificBatchStatusResponseRetrieveSpecificBatchStatusResult_QNAME = new QName("http://tempuri.org/", "RetrieveSpecificBatchStatusResult");
    private static final QName _RetrieveMultipleBatchStatusResponseRetrieveMultipleBatchStatusResult_QNAME = new QName("http://tempuri.org/", "RetrieveMultipleBatchStatusResult");
    private static final QName _RetrieveBatchStatusByDateStartDate_QNAME = new QName("http://tempuri.org/", "StartDate");
    private static final QName _RetrieveBatchStatusByDateEndDate_QNAME = new QName("http://tempuri.org/", "EndDate");
    private static final QName _RetrieveBatchStatusByDateResponseRetrieveBatchStatusByDateResult_QNAME = new QName("http://tempuri.org/", "RetrieveBatchStatusByDateResult");
    private static final QName _RetrieveUnauthorisedBatchesResponseRetrieveUnauthorisedBatchesResult_QNAME = new QName("http://tempuri.org/", "RetrieveUnauthorisedBatchesResult");
    private static final QName _RequestBatchAuthoriseFromName_QNAME = new QName("http://tempuri.org/", "FromName");
    private static final QName _RequestBatchAuthoriseFromAddress_QNAME = new QName("http://tempuri.org/", "FromAddress");
    private static final QName _RequestBatchAuthoriseResponseRequestBatchAuthoriseResult_QNAME = new QName("http://tempuri.org/", "RequestBatchAuthoriseResult");
    private static final QName _RequestMandateDataResponseRequestMandateDataResult_QNAME = new QName("http://tempuri.org/", "RequestMandateDataResult");
    private static final QName _RetrieveMandateDataResponseRetrieveMandateDataResult_QNAME = new QName("http://tempuri.org/", "RetrieveMandateDataResult");
    private static final QName _RetrieveMandatePDFResponseRetrieveMandatePDFResult_QNAME = new QName("http://tempuri.org/", "RetrieveMandatePDFResult");
    private static final QName _AddMandateAccountReference_QNAME = new QName("http://tempuri.org/", "AccountReference");
    private static final QName _AddMandateMandateName_QNAME = new QName("http://tempuri.org/", "MandateName");
    private static final QName _AddMandateFirstName_QNAME = new QName("http://tempuri.org/", "FirstName");
    private static final QName _AddMandateSurname_QNAME = new QName("http://tempuri.org/", "Surname");
    private static final QName _AddMandateTradingName_QNAME = new QName("http://tempuri.org/", "TradingName");
    private static final QName _AddMandateRegistrationNumber_QNAME = new QName("http://tempuri.org/", "RegistrationNumber");
    private static final QName _AddMandateRegisteredName_QNAME = new QName("http://tempuri.org/", "RegisteredName");
    private static final QName _AddMandateMobileNumber_QNAME = new QName("http://tempuri.org/", "MobileNumber");
    private static final QName _AddMandateCommencementDay_QNAME = new QName("http://tempuri.org/", "CommencementDay");
    private static final QName _AddMandateAgreementDate_QNAME = new QName("http://tempuri.org/", "AgreementDate");
    private static final QName _AddMandateAgreementReferenceNumber_QNAME = new QName("http://tempuri.org/", "AgreementReferenceNumber");
    private static final QName _AddMandateCancellationNoticePeriod_QNAME = new QName("http://tempuri.org/", "CancellationNoticePeriod");
    private static final QName _AddMandatePublicHolidayOption_QNAME = new QName("http://tempuri.org/", "PublicHolidayOption");
    private static final QName _AddMandateNotes_QNAME = new QName("http://tempuri.org/", "Notes");
    private static final QName _AddMandateField1_QNAME = new QName("http://tempuri.org/", "Field1");
    private static final QName _AddMandateField2_QNAME = new QName("http://tempuri.org/", "Field2");
    private static final QName _AddMandateField3_QNAME = new QName("http://tempuri.org/", "Field3");
    private static final QName _AddMandateField4_QNAME = new QName("http://tempuri.org/", "Field4");
    private static final QName _AddMandateField5_QNAME = new QName("http://tempuri.org/", "Field5");
    private static final QName _AddMandateField6_QNAME = new QName("http://tempuri.org/", "Field6");
    private static final QName _AddMandateField7_QNAME = new QName("http://tempuri.org/", "Field7");
    private static final QName _AddMandateField8_QNAME = new QName("http://tempuri.org/", "Field8");
    private static final QName _AddMandateField9_QNAME = new QName("http://tempuri.org/", "Field9");
    private static final QName _AddMandateAllowVariableDebitAmounts_QNAME = new QName("http://tempuri.org/", "AllowVariableDebitAmounts");
    private static final QName _AddMandateBankDetailType_QNAME = new QName("http://tempuri.org/", "BankDetailType");
    private static final QName _AddMandateBankAccountName_QNAME = new QName("http://tempuri.org/", "BankAccountName");
    private static final QName _AddMandateBankAccountNumber_QNAME = new QName("http://tempuri.org/", "BankAccountNumber");
    private static final QName _AddMandateBranchCode_QNAME = new QName("http://tempuri.org/", "BranchCode");
    private static final QName _AddMandateBankAccountType_QNAME = new QName("http://tempuri.org/", "BankAccountType");
    private static final QName _AddMandateCreditCardToken_QNAME = new QName("http://tempuri.org/", "CreditCardToken");
    private static final QName _AddMandateCreditCardType_QNAME = new QName("http://tempuri.org/", "CreditCardType");
    private static final QName _AddMandateExpiryMonth_QNAME = new QName("http://tempuri.org/", "ExpiryMonth");
    private static final QName _AddMandateExpiryYear_QNAME = new QName("http://tempuri.org/", "ExpiryYear");
    private static final QName _AddMandateIsIdNumber_QNAME = new QName("http://tempuri.org/", "IsIdNumber");
    private static final QName _AddMandateTitle_QNAME = new QName("http://tempuri.org/", "Title");
    private static final QName _AddMandateEmailAddress_QNAME = new QName("http://tempuri.org/", "EmailAddress");
    private static final QName _AddMandatePhoneNumber_QNAME = new QName("http://tempuri.org/", "PhoneNumber");
    private static final QName _AddMandateDateOfBirth_QNAME = new QName("http://tempuri.org/", "DateOfBirth");
    private static final QName _AddMandateDecemberDebitDay_QNAME = new QName("http://tempuri.org/", "DecemberDebitDay");
    private static final QName _AddMandateDebitMasterfileGroup_QNAME = new QName("http://tempuri.org/", "DebitMasterfileGroup");
    private static final QName _AddMandatePhysicalAddressLine1_QNAME = new QName("http://tempuri.org/", "PhysicalAddressLine1");
    private static final QName _AddMandatePhysicalAddressLine2_QNAME = new QName("http://tempuri.org/", "PhysicalAddressLine2");
    private static final QName _AddMandatePhysicalAddressLine3_QNAME = new QName("http://tempuri.org/", "PhysicalAddressLine3");
    private static final QName _AddMandatePhysicalSuburb_QNAME = new QName("http://tempuri.org/", "PhysicalSuburb");
    private static final QName _AddMandatePhysicalCity_QNAME = new QName("http://tempuri.org/", "PhysicalCity");
    private static final QName _AddMandatePhysicalProvince_QNAME = new QName("http://tempuri.org/", "PhysicalProvince");
    private static final QName _AddMandatePhysicalPostalCode_QNAME = new QName("http://tempuri.org/", "PhysicalPostalCode");
    private static final QName _AddMandateMandateActive_QNAME = new QName("http://tempuri.org/", "MandateActive");
    private static final QName _AddMandateRequestAVS_QNAME = new QName("http://tempuri.org/", "RequestAVS");
    private static final QName _AddMandateAVSCheckNumber_QNAME = new QName("http://tempuri.org/", "AVSCheckNumber");
    private static final QName _AddMandateDebiCheckMandateTemplateId_QNAME = new QName("http://tempuri.org/", "DebiCheckMandateTemplateId");
    private static final QName _AddMandateDebiCheckCollectionAmount_QNAME = new QName("http://tempuri.org/", "DebiCheckCollectionAmount");
    private static final QName _AddMandateDebiCheckFirstCollectionDiffers_QNAME = new QName("http://tempuri.org/", "DebiCheckFirstCollectionDiffers");
    private static final QName _AddMandateDebiCheckFirstCollectionDate_QNAME = new QName("http://tempuri.org/", "DebiCheckFirstCollectionDate");
    private static final QName _AddMandateDebiCheckFirstCollectionAmount_QNAME = new QName("http://tempuri.org/", "DebiCheckFirstCollectionAmount");
    private static final QName _AddMandateDebiCheckCollectionDayCode_QNAME = new QName("http://tempuri.org/", "DebiCheckCollectionDayCode");
    private static final QName _AddMandateAddToMasterFile_QNAME = new QName("http://tempuri.org/", "AddToMasterFile");
    private static final QName _AddMandateResponseAddMandateResult_QNAME = new QName("http://tempuri.org/", "AddMandateResult");
    private static final QName _GetAvailableBalanceResponseGetAvailableBalanceResult_QNAME = new QName("http://tempuri.org/", "GetAvailableBalanceResult");
    private static final QName _DebiCheckAuthenticateDebtorIdentification_QNAME = new QName("http://tempuri.org/", "DebtorIdentification");
    private static final QName _DebiCheckAuthenticateAccountName_QNAME = new QName("http://tempuri.org/", "AccountName");
    private static final QName _DebiCheckAuthenticateFirstCollectionAmount_QNAME = new QName("http://tempuri.org/", "FirstCollectionAmount");
    private static final QName _DebiCheckAuthenticateFirstCollectionDate_QNAME = new QName("http://tempuri.org/", "FirstCollectionDate");
    private static final QName _DebiCheckAuthenticateCollectionDayCode_QNAME = new QName("http://tempuri.org/", "collectionDayCode");
    private static final QName _DebiCheckAuthenticateResponseDebiCheckAuthenticateResult_QNAME = new QName("http://tempuri.org/", "DebiCheckAuthenticateResult");
    private static final QName _DebiCheckCancelAuthenticationContractReference_QNAME = new QName("http://tempuri.org/", "ContractReference");
    private static final QName _DebiCheckCancelAuthenticationResponseDebiCheckCancelAuthenticationResult_QNAME = new QName("http://tempuri.org/", "DebiCheckCancelAuthenticationResult");
    private static final QName _DebiCheckAuthenticationCurrentStatusResponseDebiCheckAuthenticationCurrentStatusResult_QNAME = new QName("http://tempuri.org/", "DebiCheckAuthenticationCurrentStatusResult");
    private static final QName _AccountFundsTransferToAccountNumber_QNAME = new QName("http://tempuri.org/", "ToAccountNumber");
    private static final QName _AccountFundsTransferBeneficiaryReference_QNAME = new QName("http://tempuri.org/", "BeneficiaryReference");
    private static final QName _AccountFundsTransferResponseAccountFundsTransferResult_QNAME = new QName("http://tempuri.org/", "AccountFundsTransferResult");
    private static final QName _AVSRealtimeQueryExtra1_QNAME = new QName("http://tempuri.org/", "Extra1");
    private static final QName _AVSRealtimeQueryExtra2_QNAME = new QName("http://tempuri.org/", "Extra2");
    private static final QName _AVSRealtimeQueryExtra3_QNAME = new QName("http://tempuri.org/", "Extra3");
    private static final QName _AVSRealtimeQueryEnquiryName_QNAME = new QName("http://tempuri.org/", "EnquiryName");
    private static final QName _AVSRealtimeQueryInitials_QNAME = new QName("http://tempuri.org/", "Initials");
    private static final QName _AVSRealtimeQueryIdNumber_QNAME = new QName("http://tempuri.org/", "IdNumber");
    private static final QName _AVSRealtimeQueryEmail_QNAME = new QName("http://tempuri.org/", "Email");
    private static final QName _AVSRealtimeQueryResponseAVSRealtimeQueryResult_QNAME = new QName("http://tempuri.org/", "AVSRealtimeQueryResult");
    private static final QName _DebiCheckAmendAuthenticationCollectionAmountInCents_QNAME = new QName("http://tempuri.org/", "CollectionAmountInCents");
    private static final QName _DebiCheckAmendAuthenticationMaximumCollectionAmountInCents_QNAME = new QName("http://tempuri.org/", "MaximumCollectionAmountInCents");
    private static final QName _DebiCheckAmendAuthenticationResponseDebiCheckAmendAuthenticationResult_QNAME = new QName("http://tempuri.org/", "DebiCheckAmendAuthenticationResult");
    private static final QName _DebiCheckRetrieveMandateTemplateDetailResponseDebiCheckRetrieveMandateTemplateDetailResult_QNAME = new QName("http://tempuri.org/", "DebiCheckRetrieveMandateTemplateDetailResult");
    private static final QName _RetrieveProofOfPaymentResponseRetrieveProofOfPaymentResult_QNAME = new QName("http://tempuri.org/", "RetrieveProofOfPaymentResult");
    private static final QName _RetrieveBlockedAccountsResponseRetrieveBlockedAccountsResult_QNAME = new QName("http://tempuri.org/", "RetrieveBlockedAccountsResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: za.co.WebServices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPaymentLimits }
     * 
     * @return
     *     the new instance of {@link GetPaymentLimits }
     */
    public GetPaymentLimits createGetPaymentLimits() {
        return new GetPaymentLimits();
    }

    /**
     * Create an instance of {@link GetPaymentLimitsResponse }
     * 
     * @return
     *     the new instance of {@link GetPaymentLimitsResponse }
     */
    public GetPaymentLimitsResponse createGetPaymentLimitsResponse() {
        return new GetPaymentLimitsResponse();
    }

    /**
     * Create an instance of {@link GetDebitLimits }
     * 
     * @return
     *     the new instance of {@link GetDebitLimits }
     */
    public GetDebitLimits createGetDebitLimits() {
        return new GetDebitLimits();
    }

    /**
     * Create an instance of {@link GetDebitLimitsResponse }
     * 
     * @return
     *     the new instance of {@link GetDebitLimitsResponse }
     */
    public GetDebitLimitsResponse createGetDebitLimitsResponse() {
        return new GetDebitLimitsResponse();
    }

    /**
     * Create an instance of {@link AccountFundsRelease }
     * 
     * @return
     *     the new instance of {@link AccountFundsRelease }
     */
    public AccountFundsRelease createAccountFundsRelease() {
        return new AccountFundsRelease();
    }

    /**
     * Create an instance of {@link AccountFundsReleaseResponse }
     * 
     * @return
     *     the new instance of {@link AccountFundsReleaseResponse }
     */
    public AccountFundsReleaseResponse createAccountFundsReleaseResponse() {
        return new AccountFundsReleaseResponse();
    }

    /**
     * Create an instance of {@link RequestActionDate }
     * 
     * @return
     *     the new instance of {@link RequestActionDate }
     */
    public RequestActionDate createRequestActionDate() {
        return new RequestActionDate();
    }

    /**
     * Create an instance of {@link RequestActionDateResponse }
     * 
     * @return
     *     the new instance of {@link RequestActionDateResponse }
     */
    public RequestActionDateResponse createRequestActionDateResponse() {
        return new RequestActionDateResponse();
    }

    /**
     * Create an instance of {@link RequestPresentationDate }
     * 
     * @return
     *     the new instance of {@link RequestPresentationDate }
     */
    public RequestPresentationDate createRequestPresentationDate() {
        return new RequestPresentationDate();
    }

    /**
     * Create an instance of {@link RequestPresentationDateResponse }
     * 
     * @return
     *     the new instance of {@link RequestPresentationDateResponse }
     */
    public RequestPresentationDateResponse createRequestPresentationDateResponse() {
        return new RequestPresentationDateResponse();
    }

    /**
     * Create an instance of {@link RequestInterimMerchantStatement }
     * 
     * @return
     *     the new instance of {@link RequestInterimMerchantStatement }
     */
    public RequestInterimMerchantStatement createRequestInterimMerchantStatement() {
        return new RequestInterimMerchantStatement();
    }

    /**
     * Create an instance of {@link RequestInterimMerchantStatementResponse }
     * 
     * @return
     *     the new instance of {@link RequestInterimMerchantStatementResponse }
     */
    public RequestInterimMerchantStatementResponse createRequestInterimMerchantStatementResponse() {
        return new RequestInterimMerchantStatementResponse();
    }

    /**
     * Create an instance of {@link RequestMerchantStatement }
     * 
     * @return
     *     the new instance of {@link RequestMerchantStatement }
     */
    public RequestMerchantStatement createRequestMerchantStatement() {
        return new RequestMerchantStatement();
    }

    /**
     * Create an instance of {@link RequestMerchantStatementResponse }
     * 
     * @return
     *     the new instance of {@link RequestMerchantStatementResponse }
     */
    public RequestMerchantStatementResponse createRequestMerchantStatementResponse() {
        return new RequestMerchantStatementResponse();
    }

    /**
     * Create an instance of {@link RetrieveMerchantStatement }
     * 
     * @return
     *     the new instance of {@link RetrieveMerchantStatement }
     */
    public RetrieveMerchantStatement createRetrieveMerchantStatement() {
        return new RetrieveMerchantStatement();
    }

    /**
     * Create an instance of {@link RetrieveMerchantStatementResponse }
     * 
     * @return
     *     the new instance of {@link RetrieveMerchantStatementResponse }
     */
    public RetrieveMerchantStatementResponse createRetrieveMerchantStatementResponse() {
        return new RetrieveMerchantStatementResponse();
    }

    /**
     * Create an instance of {@link RequestTransactionTypes }
     * 
     * @return
     *     the new instance of {@link RequestTransactionTypes }
     */
    public RequestTransactionTypes createRequestTransactionTypes() {
        return new RequestTransactionTypes();
    }

    /**
     * Create an instance of {@link RequestTransactionTypesResponse }
     * 
     * @return
     *     the new instance of {@link RequestTransactionTypesResponse }
     */
    public RequestTransactionTypesResponse createRequestTransactionTypesResponse() {
        return new RequestTransactionTypesResponse();
    }

    /**
     * Create an instance of {@link RetrieveTransactionTypes }
     * 
     * @return
     *     the new instance of {@link RetrieveTransactionTypes }
     */
    public RetrieveTransactionTypes createRetrieveTransactionTypes() {
        return new RetrieveTransactionTypes();
    }

    /**
     * Create an instance of {@link RetrieveTransactionTypesResponse }
     * 
     * @return
     *     the new instance of {@link RetrieveTransactionTypesResponse }
     */
    public RetrieveTransactionTypesResponse createRetrieveTransactionTypesResponse() {
        return new RetrieveTransactionTypesResponse();
    }

    /**
     * Create an instance of {@link LegacyCompactBatchFileUpload }
     * 
     * @return
     *     the new instance of {@link LegacyCompactBatchFileUpload }
     */
    public LegacyCompactBatchFileUpload createLegacyCompactBatchFileUpload() {
        return new LegacyCompactBatchFileUpload();
    }

    /**
     * Create an instance of {@link LegacyCompactBatchFileUploadResponse }
     * 
     * @return
     *     the new instance of {@link LegacyCompactBatchFileUploadResponse }
     */
    public LegacyCompactBatchFileUploadResponse createLegacyCompactBatchFileUploadResponse() {
        return new LegacyCompactBatchFileUploadResponse();
    }

    /**
     * Create an instance of {@link LegacyBatchFileUpload }
     * 
     * @return
     *     the new instance of {@link LegacyBatchFileUpload }
     */
    public LegacyBatchFileUpload createLegacyBatchFileUpload() {
        return new LegacyBatchFileUpload();
    }

    /**
     * Create an instance of {@link LegacyBatchFileUploadResponse }
     * 
     * @return
     *     the new instance of {@link LegacyBatchFileUploadResponse }
     */
    public LegacyBatchFileUploadResponse createLegacyBatchFileUploadResponse() {
        return new LegacyBatchFileUploadResponse();
    }

    /**
     * Create an instance of {@link BatchFileUpload }
     * 
     * @return
     *     the new instance of {@link BatchFileUpload }
     */
    public BatchFileUpload createBatchFileUpload() {
        return new BatchFileUpload();
    }

    /**
     * Create an instance of {@link BatchFileUploadResponse }
     * 
     * @return
     *     the new instance of {@link BatchFileUploadResponse }
     */
    public BatchFileUploadResponse createBatchFileUploadResponse() {
        return new BatchFileUploadResponse();
    }

    /**
     * Create an instance of {@link RequestFileUploadReport }
     * 
     * @return
     *     the new instance of {@link RequestFileUploadReport }
     */
    public RequestFileUploadReport createRequestFileUploadReport() {
        return new RequestFileUploadReport();
    }

    /**
     * Create an instance of {@link RequestFileUploadReportResponse }
     * 
     * @return
     *     the new instance of {@link RequestFileUploadReportResponse }
     */
    public RequestFileUploadReportResponse createRequestFileUploadReportResponse() {
        return new RequestFileUploadReportResponse();
    }

    /**
     * Create an instance of {@link RequestCombinedUploadReportForDate }
     * 
     * @return
     *     the new instance of {@link RequestCombinedUploadReportForDate }
     */
    public RequestCombinedUploadReportForDate createRequestCombinedUploadReportForDate() {
        return new RequestCombinedUploadReportForDate();
    }

    /**
     * Create an instance of {@link RequestCombinedUploadReportForDateResponse }
     * 
     * @return
     *     the new instance of {@link RequestCombinedUploadReportForDateResponse }
     */
    public RequestCombinedUploadReportForDateResponse createRequestCombinedUploadReportForDateResponse() {
        return new RequestCombinedUploadReportForDateResponse();
    }

    /**
     * Create an instance of {@link RequestCreditDataReport }
     * 
     * @return
     *     the new instance of {@link RequestCreditDataReport }
     */
    public RequestCreditDataReport createRequestCreditDataReport() {
        return new RequestCreditDataReport();
    }

    /**
     * Create an instance of {@link RequestCreditDataReportResponse }
     * 
     * @return
     *     the new instance of {@link RequestCreditDataReportResponse }
     */
    public RequestCreditDataReportResponse createRequestCreditDataReportResponse() {
        return new RequestCreditDataReportResponse();
    }

    /**
     * Create an instance of {@link RequestAVSReport }
     * 
     * @return
     *     the new instance of {@link RequestAVSReport }
     */
    public RequestAVSReport createRequestAVSReport() {
        return new RequestAVSReport();
    }

    /**
     * Create an instance of {@link RequestAVSReportResponse }
     * 
     * @return
     *     the new instance of {@link RequestAVSReportResponse }
     */
    public RequestAVSReportResponse createRequestAVSReportResponse() {
        return new RequestAVSReportResponse();
    }

    /**
     * Create an instance of {@link RequestPayNowInvoice }
     * 
     * @return
     *     the new instance of {@link RequestPayNowInvoice }
     */
    public RequestPayNowInvoice createRequestPayNowInvoice() {
        return new RequestPayNowInvoice();
    }

    /**
     * Create an instance of {@link RequestPayNowInvoiceResponse }
     * 
     * @return
     *     the new instance of {@link RequestPayNowInvoiceResponse }
     */
    public RequestPayNowInvoiceResponse createRequestPayNowInvoiceResponse() {
        return new RequestPayNowInvoiceResponse();
    }

    /**
     * Create an instance of {@link IsValidServiceKey }
     * 
     * @return
     *     the new instance of {@link IsValidServiceKey }
     */
    public IsValidServiceKey createIsValidServiceKey() {
        return new IsValidServiceKey();
    }

    /**
     * Create an instance of {@link IsValidServiceKeyResponse }
     * 
     * @return
     *     the new instance of {@link IsValidServiceKeyResponse }
     */
    public IsValidServiceKeyResponse createIsValidServiceKeyResponse() {
        return new IsValidServiceKeyResponse();
    }

    /**
     * Create an instance of {@link AccountServiceKeys }
     * 
     * @return
     *     the new instance of {@link AccountServiceKeys }
     */
    public AccountServiceKeys createAccountServiceKeys() {
        return new AccountServiceKeys();
    }

    /**
     * Create an instance of {@link AccountServiceKeysResponse }
     * 
     * @return
     *     the new instance of {@link AccountServiceKeysResponse }
     */
    public AccountServiceKeysResponse createAccountServiceKeysResponse() {
        return new AccountServiceKeysResponse();
    }

    /**
     * Create an instance of {@link MerchantStatementSourceStatus }
     * 
     * @return
     *     the new instance of {@link MerchantStatementSourceStatus }
     */
    public MerchantStatementSourceStatus createMerchantStatementSourceStatus() {
        return new MerchantStatementSourceStatus();
    }

    /**
     * Create an instance of {@link za.co.WebServices.MerchantStatementSourceStatusResponse }
     * 
     * @return
     *     the new instance of {@link za.co.WebServices.MerchantStatementSourceStatusResponse }
     */
    public za.co.WebServices.MerchantStatementSourceStatusResponse createMerchantStatementSourceStatusResponse() {
        return new za.co.WebServices.MerchantStatementSourceStatusResponse();
    }

    /**
     * Create an instance of {@link RequestDebitBatchUnauthorised }
     * 
     * @return
     *     the new instance of {@link RequestDebitBatchUnauthorised }
     */
    public RequestDebitBatchUnauthorised createRequestDebitBatchUnauthorised() {
        return new RequestDebitBatchUnauthorised();
    }

    /**
     * Create an instance of {@link RequestDebitBatchUnauthorisedResponse }
     * 
     * @return
     *     the new instance of {@link RequestDebitBatchUnauthorisedResponse }
     */
    public RequestDebitBatchUnauthorisedResponse createRequestDebitBatchUnauthorisedResponse() {
        return new RequestDebitBatchUnauthorisedResponse();
    }

    /**
     * Create an instance of {@link RetrieveBatchStatus }
     * 
     * @return
     *     the new instance of {@link RetrieveBatchStatus }
     */
    public RetrieveBatchStatus createRetrieveBatchStatus() {
        return new RetrieveBatchStatus();
    }

    /**
     * Create an instance of {@link RetrieveBatchStatusResponse }
     * 
     * @return
     *     the new instance of {@link RetrieveBatchStatusResponse }
     */
    public RetrieveBatchStatusResponse createRetrieveBatchStatusResponse() {
        return new RetrieveBatchStatusResponse();
    }

    /**
     * Create an instance of {@link RetrieveSpecificBatchStatus }
     * 
     * @return
     *     the new instance of {@link RetrieveSpecificBatchStatus }
     */
    public RetrieveSpecificBatchStatus createRetrieveSpecificBatchStatus() {
        return new RetrieveSpecificBatchStatus();
    }

    /**
     * Create an instance of {@link RetrieveSpecificBatchStatusResponse }
     * 
     * @return
     *     the new instance of {@link RetrieveSpecificBatchStatusResponse }
     */
    public RetrieveSpecificBatchStatusResponse createRetrieveSpecificBatchStatusResponse() {
        return new RetrieveSpecificBatchStatusResponse();
    }

    /**
     * Create an instance of {@link RetrieveMultipleBatchStatus }
     * 
     * @return
     *     the new instance of {@link RetrieveMultipleBatchStatus }
     */
    public RetrieveMultipleBatchStatus createRetrieveMultipleBatchStatus() {
        return new RetrieveMultipleBatchStatus();
    }

    /**
     * Create an instance of {@link RetrieveMultipleBatchStatusResponse }
     * 
     * @return
     *     the new instance of {@link RetrieveMultipleBatchStatusResponse }
     */
    public RetrieveMultipleBatchStatusResponse createRetrieveMultipleBatchStatusResponse() {
        return new RetrieveMultipleBatchStatusResponse();
    }

    /**
     * Create an instance of {@link RetrieveBatchStatusByDate }
     * 
     * @return
     *     the new instance of {@link RetrieveBatchStatusByDate }
     */
    public RetrieveBatchStatusByDate createRetrieveBatchStatusByDate() {
        return new RetrieveBatchStatusByDate();
    }

    /**
     * Create an instance of {@link RetrieveBatchStatusByDateResponse }
     * 
     * @return
     *     the new instance of {@link RetrieveBatchStatusByDateResponse }
     */
    public RetrieveBatchStatusByDateResponse createRetrieveBatchStatusByDateResponse() {
        return new RetrieveBatchStatusByDateResponse();
    }

    /**
     * Create an instance of {@link RetrieveUnauthorisedBatches }
     * 
     * @return
     *     the new instance of {@link RetrieveUnauthorisedBatches }
     */
    public RetrieveUnauthorisedBatches createRetrieveUnauthorisedBatches() {
        return new RetrieveUnauthorisedBatches();
    }

    /**
     * Create an instance of {@link RetrieveUnauthorisedBatchesResponse }
     * 
     * @return
     *     the new instance of {@link RetrieveUnauthorisedBatchesResponse }
     */
    public RetrieveUnauthorisedBatchesResponse createRetrieveUnauthorisedBatchesResponse() {
        return new RetrieveUnauthorisedBatchesResponse();
    }

    /**
     * Create an instance of {@link RequestBatchAuthorise }
     * 
     * @return
     *     the new instance of {@link RequestBatchAuthorise }
     */
    public RequestBatchAuthorise createRequestBatchAuthorise() {
        return new RequestBatchAuthorise();
    }

    /**
     * Create an instance of {@link RequestBatchAuthoriseResponse }
     * 
     * @return
     *     the new instance of {@link RequestBatchAuthoriseResponse }
     */
    public RequestBatchAuthoriseResponse createRequestBatchAuthoriseResponse() {
        return new RequestBatchAuthoriseResponse();
    }

    /**
     * Create an instance of {@link RequestMandateData }
     * 
     * @return
     *     the new instance of {@link RequestMandateData }
     */
    public RequestMandateData createRequestMandateData() {
        return new RequestMandateData();
    }

    /**
     * Create an instance of {@link RequestMandateDataResponse }
     * 
     * @return
     *     the new instance of {@link RequestMandateDataResponse }
     */
    public RequestMandateDataResponse createRequestMandateDataResponse() {
        return new RequestMandateDataResponse();
    }

    /**
     * Create an instance of {@link RetrieveMandateData }
     * 
     * @return
     *     the new instance of {@link RetrieveMandateData }
     */
    public RetrieveMandateData createRetrieveMandateData() {
        return new RetrieveMandateData();
    }

    /**
     * Create an instance of {@link RetrieveMandateDataResponse }
     * 
     * @return
     *     the new instance of {@link RetrieveMandateDataResponse }
     */
    public RetrieveMandateDataResponse createRetrieveMandateDataResponse() {
        return new RetrieveMandateDataResponse();
    }

    /**
     * Create an instance of {@link RetrieveMandatePDF }
     * 
     * @return
     *     the new instance of {@link RetrieveMandatePDF }
     */
    public RetrieveMandatePDF createRetrieveMandatePDF() {
        return new RetrieveMandatePDF();
    }

    /**
     * Create an instance of {@link RetrieveMandatePDFResponse }
     * 
     * @return
     *     the new instance of {@link RetrieveMandatePDFResponse }
     */
    public RetrieveMandatePDFResponse createRetrieveMandatePDFResponse() {
        return new RetrieveMandatePDFResponse();
    }

    /**
     * Create an instance of {@link AddMandate }
     * 
     * @return
     *     the new instance of {@link AddMandate }
     */
    public AddMandate createAddMandate() {
        return new AddMandate();
    }

    /**
     * Create an instance of {@link za.co.WebServices.AddMandateResponse }
     * 
     * @return
     *     the new instance of {@link za.co.WebServices.AddMandateResponse }
     */
    public za.co.WebServices.AddMandateResponse createAddMandateResponse() {
        return new za.co.WebServices.AddMandateResponse();
    }

    /**
     * Create an instance of {@link GetAvailableBalance }
     * 
     * @return
     *     the new instance of {@link GetAvailableBalance }
     */
    public GetAvailableBalance createGetAvailableBalance() {
        return new GetAvailableBalance();
    }

    /**
     * Create an instance of {@link za.co.WebServices.GetAvailableBalanceResponse }
     * 
     * @return
     *     the new instance of {@link za.co.WebServices.GetAvailableBalanceResponse }
     */
    public za.co.WebServices.GetAvailableBalanceResponse createGetAvailableBalanceResponse() {
        return new za.co.WebServices.GetAvailableBalanceResponse();
    }

    /**
     * Create an instance of {@link DebiCheckAuthenticate }
     * 
     * @return
     *     the new instance of {@link DebiCheckAuthenticate }
     */
    public DebiCheckAuthenticate createDebiCheckAuthenticate() {
        return new DebiCheckAuthenticate();
    }

    /**
     * Create an instance of {@link za.co.WebServices.DebiCheckAuthenticateResponse }
     * 
     * @return
     *     the new instance of {@link za.co.WebServices.DebiCheckAuthenticateResponse }
     */
    public za.co.WebServices.DebiCheckAuthenticateResponse createDebiCheckAuthenticateResponse() {
        return new za.co.WebServices.DebiCheckAuthenticateResponse();
    }

    /**
     * Create an instance of {@link DebiCheckCancelAuthentication }
     * 
     * @return
     *     the new instance of {@link DebiCheckCancelAuthentication }
     */
    public DebiCheckCancelAuthentication createDebiCheckCancelAuthentication() {
        return new DebiCheckCancelAuthentication();
    }

    /**
     * Create an instance of {@link DebiCheckCancelAuthenticationResponse }
     * 
     * @return
     *     the new instance of {@link DebiCheckCancelAuthenticationResponse }
     */
    public DebiCheckCancelAuthenticationResponse createDebiCheckCancelAuthenticationResponse() {
        return new DebiCheckCancelAuthenticationResponse();
    }

    /**
     * Create an instance of {@link DebiCheckAuthenticationCurrentStatus }
     * 
     * @return
     *     the new instance of {@link DebiCheckAuthenticationCurrentStatus }
     */
    public DebiCheckAuthenticationCurrentStatus createDebiCheckAuthenticationCurrentStatus() {
        return new DebiCheckAuthenticationCurrentStatus();
    }

    /**
     * Create an instance of {@link za.co.WebServices.DebiCheckAuthenticationCurrentStatusResponse }
     * 
     * @return
     *     the new instance of {@link za.co.WebServices.DebiCheckAuthenticationCurrentStatusResponse }
     */
    public za.co.WebServices.DebiCheckAuthenticationCurrentStatusResponse createDebiCheckAuthenticationCurrentStatusResponse() {
        return new za.co.WebServices.DebiCheckAuthenticationCurrentStatusResponse();
    }

    /**
     * Create an instance of {@link AccountFundsTransfer }
     * 
     * @return
     *     the new instance of {@link AccountFundsTransfer }
     */
    public AccountFundsTransfer createAccountFundsTransfer() {
        return new AccountFundsTransfer();
    }

    /**
     * Create an instance of {@link za.co.WebServices.AccountFundsTransferResponse }
     * 
     * @return
     *     the new instance of {@link za.co.WebServices.AccountFundsTransferResponse }
     */
    public za.co.WebServices.AccountFundsTransferResponse createAccountFundsTransferResponse() {
        return new za.co.WebServices.AccountFundsTransferResponse();
    }

    /**
     * Create an instance of {@link AVSRealtimeQuery }
     * 
     * @return
     *     the new instance of {@link AVSRealtimeQuery }
     */
    public AVSRealtimeQuery createAVSRealtimeQuery() {
        return new AVSRealtimeQuery();
    }

    /**
     * Create an instance of {@link za.co.WebServices.AVSRealtimeQueryResponse }
     * 
     * @return
     *     the new instance of {@link za.co.WebServices.AVSRealtimeQueryResponse }
     */
    public za.co.WebServices.AVSRealtimeQueryResponse createAVSRealtimeQueryResponse() {
        return new za.co.WebServices.AVSRealtimeQueryResponse();
    }

    /**
     * Create an instance of {@link DebiCheckAmendAuthentication }
     * 
     * @return
     *     the new instance of {@link DebiCheckAmendAuthentication }
     */
    public DebiCheckAmendAuthentication createDebiCheckAmendAuthentication() {
        return new DebiCheckAmendAuthentication();
    }

    /**
     * Create an instance of {@link DebiCheckAmendAuthenticationResponse }
     * 
     * @return
     *     the new instance of {@link DebiCheckAmendAuthenticationResponse }
     */
    public DebiCheckAmendAuthenticationResponse createDebiCheckAmendAuthenticationResponse() {
        return new DebiCheckAmendAuthenticationResponse();
    }

    /**
     * Create an instance of {@link DebiCheckRetrieveMandateTemplateDetail }
     * 
     * @return
     *     the new instance of {@link DebiCheckRetrieveMandateTemplateDetail }
     */
    public DebiCheckRetrieveMandateTemplateDetail createDebiCheckRetrieveMandateTemplateDetail() {
        return new DebiCheckRetrieveMandateTemplateDetail();
    }

    /**
     * Create an instance of {@link DebiCheckRetrieveMandateTemplateDetailResponse }
     * 
     * @return
     *     the new instance of {@link DebiCheckRetrieveMandateTemplateDetailResponse }
     */
    public DebiCheckRetrieveMandateTemplateDetailResponse createDebiCheckRetrieveMandateTemplateDetailResponse() {
        return new DebiCheckRetrieveMandateTemplateDetailResponse();
    }

    /**
     * Create an instance of {@link RetrieveProofOfPayment }
     * 
     * @return
     *     the new instance of {@link RetrieveProofOfPayment }
     */
    public RetrieveProofOfPayment createRetrieveProofOfPayment() {
        return new RetrieveProofOfPayment();
    }

    /**
     * Create an instance of {@link za.co.WebServices.RetrieveProofOfPaymentResponse }
     * 
     * @return
     *     the new instance of {@link za.co.WebServices.RetrieveProofOfPaymentResponse }
     */
    public za.co.WebServices.RetrieveProofOfPaymentResponse createRetrieveProofOfPaymentResponse() {
        return new za.co.WebServices.RetrieveProofOfPaymentResponse();
    }

    /**
     * Create an instance of {@link RetrieveBlockedAccounts }
     * 
     * @return
     *     the new instance of {@link RetrieveBlockedAccounts }
     */
    public RetrieveBlockedAccounts createRetrieveBlockedAccounts() {
        return new RetrieveBlockedAccounts();
    }

    /**
     * Create an instance of {@link za.co.WebServices.RetrieveBlockedAccountsResponse }
     * 
     * @return
     *     the new instance of {@link za.co.WebServices.RetrieveBlockedAccountsResponse }
     */
    public za.co.WebServices.RetrieveBlockedAccountsResponse createRetrieveBlockedAccountsResponse() {
        return new za.co.WebServices.RetrieveBlockedAccountsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = GetPaymentLimits.class)
    public JAXBElement<String> createGetPaymentLimitsServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, GetPaymentLimits.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LimitResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LimitResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPaymentLimitsResult", scope = GetPaymentLimitsResponse.class)
    public JAXBElement<LimitResponse> createGetPaymentLimitsResponseGetPaymentLimitsResult(LimitResponse value) {
        return new JAXBElement<>(_GetPaymentLimitsResponseGetPaymentLimitsResult_QNAME, LimitResponse.class, GetPaymentLimitsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = GetDebitLimits.class)
    public JAXBElement<String> createGetDebitLimitsServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, GetDebitLimits.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LimitResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LimitResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetDebitLimitsResult", scope = GetDebitLimitsResponse.class)
    public JAXBElement<LimitResponse> createGetDebitLimitsResponseGetDebitLimitsResult(LimitResponse value) {
        return new JAXBElement<>(_GetDebitLimitsResponseGetDebitLimitsResult_QNAME, LimitResponse.class, GetDebitLimitsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = AccountFundsRelease.class)
    public JAXBElement<String> createAccountFundsReleaseServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, AccountFundsRelease.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Date", scope = AccountFundsRelease.class)
    public JAXBElement<String> createAccountFundsReleaseDate(String value) {
        return new JAXBElement<>(_AccountFundsReleaseDate_QNAME, String.class, AccountFundsRelease.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AccountFundsReleaseResult", scope = AccountFundsReleaseResponse.class)
    public JAXBElement<String> createAccountFundsReleaseResponseAccountFundsReleaseResult(String value) {
        return new JAXBElement<>(_AccountFundsReleaseResponseAccountFundsReleaseResult_QNAME, String.class, AccountFundsReleaseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RequestActionDate.class)
    public JAXBElement<String> createRequestActionDateServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RequestActionDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Date", scope = RequestActionDate.class)
    public JAXBElement<String> createRequestActionDateDate(String value) {
        return new JAXBElement<>(_AccountFundsReleaseDate_QNAME, String.class, RequestActionDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Instruction", scope = RequestActionDate.class)
    public JAXBElement<String> createRequestActionDateInstruction(String value) {
        return new JAXBElement<>(_RequestActionDateInstruction_QNAME, String.class, RequestActionDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ForwardActionDate", scope = RequestActionDate.class)
    public JAXBElement<String> createRequestActionDateForwardActionDate(String value) {
        return new JAXBElement<>(_RequestActionDateForwardActionDate_QNAME, String.class, RequestActionDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RequestActionDateResult", scope = RequestActionDateResponse.class)
    public JAXBElement<String> createRequestActionDateResponseRequestActionDateResult(String value) {
        return new JAXBElement<>(_RequestActionDateResponseRequestActionDateResult_QNAME, String.class, RequestActionDateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RequestPresentationDate.class)
    public JAXBElement<String> createRequestPresentationDateServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RequestPresentationDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Date", scope = RequestPresentationDate.class)
    public JAXBElement<String> createRequestPresentationDateDate(String value) {
        return new JAXBElement<>(_AccountFundsReleaseDate_QNAME, String.class, RequestPresentationDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Instruction", scope = RequestPresentationDate.class)
    public JAXBElement<String> createRequestPresentationDateInstruction(String value) {
        return new JAXBElement<>(_RequestActionDateInstruction_QNAME, String.class, RequestPresentationDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ForwardActionDate", scope = RequestPresentationDate.class)
    public JAXBElement<String> createRequestPresentationDateForwardActionDate(String value) {
        return new JAXBElement<>(_RequestActionDateForwardActionDate_QNAME, String.class, RequestPresentationDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RequestPresentationDateResult", scope = RequestPresentationDateResponse.class)
    public JAXBElement<String> createRequestPresentationDateResponseRequestPresentationDateResult(String value) {
        return new JAXBElement<>(_RequestPresentationDateResponseRequestPresentationDateResult_QNAME, String.class, RequestPresentationDateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RequestInterimMerchantStatement.class)
    public JAXBElement<String> createRequestInterimMerchantStatementServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RequestInterimMerchantStatement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RequestInterimMerchantStatementResult", scope = RequestInterimMerchantStatementResponse.class)
    public JAXBElement<String> createRequestInterimMerchantStatementResponseRequestInterimMerchantStatementResult(String value) {
        return new JAXBElement<>(_RequestInterimMerchantStatementResponseRequestInterimMerchantStatementResult_QNAME, String.class, RequestInterimMerchantStatementResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RequestMerchantStatement.class)
    public JAXBElement<String> createRequestMerchantStatementServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RequestMerchantStatement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FromActionDate", scope = RequestMerchantStatement.class)
    public JAXBElement<String> createRequestMerchantStatementFromActionDate(String value) {
        return new JAXBElement<>(_RequestMerchantStatementFromActionDate_QNAME, String.class, RequestMerchantStatement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RequestMerchantStatementResult", scope = RequestMerchantStatementResponse.class)
    public JAXBElement<String> createRequestMerchantStatementResponseRequestMerchantStatementResult(String value) {
        return new JAXBElement<>(_RequestMerchantStatementResponseRequestMerchantStatementResult_QNAME, String.class, RequestMerchantStatementResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RetrieveMerchantStatement.class)
    public JAXBElement<String> createRetrieveMerchantStatementServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RetrieveMerchantStatement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PollingId", scope = RetrieveMerchantStatement.class)
    public JAXBElement<String> createRetrieveMerchantStatementPollingId(String value) {
        return new JAXBElement<>(_RetrieveMerchantStatementPollingId_QNAME, String.class, RetrieveMerchantStatement.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetrieveMerchantStatementResult", scope = RetrieveMerchantStatementResponse.class)
    public JAXBElement<String> createRetrieveMerchantStatementResponseRetrieveMerchantStatementResult(String value) {
        return new JAXBElement<>(_RetrieveMerchantStatementResponseRetrieveMerchantStatementResult_QNAME, String.class, RetrieveMerchantStatementResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RequestTransactionTypes.class)
    public JAXBElement<String> createRequestTransactionTypesServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RequestTransactionTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RequestTransactionTypesResult", scope = RequestTransactionTypesResponse.class)
    public JAXBElement<String> createRequestTransactionTypesResponseRequestTransactionTypesResult(String value) {
        return new JAXBElement<>(_RequestTransactionTypesResponseRequestTransactionTypesResult_QNAME, String.class, RequestTransactionTypesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RetrieveTransactionTypes.class)
    public JAXBElement<String> createRetrieveTransactionTypesServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RetrieveTransactionTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PollingId", scope = RetrieveTransactionTypes.class)
    public JAXBElement<String> createRetrieveTransactionTypesPollingId(String value) {
        return new JAXBElement<>(_RetrieveMerchantStatementPollingId_QNAME, String.class, RetrieveTransactionTypes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetrieveTransactionTypesResult", scope = RetrieveTransactionTypesResponse.class)
    public JAXBElement<String> createRetrieveTransactionTypesResponseRetrieveTransactionTypesResult(String value) {
        return new JAXBElement<>(_RetrieveTransactionTypesResponseRetrieveTransactionTypesResult_QNAME, String.class, RetrieveTransactionTypesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserName", scope = LegacyCompactBatchFileUpload.class)
    public JAXBElement<String> createLegacyCompactBatchFileUploadUserName(String value) {
        return new JAXBElement<>(_LegacyCompactBatchFileUploadUserName_QNAME, String.class, LegacyCompactBatchFileUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Password", scope = LegacyCompactBatchFileUpload.class)
    public JAXBElement<String> createLegacyCompactBatchFileUploadPassword(String value) {
        return new JAXBElement<>(_LegacyCompactBatchFileUploadPassword_QNAME, String.class, LegacyCompactBatchFileUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PIN", scope = LegacyCompactBatchFileUpload.class)
    public JAXBElement<String> createLegacyCompactBatchFileUploadPIN(String value) {
        return new JAXBElement<>(_LegacyCompactBatchFileUploadPIN_QNAME, String.class, LegacyCompactBatchFileUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "File", scope = LegacyCompactBatchFileUpload.class)
    public JAXBElement<String> createLegacyCompactBatchFileUploadFile(String value) {
        return new JAXBElement<>(_LegacyCompactBatchFileUploadFile_QNAME, String.class, LegacyCompactBatchFileUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessAsLegacy", scope = LegacyCompactBatchFileUpload.class)
    public JAXBElement<String> createLegacyCompactBatchFileUploadProcessAsLegacy(String value) {
        return new JAXBElement<>(_LegacyCompactBatchFileUploadProcessAsLegacy_QNAME, String.class, LegacyCompactBatchFileUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LegacyCompactBatchFileUploadResult", scope = LegacyCompactBatchFileUploadResponse.class)
    public JAXBElement<String> createLegacyCompactBatchFileUploadResponseLegacyCompactBatchFileUploadResult(String value) {
        return new JAXBElement<>(_LegacyCompactBatchFileUploadResponseLegacyCompactBatchFileUploadResult_QNAME, String.class, LegacyCompactBatchFileUploadResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserName", scope = LegacyBatchFileUpload.class)
    public JAXBElement<String> createLegacyBatchFileUploadUserName(String value) {
        return new JAXBElement<>(_LegacyCompactBatchFileUploadUserName_QNAME, String.class, LegacyBatchFileUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Password", scope = LegacyBatchFileUpload.class)
    public JAXBElement<String> createLegacyBatchFileUploadPassword(String value) {
        return new JAXBElement<>(_LegacyCompactBatchFileUploadPassword_QNAME, String.class, LegacyBatchFileUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PIN", scope = LegacyBatchFileUpload.class)
    public JAXBElement<String> createLegacyBatchFileUploadPIN(String value) {
        return new JAXBElement<>(_LegacyCompactBatchFileUploadPIN_QNAME, String.class, LegacyBatchFileUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "File", scope = LegacyBatchFileUpload.class)
    public JAXBElement<String> createLegacyBatchFileUploadFile(String value) {
        return new JAXBElement<>(_LegacyCompactBatchFileUploadFile_QNAME, String.class, LegacyBatchFileUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ProcessAsLegacy", scope = LegacyBatchFileUpload.class)
    public JAXBElement<String> createLegacyBatchFileUploadProcessAsLegacy(String value) {
        return new JAXBElement<>(_LegacyCompactBatchFileUploadProcessAsLegacy_QNAME, String.class, LegacyBatchFileUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LegacyBatchFileUploadResult", scope = LegacyBatchFileUploadResponse.class)
    public JAXBElement<String> createLegacyBatchFileUploadResponseLegacyBatchFileUploadResult(String value) {
        return new JAXBElement<>(_LegacyBatchFileUploadResponseLegacyBatchFileUploadResult_QNAME, String.class, LegacyBatchFileUploadResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = BatchFileUpload.class)
    public JAXBElement<String> createBatchFileUploadServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, BatchFileUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "File", scope = BatchFileUpload.class)
    public JAXBElement<String> createBatchFileUploadFile(String value) {
        return new JAXBElement<>(_LegacyCompactBatchFileUploadFile_QNAME, String.class, BatchFileUpload.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BatchFileUploadResult", scope = BatchFileUploadResponse.class)
    public JAXBElement<String> createBatchFileUploadResponseBatchFileUploadResult(String value) {
        return new JAXBElement<>(_BatchFileUploadResponseBatchFileUploadResult_QNAME, String.class, BatchFileUploadResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RequestFileUploadReport.class)
    public JAXBElement<String> createRequestFileUploadReportServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RequestFileUploadReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FileToken", scope = RequestFileUploadReport.class)
    public JAXBElement<String> createRequestFileUploadReportFileToken(String value) {
        return new JAXBElement<>(_RequestFileUploadReportFileToken_QNAME, String.class, RequestFileUploadReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RequestFileUploadReportResult", scope = RequestFileUploadReportResponse.class)
    public JAXBElement<String> createRequestFileUploadReportResponseRequestFileUploadReportResult(String value) {
        return new JAXBElement<>(_RequestFileUploadReportResponseRequestFileUploadReportResult_QNAME, String.class, RequestFileUploadReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RequestCombinedUploadReportForDate.class)
    public JAXBElement<String> createRequestCombinedUploadReportForDateServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RequestCombinedUploadReportForDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Date", scope = RequestCombinedUploadReportForDate.class)
    public JAXBElement<String> createRequestCombinedUploadReportForDateDate(String value) {
        return new JAXBElement<>(_AccountFundsReleaseDate_QNAME, String.class, RequestCombinedUploadReportForDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RequestCombinedUploadReportForDateResult", scope = RequestCombinedUploadReportForDateResponse.class)
    public JAXBElement<String> createRequestCombinedUploadReportForDateResponseRequestCombinedUploadReportForDateResult(String value) {
        return new JAXBElement<>(_RequestCombinedUploadReportForDateResponseRequestCombinedUploadReportForDateResult_QNAME, String.class, RequestCombinedUploadReportForDateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RequestCreditDataReport.class)
    public JAXBElement<String> createRequestCreditDataReportServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RequestCreditDataReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FileToken", scope = RequestCreditDataReport.class)
    public JAXBElement<String> createRequestCreditDataReportFileToken(String value) {
        return new JAXBElement<>(_RequestFileUploadReportFileToken_QNAME, String.class, RequestCreditDataReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RequestCreditDataReportResult", scope = RequestCreditDataReportResponse.class)
    public JAXBElement<ArrayOfstring> createRequestCreditDataReportResponseRequestCreditDataReportResult(ArrayOfstring value) {
        return new JAXBElement<>(_RequestCreditDataReportResponseRequestCreditDataReportResult_QNAME, ArrayOfstring.class, RequestCreditDataReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RequestAVSReport.class)
    public JAXBElement<String> createRequestAVSReportServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RequestAVSReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FileToken", scope = RequestAVSReport.class)
    public JAXBElement<String> createRequestAVSReportFileToken(String value) {
        return new JAXBElement<>(_RequestFileUploadReportFileToken_QNAME, String.class, RequestAVSReport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RequestAVSReportResult", scope = RequestAVSReportResponse.class)
    public JAXBElement<String> createRequestAVSReportResponseRequestAVSReportResult(String value) {
        return new JAXBElement<>(_RequestAVSReportResponseRequestAVSReportResult_QNAME, String.class, RequestAVSReportResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "serviceKey", scope = RequestPayNowInvoice.class)
    public JAXBElement<String> createRequestPayNowInvoiceServiceKey(String value) {
        return new JAXBElement<>(_RequestPayNowInvoiceServiceKey_QNAME, String.class, RequestPayNowInvoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fileToken", scope = RequestPayNowInvoice.class)
    public JAXBElement<String> createRequestPayNowInvoiceFileToken(String value) {
        return new JAXBElement<>(_RequestPayNowInvoiceFileToken_QNAME, String.class, RequestPayNowInvoice.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RequestPayNowInvoiceResult", scope = RequestPayNowInvoiceResponse.class)
    public JAXBElement<String> createRequestPayNowInvoiceResponseRequestPayNowInvoiceResult(String value) {
        return new JAXBElement<>(_RequestPayNowInvoiceResponseRequestPayNowInvoiceResult_QNAME, String.class, RequestPayNowInvoiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MethodKey", scope = IsValidServiceKey.class)
    public JAXBElement<String> createIsValidServiceKeyMethodKey(String value) {
        return new JAXBElement<>(_IsValidServiceKeyMethodKey_QNAME, String.class, IsValidServiceKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = IsValidServiceKey.class)
    public JAXBElement<String> createIsValidServiceKeyServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, IsValidServiceKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "InstructionCode", scope = IsValidServiceKey.class)
    public JAXBElement<String> createIsValidServiceKeyInstructionCode(String value) {
        return new JAXBElement<>(_IsValidServiceKeyInstructionCode_QNAME, String.class, IsValidServiceKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IsValidServiceKeyResult", scope = IsValidServiceKeyResponse.class)
    public JAXBElement<ArrayOfstring> createIsValidServiceKeyResponseIsValidServiceKeyResult(ArrayOfstring value) {
        return new JAXBElement<>(_IsValidServiceKeyResponseIsValidServiceKeyResult_QNAME, ArrayOfstring.class, IsValidServiceKeyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MethodKey", scope = AccountServiceKeys.class)
    public JAXBElement<String> createAccountServiceKeysMethodKey(String value) {
        return new JAXBElement<>(_IsValidServiceKeyMethodKey_QNAME, String.class, AccountServiceKeys.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AccountNo", scope = AccountServiceKeys.class)
    public JAXBElement<String> createAccountServiceKeysAccountNo(String value) {
        return new JAXBElement<>(_AccountServiceKeysAccountNo_QNAME, String.class, AccountServiceKeys.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AccountServiceKeysResult", scope = AccountServiceKeysResponse.class)
    public JAXBElement<ArrayOfstring> createAccountServiceKeysResponseAccountServiceKeysResult(ArrayOfstring value) {
        return new JAXBElement<>(_AccountServiceKeysResponseAccountServiceKeysResult_QNAME, ArrayOfstring.class, AccountServiceKeysResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = MerchantStatementSourceStatus.class)
    public JAXBElement<String> createMerchantStatementSourceStatusServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, MerchantStatementSourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Date", scope = MerchantStatementSourceStatus.class)
    public JAXBElement<String> createMerchantStatementSourceStatusDate(String value) {
        return new JAXBElement<>(_AccountFundsReleaseDate_QNAME, String.class, MerchantStatementSourceStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.MerchantStatementSourceStatusResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.MerchantStatementSourceStatusResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MerchantStatementSourceStatusResult", scope = za.co.WebServices.MerchantStatementSourceStatusResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.MerchantStatementSourceStatusResponse> createMerchantStatementSourceStatusResponseMerchantStatementSourceStatusResult(org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.MerchantStatementSourceStatusResponse value) {
        return new JAXBElement<>(_MerchantStatementSourceStatusResponseMerchantStatementSourceStatusResult_QNAME, org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.MerchantStatementSourceStatusResponse.class, za.co.WebServices.MerchantStatementSourceStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RequestDebitBatchUnauthorised.class)
    public JAXBElement<String> createRequestDebitBatchUnauthorisedServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RequestDebitBatchUnauthorised.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Date", scope = RequestDebitBatchUnauthorised.class)
    public JAXBElement<String> createRequestDebitBatchUnauthorisedDate(String value) {
        return new JAXBElement<>(_AccountFundsReleaseDate_QNAME, String.class, RequestDebitBatchUnauthorised.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RequestDebitBatchUnauthorisedResult", scope = RequestDebitBatchUnauthorisedResponse.class)
    public JAXBElement<String> createRequestDebitBatchUnauthorisedResponseRequestDebitBatchUnauthorisedResult(String value) {
        return new JAXBElement<>(_RequestDebitBatchUnauthorisedResponseRequestDebitBatchUnauthorisedResult_QNAME, String.class, RequestDebitBatchUnauthorisedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RetrieveBatchStatus.class)
    public JAXBElement<String> createRetrieveBatchStatusServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RetrieveBatchStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetrieveBatchStatusResult", scope = RetrieveBatchStatusResponse.class)
    public JAXBElement<String> createRetrieveBatchStatusResponseRetrieveBatchStatusResult(String value) {
        return new JAXBElement<>(_RetrieveBatchStatusResponseRetrieveBatchStatusResult_QNAME, String.class, RetrieveBatchStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RetrieveSpecificBatchStatus.class)
    public JAXBElement<String> createRetrieveSpecificBatchStatusServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RetrieveSpecificBatchStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BatchName", scope = RetrieveSpecificBatchStatus.class)
    public JAXBElement<String> createRetrieveSpecificBatchStatusBatchName(String value) {
        return new JAXBElement<>(_RetrieveSpecificBatchStatusBatchName_QNAME, String.class, RetrieveSpecificBatchStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetrieveSpecificBatchStatusResult", scope = RetrieveSpecificBatchStatusResponse.class)
    public JAXBElement<String> createRetrieveSpecificBatchStatusResponseRetrieveSpecificBatchStatusResult(String value) {
        return new JAXBElement<>(_RetrieveSpecificBatchStatusResponseRetrieveSpecificBatchStatusResult_QNAME, String.class, RetrieveSpecificBatchStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RetrieveMultipleBatchStatus.class)
    public JAXBElement<String> createRetrieveMultipleBatchStatusServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RetrieveMultipleBatchStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetrieveMultipleBatchStatusResult", scope = RetrieveMultipleBatchStatusResponse.class)
    public JAXBElement<String> createRetrieveMultipleBatchStatusResponseRetrieveMultipleBatchStatusResult(String value) {
        return new JAXBElement<>(_RetrieveMultipleBatchStatusResponseRetrieveMultipleBatchStatusResult_QNAME, String.class, RetrieveMultipleBatchStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RetrieveBatchStatusByDate.class)
    public JAXBElement<String> createRetrieveBatchStatusByDateServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RetrieveBatchStatusByDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StartDate", scope = RetrieveBatchStatusByDate.class)
    public JAXBElement<String> createRetrieveBatchStatusByDateStartDate(String value) {
        return new JAXBElement<>(_RetrieveBatchStatusByDateStartDate_QNAME, String.class, RetrieveBatchStatusByDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EndDate", scope = RetrieveBatchStatusByDate.class)
    public JAXBElement<String> createRetrieveBatchStatusByDateEndDate(String value) {
        return new JAXBElement<>(_RetrieveBatchStatusByDateEndDate_QNAME, String.class, RetrieveBatchStatusByDate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetrieveBatchStatusByDateResult", scope = RetrieveBatchStatusByDateResponse.class)
    public JAXBElement<String> createRetrieveBatchStatusByDateResponseRetrieveBatchStatusByDateResult(String value) {
        return new JAXBElement<>(_RetrieveBatchStatusByDateResponseRetrieveBatchStatusByDateResult_QNAME, String.class, RetrieveBatchStatusByDateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RetrieveUnauthorisedBatches.class)
    public JAXBElement<String> createRetrieveUnauthorisedBatchesServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RetrieveUnauthorisedBatches.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetrieveUnauthorisedBatchesResult", scope = RetrieveUnauthorisedBatchesResponse.class)
    public JAXBElement<String> createRetrieveUnauthorisedBatchesResponseRetrieveUnauthorisedBatchesResult(String value) {
        return new JAXBElement<>(_RetrieveUnauthorisedBatchesResponseRetrieveUnauthorisedBatchesResult_QNAME, String.class, RetrieveUnauthorisedBatchesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RequestBatchAuthorise.class)
    public JAXBElement<String> createRequestBatchAuthoriseServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RequestBatchAuthorise.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FromName", scope = RequestBatchAuthorise.class)
    public JAXBElement<String> createRequestBatchAuthoriseFromName(String value) {
        return new JAXBElement<>(_RequestBatchAuthoriseFromName_QNAME, String.class, RequestBatchAuthorise.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FromAddress", scope = RequestBatchAuthorise.class)
    public JAXBElement<String> createRequestBatchAuthoriseFromAddress(String value) {
        return new JAXBElement<>(_RequestBatchAuthoriseFromAddress_QNAME, String.class, RequestBatchAuthorise.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RequestBatchAuthoriseResult", scope = RequestBatchAuthoriseResponse.class)
    public JAXBElement<String> createRequestBatchAuthoriseResponseRequestBatchAuthoriseResult(String value) {
        return new JAXBElement<>(_RequestBatchAuthoriseResponseRequestBatchAuthoriseResult_QNAME, String.class, RequestBatchAuthoriseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RequestMandateData.class)
    public JAXBElement<String> createRequestMandateDataServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RequestMandateData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RequestMandateDataResult", scope = RequestMandateDataResponse.class)
    public JAXBElement<String> createRequestMandateDataResponseRequestMandateDataResult(String value) {
        return new JAXBElement<>(_RequestMandateDataResponseRequestMandateDataResult_QNAME, String.class, RequestMandateDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RetrieveMandateData.class)
    public JAXBElement<String> createRetrieveMandateDataServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RetrieveMandateData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FileToken", scope = RetrieveMandateData.class)
    public JAXBElement<String> createRetrieveMandateDataFileToken(String value) {
        return new JAXBElement<>(_RequestFileUploadReportFileToken_QNAME, String.class, RetrieveMandateData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetrieveMandateDataResult", scope = RetrieveMandateDataResponse.class)
    public JAXBElement<String> createRetrieveMandateDataResponseRetrieveMandateDataResult(String value) {
        return new JAXBElement<>(_RetrieveMandateDataResponseRetrieveMandateDataResult_QNAME, String.class, RetrieveMandateDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RetrieveMandatePDF.class)
    public JAXBElement<String> createRetrieveMandatePDFServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RetrieveMandatePDF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FileToken", scope = RetrieveMandatePDF.class)
    public JAXBElement<String> createRetrieveMandatePDFFileToken(String value) {
        return new JAXBElement<>(_RequestFileUploadReportFileToken_QNAME, String.class, RetrieveMandatePDF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetrieveMandatePDFResult", scope = RetrieveMandatePDFResponse.class)
    public JAXBElement<String> createRetrieveMandatePDFResponseRetrieveMandatePDFResult(String value) {
        return new JAXBElement<>(_RetrieveMandatePDFResponseRetrieveMandatePDFResult_QNAME, String.class, RetrieveMandatePDFResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AccountReference", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateAccountReference(String value) {
        return new JAXBElement<>(_AddMandateAccountReference_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MandateName", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateMandateName(String value) {
        return new JAXBElement<>(_AddMandateMandateName_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FirstName", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateFirstName(String value) {
        return new JAXBElement<>(_AddMandateFirstName_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Surname", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateSurname(String value) {
        return new JAXBElement<>(_AddMandateSurname_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "TradingName", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateTradingName(String value) {
        return new JAXBElement<>(_AddMandateTradingName_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegistrationNumber", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateRegistrationNumber(String value) {
        return new JAXBElement<>(_AddMandateRegistrationNumber_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RegisteredName", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateRegisteredName(String value) {
        return new JAXBElement<>(_AddMandateRegisteredName_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MobileNumber", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateMobileNumber(String value) {
        return new JAXBElement<>(_AddMandateMobileNumber_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CommencementDay", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateCommencementDay(String value) {
        return new JAXBElement<>(_AddMandateCommencementDay_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AgreementDate", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateAgreementDate(String value) {
        return new JAXBElement<>(_AddMandateAgreementDate_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AgreementReferenceNumber", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateAgreementReferenceNumber(String value) {
        return new JAXBElement<>(_AddMandateAgreementReferenceNumber_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CancellationNoticePeriod", scope = AddMandate.class)
    public JAXBElement<Integer> createAddMandateCancellationNoticePeriod(Integer value) {
        return new JAXBElement<>(_AddMandateCancellationNoticePeriod_QNAME, Integer.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MandateOptionsMandatePublicHolidayOption }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MandateOptionsMandatePublicHolidayOption }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PublicHolidayOption", scope = AddMandate.class)
    public JAXBElement<MandateOptionsMandatePublicHolidayOption> createAddMandatePublicHolidayOption(MandateOptionsMandatePublicHolidayOption value) {
        return new JAXBElement<>(_AddMandatePublicHolidayOption_QNAME, MandateOptionsMandatePublicHolidayOption.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Notes", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateNotes(String value) {
        return new JAXBElement<>(_AddMandateNotes_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Field1", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateField1(String value) {
        return new JAXBElement<>(_AddMandateField1_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Field2", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateField2(String value) {
        return new JAXBElement<>(_AddMandateField2_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Field3", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateField3(String value) {
        return new JAXBElement<>(_AddMandateField3_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Field4", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateField4(String value) {
        return new JAXBElement<>(_AddMandateField4_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Field5", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateField5(String value) {
        return new JAXBElement<>(_AddMandateField5_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Field6", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateField6(String value) {
        return new JAXBElement<>(_AddMandateField6_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Field7", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateField7(String value) {
        return new JAXBElement<>(_AddMandateField7_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Field8", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateField8(String value) {
        return new JAXBElement<>(_AddMandateField8_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Field9", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateField9(String value) {
        return new JAXBElement<>(_AddMandateField9_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AllowVariableDebitAmounts", scope = AddMandate.class)
    public JAXBElement<Boolean> createAddMandateAllowVariableDebitAmounts(Boolean value) {
        return new JAXBElement<>(_AddMandateAllowVariableDebitAmounts_QNAME, Boolean.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BankDetailType", scope = AddMandate.class)
    public JAXBElement<Integer> createAddMandateBankDetailType(Integer value) {
        return new JAXBElement<>(_AddMandateBankDetailType_QNAME, Integer.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BankAccountName", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateBankAccountName(String value) {
        return new JAXBElement<>(_AddMandateBankAccountName_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BankAccountNumber", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateBankAccountNumber(String value) {
        return new JAXBElement<>(_AddMandateBankAccountNumber_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BranchCode", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateBranchCode(String value) {
        return new JAXBElement<>(_AddMandateBranchCode_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MandateOptionsBankAccountType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MandateOptionsBankAccountType }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BankAccountType", scope = AddMandate.class)
    public JAXBElement<MandateOptionsBankAccountType> createAddMandateBankAccountType(MandateOptionsBankAccountType value) {
        return new JAXBElement<>(_AddMandateBankAccountType_QNAME, MandateOptionsBankAccountType.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CreditCardToken", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateCreditCardToken(String value) {
        return new JAXBElement<>(_AddMandateCreditCardToken_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CreditCardType", scope = AddMandate.class)
    public JAXBElement<Integer> createAddMandateCreditCardType(Integer value) {
        return new JAXBElement<>(_AddMandateCreditCardType_QNAME, Integer.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ExpiryMonth", scope = AddMandate.class)
    public JAXBElement<Integer> createAddMandateExpiryMonth(Integer value) {
        return new JAXBElement<>(_AddMandateExpiryMonth_QNAME, Integer.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ExpiryYear", scope = AddMandate.class)
    public JAXBElement<Integer> createAddMandateExpiryYear(Integer value) {
        return new JAXBElement<>(_AddMandateExpiryYear_QNAME, Integer.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IsIdNumber", scope = AddMandate.class)
    public JAXBElement<Boolean> createAddMandateIsIdNumber(Boolean value) {
        return new JAXBElement<>(_AddMandateIsIdNumber_QNAME, Boolean.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MandateOptionsTitle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MandateOptionsTitle }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Title", scope = AddMandate.class)
    public JAXBElement<MandateOptionsTitle> createAddMandateTitle(MandateOptionsTitle value) {
        return new JAXBElement<>(_AddMandateTitle_QNAME, MandateOptionsTitle.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EmailAddress", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateEmailAddress(String value) {
        return new JAXBElement<>(_AddMandateEmailAddress_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PhoneNumber", scope = AddMandate.class)
    public JAXBElement<String> createAddMandatePhoneNumber(String value) {
        return new JAXBElement<>(_AddMandatePhoneNumber_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DateOfBirth", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateDateOfBirth(String value) {
        return new JAXBElement<>(_AddMandateDateOfBirth_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DecemberDebitDay", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateDecemberDebitDay(String value) {
        return new JAXBElement<>(_AddMandateDecemberDebitDay_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DebitMasterfileGroup", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateDebitMasterfileGroup(String value) {
        return new JAXBElement<>(_AddMandateDebitMasterfileGroup_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PhysicalAddressLine1", scope = AddMandate.class)
    public JAXBElement<String> createAddMandatePhysicalAddressLine1(String value) {
        return new JAXBElement<>(_AddMandatePhysicalAddressLine1_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PhysicalAddressLine2", scope = AddMandate.class)
    public JAXBElement<String> createAddMandatePhysicalAddressLine2(String value) {
        return new JAXBElement<>(_AddMandatePhysicalAddressLine2_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PhysicalAddressLine3", scope = AddMandate.class)
    public JAXBElement<String> createAddMandatePhysicalAddressLine3(String value) {
        return new JAXBElement<>(_AddMandatePhysicalAddressLine3_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PhysicalSuburb", scope = AddMandate.class)
    public JAXBElement<String> createAddMandatePhysicalSuburb(String value) {
        return new JAXBElement<>(_AddMandatePhysicalSuburb_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PhysicalCity", scope = AddMandate.class)
    public JAXBElement<String> createAddMandatePhysicalCity(String value) {
        return new JAXBElement<>(_AddMandatePhysicalCity_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PhysicalProvince", scope = AddMandate.class)
    public JAXBElement<String> createAddMandatePhysicalProvince(String value) {
        return new JAXBElement<>(_AddMandatePhysicalProvince_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PhysicalPostalCode", scope = AddMandate.class)
    public JAXBElement<String> createAddMandatePhysicalPostalCode(String value) {
        return new JAXBElement<>(_AddMandatePhysicalPostalCode_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MandateActive", scope = AddMandate.class)
    public JAXBElement<Boolean> createAddMandateMandateActive(Boolean value) {
        return new JAXBElement<>(_AddMandateMandateActive_QNAME, Boolean.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RequestAVS", scope = AddMandate.class)
    public JAXBElement<Boolean> createAddMandateRequestAVS(Boolean value) {
        return new JAXBElement<>(_AddMandateRequestAVS_QNAME, Boolean.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AVSCheckNumber", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateAVSCheckNumber(String value) {
        return new JAXBElement<>(_AddMandateAVSCheckNumber_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DebiCheckMandateTemplateId", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateDebiCheckMandateTemplateId(String value) {
        return new JAXBElement<>(_AddMandateDebiCheckMandateTemplateId_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DebiCheckCollectionAmount", scope = AddMandate.class)
    public JAXBElement<BigDecimal> createAddMandateDebiCheckCollectionAmount(BigDecimal value) {
        return new JAXBElement<>(_AddMandateDebiCheckCollectionAmount_QNAME, BigDecimal.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DebiCheckFirstCollectionDiffers", scope = AddMandate.class)
    public JAXBElement<Boolean> createAddMandateDebiCheckFirstCollectionDiffers(Boolean value) {
        return new JAXBElement<>(_AddMandateDebiCheckFirstCollectionDiffers_QNAME, Boolean.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DebiCheckFirstCollectionDate", scope = AddMandate.class)
    public JAXBElement<String> createAddMandateDebiCheckFirstCollectionDate(String value) {
        return new JAXBElement<>(_AddMandateDebiCheckFirstCollectionDate_QNAME, String.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DebiCheckFirstCollectionAmount", scope = AddMandate.class)
    public JAXBElement<BigDecimal> createAddMandateDebiCheckFirstCollectionAmount(BigDecimal value) {
        return new JAXBElement<>(_AddMandateDebiCheckFirstCollectionAmount_QNAME, BigDecimal.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebiCheckOptionsCollectionFrequencyDayCodes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DebiCheckOptionsCollectionFrequencyDayCodes }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DebiCheckCollectionDayCode", scope = AddMandate.class)
    public JAXBElement<DebiCheckOptionsCollectionFrequencyDayCodes> createAddMandateDebiCheckCollectionDayCode(DebiCheckOptionsCollectionFrequencyDayCodes value) {
        return new JAXBElement<>(_AddMandateDebiCheckCollectionDayCode_QNAME, DebiCheckOptionsCollectionFrequencyDayCodes.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddToMasterFile", scope = AddMandate.class)
    public JAXBElement<Boolean> createAddMandateAddToMasterFile(Boolean value) {
        return new JAXBElement<>(_AddMandateAddToMasterFile_QNAME, Boolean.class, AddMandate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.AddMandateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.AddMandateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddMandateResult", scope = za.co.WebServices.AddMandateResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.AddMandateResponse> createAddMandateResponseAddMandateResult(org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.AddMandateResponse value) {
        return new JAXBElement<>(_AddMandateResponseAddMandateResult_QNAME, org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.AddMandateResponse.class, za.co.WebServices.AddMandateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "serviceKey", scope = GetAvailableBalance.class)
    public JAXBElement<String> createGetAvailableBalanceServiceKey(String value) {
        return new JAXBElement<>(_RequestPayNowInvoiceServiceKey_QNAME, String.class, GetAvailableBalance.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.GetAvailableBalanceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.GetAvailableBalanceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetAvailableBalanceResult", scope = za.co.WebServices.GetAvailableBalanceResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.GetAvailableBalanceResponse> createGetAvailableBalanceResponseGetAvailableBalanceResult(org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.GetAvailableBalanceResponse value) {
        return new JAXBElement<>(_GetAvailableBalanceResponseGetAvailableBalanceResult_QNAME, org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.GetAvailableBalanceResponse.class, za.co.WebServices.GetAvailableBalanceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = DebiCheckAuthenticate.class)
    public JAXBElement<String> createDebiCheckAuthenticateServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, DebiCheckAuthenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AccountReference", scope = DebiCheckAuthenticate.class)
    public JAXBElement<String> createDebiCheckAuthenticateAccountReference(String value) {
        return new JAXBElement<>(_AddMandateAccountReference_QNAME, String.class, DebiCheckAuthenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DebiCheckMandateTemplateId", scope = DebiCheckAuthenticate.class)
    public JAXBElement<String> createDebiCheckAuthenticateDebiCheckMandateTemplateId(String value) {
        return new JAXBElement<>(_AddMandateDebiCheckMandateTemplateId_QNAME, String.class, DebiCheckAuthenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DebtorIdentification", scope = DebiCheckAuthenticate.class)
    public JAXBElement<String> createDebiCheckAuthenticateDebtorIdentification(String value) {
        return new JAXBElement<>(_DebiCheckAuthenticateDebtorIdentification_QNAME, String.class, DebiCheckAuthenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AccountName", scope = DebiCheckAuthenticate.class)
    public JAXBElement<String> createDebiCheckAuthenticateAccountName(String value) {
        return new JAXBElement<>(_DebiCheckAuthenticateAccountName_QNAME, String.class, DebiCheckAuthenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BankAccountName", scope = DebiCheckAuthenticate.class)
    public JAXBElement<String> createDebiCheckAuthenticateBankAccountName(String value) {
        return new JAXBElement<>(_AddMandateBankAccountName_QNAME, String.class, DebiCheckAuthenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BranchCode", scope = DebiCheckAuthenticate.class)
    public JAXBElement<String> createDebiCheckAuthenticateBranchCode(String value) {
        return new JAXBElement<>(_AddMandateBranchCode_QNAME, String.class, DebiCheckAuthenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BankAccountNumber", scope = DebiCheckAuthenticate.class)
    public JAXBElement<String> createDebiCheckAuthenticateBankAccountNumber(String value) {
        return new JAXBElement<>(_AddMandateBankAccountNumber_QNAME, String.class, DebiCheckAuthenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MobileNumber", scope = DebiCheckAuthenticate.class)
    public JAXBElement<String> createDebiCheckAuthenticateMobileNumber(String value) {
        return new JAXBElement<>(_AddMandateMobileNumber_QNAME, String.class, DebiCheckAuthenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EmailAddress", scope = DebiCheckAuthenticate.class)
    public JAXBElement<String> createDebiCheckAuthenticateEmailAddress(String value) {
        return new JAXBElement<>(_AddMandateEmailAddress_QNAME, String.class, DebiCheckAuthenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FirstCollectionAmount", scope = DebiCheckAuthenticate.class)
    public JAXBElement<BigDecimal> createDebiCheckAuthenticateFirstCollectionAmount(BigDecimal value) {
        return new JAXBElement<>(_DebiCheckAuthenticateFirstCollectionAmount_QNAME, BigDecimal.class, DebiCheckAuthenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FirstCollectionDate", scope = DebiCheckAuthenticate.class)
    public JAXBElement<String> createDebiCheckAuthenticateFirstCollectionDate(String value) {
        return new JAXBElement<>(_DebiCheckAuthenticateFirstCollectionDate_QNAME, String.class, DebiCheckAuthenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebiCheckOptionsCollectionFrequencyDayCodes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DebiCheckOptionsCollectionFrequencyDayCodes }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "collectionDayCode", scope = DebiCheckAuthenticate.class)
    public JAXBElement<DebiCheckOptionsCollectionFrequencyDayCodes> createDebiCheckAuthenticateCollectionDayCode(DebiCheckOptionsCollectionFrequencyDayCodes value) {
        return new JAXBElement<>(_DebiCheckAuthenticateCollectionDayCode_QNAME, DebiCheckOptionsCollectionFrequencyDayCodes.class, DebiCheckAuthenticate.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.DebiCheckAuthenticateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.DebiCheckAuthenticateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DebiCheckAuthenticateResult", scope = za.co.WebServices.DebiCheckAuthenticateResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.DebiCheckAuthenticateResponse> createDebiCheckAuthenticateResponseDebiCheckAuthenticateResult(org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.DebiCheckAuthenticateResponse value) {
        return new JAXBElement<>(_DebiCheckAuthenticateResponseDebiCheckAuthenticateResult_QNAME, org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.DebiCheckAuthenticateResponse.class, za.co.WebServices.DebiCheckAuthenticateResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = DebiCheckCancelAuthentication.class)
    public JAXBElement<String> createDebiCheckCancelAuthenticationServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, DebiCheckCancelAuthentication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ContractReference", scope = DebiCheckCancelAuthentication.class)
    public JAXBElement<String> createDebiCheckCancelAuthenticationContractReference(String value) {
        return new JAXBElement<>(_DebiCheckCancelAuthenticationContractReference_QNAME, String.class, DebiCheckCancelAuthentication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DebiCheckCancelAuthenticationResult", scope = DebiCheckCancelAuthenticationResponse.class)
    public JAXBElement<String> createDebiCheckCancelAuthenticationResponseDebiCheckCancelAuthenticationResult(String value) {
        return new JAXBElement<>(_DebiCheckCancelAuthenticationResponseDebiCheckCancelAuthenticationResult_QNAME, String.class, DebiCheckCancelAuthenticationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = DebiCheckAuthenticationCurrentStatus.class)
    public JAXBElement<String> createDebiCheckAuthenticationCurrentStatusServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, DebiCheckAuthenticationCurrentStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ContractReference", scope = DebiCheckAuthenticationCurrentStatus.class)
    public JAXBElement<String> createDebiCheckAuthenticationCurrentStatusContractReference(String value) {
        return new JAXBElement<>(_DebiCheckCancelAuthenticationContractReference_QNAME, String.class, DebiCheckAuthenticationCurrentStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.DebiCheckAuthenticationCurrentStatusResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.DebiCheckAuthenticationCurrentStatusResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DebiCheckAuthenticationCurrentStatusResult", scope = za.co.WebServices.DebiCheckAuthenticationCurrentStatusResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.DebiCheckAuthenticationCurrentStatusResponse> createDebiCheckAuthenticationCurrentStatusResponseDebiCheckAuthenticationCurrentStatusResult(org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.DebiCheckAuthenticationCurrentStatusResponse value) {
        return new JAXBElement<>(_DebiCheckAuthenticationCurrentStatusResponseDebiCheckAuthenticationCurrentStatusResult_QNAME, org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.DebiCheckAuthenticationCurrentStatusResponse.class, za.co.WebServices.DebiCheckAuthenticationCurrentStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = AccountFundsTransfer.class)
    public JAXBElement<String> createAccountFundsTransferServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, AccountFundsTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ToAccountNumber", scope = AccountFundsTransfer.class)
    public JAXBElement<String> createAccountFundsTransferToAccountNumber(String value) {
        return new JAXBElement<>(_AccountFundsTransferToAccountNumber_QNAME, String.class, AccountFundsTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BeneficiaryReference", scope = AccountFundsTransfer.class)
    public JAXBElement<String> createAccountFundsTransferBeneficiaryReference(String value) {
        return new JAXBElement<>(_AccountFundsTransferBeneficiaryReference_QNAME, String.class, AccountFundsTransfer.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.AccountFundsTransferResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.AccountFundsTransferResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AccountFundsTransferResult", scope = za.co.WebServices.AccountFundsTransferResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.AccountFundsTransferResponse> createAccountFundsTransferResponseAccountFundsTransferResult(org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.AccountFundsTransferResponse value) {
        return new JAXBElement<>(_AccountFundsTransferResponseAccountFundsTransferResult_QNAME, org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.AccountFundsTransferResponse.class, za.co.WebServices.AccountFundsTransferResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = AVSRealtimeQuery.class)
    public JAXBElement<String> createAVSRealtimeQueryServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, AVSRealtimeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AccountReference", scope = AVSRealtimeQuery.class)
    public JAXBElement<String> createAVSRealtimeQueryAccountReference(String value) {
        return new JAXBElement<>(_AddMandateAccountReference_QNAME, String.class, AVSRealtimeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Extra1", scope = AVSRealtimeQuery.class)
    public JAXBElement<String> createAVSRealtimeQueryExtra1(String value) {
        return new JAXBElement<>(_AVSRealtimeQueryExtra1_QNAME, String.class, AVSRealtimeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Extra2", scope = AVSRealtimeQuery.class)
    public JAXBElement<String> createAVSRealtimeQueryExtra2(String value) {
        return new JAXBElement<>(_AVSRealtimeQueryExtra2_QNAME, String.class, AVSRealtimeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Extra3", scope = AVSRealtimeQuery.class)
    public JAXBElement<String> createAVSRealtimeQueryExtra3(String value) {
        return new JAXBElement<>(_AVSRealtimeQueryExtra3_QNAME, String.class, AVSRealtimeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BankAccountNumber", scope = AVSRealtimeQuery.class)
    public JAXBElement<String> createAVSRealtimeQueryBankAccountNumber(String value) {
        return new JAXBElement<>(_AddMandateBankAccountNumber_QNAME, String.class, AVSRealtimeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "BranchCode", scope = AVSRealtimeQuery.class)
    public JAXBElement<String> createAVSRealtimeQueryBranchCode(String value) {
        return new JAXBElement<>(_AddMandateBranchCode_QNAME, String.class, AVSRealtimeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EnquiryName", scope = AVSRealtimeQuery.class)
    public JAXBElement<String> createAVSRealtimeQueryEnquiryName(String value) {
        return new JAXBElement<>(_AVSRealtimeQueryEnquiryName_QNAME, String.class, AVSRealtimeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Initials", scope = AVSRealtimeQuery.class)
    public JAXBElement<String> createAVSRealtimeQueryInitials(String value) {
        return new JAXBElement<>(_AVSRealtimeQueryInitials_QNAME, String.class, AVSRealtimeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdNumber", scope = AVSRealtimeQuery.class)
    public JAXBElement<String> createAVSRealtimeQueryIdNumber(String value) {
        return new JAXBElement<>(_AVSRealtimeQueryIdNumber_QNAME, String.class, AVSRealtimeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "PhoneNumber", scope = AVSRealtimeQuery.class)
    public JAXBElement<String> createAVSRealtimeQueryPhoneNumber(String value) {
        return new JAXBElement<>(_AddMandatePhoneNumber_QNAME, String.class, AVSRealtimeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Email", scope = AVSRealtimeQuery.class)
    public JAXBElement<String> createAVSRealtimeQueryEmail(String value) {
        return new JAXBElement<>(_AVSRealtimeQueryEmail_QNAME, String.class, AVSRealtimeQuery.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.AVSRealtimeQueryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.AVSRealtimeQueryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AVSRealtimeQueryResult", scope = za.co.WebServices.AVSRealtimeQueryResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.AVSRealtimeQueryResponse> createAVSRealtimeQueryResponseAVSRealtimeQueryResult(org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.AVSRealtimeQueryResponse value) {
        return new JAXBElement<>(_AVSRealtimeQueryResponseAVSRealtimeQueryResult_QNAME, org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.AVSRealtimeQueryResponse.class, za.co.WebServices.AVSRealtimeQueryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = DebiCheckAmendAuthentication.class)
    public JAXBElement<String> createDebiCheckAmendAuthenticationServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, DebiCheckAmendAuthentication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ContractReference", scope = DebiCheckAmendAuthentication.class)
    public JAXBElement<String> createDebiCheckAmendAuthenticationContractReference(String value) {
        return new JAXBElement<>(_DebiCheckCancelAuthenticationContractReference_QNAME, String.class, DebiCheckAmendAuthentication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CollectionAmountInCents", scope = DebiCheckAmendAuthentication.class)
    public JAXBElement<Long> createDebiCheckAmendAuthenticationCollectionAmountInCents(Long value) {
        return new JAXBElement<>(_DebiCheckAmendAuthenticationCollectionAmountInCents_QNAME, Long.class, DebiCheckAmendAuthentication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MaximumCollectionAmountInCents", scope = DebiCheckAmendAuthentication.class)
    public JAXBElement<Long> createDebiCheckAmendAuthenticationMaximumCollectionAmountInCents(Long value) {
        return new JAXBElement<>(_DebiCheckAmendAuthenticationMaximumCollectionAmountInCents_QNAME, Long.class, DebiCheckAmendAuthentication.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebiCheckAmendmentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DebiCheckAmendmentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DebiCheckAmendAuthenticationResult", scope = DebiCheckAmendAuthenticationResponse.class)
    public JAXBElement<DebiCheckAmendmentResponse> createDebiCheckAmendAuthenticationResponseDebiCheckAmendAuthenticationResult(DebiCheckAmendmentResponse value) {
        return new JAXBElement<>(_DebiCheckAmendAuthenticationResponseDebiCheckAmendAuthenticationResult_QNAME, DebiCheckAmendmentResponse.class, DebiCheckAmendAuthenticationResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = DebiCheckRetrieveMandateTemplateDetail.class)
    public JAXBElement<String> createDebiCheckRetrieveMandateTemplateDetailServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, DebiCheckRetrieveMandateTemplateDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DebiCheckMandateTemplateId", scope = DebiCheckRetrieveMandateTemplateDetail.class)
    public JAXBElement<String> createDebiCheckRetrieveMandateTemplateDetailDebiCheckMandateTemplateId(String value) {
        return new JAXBElement<>(_AddMandateDebiCheckMandateTemplateId_QNAME, String.class, DebiCheckRetrieveMandateTemplateDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebiCheckMandateTemplateDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DebiCheckMandateTemplateDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "DebiCheckRetrieveMandateTemplateDetailResult", scope = DebiCheckRetrieveMandateTemplateDetailResponse.class)
    public JAXBElement<DebiCheckMandateTemplateDetail> createDebiCheckRetrieveMandateTemplateDetailResponseDebiCheckRetrieveMandateTemplateDetailResult(DebiCheckMandateTemplateDetail value) {
        return new JAXBElement<>(_DebiCheckRetrieveMandateTemplateDetailResponseDebiCheckRetrieveMandateTemplateDetailResult_QNAME, DebiCheckMandateTemplateDetail.class, DebiCheckRetrieveMandateTemplateDetailResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RetrieveProofOfPayment.class)
    public JAXBElement<String> createRetrieveProofOfPaymentServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RetrieveProofOfPayment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.RetrieveProofOfPaymentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.RetrieveProofOfPaymentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetrieveProofOfPaymentResult", scope = za.co.WebServices.RetrieveProofOfPaymentResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.RetrieveProofOfPaymentResponse> createRetrieveProofOfPaymentResponseRetrieveProofOfPaymentResult(org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.RetrieveProofOfPaymentResponse value) {
        return new JAXBElement<>(_RetrieveProofOfPaymentResponseRetrieveProofOfPaymentResult_QNAME, org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.RetrieveProofOfPaymentResponse.class, za.co.WebServices.RetrieveProofOfPaymentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceKey", scope = RetrieveBlockedAccounts.class)
    public JAXBElement<String> createRetrieveBlockedAccountsServiceKey(String value) {
        return new JAXBElement<>(_GetPaymentLimitsServiceKey_QNAME, String.class, RetrieveBlockedAccounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "StartDate", scope = RetrieveBlockedAccounts.class)
    public JAXBElement<String> createRetrieveBlockedAccountsStartDate(String value) {
        return new JAXBElement<>(_RetrieveBatchStatusByDateStartDate_QNAME, String.class, RetrieveBlockedAccounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "EndDate", scope = RetrieveBlockedAccounts.class)
    public JAXBElement<String> createRetrieveBlockedAccountsEndDate(String value) {
        return new JAXBElement<>(_RetrieveBatchStatusByDateEndDate_QNAME, String.class, RetrieveBlockedAccounts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.RetrieveBlockedAccountsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.RetrieveBlockedAccountsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RetrieveBlockedAccountsResult", scope = za.co.WebServices.RetrieveBlockedAccountsResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.RetrieveBlockedAccountsResponse> createRetrieveBlockedAccountsResponseRetrieveBlockedAccountsResult(org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.RetrieveBlockedAccountsResponse value) {
        return new JAXBElement<>(_RetrieveBlockedAccountsResponseRetrieveBlockedAccountsResult_QNAME, org.datacontract.schemas._2004._07.nc_dg_tms_c_wcf.RetrieveBlockedAccountsResponse.class, za.co.WebServices.RetrieveBlockedAccountsResponse.class, value);
    }

}
