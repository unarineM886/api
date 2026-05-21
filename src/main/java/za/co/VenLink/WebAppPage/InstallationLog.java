package za.co.VenLink.WebAppPage;

import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import jakarta.servlet.http.HttpServletRequestWrapper;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import za.co.VenLinkWeb.Support.AddEditElectronicMandate;
import za.co.VenLinkWeb.Support.CalculateWirelessInternetCost;
import za.co.VenLinkWeb.Support.ConnectToPostgresDatabase;
import za.co.VenLinkWeb.Support.ConnectToUCRMRestAPI1;
import za.co.VenLinkWeb.Support.DateTime;
import za.co.VenLinkWeb.Support.DeleteDuplicateRow;
import za.co.VenLinkWeb.Support.DoesRecordAlreadyExist;
import za.co.VenLinkWeb.Support.GetDataFromDB;
import za.co.VenLinkWeb.Support.InsertUpdateDeleteData;
import za.co.VenLinkWeb.Support.Print;
import za.co.VenLinkWeb.Support.SendClientBackToOrder;

//JSON Libraries
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

@WebServlet("/api/installation/*")
public class InstallationLog extends HttpServlet {
	private ArrayList<ArrayList<String>> invoicePayData= new ArrayList<ArrayList<String>>();
	private ArrayList variableQty=new ArrayList();
	private ArrayList variableRate=new ArrayList();
	private ArrayList variableOther=new ArrayList();	
	private ArrayList insertCustomerInstallInvoiceSQLArrayList=new ArrayList();
	private ArrayList insertCustomerProRataInvoiceSQLArrayList=new ArrayList();
	private ArrayList insertMonthlySubscriptionCustomerInvoiceSQLArrayList=new ArrayList();
	
	private static final long serialVersionUID = 1L;	
	private double balance=0;
	private double vatAmount=0;
	
	private int miniUPSRate;
	private int refererReferalAmount;
	private int refereeReferalAmount;
	private int kiloMeterRate;
	private int callOutRate;
	private int labourRate;
	private int installRate;
	private int numberOfMonthBetween=0;	
	
	private String nextInvoiceNum;
	private String reference;
	private String internetService;
	private String invoiceNumber;
		
	private String deposit;
	private String invoiceNum;
	private String nameSurname;
	private String title;
	private String surname;
	private String isVatIncluded;	
	
	private String installLogEmail;
	private String installLogCustName;
	private String installLogDelivery;
	private String installLogDate;
	private String installLogVatNum;
	
	private String installer;
	private String servicePlan;
	private String servicePlanGroup;
	private String installDiscount;
	private String miniUPS;
	private String installCompDate;
	private String callOut;
	private String labourHour;
	private String kilometer;
	private String referedBy="Own Client";
	private String refererRef="";
	private String refereeFullName;	
	private String userRight;	
	private String serverLink="http://165.165.58.35";
	
	private boolean isNoInstallationCost=false;
	private boolean isVatCheckBoxSelected=false;
	private boolean isInsertInstallLogSuccesfull=false;
	private boolean isUpdateCustOrderSuccesfull=false;
	private boolean isFreeInstallationCheckBoxSelected=false;
	
	private int debitPaymentDate;		
	
	private String isFreeInstallation;
	
	private String homeServicePlan;
	private String bussinessServicePlan;
	private String corporateServicePlan;
	
	private String nameSurnameRight;
	private String nextCreditNoteNum;
	
	private String monthlyInvoiceStartDate=null;
	private String monthlyInvoiceEndDate=null;	
	private String paymentMethod;
	
	private Vector installRateVector;
	private Vector installerVector;
	private Vector debitPaymentDateVector;
	private Vector paymentMethodVector;
	private Vector installPaymentMethodVector;
	
	private Vector servicePlanGroupVector;
	private Vector servicePlanVector;
	private Vector LIBRENMSInfoVector;
	private Vector UISPInfoVector;
	private Vector bankNameVector;
	private Vector accountTypeVector;
	
	private String servicePlanRate="";
	private String updateCustTitle;
	private String updateCustSurname;
	private String updateCustName;
	private String updateOrderDate;
	private String updateAddress;
	private String updateService;
	private String updateReferedBy;
	private String updateVatNumber;
	private String updateCustEmail;
	private String updateDebitOrderDate;
	private String updatePreviousISP;
	private String updateCompanyName;

	private String installDate=new DateTime().getCurrentDate();
	private String client_id="";
	private String service_id="";
	private String debitPaymentDay="01";
	private String clientServicePlan="";
	private String accountStatus="NOT_ACTIVE";
	private String isProRataIncluded;	
	private String dialogTitle="Change Reference";
	
	private String bankName;
	private String bankAccountNum;
	private String identityNum;	
	private String monthList="";
	
	private boolean isClientOnUISP=false;
	private boolean isProRataCheckBoxSelected=false;
	
	private int numberOfProRataDays=0;
	private int proRataRate;
	private int clientId;
	private int clientServiceId;
	private int servicePlanId;
	private int servicePlanPeriodId;
	private int servicePlanPrice;
	private int cashAmount;
	
	private String installPaymentMethod;
	private String instruction;
	private String temp_client_id;
	private String databasePointer="VenLinkNetworks";
	private String empName;
	private String empSurname;
	
	private CalculateWirelessInternetCost calculateWirelessInternetCost;
	
	private final String GET_NEXT_INVOICE_NUM_SQL= "SELECT COALESCE(MAX(CAST(invoice_number AS integer)), 0)+1 NEXT_INV_NUM FROM customer_invoice";
	private final String GET_NEXT_CREDIT_NOTE_SQL= "SELECT COALESCE(MAX(CAST(credit_note_number AS integer)), 0)+1 NEXT_CRN_NUM FROM customer_invoice";
	
	//Debit order variables
	private int packageAmount=0;
	private String masterFileGroupName;
	private String bankCode;
	private String registereredName;
	private String registrationNumber;
	private String tradingName;
	private String customerSurname;
	private String customerName;
	private String accountTypeCode;
	private String accountType;
			
	public InstallationLog(){
        super();
    }
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		new Print("InstallationLogAPI() DoGet() Method........");
		
	    
	    String refParam = request.getParameter("reference");
	    if (refParam != null && !refParam.isEmpty()) {
	        request.setAttribute("CustomerReference", refParam);
	        new Print("Test reference set to: " + refParam);
	    }
		installationLogPage(request, response);
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
	        throws ServletException, IOException {
	    new Print("InstallationLogAPI() DoPost() Method........");
	    
	    // Check if this is a JSON API request
	    String contentType = request.getContentType();
	    if (contentType != null && contentType.contains("application/json")) {
	        new Print("JSON request detected - processing installation...");
	        
	        // Read JSON body
	        StringBuilder sb = new StringBuilder();
	        String line;
	        try (BufferedReader reader = request.getReader()) {
	            while ((line = reader.readLine()) != null) {
	                sb.append(line);
	            }
	        }
	        
	        // Parse JSON and create a wrapper request that includes JSON parameters
	        try {
	            JSONParser parser = new JSONParser();
	            JSONObject jsonRequest = (JSONObject) parser.parse(sb.toString());
	            
	            //jsonRequest.put("Instruction", "InstallLog");
	            //new Print("Instruction set to: InstallLog");
	            
	            // Create a wrapper that will return JSON values for getParameter()
	            HttpServletRequest jsonWrapper = new HttpServletRequestWrapper(request) {
	                @Override
	                public String getParameter(String name) {
	                    // First check if it's in the JSON
	                    if (jsonRequest.containsKey(name)) {
	                        Object value = jsonRequest.get(name);
	                        return value != null ? value.toString() : null;
	                    }
	                    // Otherwise fall back to original request
	                    return super.getParameter(name);
	                }
	              
	            };
	            
	            String custRef = jsonWrapper.getParameter("custReference");
	            if (custRef != null && !custRef.isEmpty()) {
	                this.reference = custRef;
	                new Print("Reference extracted from JSON and set: " + this.reference);
	            }
	            
	            // Call the handler with the wrapped request
	            installationLogHandler(jsonWrapper, response);
	            
	        } catch (Exception e) {
	            new Print("Error parsing JSON: " + e.getMessage());
	            e.printStackTrace();
	            JSONObject errorResponse = new JSONObject();
	            errorResponse.put("success", false);
	            errorResponse.put("error", "Invalid JSON: " + e.getMessage());
	            response.setContentType("application/json");
	            response.getWriter().print(errorResponse.toJSONString());
	        }
	        return;
	    }
	    
	    // Original HTML form handling 
	    String pressedButton = request.getParameter("Submit");
	    new Print("Install_Log_Pressed_Button: "+pressedButton);
	        
	    if(pressedButton==null){
	        new Print("Opening Wireless_Internet InstallationLogPage........");
	        installationLogPage(request, response);
	    } else {
	        new Print("Opening installationLogHandler()........");
	        installationLogHandler(request, response);
	    }
	}
	
	private String getNameSurnameRight(){
		return nameSurnameRight;
	}
	
	private String getMonthList(){
		return monthList;
	}
	
	private String getDialogTitle() {
		return dialogTitle;
	}

	public void installationLogPage(HttpServletRequest request, HttpServletResponse response){
	   try{
		   	response.setContentType("application/json");
	 	  	PrintWriter out = response.getWriter();
	 	  
	 	  	HttpSession sesion=request.getSession(true);
 	  		long sessionCreationTime=sesion.getCreationTime();
 	  		long sessionLastAccessedTime=sesion.getLastAccessedTime();
 	  		int maxInactiveInterval=sesion.getMaxInactiveInterval();
 	  		String sessionId=sesion.getId();
 	  		new Print("SessionId: "+sessionId+" SesionCreationTime: "+sessionCreationTime+" sesionLastAccessedTime: "+sessionLastAccessedTime+" maxInactiveInterval: "+maxInactiveInterval);
	   	  	 	  	
	 	  	try{
	 	  		String nameSurnameRight=(String)sesion.getAttribute("NameSurnameRight");	           
	 	  		final String[] NameSurnameRight = nameSurnameRight.split("##");
            	this.empName = NameSurnameRight[0];
            	new Print("EmpName: "+this.getEmpName());
            	this.empSurname = NameSurnameRight[1];
            	new Print("EmpSurname: "+this.getEmpSurname());
            	this.nameSurname = this.getEmpSurname()+" "+this.getEmpName();
            	new Print("nameSurname: "+this.getNameSurname());
            	this.userRight = NameSurnameRight[2];
            	new Print("UserRight: "+this.getUserRight());
	 	  		
	 	  		reference=(String)request.getAttribute("CustomerReference");
	 	  		new Print("Reference: "+getReference());
	 	  		instruction=(String)request.getAttribute("Instruction");
	 	  		new Print("Instruction: "+getInstruction()); 
	 		
		   } catch(NullPointerException e){
			    // Create a test session without Authenticator
			    HttpSession session = request.getSession(true);
			    session.setAttribute("NameSurnameRight", "Test##User##ADMIN");
			    
			    // Set test values
			    this.empName = "Test";
			    this.empSurname = "User";
			    this.nameSurname = "User Test";
			    this.userRight = "ADMIN";
			     
			}
	 
			getInstallLogData();
			new Print("SERVLET_NAME: "+getServletName());
			dialogTitle="INSTALLATION LOG ("+getRefereeFullName()+")";
			new Print("INSTALLER_NAME_SURNAME: "+getNameSurname());
			
			//------------CHANGES---------------//
			
			new Print("=== DEBUG servicePlanVector ===");
			new Print("servicePlanVector size: " + servicePlanVector.size());
			new Print("homeServicePlan: " + homeServicePlan);
			new Print("bussinessServicePlan: " + bussinessServicePlan);
			new Print("corporateServicePlan: " + corporateServicePlan);
			
			// Build JSON response instead of HTML
			JSONObject jsonResponse = new JSONObject();
			jsonResponse.put("dialogTitle", getDialogTitle());
			jsonResponse.put("reference", getReference());
			jsonResponse.put("internetService", getInternetService());
			jsonResponse.put("isClientOnUISP", isClientOnUISP());
			jsonResponse.put("installer", getNameSurname());
			jsonResponse.put("installDate", getInstallDate());
			
			// convert vectors to JSON arrays
			JSONArray installRatesArray = new JSONArray();
			for(int i=0; i<installRateVector.size(); i++) {
				installRatesArray.add(installRateVector.elementAt(i).toString());
			}
			jsonResponse.put("installRates", installRatesArray);
			
			JSONArray servicePlanGroupArray = new JSONArray();
			for(int i=0; i<servicePlanGroupVector.size(); i++) {
				JSONObject group = new JSONObject();
				group.put("value", servicePlanGroupVector.elementAt(i).toString());
				group.put("selected", "Home".equalsIgnoreCase(servicePlanGroupVector.elementAt(i).toString()));
				servicePlanGroupArray.add(group);
			}
			jsonResponse.put("servicePlanGroups", servicePlanGroupArray);
			
			JSONArray servicePlansArray = new JSONArray();
			for(int h=0; h<servicePlanVector.size(); h++) {
				String plan = servicePlanVector.elementAt(h).toString();
				JSONObject planObj = new JSONObject();
				planObj.put("value", plan);
				planObj.put("selected", plan.equalsIgnoreCase(getClientServicePlan()));
				servicePlansArray.add(planObj);
			}
			jsonResponse.put("servicePlans", servicePlansArray);
			
			JSONArray installPaymentMethodsArray = new JSONArray();
			for(int i=0; i<installPaymentMethodVector.size(); i++) {
				installPaymentMethodsArray.add(installPaymentMethodVector.elementAt(i).toString());
			}
			jsonResponse.put("installPaymentMethods", installPaymentMethodsArray);
			
			JSONArray paymentMethodsArray = new JSONArray();
			for(int i=0; i<paymentMethodVector.size(); i++) {
				paymentMethodsArray.add(paymentMethodVector.elementAt(i).toString());
			}
			jsonResponse.put("paymentMethods", paymentMethodsArray);
			
			JSONArray bankNamesArray = new JSONArray();
			for(int i=0; i<bankNameVector.size(); i++) {
				bankNamesArray.add(bankNameVector.elementAt(i).toString());
			}
			jsonResponse.put("bankNames", bankNamesArray);
			
			JSONArray accountTypesArray = new JSONArray();
			for(int i=0; i<accountTypeVector.size(); i++) {
				accountTypesArray.add(accountTypeVector.elementAt(i).toString());
			}
			jsonResponse.put("accountTypes", accountTypesArray);
			
			JSONArray debitPaymentDatesArray = new JSONArray();
			for(int i=0; i<debitPaymentDateVector.size(); i++) {
				String dateStr = debitPaymentDateVector.elementAt(i).toString();
				JSONObject dateObj = new JSONObject();
				dateObj.put("value", dateStr);
				dateObj.put("selected", dateStr.equalsIgnoreCase(getDebitPaymentDay()));
				debitPaymentDatesArray.add(dateObj);
			}
			
			jsonResponse.put("debitPaymentDates", debitPaymentDatesArray);
			jsonResponse.put("referredBy", getReferedBy());
			jsonResponse.put("refererRef", getRefererRef());
			jsonResponse.put("refereeFullName", getRefereeFullName());
			jsonResponse.put("clientServicePlan", getClientServicePlan());
			jsonResponse.put("debitPaymentDay", getDebitPaymentDay());
			jsonResponse.put("isClientOnUISP", isClientOnUISP());
			
			// Hidden values
			JSONObject hiddenValues = new JSONObject();
			hiddenValues.put("labourRate", getLabourRate());
			hiddenValues.put("kiloMeterRate", getKiloMeterRate());
			hiddenValues.put("callOutRate", getCallOutRate());
			hiddenValues.put("miniUPSRate", getMiniUPSRate());
			hiddenValues.put("refererReferalAmount", getRefererReferalAmount());
			hiddenValues.put("refereeReferalAmount", getRefereeReferalAmount());
			hiddenValues.put("bussinessServicePlan", getBussinessServicePlan());
			hiddenValues.put("homeServicePlan", getHomeServicePlan());
			hiddenValues.put("corporateServicePlan", getCorporateServicePlan());
			hiddenValues.put("servicePlanRate", servicePlanRate);
			hiddenValues.put("servletName", getServletName());
			hiddenValues.put("numberOfMonthBetween", getNumberOfMonthBetween());
			jsonResponse.put("hiddenValues", hiddenValues);
			
			out.print(jsonResponse.toJSONString());
			new Print("THE END...... Of InstallLogAPI");
			
			//-------------------------------------------------------------------	
			out.flush();
			out.close();
			    
		 } catch(Exception e){
	    	 new Print(e.getMessage());
	    	 e.printStackTrace();
	     }
	}

	private void getInstallLogData() {
		installRateVector = new Vector();
	    installRateVector.add("-Select-"); 	    
 	    
 	    installerVector = new Vector();
 	    installerVector.add("-Select-");
 	    
 	    UISPInfoVector = new Vector();
 	    UISPInfoVector.add("-Select-");
 	    
 	    LIBRENMSInfoVector = new Vector();
 	    LIBRENMSInfoVector.add("-Select-");
 	   
 	    servicePlanVector = new Vector();
 	    servicePlanVector.add("-Select-");
 	   
 	    servicePlanGroupVector = new Vector();
 	    servicePlanGroupVector.add("-Select-");
 	    
 	    paymentMethodVector = new Vector();
 	    paymentMethodVector.add("-Select-");
 	    
 	    installPaymentMethodVector = new Vector();
 	   	installPaymentMethodVector.add("-Select-");
		
 	    debitPaymentDateVector = new Vector();
 	    debitPaymentDateVector.add("-Select-");	 
 	    
 	    bankNameVector= new Vector();
 	    bankNameVector.add("-Select-");
 	    
 	    accountTypeVector= new Vector();
 	    accountTypeVector.add("-Select-");	   
 	    
 	    isClientOnUISP=false;
 	        
 	    new Print("CUSTOMER_REFERENCE: "+getReference());
	    String getInstallRateSQL= "SELECT value INSTALL_RATE FROM venlink_system WHERE sys_name='INSTALL_RATE' ORDER BY CAST(value AS INTEGER) ASC";
	    String getInstallerSQL= "SELECT value INSTALLER FROM venlink_system WHERE sys_name='INSTALLER' ORDER BY value";
	    String getUISPInfoSQL= "SELECT value UISP_INFO, additional  FROM venlink_system WHERE sys_name='UISP_INFO' ORDER BY value";
	    String getLIBRENMSInfoSQL= "SELECT value LIBRENMS_INFO, additional  FROM venlink_system WHERE sys_name='LIBRENMS_INFO' ORDER BY value";
	    String getServicePlanSQL= "SELECT service_plan_name||'{'||service_plan_price||'}' SERVICE_PLAN, service_plan_group  SERVICE_PLAN_GROUP  FROM ucrm_service_plan ORDER BY TO_NUMBER(downlink_speed, '99')";
	    String getServicePlanRateSQL= "SELECT CONCAT(service_plan_name,'#', service_plan_price) SERVICE_PLAN_RATE, service_plan_group SERVICE_PLAN_GROUP FROM ucrm_service_plan ORDER BY TO_NUMBER(downlink_speed, '99')";
	    String getServicePlanGroupSQL= "SELECT DISTINCT(service_plan_group) SERVICE_PLAN_GROUP FROM ucrm_service_plan ORDER BY service_plan_group";
	    String getLabourRateSQL= "SELECT rate LABOUR_RATE FROM product WHERE description='labour' ORDER BY rate";
	    String getKiloMeterRateSQL= "SELECT rate KILO_METER_RATE FROM product WHERE description='kilometer' ORDER BY rate";
	    String getCallOutRateSQL= "SELECT rate CALL_OUT_RATE FROM product WHERE description='call out' ORDER BY rate";
	    String getRefererReferalAmountSQL= "SELECT rate REFERER_REFERAL_AMOUNT FROM product WHERE description='referer referal amount' ORDER BY rate";
	    String getRefereeReferalAmountSQL= "SELECT rate REFEREE_REFERAL_AMOUNT FROM product WHERE description='referee referal amount' ORDER BY rate";
	    String getMiniUPSRateSQL= "SELECT rate MINI_UPS_RATE FROM product WHERE description='mini UPS' ORDER BY rate";						   				
	    String getRefererInfoSQL= "SELECT CONCAT(cust_surname,' ', cust_name) REFEREE_NAME, cust_surname CUST_SURNAME, cust_name CUST_NAME, refered_by REFERER_NAME, referer_ref REFERER_REF, service SERVICE FROM customer WHERE cust_ref='"+getReference()+"' ORDER BY cust_ref";						   				
	    String getPaymentMethodSQL="SELECT value PAYMENT_METHOD FROM venlink_system WHERE sys_name='MONTH_PAYMENT_METHOD' AND in_use='YES' ORDER BY value";
	    String getInstallPaymentMethodSQL="SELECT value INSTALL_PAYMENT_METHOD FROM venlink_system WHERE sys_name='INSTALL_PAYMENT_METHOD' AND in_use='YES' ORDER BY value";
		String getdebitPaymentDateSQL="SELECT value||'{'||additional||'}' DEBIT_DATE FROM venlink_system WHERE sys_name='DEBIT_PAYMENT_DATE' AND in_use='YES' ORDER BY value";
		String getClientServicePlanSQL="select service_plan_name from ucrm_client_service ucs where client_id =(select id from ucrm_client uc where phone='"+getReference()+"') limit 1";
		String getUispDataSQL="SELECT uc.id CLIENT_ID, ucs.id SERVICE_ID, ucs.unms_client_site_id SITE_ID, COALESCE(TO_CHAR(CAST(uc.registration_date AS DATE),'MM-DD-YYYY'), '03-30-2025') INSTALL_DATE, COALESCE(ucs.invoicing_period_start_day, '1') DEBIT_PAY_DAY, ("+getClientServicePlanSQL+") SERVICE_PLAN, 'ACTIVE' ACC_STATUS FROM ucrm_client uc, ucrm_client_service ucs WHERE uc.id=ucs.client_id GROUP BY ucs.invoicing_period_start_day, uc.registration_date, uc.id, ucs.client_id, ucs.id, ucs.unms_client_site_id, ucs.invoicing_start, uc.phone having uc.phone='"+getReference()+"' order by ucs.invoicing_start DESC limit 1";
		String getBankNameSQL= "SELECT value||'{'||additional||'}' BANK_NAME FROM venlink_system WHERE sys_name='BANK_NAME' ORDER BY value";
		String getAccountTypeSQL= "SELECT value||'{'||additional||'}' ACCOUNT_TYPE FROM venlink_system WHERE sys_name='DEBIT_ACCOUNT_TYPE' ORDER BY value";
	    
    	String[][] data={
    					 {getInstallRateSQL, "INSTALL_RATE"},
 			   			 {getInstallerSQL, "INSTALLER"},
 			   			 {getUISPInfoSQL, "UISP_INFO"},
 			   			 {getLIBRENMSInfoSQL, "LIBRENMS_INFO"},
 			   			 {getServicePlanSQL, "SERVICE_PLAN", "SERVICE_PLAN_GROUP"},
 			   			 {getServicePlanGroupSQL, "SERVICE_PLAN_GROUP"},
 			   			 {GET_NEXT_INVOICE_NUM_SQL, "NEXT_INV_NUM"},
 			   			 {GET_NEXT_CREDIT_NOTE_SQL, "NEXT_CRN_NUM"},
 			   			 {getLabourRateSQL,"LABOUR_RATE"},
 			   			 {getKiloMeterRateSQL, "KILO_METER_RATE"},
 			   			 {getCallOutRateSQL, "CALL_OUT_RATE"},
 			   			 {getRefererReferalAmountSQL,"REFERER_REFERAL_AMOUNT"},
 			   			 {getRefereeReferalAmountSQL,"REFEREE_REFERAL_AMOUNT"},
 			   			 {getMiniUPSRateSQL,"MINI_UPS_RATE"},
 			   			 {getRefererInfoSQL, "REFEREE_NAME", "CUST_SURNAME", "CUST_NAME", "REFERER_NAME", "REFERER_REF", "SERVICE"},
 			   			 {getPaymentMethodSQL,"PAYMENT_METHOD"},
 			   			 {getdebitPaymentDateSQL,"DEBIT_DATE"},
 			   			 {getServicePlanRateSQL,"SERVICE_PLAN_RATE"},
 			   			 {getUispDataSQL, "CLIENT_ID", "SERVICE_ID", "INSTALL_DATE", "DEBIT_PAY_DAY", "SERVICE_PLAN", "ACC_STATUS"},
 			   			 {getBankNameSQL, "BANK_NAME"},	
 			   			 {getInstallPaymentMethodSQL,"INSTALL_PAYMENT_METHOD"},
 			   			 {getAccountTypeSQL, "ACCOUNT_TYPE"}, 			   			
    	};
 	    
 	   for(int i=0;i<data.length;i++){	 		   
 		   ConnectToPostgresDatabase connect=new ConnectToPostgresDatabase();
 		   try{
 			   new Print("SQL["+i+"]: "+data[i][0]);
 			   ResultSet rs=connect.getStatement().executeQuery(data[i][0]);
 	    	
 			   if(i==0){
 				   while(rs.next()){
 					   installRateVector.add(rs.getString(data[i][1]));
 				   }
 	    	  
 			   } else if(i==1){
 				   while(rs.next()){
 					   installerVector.add(rs.getString(data[i][1]));
 				   }
				 	    	  
 			   } else if(i==2){
 				   while(rs.next()){
 					   UISPInfoVector.add(rs.getString(data[i][1]));
 				   }	
				
 			   } else if(i==3){
 				   while(rs.next()){
 					   LIBRENMSInfoVector.add(rs.getString(data[i][1]));
 				   }						 	    	  
			
 			   } else if(i==4){
 				   homeServicePlan="-Select-";
 				   bussinessServicePlan="-Select-";
 				   corporateServicePlan="-Select-";
 				   while(rs.next()){
 					   new Print("SERVICE_PLAN: "+rs.getString(data[i][1]));
 					   String servicePlan=rs.getString(data[i][1]);
 					   new Print("SERVICE_PLAN_GROUP: "+rs.getString(data[i][2]));
 					   String servicePlanGroup=rs.getString(data[i][2]);					
 					   if("Home".equalsIgnoreCase(servicePlanGroup)){
 						   homeServicePlan+=","+servicePlan;
 						  new Print("HOME_SERVICE_PLAN: "+getHomeServicePlan());
	 	    			
 					   } else if("Bussiness".equalsIgnoreCase(servicePlanGroup)){
 						   bussinessServicePlan+=","+servicePlan;
					
 					   } else if("Corporate".equalsIgnoreCase(servicePlanGroup)){
 						   corporateServicePlan+=","+servicePlan;
 					   }
 				   }
				
 			   } else if(i==5){
 				   while(rs.next()){
 					   servicePlanGroupVector.add(rs.getString(data[i][1]));
 				   }
					 	      
 			   } else if(i==6){
 				  nextInvoiceNum="0";
 				   while(rs.next()){
 					  nextInvoiceNum=rs.getString(data[i][1]);
 					   new Print("Next_Invoice_Num: "+getNextInvoiceNum());
 				   }
			 	       
 			   }  else if(i==7){
 				   while(rs.next()){
 					   nextCreditNoteNum=rs.getString(data[i][1]);
 					  new Print("Next_Credit_Num: "+getNextCreditNoteNum());
 				   }
			 	       
 			   } else if(i==8){
 				   while(rs.next()){
 					   labourRate=Integer.parseInt(rs.getString(data[i][1]));
 				   }
				 	    
 			   } else if(i==9){
 				   while(rs.next()){
 					   kiloMeterRate=Integer.parseInt(rs.getString(data[i][1]));
 				   }
			
 			   } else if(i==10){
 				   while(rs.next()){
 					   callOutRate=Integer.parseInt(rs.getString(data[i][1]));
 				   }
			
 			   }  else if(i==11){
 				   while(rs.next()){
 					   refererReferalAmount=Integer.parseInt(rs.getString(data[i][1]));		
 				   }
				
 			   }  else if(i==12){
 				   while(rs.next()){
 					   refereeReferalAmount=Integer.parseInt(rs.getString(data[i][1]));		
 				   }
				
 			   } else if(i==13){
 				   while(rs.next()){
 					   miniUPSRate=Integer.parseInt(rs.getString(data[i][1]));											 
 				   }
 				   
 			   } else if(i==14){
 				   while(rs.next()){
 					   refereeFullName=rs.getString(data[i][1]);
 					   new Print("RefereeFullName: "+getRefereeFullName()); 					   
 					   customerSurname=rs.getString(data[i][2]);
 					   new Print("CustomerSurname: "+getCustomerSurname()); 
 					   customerName=rs.getString(data[i][3]);
 					   new Print("CustomerName: "+getCustomerName());  
 					   referedBy=rs.getString(data[i][4]);
 					   new Print("referedBy: "+getReferedBy());					
 					   if("Own Client".equalsIgnoreCase(getReferedBy())){
 						   refererRef="NA";
			
 					   } else{
 						   refererRef=rs.getString(data[i][5]);	
 						   new Print("RefererRef: "+getRefererRef());
 					   }
 					   internetService=rs.getString(data[i][6]);
 					   new Print("Internet_Service: "+internetService);
 				   }
				
 			   } else if(i==15){
 				   while(rs.next()){
 					   paymentMethodVector.add(rs.getString(data[i][1]));
 				   }
	
 			   } else if(i==16){
 				   while(rs.next()){
 					   debitPaymentDateVector.add(rs.getString(data[i][1]));
 				   }					
	 	    
 			   } else if(i==17){
 				   servicePlanRate="-Select-";
 				   while(rs.next()){
 					   String servPlanRate=rs.getString(data[i][1]);
 					   servicePlanRate+="?"+servPlanRate;
 				   }
				
 			   } else if(i==18){
 				   while(rs.next()){	 	    		
 					   new Print("There is UISP Data.........");
 					   client_id=rs.getString(data[i][1]);
 					   new Print("CLIENT_ID: "+getClient_id());
 					   service_id=rs.getString(data[i][2]);	 
 					   new Print("SERVICE_ID: "+getService_id());
					   debitPaymentDay=rs.getString(data[i][4]);
					   new Print("DEBIT_PAY_DAY: "+getDebitPaymentDay());
					   clientServicePlan=rs.getString(data[i][5]);
					   new Print("SERVICE_PLAN: "+getClientServicePlan());
 					   accountStatus=rs.getString(data[i][6]);	
 					   new Print("ACCOUNT_STATUS: "+getAccountStatus());
 					   if(getClient_id()!=null){
 						   new Print("This CLIENT was imported from UISP.....");
 						   isClientOnUISP=true;	
	 	    		
 					   } else{
 						   isClientOnUISP=false;
 					   }
 				   } 	    		  
			
 			   } else if(i==19){
 				   while(rs.next()){
 					   bankNameVector.add(rs.getString(data[i][1]));
 				   }				 	    	  
			
 			   } else if(i==20){
 				   while(rs.next()){
 					   installPaymentMethodVector.add(rs.getString(data[i][1]));
 				   }
 				   
 			   } else if(i==21){
 				   while(rs.next()){
 					   accountTypeVector.add(rs.getString(data[i][1]));
 				   }				 	    	  
			
 			   }
		
 		   } catch(Exception e){
 			   new Print(e.toString());
 			   new Print(e.getMessage());
 			   e.printStackTrace();
	   
 		   } finally{
 			   try{
 				   new Print("CLOSING CONNECTION TO THE DB...");
 				   connect.getConnection().close();
 				   connect.getStatement().close();
 				   new Print("CONNECTION TO THE DB CLOSED");
	       
 			   } catch(Exception e){
 				   new Print(e.toString());
 				   new Print(e.getMessage());
 				   e.printStackTrace();
 			   }
 		   }
 	   } 	   
	}
	
	public void installationLogHandler(HttpServletRequest request, HttpServletResponse response){
	     try{
	    	 
	    	 //--------CHANGES-----------------------
	    	 
	         this.instruction = "InstallLog";
	         new Print("instruction forced to: " + this.instruction);
	    	 setInstallationLogVariables(request, response);			  
	    	 response.setContentType("application/json");
	    	 PrintWriter out = response.getWriter();
	    	 getInstallLogData();
	    	 //Update customer table
	    	 updateCustomerTable();
	           
	    	 
	    	 if(isUpdateCustOrderSuccesfull()){
	    		 // Send JSON success response instead of HTML alert
	    		 JSONObject jsonResponse = new JSONObject();
	    		 jsonResponse.put("success", true);
	    		 jsonResponse.put("message", "Installation Log for ("+getRefereeFullName()+") successfully updated!");
	    		 jsonResponse.put("invoiceNumber", getNextInvoiceNum());
	    		 jsonResponse.put("customerReference", getReference());
	    		 out.print(jsonResponse.toJSONString());
	    		 
	    		 String tableName="customer_invoice";
	    		 String columnGroup="cust_ref, invoice_number, invoice_date, invoice_description, rate";
	    		 new DeleteDuplicateRow(tableName, columnGroup, getDatabasePointer());
	    		 
	    		 String getCustomerDetailsSQL="SELECT INITCAP(CO.cust_title) #VENLINK_UPDATE_TITLE#, INITCAP(CO.cust_surname) SURNAME, INITCAP(CO.cust_name) NAMES, TO_CHAR(CO.order_date,'DD-MON-YYYY') ORDER_DATE, INITCAP(CO.address), service, CO.refered_by, COALESCE(cust_email,''), COALESCE(vat_num, ''), COALESCE(debit_payment_date, ''), COALESCE(previous_isp, 'VenLink') DEBIT_ORDER_DATE, INITCAP(CO.company_name) COMPANY_NAME FROM customer CO WHERE cust_ref='"+getReference()+"' ";
	    		 getCustomerDetailToUpdate(getCustomerDetailsSQL);
	    		 
	    		//Add client/Service to UISP and LibreNMS
		         /*if(!isClientOnUISP){
		        	 String getTempUispDataSQL="SELECT client_id TEMP_CLIENT_ID FROM customer WHERE cust_ref='"+getReference()+"' AND client_id IS NOT NULL";	
		        	 if(!new DoesRecordAlreadyExist(getTempUispDataSQL).doesRecordAlreadyExist()){
		        		 addClientToUisp(new ConnectToUCRMRestAPI1("POST", "clients").getConnection(), request, response);
		        	 }
		        	 
		         } else {
		        	 if(getInstruction().equalsIgnoreCase("AddService")){
		        		 //Add Client_Service to UISP
		                 addClientServiceToUisp(new ConnectToUCRMRestAPI1("POST", "clients/"+getClientId()+"/services").getConnection(), request, response);		              
		        	 }
		         }*/
		         
	    		 
	    		 new Print("Payment Method: "+getPaymentMethod());
	    		 
	    		 if(getPaymentMethod().equalsIgnoreCase("DEBIT_ORDER")){
		        	 addElectronicMandate();
		         }
		         
	    	 } else {
	    		 JSONObject jsonResponse = new JSONObject();
	    		 jsonResponse.put("success", false);
	    		 jsonResponse.put("message", "Installation Log update failed!");
	    		 out.print(jsonResponse.toJSONString());
	    	 }
	    	 
	    	 //----------------------------------------------------------------------
	    	 
	    	 out.flush();
	    	 out.close();
	  	
	    } catch (Exception e){
	   	     new Print(e.toString());
	   	     new Print(e.getMessage());
	   	     e.printStackTrace();
	    }
	}
	
	private void sendPayLoad(HttpURLConnection connection, JSONObject bodyPayload){
		try {
			try(DataOutputStream os = new DataOutputStream(connection.getOutputStream())){
				os.writeBytes(bodyPayload.toString());
				os.flush();
			};
			
		} catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
	}
	
	private void addClientServiceToUisp(HttpURLConnection connection, HttpServletRequest request, HttpServletResponse response ){		
		try {
			response.setContentType("application/json");
			PrintWriter out = response.getWriter();
			String getServicePlanIdSQL="SELECT id SERV_PLAN_ID, service_plan_period_id SERV_PLAN_PER_ID, service_plan_price SERV_PLAN_PRICE FROM ucrm_service_plan WHERE service_plan_name='"+getServicePlan()+"' AND service_plan_period=1 ";
			setServicePlanPeriodId(getServicePlanIdSQL);		    
			JSONObject bodyPayload = new JSONObject();		
			bodyPayload.put("servicePlanPeriodId", getServicePlanPeriodId());
			bodyPayload.put("invoicingPeriodStartDay", Integer.parseInt(getDebitPaymentDay()));
			bodyPayload.put("invoicingStart", new DateTime(1).dateFormatChange("MM/dd/yyyy", "yyyy-MM-dd'T'HH:mm:ssXXX", getInstallCompDate()));
			new Print("Service_Body_Pay_Load: "+bodyPayload.toString());			
			sendPayLoad(connection, bodyPayload);
            int responseCode = connection.getResponseCode();
            new Print("ResponseCode: "+responseCode);
            if (responseCode == HttpURLConnection.HTTP_OK||responseCode == 201){
            	new Print("CLIENT_SERVICE POST Successfull..........");
                updateCustomerServiceId(getResponse(connection));
                JSONObject jsonResponse = new JSONObject();
                jsonResponse.put("success", true);
                jsonResponse.put("message", "Client ("+getRefereeFullName()+") successfully added to UISP!");
                out.print(jsonResponse.toJSONString());
                
            } else {
                System.out.println("Error: HTTP Response code - " + responseCode);
            }
            connection.disconnect();
		
		} catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
	}
	
	private StringBuilder getResponse(HttpURLConnection connection){
		StringBuilder response = new StringBuilder();
		try {		
			try(BufferedReader reader = new BufferedReader( new InputStreamReader( connection.getInputStream()))){
				String line;
				while ((line = reader.readLine()) != null){
					response.append(line);
				}
			}	
		
		} catch(Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }		
		return response;
	}
	
	private void setServicePlanPeriodId(String getServicePlanIdSQL){
		new Print("Service_Plan_Id_SQL: "+getServicePlanIdSQL);
		ConnectToPostgresDatabase connect=new ConnectToPostgresDatabase();
		   try{
			   ResultSet rs=connect.getStatement().executeQuery(getServicePlanIdSQL);
	    	   while(rs.next()){
	    		   servicePlanId=Integer.parseInt(rs.getString("SERV_PLAN_ID"));
	    		   servicePlanPeriodId=Integer.parseInt(rs.getString("SERV_PLAN_PER_ID"));
	    		   servicePlanPrice=Integer.parseInt(rs.getString("SERV_PLAN_PRICE"));	   	    	
	    	   }
	    	   new Print("Service_Plan_Id: "+getServicePlanId()+" Service_Plan_Period_Id: "+getServicePlanPeriodId()+" Service_Plan_Price: "+getServicePlanPrice());
	    	
		   } catch (Exception e) {
	            System.out.println(e.toString());
	            e.printStackTrace();
	       
		   } finally {
				try {
					new Print("CLOSING CONNECTION TO THE DB...");					  
					connect.getConnection().close();
					connect.getStatement().close();
					new Print("CONNECTION TO THE DB CLOSED");
					       
				} catch(Exception e){
					new Print(e.toString());
					new Print(e.getMessage());
					e.printStackTrace();
				}
		   }
	}

	private void addClientToUisp(HttpURLConnection connection, HttpServletRequest request, HttpServletResponse response){
		try {
			
			String getCustomerDetailsSQL="SELECT INITCAP(CO.cust_title) VENLINK_UPDATE_TITLE, INITCAP(CO.cust_surname) SURNAME, INITCAP(CO.cust_name) NAMES, TO_CHAR(CO.order_date,'DD-MON-YYYY') ORDER_DATE, INITCAP(CO.address), service, CO.refered_by, COALESCE(cust_email,''), COALESCE(vat_num, ''), COALESCE(debit_payment_date, ''), COALESCE(previous_isp, 'VenLink') DEBIT_ORDER_DATE, INITCAP(CO.company_name) COMPANY_NAME FROM customer CO WHERE cust_ref='"+getReference()+"' ";
			getCustomerDetailToUpdate(getCustomerDetailsSQL);
			
			JSONObject bodyPayload = new JSONObject();
			if(getUpdatePreviousISP().equalsIgnoreCase("VenLink")){
				bodyPayload.put("previousIsp", "");	
				
			} else {
				bodyPayload.put("previousIsp", getUpdatePreviousISP());
			}
			
			if(getUpdateReferedBy().equalsIgnoreCase("Own Client")){
				bodyPayload.put("referral", "");
				
			} else {
				bodyPayload.put("referral", getUpdateReferedBy());
			}			
			
			bodyPayload.put("registrationDate", new DateTime(1).dateFormatChange("MM/dd/yyyy", "yyyy-MM-dd'T'HH:mm:ssXXX", getInstallCompDate()));
			bodyPayload.put("fullAddress", getUpdateAddress());
			
			JSONArray contactsArray = new JSONArray();
			JSONObject contactsObject = new JSONObject();
			contactsObject.put("email", getUpdateCustEmail());
			contactsObject.put("phone", getReference());
			contactsArray.add(contactsObject);
			bodyPayload.put("contacts", contactsArray);
				
			if(getUpdateCustTitle().equalsIgnoreCase("Company")||getUpdateCustTitle().equalsIgnoreCase("School")||
			   getUpdateCustTitle().equalsIgnoreCase("Church")){
				bodyPayload.put("companyName", getUpdateCompanyName());
				bodyPayload.put("companyContactFirstName", getUpdateCustName());
				bodyPayload.put("companyContactLastName", getUpdateCustSurname());				
				bodyPayload.put("firstName", "");
				bodyPayload.put("lastName", "");
			
			} else {
				bodyPayload.put("companyName", "");
				bodyPayload.put("companyContactFirstName", "");
				bodyPayload.put("companyContactLastName", "");				
				bodyPayload.put("firstName", getUpdateCustName());
				bodyPayload.put("lastName", getUpdateCustSurname());
			}
			
			new Print("Body_Pay_Load: "+bodyPayload.toString());			
			sendPayLoad(connection, bodyPayload);
            int responseCode = connection.getResponseCode();
            new Print("ResponseCode: "+responseCode);
            /*if (responseCode==HttpURLConnection.HTTP_OK||responseCode==201){
            	new Print("CLIENT POST Successfull..........");
                updateCustomerId(getResponse(connection));                
                addClientServiceToUisp(new ConnectToUCRMRestAPI1("POST", "clients/"+getClientId()+"/services").getConnection(), request, response);
            
            } else {
                System.out.println("Error: HTTP Response code - " + responseCode);
            }*/
            connection.disconnect();
        
		} catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }

	private void updateCustomerId(StringBuilder response){
		new Print("RESPONSE: "+response.toString());
		try {
			JSONParser jasonParser = new JSONParser();
			JSONObject data_obj= (JSONObject)jasonParser.parse(response.toString());
			clientId=Integer.parseInt(data_obj.get("id").toString());
			
			String UPDATE_CUSTOMER_ID_SQL="UPDATE customer SET client_id="+getClientId()+" WHERE cust_ref='"+getReference()+"' ";			
			
			String ucrmClientTable= "ucrm_client";
			String clientColumn="id, first_name, last_name, email, address, phone, company_name, company_contact_first_name, company_contact_last_name, registration_date, previous_isp, referral";
			String summaryValue=" "+getClientId()+", '"+getUpdateCustName()+"', '"+getUpdateCustSurname()+"','"+getUpdateCustEmail()+"', '"+getUpdateAddress()+"', '"+getReference()+"', '"+getUpdateCompanyName()+"', '"+getUpdateCustName()+"', '"+getUpdateCustSurname()+"', '"+getInstallCompDate()+"', '"+getUpdatePreviousISP()+"', '"+getUpdateReferedBy()+"' ";
			String INSERT_CLIENT_SQL= "INSERT INTO "+ucrmClientTable+"("+clientColumn+") VALUES("+summaryValue+")";;
		    
			String[] sqlArray={UPDATE_CUSTOMER_ID_SQL, INSERT_CLIENT_SQL};
			for(int i=0; i<sqlArray.length; i++){
				new Print("Update_Customer_Id_SQL: "+sqlArray[i]);
				InsertUpdateDeleteData insertData=new InsertUpdateDeleteData(sqlArray[i]);	
			}
		
		} catch (Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
        }
	}

	private void updateCustomerServiceId(StringBuilder response){
		new Print("RESPONSE: "+response.toString());
		try {
			JSONParser jasonParser = new JSONParser();
			JSONObject data_obj= (JSONObject)jasonParser.parse(response.toString());
			clientServiceId=Integer.parseInt(data_obj.get("id").toString());
			String customerInvoiceTable="customer_invoice";
			String updateCustomerServiceIdSQL="UPDATE "+customerInvoiceTable+" SET service_id="+getClientServiceId()+" WHERE cust_ref='"+getReference()+"' AND service_id IS NULL ";
			new Print("Update_Customer_Service_Id_SQL"+updateCustomerServiceIdSQL);
			InsertUpdateDeleteData insertData=new InsertUpdateDeleteData(updateCustomerServiceIdSQL);		  		
		
		} catch (Exception e){
            System.out.println(e.toString());
            e.printStackTrace();
        }
	}

	private void getCustomerDetailToUpdate(String customerDetails){
		new Print("CustomerDetails_SQL: "+customerDetails);
		String temp[]=new GetDataFromDB().getDataFromDB(customerDetails).split("&&");
		for(int i=0;i<temp.length;i++){
			String temp1[]=temp[i].split("##");
			int num=temp1.length;
			
			for(int j=0; j<num; j++){
				switch(j){
				case 0:{
					updateCustTitle=temp1[j];
					new Print("UpdateCustTitle: "+getUpdateCustTitle());
					break;
					
				} case 1:{
					updateCustSurname=temp1[j];
					new Print("UpdateCustSurname: "+getUpdateCustSurname());
					break;
					
				} case 2:{
					updateCustName=temp1[j];
					new Print("UpdateCustName: "+getUpdateCustName());
					break;
							
				} case 3:{
					updateOrderDate=temp1[j];
					new Print("UpdateOrderDate: "+getUpdateOrderDate());
					break;
							
				} case 4:{
					updateAddress=temp1[j];
					new Print("UpdateAddress: "+getUpdateAddress());
					break;
							
				} case 5:{
					updateService=temp1[j];
					new Print("UpdateService: "+getUpdateService());
					break;
					
				} case 6:{
					updateReferedBy=temp1[j];
					new Print("UpdateReferedBy: "+getUpdateReferedBy());
					break;
							
				} case 7:{
					updateCustEmail=temp1[j];
					new Print("UpdateCustEmail: "+getUpdateCustEmail());
					break;
							
				} case 8:{
					updateVatNumber=temp1[j];
					new Print("UpdateVatNumber: "+getUpdateVatNumber());
					break;
							
				} case 9:{
					updateDebitOrderDate=temp1[j];
					new Print("UpdateDebitOrderDate: "+getUpdateDebitOrderDate());
					break;
							
				} case 10:{
					updatePreviousISP=temp1[j];
					new Print("UpdatePreviousISP: "+getUpdatePreviousISP());
					break;
							
				} case 11:{
					updateCompanyName=temp1[j];
					new Print("UpdateCompanyName: "+getUpdateCompanyName());
					break;
							
				} default:{
					break;
				}
			  }	
			}
		}	
	}

	public void deleteInstallationLog(){
  		String deleteInstalliLogSQL="DELETE FROM network WHERE cust_ref='"+this.getReference()+"'";
  		String updateCustOrderSQL="UPDATE customer SET order_status='Scheduled' WHERE cust_ref='"+this.getReference()+"'";
  		String[]deleteInstalliLogVatInvoiceSQL={deleteInstalliLogSQL,updateCustOrderSQL};
  		for(int i=0;i<deleteInstalliLogVatInvoiceSQL.length;i++){
  			InsertUpdateDeleteData insertData=new InsertUpdateDeleteData(deleteInstalliLogVatInvoiceSQL[i]);
  		}
  	}
	
	private void updateCustomerTable(){
		try{		
			ArrayList sql=new ArrayList();
			String customerTable="customer";
			String customerPaymentTable="customer_payment";
			
			if(getInstruction().equalsIgnoreCase("InstallLog")){
				String updateCustOrderSQL="UPDATE "+customerTable+" SET order_status='Complete', account_status='ACTIVE', "
					  				 +"install_date=TO_DATE('"+getInstallCompDate()+"' ,'MM-DD-YYYY'), "
					  				 +"payment_method='"+getPaymentMethod()+"', debit_payment_date='"+getDebitPaymentDate()+"' WHERE cust_ref='"+this.getReference()+"' ";
				sql.add(updateCustOrderSQL);
				
				if(getPaymentMethod().equalsIgnoreCase("DEBIT_ORDER")){
					String	updateBankDetailSQL="UPDATE "+customerTable+" SET id_num='"+getIdentityNum()+"', bank_name='"+getBankName()+"', bank_acc_num='"+getBankAccountNum()+"' WHERE cust_ref='"+this.getReference()+"' ";
					sql.add(updateBankDetailSQL);
				}
			
			} else if(getInstruction().equalsIgnoreCase("AddService")){				
				String updateCustOrderSQL="UPDATE "+customerTable+" SET order_status='Complete', account_status='ACTIVE'  WHERE cust_ref='"+this.getReference()+"' ";
				sql.add(updateCustOrderSQL);
			}
			
			if(getInstallPaymentMethod().equalsIgnoreCase("CASH")){
				new Print("CASH PAYMENT..........");
				String inPaymentColumns="amount, account, cust_ref, bank_cust_ref, deposit_type, pay_date, new_cust, netcash_unpaid_code, t_id";
				String inPaymentValues= " "+getCashAmount()+ ", 'CASH_ACCOUNT','"+this.getReference()+"','"+this.getReference()+"', 'CASH', TO_DATE('"+getInstallCompDate()+"','MM-DD-YYYY'), 'NO', '0', nextval('in_payment_t_id') ";
				String insertCashPaymentSQL="INSERT INTO "+customerPaymentTable+" ("+inPaymentColumns+") VALUES ("+inPaymentValues+")";				
				sql.add(insertCashPaymentSQL);
				
				String pettyCashValues="SELECT c.cust_ref CELL_NUM, CURRENT_DATE, 'DUMMY_PETTY',0 FROM customer c, customer_payment cp WHERE c.cust_ref=cp.cust_ref GROUP BY c.cust_ref, cp.account, cp.amount HAVING cp.account='CASH_ACCOUNT' AND cp.amount>0";
				String insertPettyCashSQL="INSERT INTO petty_cash (cust_ref, petty_date, description, amount) "+pettyCashValues+" ";
				sql.add(insertPettyCashSQL);
			}
	    	
	    	InsertUpdateDeleteData updateData=null;            
	    	for(int i=0;i<sql.size();i++){
	    	   updateData=new InsertUpdateDeleteData(sql.get(i).toString());
            }
	    	 
            if(updateData.isUpdateSuccesfull()){
            	insertCustomerInvoiceTable();            	
            }
      
         } catch(Exception e){
        	 new SendClientBackToOrder(getReference(), getReferedBy());             
        	 isUpdateCustOrderSuccesfull=false;
        	 new Print(e.toString());
			 new Print(e.getMessage());
			 e.printStackTrace();	
         }		
	}

	private void insertCustomerInvoiceTable(){
		try {
			InsertUpdateDeleteData insertCustomerInvoiceData=null;
			setInsertInstallationCustomerInvoiceRowSQL();
			for(int i = 0; i < getInsertCustomerInstallInvoiceSQLArrayList().size();i++){
				new Print("INSERT_CUSTOMER_INVOICE_SQL ["+i+"]: "+getInsertCustomerInstallInvoiceSQLArrayList().get(i));
				insertCustomerInvoiceData=new InsertUpdateDeleteData(getInsertCustomerInstallInvoiceSQLArrayList().get(i).toString());	  
			}	  
		
			setInsertMonthlySubscriptionCustomerInvoiceRowSQL();
			if(getInsertMonthlySubscriptionCustomerInvoiceSQLArrayList().size()>0){
				deleteMonthlySubscriptionInvoice();
			}
		
			for(int i = 0; i < getInsertMonthlySubscriptionCustomerInvoiceSQLArrayList().size();i++){
				new Print("INSERT MONTHLTY SUBSCRIPTION CUSTOMER_INVOICE_SQL ["+i+"]: "+getInsertMonthlySubscriptionCustomerInvoiceSQLArrayList().get(i));
				insertCustomerInvoiceData=new InsertUpdateDeleteData(getInsertMonthlySubscriptionCustomerInvoiceSQLArrayList().get(i).toString());	  
			}
			isUpdateCustOrderSuccesfull=true;		
			String tableName="customer_invoice";
			String columnGroup="invoice_date, invoice_description, cust_ref, invoice_type, rate, service_id";
			new DeleteDuplicateRow(tableName, columnGroup, "VenLinkNetworks");
		
		} catch(Exception e){
			new SendClientBackToOrder(getReference(), getReferedBy());             
			new Print(e.toString());
			new Print(e.getMessage());
			e.printStackTrace();
       }
	}
	
	public void deleteMonthlySubscriptionInvoice(){
		String deleteMonthlyInvoiceSQL="DELETE FROM customer_invoice WHERE cust_ref='"+this.getReference()+"' AND invoice_description LIKE '%Monthly Subscription%' ";
		InsertUpdateDeleteData insertCustomerInvoiceData=new InsertUpdateDeleteData(deleteMonthlyInvoiceSQL);	
	}
	
	public void setInsertProRataSubscriptionCustomerInvoiceRowSQL(){
		insertCustomerProRataInvoiceSQLArrayList.clear();
		new Print("SetInsertProRataSubscriptionCustomerInvoiceRowSQL()() RUNNING........");	
		numberOfProRataDays=new DateTime(1).getDaysBetweenDates(new DateTime(0).dateFormatChange("MM/dd/yyyy", "yyyy-MM-dd", getInstallCompDate()), new DateTime(0).dateFormatChange("MM-dd-yyyy", "yyyy-MM-dd", getMonthlyInvoiceStartDate(getDebitPaymentDate(), getInstallCompDate())));
		String customerInvoiceTable="customer_invoice";
		
		new Print("numberOfProRataDays: "+getNumberOfProRataDays());
		if(getNumberOfProRataDays()>5){
			if(isProRataCheckBoxSelected()){
				new Print("PRORATA_NEXT_INVOICE_NUM: "+getNextInvoiceNum());
				String proRataDescription="Pro-Rata based usage Charge("+new DateTime(0).dateFormatChange("MM/dd/yyyy", "dd-MMM-yyyy",getInstallCompDate())+" to "+new DateTime(0).dateFormatChange("MM-dd-yyyy", "dd-MMM-yyyy", getMonthlyInvoiceStartDate(getDebitPaymentDate(), getInstallCompDate()))+")"; 
				String column="cust_ref, invoice_number, invoice_date, invoice_description, unit, quantity, rate";
				String value=" '"+this.getReference()+"', '"+getNextInvoiceNum()+"', TO_DATE('"+getInstallCompDate()+"', 'MM-DD-YYYY'), '"+proRataDescription+"', 'Days', "+getNumberOfProRataDays()+" , "+getProRataRate()+" ";
				String insertCustomerProRataInvoiceRowSQL="INSERT INTO "+customerInvoiceTable+"("+column+") VALUES ("+value+") ";
				insertCustomerInstallInvoiceSQLArrayList.add(insertCustomerProRataInvoiceRowSQL);
			}
		}
		
		new Print("insertMonthlySubscriptionCustomerInvoiceSQLArrayList SIZE: "+getInsertCustomerInstallInvoiceSQLArrayList().size());
		if(getInsertCustomerInstallInvoiceSQLArrayList().size()==0){
			String customerInvoiceColumns="invoice_date, invoice_description, unit, rate, quantity, invoice_type, cust_ref";
			String customerInvoiceDataSQL="TO_DATE('"+getInstallCompDate()+"', 'MM-DD-YYYY'), 'DUMMY_INVOICE', 'SUM', 0, 1,'DUMMY_INVOICE','"+this.getReference()+"' ";
			String insertcustomerInvoiceSQL="INSERT INTO customer_invoice ("+customerInvoiceColumns+") VALUES ("+customerInvoiceDataSQL+") ";			
			new Print("CUSTOMER_DUMMY_INVOICE_SQL: "+insertcustomerInvoiceSQL);						 
			InsertUpdateDeleteData insertData =new InsertUpdateDeleteData(insertcustomerInvoiceSQL);			
		}
	}

	public void setInsertMonthlySubscriptionCustomerInvoiceRowSQL(){
		insertMonthlySubscriptionCustomerInvoiceSQLArrayList.clear();
		new Print("SetInsertMonthlySubscriptionCustomerInvoiceRowSQL()() RUNNING........");	
		setNumberOfMonthBetween();
		try {			
			if(getNumberOfMonthBetween()>0){
				SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
				Date convertedDate=dateFormat.parse(getMonthlyInvoiceStartDate(getDebitPaymentDate(), getInstallCompDate()));
				new Print ("Converted_Date: "+convertedDate);
			
				Calendar calendar = Calendar.getInstance();
				String customerInvoiceTable="customer_invoice";
				String nextInvoiceNumToAdd=getNextInvoiceNum();
				new Print("Next_Invoice_Num_To_Add: "+nextInvoiceNumToAdd);
				new Print("Number_Of_Month_Between: "+getNumberOfMonthBetween());
				for(int i=0; i<getNumberOfMonthBetween(); i++){
					calendar.setTime(convertedDate);
					calendar.add(Calendar.MONTH, i);
					String monthDate=dateFormat.format(calendar.getTime());
					new Print(i+ " MONTH: "+monthDate);
					monthList+=monthDate+"#";
					
					nextInvoiceNum=String.valueOf(Integer.parseInt(nextInvoiceNumToAdd)+i+1);
					new Print("MONTHLY_NEXT_INVOICE_NUM: "+getNextInvoiceNum());
					String column="cust_ref, invoice_number, invoice_date, invoice_description, unit, quantity, rate";
					String value="'"+this.getReference()+"', ("+GET_NEXT_INVOICE_NUM_SQL+"), TO_DATE('"+monthDate+"', 'MM-DD-YYYY'), 'Monthly Subscription ("+getServicePlan()+" Mbps)', 'SUM', 1 , "+getPackageAmount()+"";
					String insertCustomerMonthlyInvoiceRowSQL="INSERT INTO "+customerInvoiceTable+" ("+column+") VALUES("+value+" )";
					new Print("Insert_Customer_Monthly_InvoiceRow_SQL: "+insertCustomerMonthlyInvoiceRowSQL);
					insertMonthlySubscriptionCustomerInvoiceSQLArrayList.add(insertCustomerMonthlyInvoiceRowSQL);				
				}
			}
			
		} catch(Exception e){
       	   	 new Print(e.toString());
			 new Print(e.getMessage());
			 e.printStackTrace();
        }
	}
	
	public void addElectronicMandate(){
		new Print("mandate upload to netcash running........");
		final String MANDATE_ACTIVE="1";
		final String IS_SA_ID="1";
		final String BANK_DETAIL_TYPE="1";
		final String DEBIT_FREQ="1";
		
		try {
			ArrayList mandateDateArrayList=new ArrayList();
			mandateDateArrayList.add("101:"+getReference()+"");				
			mandateDateArrayList.add("102:"+getRefereeFullName()+"");		
			mandateDateArrayList.add("103:"+MANDATE_ACTIVE+"");				
			mandateDateArrayList.add("113:"+getCustomerSurname()+"");		
			mandateDateArrayList.add("114:"+getCustomerName()+"");			
			mandateDateArrayList.add("119:"+getUpdateCustTitle()+"");		
			 if(getUpdateCustTitle().equalsIgnoreCase("Company")
		            	||getUpdateCustTitle().equalsIgnoreCase("School")
		            	||getUpdateCustTitle().equalsIgnoreCase("Church")){
				 mandateDateArrayList.add("110:0");								
				 mandateDateArrayList.add("121:"+getTradingName()+" ");			
				 mandateDateArrayList.add("122:"+getRegistrationNumber()+" ");	
				 mandateDateArrayList.add("123: "+getRegistereredName()+"");	
			 				 
			 } else {
				 mandateDateArrayList.add("110:1");								
				 mandateDateArrayList.add("119:"+getUpdateCustTitle()+"");		
				 mandateDateArrayList.add("121: ");								
				 mandateDateArrayList.add("122: ");								
				 mandateDateArrayList.add("123: ");								
			 }
			 
			mandateDateArrayList.add("126:"+getIdentityNum()+"");				
			mandateDateArrayList.add("127:"+IS_SA_ID+"");						
			mandateDateArrayList.add("131:"+BANK_DETAIL_TYPE+"");				
			mandateDateArrayList.add("132:"+getCustomerFullName()+"");			
			mandateDateArrayList.add("133:"+getAccountTypeCode()+"");			
			mandateDateArrayList.add("134:"+getBankCode()+"");											
			mandateDateArrayList.add("136:"+getBankAccountNum()+"");								
			mandateDateArrayList.add("161:"+getPackageAmount()+"");								
			mandateDateArrayList.add("281:"+getMasterFileGroupName()+"");		
			mandateDateArrayList.add("530:"+DEBIT_FREQ+"");						
			mandateDateArrayList.add("531:"+getCommencementMonth()+"");			
			mandateDateArrayList.add("532:"+getDebitPaymentDate()+"");			
			mandateDateArrayList.add("533:"+getDebitPaymentDate()+"");			
			mandateDateArrayList.add("534:"+getMandateAgreementDate()+"");		
			mandateDateArrayList.add("535:"+getReference()+"");									
			new AddEditElectronicMandate(mandateDateArrayList);
			
			new Print("mandateDateArrayList: "+mandateDateArrayList);
			
		} catch (Exception netcashEx) {
	        new Print("Netcash upload failed:");
	        new Print(netcashEx.getMessage());
	        netcashEx.printStackTrace();
	    }
	}
		
	private String getMandateAgreementDate(){
		return getSoapDate(getInstallDate(), "MM-dd-yyyy");
	}
	
	private String getCommencementMonth(){
		new Print("Mandate_AgreementDate: "+getMandateAgreementDate());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
		String nextMonthDate = LocalDate.parse(getMandateAgreementDate(), dtf)
		                                .plusMonths(1)
		                                .format(dtf);		
		new Print("Next_Month_Date: "+nextMonthDate);		
		String nextMonth=nextMonthDate.substring(4, 6);
		new Print("Next_Month: "+nextMonth);
		
		return nextMonth;
	}	

	private String getAccountTypeCode(){
		return accountTypeCode;
	}

	private String getCustomerFullName(){
		return getRefereeFullName();
	}

	private String getMasterFileGroupName(){
		return masterFileGroupName;
	}

	private String getBankCode(){
		return bankCode;
	}

	private String getRegistereredName(){
		return registereredName;
	}

	private String getRegistrationNumber(){
		return registrationNumber;
	}

	private String getTradingName(){
		return tradingName;
	}

	private String getCustomerSurname(){
		return customerSurname;
	}

	private String getCustomerName(){
		return customerName;
	}

	private void setNumberOfMonthBetween(){
		ConnectToPostgresDatabase connect=new ConnectToPostgresDatabase();	
		try {
			String getMonthBetweenSQL="SELECT FLOOR((TO_DATE('"+getMonthlyInvoiceEndDate(getDebitPaymentDate())+"', 'MM-DD-YYYY')::date - TO_DATE('"+getMonthlyInvoiceStartDate(getDebitPaymentDate(), getInstallCompDate())+"','MM-DD-YYYY')::date)::numeric /30.43) AS MONTHS";
			new Print("Month_Between_SQL: "+getMonthBetweenSQL);
			ResultSet rs=connect.getStatement().executeQuery(getMonthBetweenSQL);
	 	    	
			while(rs.next()){
				numberOfMonthBetween=Integer.parseInt(rs.getString("MONTHS"))+1;
				new Print("Number_Of_Months_Between: "+getNumberOfMonthBetween());
			}
		
		} catch(Exception e){
			new Print(e.toString());
			new Print(e.getMessage());
			e.printStackTrace();
			
		} finally {
			try {
				new Print("CLOSING CONNECTION TO THE DB...");					  
				connect.getConnection().close();
				connect.getStatement().close();
				new Print("CONNECTION TO THE DB CLOSED");
				       
			} catch(Exception e){
				new Print(e.toString());
				new Print(e.getMessage());
				e.printStackTrace();
			}
	   }
	}
	
	public String getMonthlyInvoiceStartDate(int debitPayDate, String installCompDate){
		new Print("DebitPayDate: "+debitPayDate+" InstallCompDate: "+installCompDate);
		String[] dayMonthYear1=installCompDate.replace("/", "-").split("-");
		String invoiceStartMonth=dayMonthYear1[0];
		String invoiceStartDay=dayMonthYear1[1];
		String invoiceStartYear=dayMonthYear1[2];
		new Print("invoiceStartDay: "+invoiceStartDay+" invoiceStartMonth: "+invoiceStartMonth+" invoiceStartYear: "+invoiceStartYear);
		
		if(Integer.parseInt(invoiceStartDay)> debitPayDate){
			monthlyInvoiceStartDate=invoiceStartMonth+"-"+debitPayDate+"-"+invoiceStartYear;				
			monthlyInvoiceStartDate=new DateTime(0).addSubtractMonth(monthlyInvoiceStartDate, +1);
			
		} else {
			monthlyInvoiceStartDate=invoiceStartMonth+"-"+debitPayDate+"-"+invoiceStartYear;
		}		
		return monthlyInvoiceStartDate;
	}
	
	public String getMonthlyInvoiceEndDate(int debitPayDate){
		String today=new DateTime().getCurrentDate();
		new Print("Today's Date: "+today);
		
		String[] dayMonthYear=today.split("-");
		String invoiceEndMonth=dayMonthYear[0];
		String invoiceEndDay=dayMonthYear[1];
		String invoiceEndYear=dayMonthYear[2];
		new Print("Day: "+invoiceEndDay+" Month: "+invoiceEndMonth+" Year: "+invoiceEndYear);
		
		if(debitPayDate==1){
			monthlyInvoiceEndDate=invoiceEndMonth+"-"+debitPayDate+"-"+invoiceEndYear;
	    	
		} else {
		    if(Integer.parseInt(invoiceEndDay)> debitPayDate){
		    	monthlyInvoiceEndDate=invoiceEndMonth+"-"+debitPayDate+"-"+invoiceEndYear;
			
		    } else {
		    	monthlyInvoiceEndDate=invoiceEndMonth+"-"+debitPayDate+"-"+invoiceEndYear;
		    	monthlyInvoiceEndDate=new DateTime(0).addSubtractMonth(monthlyInvoiceEndDate, -1);
		    }
		}		
		return monthlyInvoiceEndDate;
	}

	public void setInsertInstallationCustomerInvoiceRowSQL(){
		new Print("SetInsertCustomerInvoiceRowSQL()() RUNNING........");	
		insertCustomerInstallInvoiceSQLArrayList.clear();
		try {
			String customerInvoiceTable="customer_invoice";
			for(int i = 0; i < calculateWirelessInternetCost.getCustomerInvoiceDataArrayList().size();i++){
				new Print("RUNNING INVOICE SQL RAW");
				String invoiceDescription=((ArrayList)calculateWirelessInternetCost.getCustomerInvoiceDataArrayList().get(i)).get(0).toString();
				new Print("InvoiceDescription: "+invoiceDescription);
				String invoiceUnit=((ArrayList)calculateWirelessInternetCost.getCustomerInvoiceDataArrayList().get(i)).get(1).toString();
				new Print("InvoiceUnit: "+invoiceUnit);
				String invoiceQuantity=((ArrayList)calculateWirelessInternetCost.getCustomerInvoiceDataArrayList().get(i)).get(2).toString();
				new Print("InvoiceQuantity: "+invoiceQuantity);
				String invoiceRate=((ArrayList)calculateWirelessInternetCost.getCustomerInvoiceDataArrayList().get(i)).get(3).toString();
				new Print("InvoiceRate: "+invoiceRate);
				
				if(invoiceDescription.contains("Referal Program")){
					new Print("REFERAL PROGRAM........  "+invoiceDescription);
					String referalReference=null;
					if(invoiceDescription.contains("Refered by:")){
						referalReference=getReference();
						
					} else if(invoiceDescription.contains("Refered:")){
						referalReference=getRefererRef();
					}					
					
					new Print("ReferalReference: "+referalReference);
					String insertCustomerInvoiceRowSQL="INSERT INTO "+customerInvoiceTable+"(cust_ref, credit_note_number, invoice_date, invoice_description, unit, quantity, rate) "
													  +"VALUES ('"+referalReference+"', '"+getNextCreditNoteNum()+"', TO_DATE('"+getInstallCompDate()+"', 'MM-DD-YYYY'), '"+invoiceDescription+"', '"+invoiceUnit+"', "+invoiceQuantity+" , "+invoiceRate+" )";
					new Print("Insert_Customer_Invoice_Referal_ProgramRow_SQL: "+insertCustomerInvoiceRowSQL);
					insertCustomerInstallInvoiceSQLArrayList.add(insertCustomerInvoiceRowSQL);
					
				} else {
					new Print("NOT REFERAL PROGRAM........"+invoiceDescription+" NEW_INVOICE_NUMBER: "+getNextInvoiceNum());
					String column="cust_ref, invoice_number, invoice_date, invoice_description, unit, quantity, rate";
					String value="'"+this.getReference()+"', '"+getNextInvoiceNum()+"', TO_DATE('"+getInstallCompDate()+"', 'MM-DD-YYYY'), '"+invoiceDescription+"', '"+invoiceUnit+"', "+invoiceQuantity+" , "+invoiceRate+" ";
					String insertCustomerInvoiceRowSQL="INSERT INTO "+customerInvoiceTable+"("+column+") VALUES ("+value+")";
					insertCustomerInstallInvoiceSQLArrayList.add(insertCustomerInvoiceRowSQL);
				}
				new Print("Customer_Invoice_SQL_ArrayList SIZE: "+getInsertCustomerInstallInvoiceSQLArrayList().size());
			}		
			setInsertProRataSubscriptionCustomerInvoiceRowSQL();
			
		} catch(Exception ex) {
			ex.printStackTrace();
			ex.printStackTrace();
		}
	}
	
	public void setInstallationLogVariables(HttpServletRequest request, HttpServletResponse response) throws IOException{		
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		String referenceTitleSurnameNamesDepositService=request.getParameter("custReference");
		new Print("Reference#Title@Surname_Name&Name#Deposit#Service: "+ referenceTitleSurnameNamesDepositService);
		
		internetService=request.getParameter("internetService");
		new Print("installLog() Internet_Service: "+getInternetService());
		installer=request.getParameter("installer");
		new Print("installLog() Installer: "+getInstaller());
		if(request.getParameter("installRate").equalsIgnoreCase("-Select-")){
			JSONObject errorResponse = new JSONObject();
			errorResponse.put("success", false);
			errorResponse.put("error", "Select Install Rate!");
			out.print(errorResponse.toJSONString());
			
		} else {
			installRate=Integer.parseInt(request.getParameter("installRate"));	
		}		
		
		new Print("installLog() InstallRate: "+getInstallRate());
		String servicePlanAmount=request.getParameter("servicePlan");
		new Print("installLog() servicePlanAmount: "+servicePlanAmount);
		String[] servicePlanAmountSplit=servicePlanAmount.split("\\{");
		servicePlan=servicePlanAmountSplit[0];
		new Print("installLog() ServicePlan: "+getServicePlan());
		packageAmount=Integer.parseInt(servicePlanAmountSplit[1].replace("}", "").trim());
		new Print("installLog() PackageAmount: "+getPackageAmount());
		
		servicePlanGroup=request.getParameter("servicePlanGroup");
		new Print("installLog() servicePlanGroup: "+getServicePlanGroup());
		     
		installDiscount=request.getParameter("installDiscount");
		new Print("installLog() InstallDiscount: "+getInstallDiscount());	
		miniUPS=request.getParameter("miniUPS");
		new Print("installLog() MiniUPS: "+getMiniUPS());
		   
		installCompDate=request.getParameter("compDate");	 
		new Print("installLog() InstallCompDate: "+getInstallCompDate());   
		
		paymentMethod=request.getParameter("paymentMethod").trim();
		new Print("PaymentMethod: "+getPaymentMethod());
		String debitPaaymentDateGroupName=request.getParameter("debitPaymentDate").trim();
		String[] debitPaymentDateGroupNameSplit=debitPaaymentDateGroupName.split("\\{");		
		debitPaymentDate=Integer.parseInt(debitPaymentDateGroupNameSplit[0]);
		new Print("DebitPaymentDate: "+getDebitPaymentDate());	
		masterFileGroupName=debitPaymentDateGroupNameSplit[1].replace("}", "").trim();
		new Print("MasterFileGroupName: "+getMasterFileGroupName());
		
		if(getPaymentMethod().equalsIgnoreCase("DEBIT_ORDER")){			
			if(request.getParameter("bankName").trim().equalsIgnoreCase("-Select-")){
				JSONObject errorResponse = new JSONObject();
				errorResponse.put("success", false);
				errorResponse.put("error", "Select Bank Name!");
				out.print(errorResponse.toJSONString());
				
			} else {
				String bankNameCode=request.getParameter("bankName").trim();
				String[] bankNameCodeSplit=bankNameCode.split("\\{");	
				bankName=bankNameCodeSplit[0];
				new Print("BankName: "+getBankName());	
				bankCode=bankNameCodeSplit[1].replace("}", "").trim();
				new Print("BankCode: "+getBankCode());
			}
			
			if(request.getParameter("accountType").trim().equalsIgnoreCase("-Select-")){
				JSONObject errorResponse = new JSONObject();
				errorResponse.put("success", false);
				errorResponse.put("error", "Select Bank Account Type!");
				out.print(errorResponse.toJSONString());
				
			} else {
				String accountTypeCo=request.getParameter("accountType").trim();
				String[] accountTypeCodeSplit=accountTypeCo.split("\\{");	
				accountType=accountTypeCodeSplit[0];
				new Print("AccountType: "+getAccountType());	
				accountTypeCode=accountTypeCodeSplit[1].replace("}", "").trim();
				new Print("AccountTypeCode: "+getAccountTypeCode());
			}			
			
			if(request.getParameter("accountNum").trim().isEmpty()){
				JSONObject errorResponse = new JSONObject();
				errorResponse.put("success", false);
				errorResponse.put("error", "Please input Bank Account#!");
				out.print(errorResponse.toJSONString());
				
			} else {
				bankAccountNum=request.getParameter("accountNum").trim();
				new Print("BankAccountNum: "+getBankAccountNum());	
			}
			
			if(request.getParameter("identityNum").trim().isEmpty()){
				JSONObject errorResponse = new JSONObject();
				errorResponse.put("success", false);
				errorResponse.put("error", "Please input Client ID#!");
				out.print(errorResponse.toJSONString());
				
			} else {
				identityNum=request.getParameter("identityNum").trim();
				new Print("IdentityNum: "+getIdentityNum());
			}			
		}
		
		installPaymentMethod=request.getParameter("installPaymentMethod").trim();
		new Print("installPaymentMethod: "+getInstallPaymentMethod());		
		cashAmount=Integer.parseInt(request.getParameter("cashAmount").trim());
		new Print("installLog() CashAmount: "+getCashAmount()); 
		
		
		
		
		callOut=request.getParameter("callOut");
		new Print("installLog() CallOut: "+getCallOut());
		labourHour=request.getParameter("labourHours");
		new Print("installLog() LabourHour: "+getLabourHour());
		kilometer=request.getParameter("kilometer");
		new Print("installLog() Kilometer: "+getKilometer());
		   
		new Print("installLog() refered_By: "+getReferedBy());
		refererRef=request.getParameter("refererRef");
		new Print("installLog() Referer_Ref: "+getRefererRef());
		
		
		isProRataIncluded=request.getParameter("proRata");
		new Print("isProRataIncluded: "+isProRataIncluded());
		proRataRate=(int) Math.floor((getPackageAmount()/4.33)/7);
		new Print("ProRataRate: "+getProRataRate());
		if(isProRataIncluded()==null){
			isProRataCheckBoxSelected=false;
			proRataRate=0;
		
		} else {
			isProRataCheckBoxSelected=true;
		}
		new Print("isProRataCheckBoxSelected: "+isProRataCheckBoxSelected());
				
		isVatIncluded=request.getParameter("isVATIncluded");
		new Print("isVatIncluded: "+getIsVatIncluded());
		if(getIsVatIncluded()==null){
		  isVatCheckBoxSelected=false;
		  
		} else {
		  isVatCheckBoxSelected=true;					
		}
		new Print("isVatCheckBoxSelected: "+isVatCheckBoxSelected());
		
		isFreeInstallation=request.getParameter("isNoCostInstallation");
		new Print("isFreeInstallation: "+getIsFreeInstallation());
		if(getIsFreeInstallation()==null){
			isFreeInstallationCheckBoxSelected=false;
		  
		} else {
			isFreeInstallationCheckBoxSelected=true;
			installRate=0;
		}
		new Print("isFreeInstallationCheckBoxSelected: "+isFreeInstallationCheckBoxSelected());
				
		if(getInstaller().equalsIgnoreCase("-Select-")){
			JSONObject errorResponse = new JSONObject();
			errorResponse.put("success", false);
			errorResponse.put("error", "Select Installer!");
			out.print(errorResponse.toJSONString());
					    	
		} else if(getMiniUPS().equalsIgnoreCase("-Select-")){
			JSONObject errorResponse = new JSONObject();
			errorResponse.put("success", false);
			errorResponse.put("error", "Select Mini UPS Option!");
			out.print(errorResponse.toJSONString());
					    	
		} else if(getServicePlan().equalsIgnoreCase("-Select-")){
			JSONObject errorResponse = new JSONObject();
			errorResponse.put("success", false);
			errorResponse.put("error", "Select Service Plan!");
			out.print(errorResponse.toJSONString());
					    	
		} else {
			
			// Clear and repopulate variableOther
			/*variableOther.clear();

			// Add each element with null checks
			variableOther.add(getInternetService() != null ? getInternetService() : "");
			variableOther.add(getCallOut() != null ? getCallOut() : "NO");
			variableOther.add(getMiniUPS() != null ? getMiniUPS() : "NO");
			variableOther.add(getRefereeFullName() != null ? getRefereeFullName() : "");
			variableOther.add(getReferedBy() != null ? getReferedBy() : "Own Client");
			variableOther.add(isVatCheckBoxSelected() ? "true" : "false");
			variableOther.add(isNoCostInstallation() ? "true" : "false");
			variableOther.add(String.valueOf(getNumberOfMonthBetween()));
			variableOther.add(String.valueOf(getNumberOfProRataDays()));

			// Debug: Print all values to see which one is null
			for (int i = 0; i < variableOther.size(); i++) {
			    new Print("variableOther[" + i + "] = " + variableOther.get(i));
			}*/
			
			new Print("installLog() Kilometer: "+getKilometer());
			variableQty.add(0, getKilometer());
			new Print("installLog() Labour_Hour: "+getLabourHour());
			variableQty.add(1, getLabourHour());
			    
			new Print("installLog() InstallRate: "+getInstallRate());
			variableRate.add(0, getInstallRate());
			new Print("installLog() Mini_UPS_Rate: "+getMiniUPSRate());
			variableRate.add(1, getMiniUPSRate());
			new Print("installLog() KiloMeter_Rate: "+getKiloMeterRate());
			variableRate.add(2, getKiloMeterRate());
			new Print("installLog() Labour_Rate: "+getLabourRate());
			variableRate.add(3, getLabourRate());
			new Print("installLog() CallOut_Rate: "+getCallOutRate());
			variableRate.add(4, getCallOutRate());
			new Print("installLog() Install_Discount: "+getInstallDiscount());
			variableRate.add(5, getInstallDiscount());
			new Print("installLog() Referer_Referal_Amount: "+getRefererReferalAmount());
			variableRate.add(6, getRefererReferalAmount());
			new Print("installLog() Referee_Referal_Amount: "+getRefereeReferalAmount());
			variableRate.add(7, getRefereeReferalAmount());
			    
			
			// Before adding to variableOther, ensure no nulls
			/*new Print("installLog() Internet_Service: " + getInternetService());
			variableOther.add(0, getInternetService() != null ? getInternetService() : "");
			new Print("installLog() Call_Out: " + getCallOut());
			variableOther.add(1, getCallOut() != null ? getCallOut() : "NO");
			new Print("installLog() Mini_UPS: " + getMiniUPS());
			variableOther.add(2, getMiniUPS() != null ? getMiniUPS() : "NO");
			new Print("installLog() Referee_Full_Name: " + getRefereeFullName());
			String refName = getRefereeFullName();
			variableOther.add(3, refName != null ? refName : "");
			new Print("installLog() refered_By: " + getReferedBy());
			variableOther.add(4, getReferedBy() != null ? getReferedBy() : "Own Client");
			new Print("installLog() isVatCheckBoxSelected: " + isVatCheckBoxSelected());
			variableOther.add(5, isVatCheckBoxSelected());
			new Print("installLog() isNoCostInstallation: " + isNoCostInstallation());
			variableOther.add(6, isNoCostInstallation());*/
			
			
			new Print("installLog() Internet_Service: "+getInternetService());
			variableOther.add(0, getInternetService());
			new Print("installLog() Call_Out: "+getCallOut());
			variableOther.add(1, getCallOut());
			new Print("installLog() Mini_UPS: "+getMiniUPS());
			variableOther.add(2, getMiniUPS());
			/*new Print("installLog() Referal: "+getReferal());
			variableOther.add(3, getReferal());*/
			new Print("installLog() Referee_Full_Name: "+getRefereeFullName());
			variableOther.add(3, this.getRefereeFullName());
			new Print("installLog() refered_By: "+getReferedBy());
			variableOther.add(4, this.getReferedBy());
			new Print("installLog() isVatCheckBoxSelected: "+isVatCheckBoxSelected());
			variableOther.add(5, this.isVatCheckBoxSelected());
			new Print("installLog() isNoCostInstallation: "+isNoCostInstallation());
			variableOther.add(6, this.isNoCostInstallation());

			variableOther.add(7, getNumberOfMonthBetween());
			variableOther.add(8, getNumberOfProRataDays());
			    
			variableOther.add(7, this.getNumberOfMonthBetween());
			variableOther.add(8, this.getNumberOfProRataDays());
			    
			calculateWirelessInternetCost = new CalculateWirelessInternetCost(variableQty, variableRate, variableOther);
			    
			calculateWirelessInternetCost.populateInternetServiceInstallationCostTable("installLog");
			if(!"Own Client".equalsIgnoreCase(getReferedBy())){
			    calculateWirelessInternetCost.populateRereralProgramTable("installLog");
			}
		}
	}
	
	public static String getSoapDate(String inputDateString, String inPutFormat){
		new Print("Input_Date_String: "+inputDateString);
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern(inPutFormat);
        LocalDate date = LocalDate.parse(inputDateString, inputFormatter);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        String outputDateString = date.format(outputFormatter);        
        return outputDateString;
    }

	private String getAccountCode(){
		return accountType;
	}

	private String getAccountType(){
		return accountType;
	}

	private int getPackageAmount(){
		return packageAmount;
	}

	private ArrayList getClientDataArrayList(){
		ArrayList<ArrayList<String>> clientDataArrayList= new ArrayList<ArrayList<String>>();		
		   if("Company".equalsIgnoreCase(getTitle())){
			   ArrayList inner=new ArrayList();
			   inner.add(0,"Client:");
			   inner.add(1, getSurname()); 		   
			   clientDataArrayList.add(inner);
		   
			   inner=new ArrayList();
			   inner.add(0,"VAT#:");
			   inner.add(1, getInstallLogVatNum()); 		   
			   clientDataArrayList.add(inner);
		   
			   inner=new ArrayList();
			   inner.add(0,"Contact Person:");
			   inner.add(1,getInstallLogCustName()); 		   
			   clientDataArrayList.add(inner);
		   
			   inner=new ArrayList();
			   inner.add(0,"Cell no:");
			   inner.add(1, getReference()); 		   
			   clientDataArrayList.add(inner);
		   
			   inner=new ArrayList();
			   inner.add(0,"Email:");
			   inner.add(1, getInstallLogEmail()); 		   
			   clientDataArrayList.add(inner);
		   
			   inner=new ArrayList();
			   inner.add(0,"Date:");
			   inner.add(1, getInstallLogDate()); 		   
			   clientDataArrayList.add(inner);
		   
			   inner=new ArrayList();
			   inner.add(0,"Delivery:");
			   inner.add(1, getInstallLogDelivery()); 		   
			   clientDataArrayList.add(inner);
		   
		   } else {
			   ArrayList inner=new ArrayList();
			   inner.add(0,"Client:");
			   inner.add(1, getSurname()+" "+getInstallLogCustName()); 		   
			   clientDataArrayList.add(inner);
		   
			   inner=new ArrayList();
			   inner.add(0,"Cell no:");
			   inner.add(1, getReference()); 		   
			   clientDataArrayList.add(inner);
		   
			   inner=new ArrayList();
			   inner.add(0,"Email:");
			   inner.add(1, getInstallLogEmail()); 		   
			   clientDataArrayList.add(inner);
		   
			   inner=new ArrayList();
			   inner.add(0,"Date:");
			   inner.add(1, getInstallLogDate()); 		   
			   clientDataArrayList.add(inner);
		   
			   inner=new ArrayList();
			   inner.add(0,"Delivery:");
			   inner.add(1, getInstallLogDelivery()); 		   
			   clientDataArrayList.add(inner);
		   }		   
		return clientDataArrayList;
	}
	
	private ArrayList getInsertMonthlySubscriptionCustomerInvoiceSQLArrayList(){
		return insertMonthlySubscriptionCustomerInvoiceSQLArrayList;
	}
	
	private String getEmpName() {
		return empName;
	}

	private String getEmpSurname() {
		return empSurname;
	}

	private String getInstruction() {
		return instruction;
	}

	private boolean isClientOnUISP() {
		return isClientOnUISP;
	}

	private String getTemp_client_id() {
		return temp_client_id;
	}

	private String getClientServicePlan(){
		return clientServicePlan;
	}

	private String getAccountStatus(){
		return accountStatus;
	}

	private String getDebitPaymentDay(){
		if(debitPaymentDay.length()==1){
			debitPaymentDay="0"+debitPaymentDay;
		}		
		return debitPaymentDay;
	}
	
	private ArrayList getInsertCustomerProRataInvoiceSQLArrayList() {
		return insertCustomerProRataInvoiceSQLArrayList;
	}
	
	private int getServicePlanPrice() {
		return servicePlanPrice;
	}

	private int getServicePlanPeriodId() {
		return servicePlanPeriodId;
	}

	private int getServicePlanId() {
		return servicePlanId;
	}
	
	private String getDatabasePointer() {
		return databasePointer;
	}
	
	private int getClientId(){
		return clientId;
	}
	
	private int getClientServiceId(){
		return clientServiceId;
	}

	private String getUpdateCompanyName() {
		return updateCompanyName;
	}

	private String getUpdatePreviousISP() {
		return updatePreviousISP;
	}

	private String getUpdateDebitOrderDate() {
		return updateDebitOrderDate;
	}

	private String getUpdateVatNumber() {
		return updateVatNumber;
	}

	private String getUpdateCustEmail() {
		return updateCustEmail;
	}

	private String getUpdateReferedBy() {
		return updateReferedBy;
	}

	private String getUpdateService() {
		return updateService;
	}

	private String getUpdateAddress(){
		return updateAddress;
	}

	private String getUpdateOrderDate(){
		return updateOrderDate;
	}

	private String getUpdateCustName(){
		return updateCustName;
	}

	private String getUpdateCustSurname(){
		return updateCustSurname;
	}

	private String getUpdateCustTitle() {
		return updateCustTitle;
	}
	
	private int getNumberOfProRataDays(){
		return numberOfProRataDays;
	}
	
	private String getInstallPaymentMethod() {
		return installPaymentMethod;
	}

	private int getCashAmount() {
		return cashAmount;
	}

	private int getProRataRate() {
		return proRataRate;
	}

	private boolean isProRataCheckBoxSelected(){
		return isProRataCheckBoxSelected;
	}

	private String isProRataIncluded(){
		return isProRataIncluded;
	}
	
	private String getBankName() {
		return bankName;
	}

	private String getBankAccountNum() {
		return bankAccountNum;
	}

	private String getIdentityNum(){
		return identityNum;
	}
	
	private String getClient_id() {
		return client_id;
	}

	private String getService_id() {
		return service_id;
	}

	private String getInstallDate() {
		return installDate;
	}	
	
	private int getNumberOfMonthBetween() {
		return numberOfMonthBetween;
	}
	
	private String getBussinessServicePlan(){
		return bussinessServicePlan;
	}

	private String getHomeServicePlan(){
		return homeServicePlan;
	}

	private String getCorporateServicePlan(){
		return corporateServicePlan;
	}	
	
	private boolean isFreeInstallationCheckBoxSelected(){
		return isFreeInstallationCheckBoxSelected;
	}

	private String getIsFreeInstallation(){
		return isFreeInstallation;
	}
	
	private int getDebitPaymentDate(){
		return debitPaymentDate;
	}

	private String getPaymentMethod(){
		return paymentMethod;
	}
	
	private String getNextCreditNoteNum(){
		return nextCreditNoteNum;
	}
	
	private String getNextInvoiceNum(){
		return nextInvoiceNum;
	}
	
	private ArrayList getInsertCustomerInstallInvoiceSQLArrayList(){
		return insertCustomerInstallInvoiceSQLArrayList;
	}
	
	private String getRefereeFullName(){
		return refereeFullName;
	}
	
	private int getMiniUPSRate(){
		return miniUPSRate;
	}

	private int getRefererReferalAmount(){
		return refererReferalAmount;
	}
	
	private int getRefereeReferalAmount(){
		return refereeReferalAmount;
	}

	private int getCallOutRate(){
		return callOutRate;
	}

	private int getKiloMeterRate(){
		return kiloMeterRate;
	}

	private int getLabourRate(){
		return labourRate;
	}

	private String getUserRight(){
		return userRight;
	}
	
	private String getServerLink(){
		return serverLink;
	}

	private String getInstaller(){
		return installer;
	}
	
	private boolean isNoCostInstallation(){
		return isNoInstallationCost;
	}
	
	private String getRefererRef(){
		return refererRef;
	}

	private String getReferedBy(){
		return referedBy;
	}

	private String getKilometer(){
		return kilometer;
	}

	private String getLabourHour(){
		return labourHour;
	}

	private String getCallOut(){
		return callOut;
	}

	private String getInstallCompDate(){
		return installCompDate;
	}

	private String getMiniUPS(){
		return miniUPS;
	}

	private String getInstallDiscount(){
		return installDiscount;
	}

	private String getServicePlanGroup(){
		return servicePlanGroup;
	}
	
	private String getServicePlan(){
		return servicePlan;
	}

	private int getInstallRate(){
		return installRate;
	}
	
	private ArrayList getInvoicePayData(){
		return invoicePayData;
	}
	
	private String getInstallLogDate(){
		return installLogDate;
	}

	private String getInstallLogVatNum(){
		return installLogVatNum;
	}

	private String getInstallLogDelivery(){
		return installLogDelivery;
	}

	private String getInstallLogCustName(){
		return installLogCustName;
	}

	private String getInstallLogEmail(){
		return installLogEmail;
	}

	private String getIsVatIncluded(){
		return isVatIncluded;
	}

	private boolean isVatCheckBoxSelected(){
		return isVatCheckBoxSelected;
	}
	
	protected String getReference(){
		return reference;
	}

  	protected double getDeposit(){
		return Double.parseDouble(deposit);
	}

	protected double getVatAmount(){
		return vatAmount;
	}

	protected String getInternetService(){
		return internetService;
	}

	protected boolean isInsertInstallLogSuccesfull(){
		return isInsertInstallLogSuccesfull;
	}
	  
	protected boolean isUpdateCustOrderSuccesfull(){
		return isUpdateCustOrderSuccesfull;
	}	  
	
	protected String getInvoiceNumber(){
		return invoiceNumber;
	}
  
	protected String getInvoiceNum(){
		return invoiceNum;
	}
	
	protected double getBalance(){
		return balance;
	}	
	  
	protected String getNameSurname(){
		return nameSurname;
    }

	private String getSurname(){
		return surname.replace("&", " ");
	}

	private String getTitle(){
		return title;
	}
}