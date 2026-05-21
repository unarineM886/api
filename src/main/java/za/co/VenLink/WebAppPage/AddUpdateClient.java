package za.co.VenLink.WebAppPage;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import za.co.VenLinkWeb.Support.ConnectToUCRMRestAPI1;
import za.co.VenLinkWeb.Support.ConnectToUNMSRestAPI1;
//import za.co.VenLinkWeb.Support.AddEditElectronicMandate;
import za.co.VenLinkWeb.Support.CapitaliseFirstLetter;
import za.co.VenLinkWeb.Support.ConnectToPostgresDatabase;
import za.co.VenLinkWeb.Support.DateTime;
import za.co.VenLinkWeb.Support.DeleteDuplicateRow;
import za.co.VenLinkWeb.Support.DoesRecordAlreadyExist;
import za.co.VenLinkWeb.Support.FillCustomerOrderFromEnquiry;
import za.co.VenLinkWeb.Support.GetCurrentDate;
import za.co.VenLinkWeb.Support.InsertUpdateDeleteData;
import za.co.VenLinkWeb.Support.IsNumeric;
import za.co.VenLinkWeb.Support.Print;
import za.co.VenLinkWeb.Support.SetEnquiryCustomerDetails;

@WebServlet("/api/client")
public class AddUpdateClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private boolean isCustRefChanging=false;
	private boolean isMandateUpdating=false;
	
	private String nameSurname;
	private String isSendSmsSelected;
	private String custTitle;
	private String referedBy;
	private String custSurname="";
	private String custName="";
	private String custReference;
	private String custEmail;
	private String delivery;
	private String maxCustRef;
	private String cashNoCoverageClient;
	private String internetService;
	private String companyName=null;
	private String installAdditionalInstruction=null;
	private String serverLink="http://165.165.58.35";
	
	private String userRight;
	private String fromClass;
	private String empName;
	private String empSurname;
	private String previousISP;	
	
	private String updateCustTitle;
	private String updateCustSurname;
	private String updateCustName;
	private String updateOrderDate;
	private String updateDelivery;
	private String updateService;
	private String updateReferedBy;
	private String updateCustEmail;
	
	private String updateDebitOrderDate;
	private String updatePreviousISP;
	private String updateReferenceNo;
	private String updateCompanyName;	
	private String isCustRefChangingSelected;
	
	private String dialogTitle="";
	private String updatePaymentMethod;
	private String updateDebitPayDate;
	private String updateOrderStatus="";
	private String updateAccountStatus="";
	private String updateBankAccNum="";
	private String updateBankName="";
	private String updateIdNumber="";
	private String updateInstallAdditionalInstruction="";	
	
	private String bankDetailStatus="HIDDEN";
	
	private Vector paymentMethodVector;
	private Vector installPaymentMethodVector;
	private Vector debitPaymentDateVector;
	private Vector bankNameVector;	
	private Vector accountTypeVector;
	private String bankName;
	private String paymentMethod;
	private String bankAccNumber;
	private String identityNum;
	private String debitPaymentDate;
	
	private int updateClientId;
	private int updateContactId;
	private int updatePackageAmount=0;
	
	private String todayDate=new GetCurrentDate().getCurrentDate();
	private String yesterdayDate=new GetCurrentDate().getYesterdayDate();
	private ConnectToPostgresDatabase connect;
	private String updateAccountType;
	private String bankAccType;
	private String bankCode;
	private String bankAccTypeCode;
	private String masterFileGroupName;
	private String isUpdateMandateSelected;
	
   public AddUpdateClient(){
      super();
   }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		new Print("NewClient Get() Method......");
		String pathInfo = request.getPathInfo();
		
		/*if (pathInfo != null && pathInfo.contains("/getData")) {
			String reference = request.getParameter("reference");
			if (reference != null && !reference.isEmpty()) {
				//getCustomerDataJson(reference, response);
			} else {
				sendJsonError(response, "Reference parameter required", 400);
			}
		} else {
			addUpdateClientPage(request, response);
		}*/
		
		String refParam = request.getParameter("reference");
	    if (refParam != null && !refParam.isEmpty()) {
	        request.setAttribute("CustomerReference", refParam);
	        new Print("Test reference set to: " + refParam);
	        getCustomerDataJson(refParam, response);
	    } else {
		addUpdateClientPage(request, response);
	    }
		
	}	
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String contentType = request.getContentType();
		
		if (contentType != null && contentType.contains("application/json")) {
			handleJsonPost(request, response);
		} else {
			String pressedButton = request.getParameter("Submit");
			new Print("AddUpdateClient() Pressed_Button: "+pressedButton);
			
			if(pressedButton != null){			
				addUpdateClientHandler(request, response);
			} else {
				cashNoCoverageClient = (String) request.getAttribute("CashNoCoverageClient");
				new Print("CashNoCoverageClient: "+getCashNoCoverageClient());
				fromClass = "/" + (String) request.getAttribute("FromClass");
				new Print("From_Class: "+getFromClass());
				
				new Print("AddUpdateClient Post() Method......"+ "\n CashNoCoverageClient: "+ getCashNoCoverageClient());
				
				updateAccountStatus = null;
				updateOrderStatus = null;
				
				if(getCashNoCoverageClient() != null && getCashNoCoverageClient().startsWith("UpdateClientDetails")){
					dialogTitle = "Update Client";
					updateReferenceNo = (String) request.getAttribute("CustomerReference");
					new Print("Update_ReferenceNo: "+getUpdateReferenceNo());
					
					String tableName = "customer";
					if(getCashNoCoverageClient().endsWith("_NoCoverage")){
						tableName = "enquiry";
					}
					
					String getContactIdSql = "SELECT COALESCE(contact_id ,0) FROM ucrm_client uc WHERE phone='"+getUpdateReferenceNo()+"' ";
					String getCustomerDetailsSQL = "SELECT INITCAP(CO.cust_title) VENLINK_UPDATE_TITLE, INITCAP(CO.cust_surname) SURNAME, INITCAP(CO.cust_name) NAMES, TO_CHAR(CO.order_date,'DD-MON-YYYY') ORDER_DATE, INITCAP(CO.address), service, CO.refered_by, COALESCE(cust_email,''), COALESCE(account_status, 'NA'), COALESCE(debit_payment_date, ''), COALESCE(previous_isp, 'VenLink') DEBIT_ORDER_DATE, INITCAP(COALESCE(CO.company_name,'')) COMPANY_NAME, payment_method PAY_METHOD, debit_payment_date DEBIT_DATE, order_status ORDER_STATUS, COALESCE(id_num, ' ') ID_NUM, COALESCE(bank_name, ' ') BANK_NAME, COALESCE(account_type, ' ') ACCOUNT_TYPE, COALESCE(bank_acc_num, ' ') ACC_NUM, COALESCE(client_id, '0') CLIENT_ID, COALESCE(("+getContactIdSql+"), '0') CONTACT_ID,  COALESCE((SELECT ucs.service_plan_price FROM ucrm_client_service ucs WHERE ucs.client_id= co.client_id),'0') PACK_PRICE, COALESCE(install_additional_instruction, '') FROM "+tableName+" CO WHERE cust_ref='"+getUpdateReferenceNo()+"' ";
					getCustomerDetailToUpdate(getCustomerDetailsSQL);
				} else {
					dialogTitle = "Add New Client";				
				}
				addUpdateClientPage(request, response);
			}
		}
	}
	
	private void getCustomerDataJson(String reference, HttpServletResponse response) throws IOException {
		JSONObject result = new JSONObject();
		PrintWriter out = response.getWriter();
		
		ConnectToPostgresDatabase connect = null;
		try {
			connect = new ConnectToPostgresDatabase();
			
			String getCustomerSQL = "SELECT cust_title, cust_surname, cust_name, cust_email, address, service, refered_by, previous_isp, company_name, install_additional_instruction FROM customer WHERE cust_ref='" + reference + "'";
			ResultSet rs = connect.getStatement().executeQuery(getCustomerSQL);
			
			if (rs.next()) {
				result.put("reference", reference);
				result.put("custTitle", rs.getString("cust_title") != null ? rs.getString("cust_title") : "");
				result.put("custSurname", rs.getString("cust_surname") != null ? rs.getString("cust_surname") : "");
				result.put("custName", rs.getString("cust_name") != null ? rs.getString("cust_name") : "");
				result.put("custEmail", rs.getString("cust_email") != null ? rs.getString("cust_email") : "");
				result.put("address", rs.getString("address") != null ? rs.getString("address") : "");
				result.put("service", rs.getString("service") != null ? rs.getString("service") : "");
				result.put("referredBy", rs.getString("refered_by") != null ? rs.getString("refered_by") : "Own Client");
				result.put("previousISP", rs.getString("previous_isp") != null ? rs.getString("previous_isp") : "");
				result.put("companyName", rs.getString("company_name") != null ? rs.getString("company_name") : "");
				result.put("installAdditionalInstruction", rs.getString("install_additional_instruction") != null ? rs.getString("install_additional_instruction") : "");
			} else {
				result.put("error", "Customer not found");
				out.print(result.toJSONString());
				return;
			}
			rs.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			result.put("error", e.getMessage());
		} finally {
			if (connect != null) {
				try { connect.getConnection().close(); } catch(Exception e) {}
			}
		}
		
		out.print(result.toJSONString());
	}
	
	private void handleJsonPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		
		try {
			StringBuilder sb = new StringBuilder();
			String line;
			try (BufferedReader reader = request.getReader()) {
				while ((line = reader.readLine()) != null) {
					sb.append(line);
				}
			}
			
			JSONParser parser = new JSONParser();
			JSONObject jsonRequest = (JSONObject) parser.parse(sb.toString());
			
			// Extract data from JSON
			custTitle = (String) jsonRequest.getOrDefault("custTitle", "");
			referedBy = (String) jsonRequest.getOrDefault("referedBy", "Own Client");
			custSurname = (String) jsonRequest.getOrDefault("custSurname", "");
			custName = (String) jsonRequest.getOrDefault("custName", "");
			custReference = (String) jsonRequest.getOrDefault("custReference", "");
			custEmail = (String) jsonRequest.getOrDefault("custEmail", "");
			internetService = (String) jsonRequest.getOrDefault("internetService", "");
			previousISP = (String) jsonRequest.getOrDefault("previousISP", "");
			delivery = (String) jsonRequest.getOrDefault("delivery", "");
			companyName = (String) jsonRequest.getOrDefault("companyName", "");
			installAdditionalInstruction = (String) jsonRequest.getOrDefault("installAdditionalInstruction", "");
			paymentMethod = (String) jsonRequest.getOrDefault("paymentMethod", "");
			
			if (jsonRequest.containsKey("debitPaymentDate")) {
				debitPaymentDate = jsonRequest.get("debitPaymentDate").toString();
			}
			if (jsonRequest.containsKey("bankName")) {
				bankName = jsonRequest.get("bankName").toString();
			}
			if (jsonRequest.containsKey("bankAccNumber")) {
				bankAccNumber = jsonRequest.get("bankAccNumber").toString();
			}
			if (jsonRequest.containsKey("identityNum")) {
				identityNum = jsonRequest.get("identityNum").toString();
			}
			
			String isUpdateClient = (String) jsonRequest.getOrDefault("isUpdateClient", "false");
			String cashClient = (String) jsonRequest.getOrDefault("cashNoCoverageClient", "NewClient");
			String from = (String) jsonRequest.getOrDefault("fromClass", "/DashBoard");
			
			if (cashClient != null) {
				this.cashNoCoverageClient = cashClient;
			}
			if (from != null) {
				this.fromClass = from;
			}
			
			JSONObject result = new JSONObject();
			
			if ("true".equals(isUpdateClient)) {
				updateCustomerDetails(isCustRefChanging);
				result.put("success", true);
				result.put("message", "Customer updated successfully");
				result.put("customerReference", custReference);
			} else {
				String checkCusterRef = "SELECT cust_ref FROM customer WHERE cust_ref='" + custReference + "'";
				if (!new DoesRecordAlreadyExist(checkCusterRef).doesRecordAlreadyExist()) {
					addNewCustomer();
					result.put("success", true);
					result.put("message", "Client successfully added");
					result.put("customerReference", custReference);
				} else {
					result.put("success", false);
					result.put("error", "Customer reference already exists");
				}
			}
			
			out.print(result.toJSONString());
			
		} catch (Exception e) {
			e.printStackTrace();
			JSONObject errorResponse = new JSONObject();
			errorResponse.put("success", false);
			errorResponse.put("error", e.getMessage());
			out.print(errorResponse.toJSONString());
		}
	}
	
	private void addNewCustomer() {
		try {
			String checkInPaymentRefSql = "SELECT cust_ref FROM customer_payment WHERE cust_ref='" + custReference + "'";
			if (!new DoesRecordAlreadyExist(checkInPaymentRefSql).doesRecordAlreadyExist()) {
				String inPaymentColumns = "amount, account, cust_ref, bank_cust_ref, deposit_type, pay_date, new_cust";
				String inPaymentValues = "0.00, 'CASH_CLIENT','" + custReference + "','" + custReference + "', 'CASH_CLIENT', TO_DATE('" + todayDate + "','DD-MM-YYYY'), 'NO'";
				String insertInPaymentSQL = "INSERT INTO customer_payment (" + inPaymentColumns + ") VALUES (" + inPaymentValues + ")";
				new InsertUpdateDeleteData(insertInPaymentSQL);
			}
			
			String custOrderColumns = "cust_title, company_name, cust_surname, cust_name, vat_num, cust_ref, phone_number, order_date, address, cust_email, order_status, service, previous_isp, filled_by, filled_through, refered_by, referer_ref, order_number, install_additional_instruction";
			String custOrderValues = "'" + custTitle + "', NULLIF('" + companyName + "',''), '" + custSurname + "', '" + custName + "', '0000', '" + custReference + "', '" + custReference + "', TO_DATE('" + todayDate + "', 'DD-MM-YYYY'), '" + delivery + "', NULLIF('" + custEmail + "',''), 'Scheduled', '" + internetService + "', '" + previousISP + "', '" + nameSurname + "', 'WEB_APP', '" + referedBy + "', null , NEXTVAL('order_number'), '" + installAdditionalInstruction + "'";
			String insertCustOrderSQL = "INSERT INTO customer (" + custOrderColumns + ") VALUES (" + custOrderValues + ")";
			new InsertUpdateDeleteData(insertCustOrderSQL);
			
			String updateNewCust = "UPDATE customer_payment SET new_cust='NO' WHERE cust_ref='" + custReference + "' AND new_cust='YES'";
			new InsertUpdateDeleteData(updateNewCust);
			
			String updateEnquery = "UPDATE enquiry SET secured='YES' WHERE cust_ref ='" + custReference + "'";
			new InsertUpdateDeleteData(updateEnquery);
			
		} catch (Exception e) {
			new Print(e.toString());
			e.printStackTrace();
		}
	}
	
	private String getCustomerFullName() {
		return getCustSurname()+" "+getCustName();
	}

	private void getCustomerDetailToUpdate(String customerDetails){
		new Print("Customer_Details_SQL: "+customerDetails);
		String temp[]=getDataFromDB(customerDetails).split("&&");
		for(int i=0;i<temp.length;i++) {
			String temp1[]=temp[i].split("##");
			int num=temp1.length;
					
			for(int j=0; j<num; j++){
				switch(j){
					case 0:{
						updateCustTitle=temp1[j];
						break;
					}
					case 1:{
						updateCustSurname=temp1[j];
						break;
					}
					case 2:{
						updateCustName=temp1[j];
						break;
					}
					case 3:{
						updateOrderDate=temp1[j];
						break;
					}
					case 4:{
						updateDelivery=temp1[j];
						break;
					}
					case 5:{
						updateService=temp1[j];
						break;
					}
					case 6:{
						updateReferedBy=temp1[j];
						break;
					}
					case 7:{
						updateCustEmail=temp1[j];
						break;
					}
					case 8:{
						updateAccountStatus=temp1[j];
						break;
					}
					case 9:{
						updateDebitOrderDate=temp1[j];
						break;
					}
					case 10:{
						updatePreviousISP=temp1[j];
						break;
					}
					case 11:{
						updateCompanyName=temp1[j];
						break;
					}
					case 12:{
						updatePaymentMethod=temp1[j];
						if(getUpdatePaymentMethod().equalsIgnoreCase("DEBIT_ORDER")){
							bankDetailStatus="";
						} else{
							bankDetailStatus="HIDDEN";
						}
						break;
					}
					case 13:{
						updateDebitPayDate=temp1[j].replace("0", "");
						new Print("Update_Debit_Pay_Date: "+getUpdateDebitPayDate());
						break;
					}
					case 14:{
						updateOrderStatus=temp1[j];
						break;
					}
					case 15:{
						updateIdNumber=temp1[j];
						break;
					}
					case 16:{
						updateBankName=temp1[j];
						break;
					}
					case 17:{
						updateAccountType=temp1[j];
						break;
					}
					case 18:{
						updateBankAccNum=temp1[j];
						break;
					}
					case 19:{
						updateClientId=Integer.parseInt(temp1[j]);
						break;
					}
					case 20:{
						updateContactId=Integer.parseInt(temp1[j]);
						break;
					}
					case 21:{
						updatePackageAmount=Integer.parseInt(temp1[j]);
						break;
					}
					case 22:{
						updateInstallAdditionalInstruction=temp1[j].toString().replace("null", "");
						break;	
					}
					default:{
						break;
					}
				}	
			}			
			dialogTitle="Update: "+getUpdateCustSurname()+" "+getUpdateCustName();
		}		
	}
	
	private int getUpdatePackageAmount() {
		return updatePackageAmount;
	}

	private String getUpdateAccountType() {
		return updateAccountType;
	}

	private int getUpdateContactId(){
		return updateContactId;
	}

	private String getUpdateInstallAdditionalInstruction(){
		return updateInstallAdditionalInstruction;
	}

	private int getUpdateClientId(){
		return updateClientId;
	}

	private String getUpdateBankAccNum(){
		return updateBankAccNum;
	}

	private String getUpdateBankName(){
		return updateBankName;
	}

	private String getUpdateIdNumber(){
		return updateIdNumber;
	}

	private String getUpdateOrderStatus(){
		return updateOrderStatus;
	}

	private String getUpdateDebitPayDate(){
		return updateDebitPayDate;
	}

	private String getUpdatePaymentMethod(){
		return updatePaymentMethod;
	}

	private String getUpdateCompanyName(){
		return updateCompanyName;
	}

	public String getDataFromDB(String statement){
		ConnectToPostgresDatabase connectToDB=  new ConnectToPostgresDatabase();
		String reply="";
 		  try{
 			 ResultSet rs=connectToDB.getStatement().executeQuery(statement.replace("#", ""));
	  		 ResultSetMetaData rsmd = rs.getMetaData();
	  		 int columnCount = rsmd.getColumnCount();
	  		 String row="";
	  		 String colNames="";
	  		 
	  		 while(rs.next()){
	  			 row="";
	  			 colNames="";
	  			 for(int i = 1;i<=columnCount;i++){
	  				 row +=rs.getString(i)+"##";
	  				 colNames+=rsmd.getColumnName(i)+"@";
	  			 }
	  			 reply += "&&"+row;
	  		 }
	  		 
	  		 rs.last();      
	  		 int rowCount = rs.getRow();      
	  		 if(rowCount>0){
	  			 reply=colNames+" $$ "+reply;  			     
  		           
	  		 } else {
	  		 }
	  		
	  	 } catch (SQLException e){
		   	 new Print(e.toString());
		   	 new Print(e.getMessage());
		 	 e.printStackTrace();
		 	 
	  	 } finally{
			  try{
				  connectToDB.getConnection().close();
				  connectToDB.getStatement().close();
			       
			  } catch(Exception e){
				 new Print(e.toString());
				 new Print(e.getMessage());
				 e.printStackTrace();
			 }
		 }
		return reply;
	}

	public void addUpdateClientPage(HttpServletRequest request, HttpServletResponse response){
		new Print("addUpdateClientPage()........... LOADING");		
		
		Vector internetServiceVector = new Vector();
		internetServiceVector.add("-Select-");
		
		Vector referalNameVector = new Vector();
		referalNameVector.add("-Select-");
		
		Vector refVector = new Vector();
		refVector.add("-Select-");
		
		Vector titleVector = new Vector();
		titleVector.add("-Select-");
		
		Vector previousISPVector = new Vector();
		previousISPVector.add("-Select-");
		
		Vector refererVector = new Vector();
		refererVector.add("Own Client");
		
		Vector addressVector = new Vector();
		
		paymentMethodVector = new Vector();
		paymentMethodVector.add("-Select-");
		
		installPaymentMethodVector = new Vector();
		installPaymentMethodVector.add("-Select-");
		
		debitPaymentDateVector = new Vector();
		debitPaymentDateVector.add("-Select-");
		
		bankNameVector = new Vector();
		bankNameVector.add("-Select-");
		
		accountTypeVector = new Vector();
		accountTypeVector.add("-Select-");
		
		String getInternetServiceSQL="SELECT value SERVICE FROM venlink_system WHERE sys_name='SERVICES' AND in_use='YES' ORDER BY value";
		String getReferalNameSQL="SELECT value REFERED_SURNAME FROM venlink_system WHERE sys_name='REFERAL' AND in_use='YES' ORDER BY value";
		String getScheduledOrderSQL="SELECT cust_ref FROM customer_payment WHERE new_cust='YES' AND account LIKE '%cheq%' GROUP BY cust_ref HAVING SUM(amount)>=10000";
		String getTitleSQL="SELECT value TITLE FROM venlink_system WHERE sys_name='TITLE' AND in_use='YES' ORDER BY value";
		String getPreviousISPSQL="SELECT value PREVIOUS_ISP FROM venlink_system WHERE sys_name='PREVIOUS_ISP' AND in_use='YES' ORDER BY value";
		String getReferedByListSQL="SELECT CONCAT(cust_surname,' ', cust_name) REFERAL_LIST FROM customer ORDER BY cust_surname";
		String getAddressListSQL="SELECT DISTINCT(address) ADDRESS_LIST FROM customer ORDER BY address";
		
		String getPaymentMethodSQL="SELECT value PAYMENT_METHOD FROM venlink_system WHERE sys_name='MONTH_PAYMENT_METHOD' AND in_use='YES' ORDER BY value";
		String getInstallPaymentMethodSQL="SELECT value INSTALL_PAYMENT_METHOD FROM venlink_system WHERE sys_name='INSTALL_PAYMENT_METHOD' AND in_use='YES' ORDER BY value";
		String getdebitPaymentDateSQL="SELECT value||'{'||additional||'}' DEBIT_DATE FROM venlink_system WHERE sys_name='DEBIT_PAYMENT_DATE' AND in_use='YES' ORDER BY value";
		String getBankNameSQL="SELECT value||'{'||additional||'}' BANK_NAME FROM venlink_system WHERE sys_name='BANK_NAME' ORDER BY value";
		String getAccountTypeSQL="SELECT value||'{'||additional||'}' ACCOUNT_TYPE FROM venlink_system WHERE sys_name='DEBIT_ACCOUNT_TYPE' ORDER BY value";
		
		String[][] data={
				{getInternetServiceSQL,"SERVICE"},
				{getReferalNameSQL,"REFERED_SURNAME"},
				{getScheduledOrderSQL,"CUST_REF"},
				{getTitleSQL,"TITLE"},
				{getPreviousISPSQL,"PREVIOUS_ISP"},
				{getReferedByListSQL,"REFERAL_LIST"},
				{getAddressListSQL,"ADDRESS_LIST"},
				{getPaymentMethodSQL,"PAYMENT_METHOD"},
				{getdebitPaymentDateSQL,"DEBIT_DATE"},
				{getInstallPaymentMethodSQL,"INSTALL_PAYMENT_METHOD"},
				{getBankNameSQL,"BANK_NAME"},
				{getAccountTypeSQL,"ACCOUNT_TYPE"},
		};
		
		try {
			for(int i=0;i<data.length;i++) {
				connect=new ConnectToPostgresDatabase();
				ResultSet rs=connect.getStatement().executeQuery(data[i][0]);
				if(i==0){
					while(rs.next()){
						internetServiceVector.add(rs.getString(data[i][1]));
					}
				} else if(i==1){
					while(rs.next()){
						referalNameVector.add(rs.getString(data[i][1]));
					}
				} else if(i==2){
					while(rs.next()){
						refVector.add(rs.getString(data[i][1]));
					}
					new Print("refVector SIZE: "+refVector.size());
				} else if(i==3){
					while(rs.next()){
						titleVector.add(rs.getString(data[i][1]));
					}
					new Print("titleVector SIZE: "+titleVector.size());
				} else if(i==4){
					while(rs.next()){
						previousISPVector.add(rs.getString(data[i][1]));
					}
				} else if(i==5){
					while(rs.next()){
						refererVector.add(rs.getString(data[i][1]));
					}
					new Print("RefererVector SIZE: "+refererVector.size());
				} else if(i==6){
					while(rs.next()){
						addressVector.add(rs.getString(data[i][1]));
					}
					new Print("AddressVector SIZE: "+addressVector.size());
				} else if(i==7){
					while(rs.next()){
						paymentMethodVector.add(rs.getString(data[i][1]));
					}
				} else if(i==8){
					while(rs.next()){
						new Print("PAY DATE: "+rs.getString(data[i][1]));
						debitPaymentDateVector.add(rs.getString(data[i][1]));
					}
				} else if(i==9){
					while(rs.next()){
						installPaymentMethodVector.add(rs.getString(data[i][1]));
					}
				} else if(i==10){
					while(rs.next()){
						bankNameVector.add(rs.getString(data[i][1]));
					}
				} else if(i==11){
					while(rs.next()){
						accountTypeVector.add(rs.getString(data[i][1]));
					}
				}
			}
			
			response.setContentType("application/json");
			PrintWriter out = response.getWriter();
			
			if(request.getAttribute("nameSurnameRight") == null){
				new Print("Name_Surname_Right is NULL....");
				HttpSession sesion=request.getSession(true);
				String nameSurnameRight=(String)sesion.getAttribute("nameSurnameRight");
				new Print("Name_Surname_Right: "+nameSurnameRight);
				setNameSurnameRight(nameSurnameRight);
			} else {
				new Print("Name_Surname_Right is NOT_NULL....");
				final String nameSurnameRight = request.getAttribute("nameSurnameRight").toString();
				setNameSurnameRight(nameSurnameRight);
			}
			
			JSONObject jsonResponse = new JSONObject();
			jsonResponse.put("dialogTitle", getDialogTitle());
			jsonResponse.put("cashNoCoverageClient", getCashNoCoverageClient());
			jsonResponse.put("fromClass", getFromClass());
			jsonResponse.put("updateOrderStatus", getUpdateOrderStatus());
			jsonResponse.put("updateAccountStatus", getUpdateAccountStatus());
			jsonResponse.put("bankDetailStatus", getBankDetailStatus());
			
			// Title Vector
			JSONArray titleArray = new JSONArray();
			for(int i=0; i<titleVector.size(); i++) {
				JSONObject titleObj = new JSONObject();
				String titleValue = titleVector.elementAt(i).toString();
				titleObj.put("value", titleValue);
				titleObj.put("selected", titleValue.equals(getUpdateCustTitle()));
				titleArray.add(titleObj);
			}
			jsonResponse.put("titles", titleArray);
			
			// Service Vector
			JSONArray serviceArray = new JSONArray();
			for(int i=0; i<internetServiceVector.size(); i++) {
				JSONObject serviceObj = new JSONObject();
				String serviceValue = internetServiceVector.elementAt(i).toString();
				serviceObj.put("value", serviceValue);
				serviceObj.put("selected", serviceValue.equals(getUpdateService()));
				serviceArray.add(serviceObj);
			}
			jsonResponse.put("services", serviceArray);
			
			// Previous ISP Vector
			JSONArray previousISPArray = new JSONArray();
			for(int i=0; i<previousISPVector.size(); i++) {
				JSONObject ispObj = new JSONObject();
				String ispValue = previousISPVector.elementAt(i).toString();
				ispObj.put("value", ispValue);
				ispObj.put("selected", ispValue.equals(getUpdatePreviousISP()));
				previousISPArray.add(ispObj);
			}
			jsonResponse.put("previousISPs", previousISPArray);
			
			// Referer Vector
			JSONArray refererArray = new JSONArray();
			for(int i=0; i<refererVector.size(); i++) {
				refererArray.add(refererVector.elementAt(i).toString());
			}
			jsonResponse.put("referers", refererArray);
			
			// Address Vector
			JSONArray addressArray = new JSONArray();
			for(int i=0; i<addressVector.size(); i++) {
				addressArray.add(addressVector.elementAt(i).toString());
			}
			jsonResponse.put("addresses", addressArray);
			
			// Payment Methods
			JSONArray paymentMethodsArray = new JSONArray();
			for(int i=0; i<paymentMethodVector.size(); i++) {
				JSONObject pmObj = new JSONObject();
				String pmValue = paymentMethodVector.elementAt(i).toString();
				pmObj.put("value", pmValue);
				pmObj.put("selected", pmValue.equals(getUpdatePaymentMethod()));
				paymentMethodsArray.add(pmObj);
			}
			jsonResponse.put("paymentMethods", paymentMethodsArray);
			
			// Debit Payment Dates
			JSONArray debitDatesArray = new JSONArray();
			for(int i=0; i<debitPaymentDateVector.size(); i++) {
				String dateStr = debitPaymentDateVector.elementAt(i).toString();
				JSONObject dateObj = new JSONObject();
				dateObj.put("value", dateStr);
				String dateOnly = dateStr.split("\\{")[0];
				dateObj.put("selected", dateOnly.equals(getUpdateDebitPayDate()));
				debitDatesArray.add(dateObj);
			}
			jsonResponse.put("debitPaymentDates", debitDatesArray);
			
			// Bank Names
			JSONArray bankNamesArray = new JSONArray();
			for(int i=0; i<bankNameVector.size(); i++) {
				String bankStr = bankNameVector.elementAt(i).toString();
				JSONObject bankObj = new JSONObject();
				bankObj.put("value", bankStr);
				bankObj.put("selected", bankStr.contains(getUpdateBankName()));
				bankNamesArray.add(bankObj);
			}
			jsonResponse.put("bankNames", bankNamesArray);
			
			// Account Types
			JSONArray accountTypesArray = new JSONArray();
			for(int i=0; i<accountTypeVector.size(); i++) {
				accountTypesArray.add(accountTypeVector.elementAt(i).toString());
			}
			jsonResponse.put("accountTypes", accountTypesArray);
			
			// Update data if editing
			if(getCashNoCoverageClient() != null && getCashNoCoverageClient().startsWith("UpdateClientDetails")) {
				JSONObject updateData = new JSONObject();
				updateData.put("custTitle", getUpdateCustTitle());
				updateData.put("custSurname", getUpdateCustSurname());
				updateData.put("custName", getUpdateCustName());
				updateData.put("companyName", getUpdateCompanyName());
				updateData.put("reference", getUpdateReferenceNo());
				updateData.put("custEmail", getUpdateCustEmail());
				updateData.put("delivery", getUpdateDelivery());
				updateData.put("service", getUpdateService());
				updateData.put("previousISP", getUpdatePreviousISP());
				updateData.put("referedBy", getUpdateReferedBy());
				updateData.put("bankName", getUpdateBankName());
				updateData.put("accountType", getUpdateAccountType());
				updateData.put("bankAccNum", getUpdateBankAccNum());
				updateData.put("idNum", getUpdateIdNumber());
				updateData.put("installAdditionalInstruction", getUpdateInstallAdditionalInstruction());
				updateData.put("paymentMethod", getUpdatePaymentMethod());
				updateData.put("debitPayDate", getUpdateDebitPayDate());
				jsonResponse.put("updateData", updateData);
			}
			
			out.print(jsonResponse.toJSONString());
			new Print("THE END...... Of AddUpdateClient API");
			out.flush();
			out.close();
			
		} catch(Exception e){
			new Print(e.getMessage());
			e.printStackTrace();
		}
	}
	
	private String getBankDetailStatus(){
		return bankDetailStatus;
	}

	private String getDialogTitle(){
		return dialogTitle;
	}

	private void setNameSurnameRight(String nameSurnameRight){
		if (nameSurnameRight == null || nameSurnameRight.isEmpty()) {
			this.empName = "API";
			this.empSurname = "User";
			this.nameSurname = "API User";
			this.userRight = "ADMIN";
			return;
		}
		
		final String[] NameSurnameRight = nameSurnameRight.split("##");
		this.empName = NameSurnameRight[0];
		new Print("EmpName: "+this.getEmpName());
		this.empSurname = NameSurnameRight[1];
		new Print("EmpSurname: "+this.getEmpSurname());
		this.nameSurname = this.getEmpName() + " " + this.getEmpSurname();
		new Print("nameSurname: "+this.getNameSurname());
		this.userRight = NameSurnameRight[2];
		new Print("UserRight: "+this.getUserRight());		
	}

	public void addUpdateClientHandler(HttpServletRequest request, HttpServletResponse response){
		companyName="";
		custEmail="";
		bankName="";
		bankCode="";
		bankAccNumber="";
		bankAccType="";
		bankAccTypeCode="";
		identityNum="";
		
		try{
			response.setContentType("application/json");
			PrintWriter out = response.getWriter();
			custTitle=request.getParameter("title").trim();
			referedBy=request.getParameter("referedBy");
			custSurname=request.getParameter("surname").trim();
			custName=request.getParameter("name").trim();
			custReference=request.getParameter("reference").trim();
			custEmail=request.getParameter("email").trim();			
			internetService=request.getParameter("service");
			previousISP=request.getParameter("previousISP").trim();
			new Print("PreviousISP: "+getPreviousISP());
			delivery=request.getParameter("delivery").trim();
			new Print("Delivery: "+getDelivery());
			new Print("Order_Status: "+getUpdateOrderStatus());
			new Print("Account_Status: "+getUpdateAccountStatus());
			isUpdateMandateSelected=request.getParameter("updateMandate");
			new Print("isUpdateMandateSelected: "+isUpdateMandateSelected());			
			if(isUpdateMandateSelected()==null){
				isMandateUpdating=false;
				new Print("IS_CUSTOMER_MANDATE_UPDATING_FALSE: "+isMandateUpdating);
				
			} else {
				isMandateUpdating=true;
				new Print("IS_CUSTOMER_MANDATE_UPDATING_TRUE: "+isMandateUpdating);
			}
			
			if("Complete".equalsIgnoreCase(getUpdateOrderStatus()) && "ACTIVE".equalsIgnoreCase(getUpdateAccountStatus())){
				paymentMethod=request.getParameter("paymentMethod").trim();
				new Print("Payment_Method: "+getPaymentMethod());
				if(getPaymentMethod().equalsIgnoreCase("DEBIT_ORDER") && isMandateUpdating()){
					String bankNameCode=request.getParameter("bankName").trim();
					if("-Select-".equalsIgnoreCase(bankNameCode)){
						bankName="";
					}
					String[] bankNameCodeSplit=bankNameCode.split("\\{");	
					bankName=bankNameCodeSplit[0];
					new Print("BankName: "+getBankName());	
					bankCode=bankNameCodeSplit[1].replace("}", "").trim();
					new Print("BankCode: "+getBankCode());				
					bankAccNumber=request.getParameter("accountNum").trim();
					new Print("Bank_Acc_Number: "+getBankAccNumber());					
					String accountTypeCode=request.getParameter("accountType").trim();
					if("-Select-".equalsIgnoreCase(accountTypeCode)){
					}
					String[] accountTypeCodeSplit=accountTypeCode.split("\\{");	
					bankAccType=accountTypeCodeSplit[0];
					new Print("BankAccType(): "+getBankAccType());	
					bankAccTypeCode=accountTypeCodeSplit[1].replace("}", "").trim();
					new Print("AccountTypeCode: "+getBankAccTypeCode());				
					identityNum=request.getParameter("identityNum").trim();
					new Print("Identity_Num: "+getIdentityNum());
				}
				
				String debitPaymentDateGroupName=request.getParameter("debitPaymentDate").trim();
				String[] debitPaymentDateGroupNameSplit=debitPaymentDateGroupName.split("\\{");		
				debitPaymentDate=debitPaymentDateGroupNameSplit[0];
				new Print("DebitPaymentDate: "+getDebitPaymentDate());	
				masterFileGroupName=debitPaymentDateGroupNameSplit[1].replace("}", "").trim();
				new Print("MasterFileGroupName: "+getMasterFileGroupName());
						
			} else {
				installAdditionalInstruction=request.getParameter("installAdditionalInstruction");
				new Print("Install_Additional_Instruction: "+getInstallAdditionalInstruction());
			}
						
			isCustRefChangingSelected=request.getParameter("custRefChange");
			if(isCustRefChangingSelected()==null){
				isCustRefChanging=false;
				new Print("IS_CUSTOMER_REF_CHANGING_FALSE: "+isCustRefChanging());
				
			} else {
				isCustRefChanging=true;
				new Print("IS_CUSTOMER_REF_CHANGING_TRUE: "+isCustRefChanging());
			}
				
			if(getDelivery()==null||getDelivery().isEmpty()){
				sendJsonError(response, "Please fill in the Delivery!", 400);
						
			} else if(getCustSurname()==null||getCustSurname().isEmpty()){
				sendJsonError(response, "Please Fill Customer surname!", 400);
					
			} else if(getTodayDate()==null||getTodayDate().isEmpty()){
				sendJsonError(response, "Please Fill Order Date!", 400);
					
			} else if(getCustName()==null||getCustName().isEmpty()){
				sendJsonError(response, "Please Fill Customer Name!", 400);
					
			} else if(getCustReference()==null){
				sendJsonError(response, "Please Fill Customer Reference!", 400);
					
			} else if("-Select-".equalsIgnoreCase(getCustTitle())){
				sendJsonError(response, "Please select Customer Title!", 400);
					
			} else if("-Select-".equalsIgnoreCase(getReferedBy())){
				sendJsonError(response, "Please Select Who Refered the Customer!", 400);
					
			} else if("-Select-".equalsIgnoreCase(getInternetService())){
				sendJsonError(response, "Please Select Internet Service!", 400);
					
			} if(getCustReference().length()>10||getCustReference().length()<10){
				sendJsonError(response, "Phone Number is less or more than 10 digits!!", 400);
								
			} else {
				if("Company".equalsIgnoreCase(getCustTitle())||"School".equalsIgnoreCase(getCustTitle())
						||"Church".equalsIgnoreCase(getCustTitle())){
					companyName=request.getParameter("companyName").trim();	
						
					if(getCompanyName().length()==0){
						sendJsonError(response, "Please enter the Company Name!", 400);							
					}
				} else {
					companyName="";
				}
					
				if(getCustReference().length()==10 && new IsNumeric(getCustReference()).isNumeric()){
					String checkCustOrderRef="SELECT cust_ref FROM customer WHERE cust_ref='"+getCustReference()+"'";
					if(new DoesRecordAlreadyExist(checkCustOrderRef).doesRecordAlreadyExist()){
						if(!"UpdateClientDetails".equalsIgnoreCase(getCashNoCoverageClient())){
							if("Company".equalsIgnoreCase(getCustTitle())||"School".equalsIgnoreCase(getCustTitle())
									||"Church".equalsIgnoreCase(getCustTitle())){
								String suggestedRef=getGeneratedSuggestedRef();
								new Print("SuggestedRef: "+suggestedRef);
								JSONObject responseJson = new JSONObject();
								responseJson.put("success", false);
								responseJson.put("error", "Customer already exists");
								responseJson.put("suggestedReference", suggestedRef);
								responseJson.put("message", "Customer with Cell/Ref#: "+getCustReference()+" already exists. Use this suggested reference?");
								out.print(responseJson.toJSONString());
								custReference=suggestedRef;
							} else {
								sendJsonError(response, "Customer with Cell/Ref#: "+getCustReference()+" Already Exist!!! \n2 clients can't share same Ref/Cell#", 400);
							}
						}
						addUpdateCustomer(request, response);
					} else {
						addUpdateCustomer(request, response);				
					}
				} else {
					sendJsonError(response, "Invalid Cell Number. Cell Number should be 10 digits only!", 400);
				}
			}
			
		} catch(Exception e){
			new Print(e.toString());
			new Print(e.getMessage());
			e.printStackTrace();
		}			
	}

	private boolean isCustRefChanging() {
		return isCustRefChanging;
	}

	private boolean isMandateUpdating() {
		return isMandateUpdating;
	}

	private String isUpdateMandateSelected() {
		return isUpdateMandateSelected;
	}

	private String getMasterFileGroupName() {
		return masterFileGroupName;
	}

	private String getBankAccTypeCode() {
		return bankAccTypeCode;
	}

	private String getBankCode() {
		return bankCode;
	}

	private String getBankAccType() {
		return bankAccType;
	}

	private String getDebitPaymentDate() {
		return debitPaymentDate;
	}

	private String getIdentityNum() {
		return identityNum;
	}

	private String getBankAccNumber() {
		return bankAccNumber;
	}

	private String getBankName() {
		return bankName;
	}

	private String getPaymentMethod() {
		return paymentMethod;
	}

	private String isCustRefChangingSelected() {
		return isCustRefChangingSelected;
	}

	private String getGeneratedSuggestedRef(){
		String suggestedRef=null;		
		try {
			String checkMaxCustRefSQL="SELECT MAX(CAST(cust_ref AS BIGINT)) MAX_REF FROM customer WHERE cust_ref LIKE '%"+getCustReference().substring(1)+"' ";
			connect=new ConnectToPostgresDatabase();
			ResultSet rs=connect.getStatement().executeQuery(checkMaxCustRefSQL);
			while(rs.next()){
				maxCustRef=rs.getString("MAX_REF");
			}
			new Print("MaxCustRef: "+getMaxCustRef());

			String firstLetter;
			String last9Letters=null;
			int newSeq=0;
			if(getMaxCustRef().length()==10){
				firstLetter=getMaxCustRef().substring(0, 1);
				newSeq=Integer.parseInt(firstLetter)+1;
				last9Letters=getMaxCustRef().substring(1);
			} else if(getMaxCustRef().length()==11){
				firstLetter=getMaxCustRef().substring(0, 2);
				newSeq=Integer.parseInt(firstLetter)+1;
				last9Letters=getMaxCustRef().substring(2);				
			}	
			suggestedRef = newSeq+last9Letters;
			
		} catch(Exception e){
			new Print(e.toString());
			new Print(e.getMessage());
			e.printStackTrace();
		}	
		return suggestedRef;
	}

	private void addUpdateCustomer(HttpServletRequest request, HttpServletResponse response){
		try{
			response.setContentType("application/json");
			PrintWriter out = response.getWriter();
			new Print("addUpdateCustomer() Method: "+ getCashNoCoverageClient());		
			String checkCusterRef="SELECT cust_ref FROM customer WHERE cust_ref='"+getCustReference()+"'";
			if(!new DoesRecordAlreadyExist(checkCusterRef).doesRecordAlreadyExist()){
				if("NewClient".equalsIgnoreCase(getCashNoCoverageClient())){		
					String insertInPaymentSQL=null;
					String inPaymentColumns="amount, account, cust_ref, bank_cust_ref, deposit_type, pay_date, new_cust";
					String inPaymentValues= "0.00, 'CASH_CLIENT','"+getCustReference()+"','"+getCustReference()+"', 'CASH_CLIENT', TO_DATE('"+getTodayDate()+"','DD-MM-YYYY'), 'NO'";
					insertInPaymentSQL="INSERT INTO customer_payment ("+inPaymentColumns+") VALUES ("+inPaymentValues+")";			
					InsertUpdateDeleteData insertData =new InsertUpdateDeleteData(insertInPaymentSQL);
					
					String checkInPaymentRefSql="SELECT cust_ref FROM customer_payment WHERE cust_ref='"+getCustReference()+"'";
					if(new DoesRecordAlreadyExist(checkInPaymentRefSql).doesRecordAlreadyExist()){
						String checkRefOnEnquirySQL="SELECT cust_ref, cust_title, cust_name, cust_surname, cust_email, address, service, refered_by FROM enquiry WHERE cust_ref='"+getCustReference()+"' AND secured IS NULL ";
						if(new DoesRecordAlreadyExist(checkRefOnEnquirySQL).doesRecordAlreadyExist()){
							new Print("Filling Data from Enquiry.....");			  
							SetEnquiryCustomerDetails setEnquiryCustomerDetails= new SetEnquiryCustomerDetails(checkRefOnEnquirySQL);
							FillCustomerOrderFromEnquiry fillCustomerOrderFromEnquiry=new FillCustomerOrderFromEnquiry(getCustReference(), setEnquiryCustomerDetails.getEnquiryCustTitle(), setEnquiryCustomerDetails.getEnquiryCustSurname(), setEnquiryCustomerDetails.getEnquiryNoCoverageCust());
							
							if(fillCustomerOrderFromEnquiry.isAddCustomerFromEnquirySuccesfull()){
								JSONObject successResponse = new JSONObject();
								successResponse.put("success", true);
								successResponse.put("message", "Client successfully added!");
								successResponse.put("customerReference", getCustReference());
								out.print(successResponse.toJSONString());
							}
						} else {
							new Print(getCustReference()+" not found from ENQUIRY table....");
							String refererSurname=null;
							String refererName=null;
							String refererRefSQL="";
							String custOrderValues=null;
							if(!"Own Client".equalsIgnoreCase(referedBy)){
								String[] surnameName=referedBy.split(" ");
								if(surnameName.length==2){
									refererSurname=surnameName[0];
									refererName=surnameName[1];
								} else if(surnameName.length==3){
									refererSurname=surnameName[0];
									refererName=surnameName[1]+" "+surnameName[2];
								}
								
								refererRefSQL="SELECT cust_ref FROM customer WHERE cust_surname='"+refererSurname+"' AND cust_name='"+refererName+"' ";
								custOrderValues= " '"+getCustTitle()+"', NULLIF('"+getCompanyName()+"',''), '"+getCustSurname()+"', '"+getCustName()+"', '"+getVatNumber()+"', '"+getCustReference()+"', '"+getCustReference()+"', TO_DATE('"+getTodayDate()+"', 'DD-MM-YYYY'), '"+new CapitaliseFirstLetter().capitalizeFirstLetter(getDelivery())+"', NULLIF('"+getCustEmail()+"',''), 'Scheduled', '"+getInternetService()+"', '"+getPreviousISP()+"',  '"+this.getNameSurname()+"', 'WEB_APP', '"+getReferedBy()+"', ("+refererRefSQL+"), NEXTVAL('order_number'), '"+getInstallAdditionalInstruction()+"' ";
							} else {
								custOrderValues= " '"+getCustTitle()+"', NULLIF('"+getCompanyName()+"',''), '"+getCustSurname()+"', '"+getCustName()+"', '"+getVatNumber()+"', '"+getCustReference()+"', '"+getCustReference()+"', TO_DATE('"+getTodayDate()+"', 'DD-MM-YYYY'), '"+new CapitaliseFirstLetter().capitalizeFirstLetter(getDelivery())+"', NULLIF('"+getCustEmail()+"',''), 'Scheduled', '"+getInternetService()+"', '"+getPreviousISP()+"',  '"+this.getNameSurname()+"', 'WEB_APP', '"+getReferedBy()+"', null , NEXTVAL('order_number'), '"+getInstallAdditionalInstruction()+"' "; 
							}
							
							String custOrderTable="customer";
							String custOrderColumns="cust_title, company_name, cust_surname, cust_name, vat_num, cust_ref, phone_number, order_date, address, cust_email, order_status, service, previous_isp, filled_by, filled_through, refered_by, referer_ref, order_number, install_additional_instruction"; 
							String onConflict="ON CONFLICT (cust_ref) DO UPDATE SET "
									+"cust_title = EXCLUDED.cust_title,"
									+"company_name = EXCLUDED.company_name, "
									+"cust_surname = EXCLUDED.cust_surname, "
									+"cust_name = EXCLUDED.cust_name,"
									+"order_date = EXCLUDED.order_date, "
									+"address = EXCLUDED.address, "
									+"cust_email = EXCLUDED.cust_email, "
									+"order_status = EXCLUDED.order_status, "
									+"service = EXCLUDED.service, "
									+"previous_isp = EXCLUDED.previous_isp, "
									+"filled_by = EXCLUDED.filled_by, "
									+"filled_through = EXCLUDED.filled_through, "
									+"refered_by = EXCLUDED.refered_by, "
									+"referer_ref = EXCLUDED.referer_ref, "
									+"order_number = EXCLUDED.order_number, "
									+"install_additional_instruction = EXCLUDED.install_additional_instruction";
							String insertCustOrderSQL="INSERT INTO "+custOrderTable+" ("+custOrderColumns+") VALUES ("+custOrderValues+") "+onConflict;
							
							new Print("InsertCustOrderSQL: "+insertCustOrderSQL);
							String[] SQL={insertCustOrderSQL};
							
							for(int i=0;i<SQL.length;i++){
								insertData =new InsertUpdateDeleteData(SQL[i]);
							}
						}
						
						if(new DoesRecordAlreadyExist(checkCusterRef).doesRecordAlreadyExist()){
							String updateNewCust="UPDATE customer_payment SET new_cust='NO' WHERE cust_ref='"+getCustReference()+"' AND new_cust='YES'";
							String updateEnquery="UPDATE enquiry SET secured='YES' WHERE cust_ref ='"+getCustReference()+"' ";
							
							String[] SQL1={updateNewCust, updateEnquery};
							for(int i=0; i<SQL1.length; i++){
								insertData =new InsertUpdateDeleteData(SQL1[i]);
							}
							
							JSONObject successResponse = new JSONObject();
							successResponse.put("success", true);
							successResponse.put("message", "Client successfully added!");
							successResponse.put("customerReference", getCustReference());
							out.print(successResponse.toJSONString());
						} else {
							sendJsonError(response, "Insert customer NOT Successfull", 500);
						}
					}
				} else if("UpdateClientDetails".equalsIgnoreCase(getCashNoCoverageClient())){
					new Print("THIS_IS_WHERE_COMPLETE_REF_CHANGE_IS_DONE: "+isCustRefChanging());
					updateCustomerDetails(isCustRefChanging());
					JSONObject successResponse = new JSONObject();
					successResponse.put("success", true);
					successResponse.put("message", "Customer UPDATED Successfully!");
					successResponse.put("customerReference", getCustReference());
					out.print(successResponse.toJSONString());
				}
			} else {
				new Print("This is WHERE customers are UPDATED........");
				if("UpdateClientDetails".equalsIgnoreCase(getCashNoCoverageClient())
						||"NewClient".equalsIgnoreCase(getCashNoCoverageClient())){
					new Print("IsCustRefChanging: "+isCustRefChanging());
					updateCustomerDetails(isCustRefChanging());	
					JSONObject successResponse = new JSONObject();
					successResponse.put("success", true);
					if(isCustRefChanging()) {
						successResponse.put("message", "Reference UPDATED Successfully!");
					} else {
						successResponse.put("message", "Customer UPDATED Successfully!");	
					}
					successResponse.put("customerReference", getCustReference());
					out.print(successResponse.toJSONString());
				}
			}
			
			String tableName="customer";
			String columnGroup="cust_ref, cust_name, cust_surname";
			new DeleteDuplicateRow(tableName, columnGroup, "VenLinkNetworks");
			
			out.flush();
			out.close();
			
		} catch(Exception e){
			new Print(e.toString());
			new Print(e.getMessage());
			e.printStackTrace();
		}
	}
	
	private String getInstallAdditionalInstruction() {
		return installAdditionalInstruction;
	}

	public void changeCustomerReferenceNumber(){
		try{
			new Print("NEW_REF: "+ getCustReference()+" OLD_REF: "+getUpdateReferenceNo()+" CLIENT_ID: "+getUpdateClientId());
			
			String updateCustomer="UPDATE customer SET cust_ref='"+getCustReference()+"' WHERE cust_ref='"+getUpdateReferenceNo()+"' AND client_id='"+getUpdateClientId()+"' ";
			String updateCustomerInvoice="UPDATE customer_invoice SET cust_ref='"+getCustReference()+"' WHERE cust_ref='"+getUpdateReferenceNo()+"' ";
			String updateCustomerPayment="UPDATE customer_payment SET cust_ref='"+getCustReference()+"' WHERE cust_ref='"+getUpdateReferenceNo()+"' ";
			String updateFnbTransHistoryPayment="UPDATE fnb_transaction_history SET cust_ref='"+getCustReference()+"' WHERE cust_ref='"+getUpdateReferenceNo()+"' ";
			String updateNetcashMerchStatementPayment="UPDATE netcash_merchant_statement SET cust_ref='"+getCustReference()+"' WHERE cust_ref='"+getUpdateReferenceNo()+"' ";
			String updateUcrmClients="UPDATE ucrm_client SET phone='"+getCustReference()+"' WHERE phone='"+getUpdateReferenceNo()+"' ";
			String updatePettyCash="UPDATE petty_cash SET cust_ref='"+getCustReference()+"' WHERE cust_ref='"+getUpdateReferenceNo()+"' ";
			String updateTempPettyCash="UPDATE petty_cash SET cust_ref='"+getCustReference()+"' WHERE cust_ref='"+getUpdateReferenceNo()+"' ";
			
			String[] custRefChangeSQL= {updateCustomer, updateCustomerPayment,updateFnbTransHistoryPayment,updateNetcashMerchStatementPayment, updateCustomerInvoice, updatePettyCash, updateTempPettyCash, updateUcrmClients};
			for(int i=0; i<custRefChangeSQL.length; i++){
				InsertUpdateDeleteData insertData =new InsertUpdateDeleteData(custRefChangeSQL[i]);
			}
		} catch(Exception e){
			new Print(e.toString());
			e.getStackTrace();
			e.printStackTrace();
			e.getMessage();
		}
	}	
	
	private void updateCustomerDetails(boolean isCustRefChanging){
		new Print("updateCustomerDetails() "+ isCustRefChanging);
		try{		
			if(isCustRefChanging){
				changeCustomerReferenceNumber();
				updateContactDetailOnUisp(new ConnectToUCRMRestAPI1("PATCH", "clients/contacts/"+getUpdateContactId()).getConnection());
			} else {
				new Print("UPDATE_STATUS: "+getUpdateOrderStatus());
				ArrayList sqlArrayList=new ArrayList();
				String updateCustDetailsSQL=null;
				String refererSurname=null;
				String refererName=null;
				String paymentMethodDetails="UPDATE customer SET payment_method='"+getPaymentMethod()+"', bank_name='"+getBankName()+"', account_type='"+getBankAccType()+"', bank_acc_num='"+getBankAccNumber()+"', id_num='"+getIdentityNum()+"', debit_payment_date="+getDebitPaymentDate()+"  WHERE cust_ref='"+getCustReference()+"' ";
				
				if(!"Own Client".equalsIgnoreCase(referedBy)){
					String[] surnameName=referedBy.split(" ");
					if(surnameName.length==2){
						refererSurname=surnameName[0];
						refererName=surnameName[1];
					} else if(surnameName.length==3){
						refererSurname=surnameName[0];
						refererName=surnameName[1]+" "+surnameName[2];
					}
					
					String refererRefSQL="SELECT cust_ref FROM customer WHERE cust_surname='"+refererSurname+"' AND LOWER(cust_name)=LOWER('"+refererName+"') ";
					updateCustDetailsSQL="UPDATE customer SET cust_title='"+getCustTitle()+"', company_name=NULLIF('"+getCompanyName()+"',''), cust_surname='"+getCustSurname()+"', cust_name='"+getCustName()+"', vat_num='"+getVatNumber()+"', cust_email=NULLIF('"+getCustEmail()+"',''), address='"+getDelivery()+"', service='"+getInternetService()+"', refered_by='"+getReferedBy()+"', referer_ref=("+refererRefSQL+"), previous_isp='"+getPreviousISP()+"', install_additional_instruction=NULLIF('"+getInstallAdditionalInstruction()+"','') WHERE cust_ref='"+getCustReference()+"' AND client_id='"+getUpdateClientId()+"' ";
					sqlArrayList.add(updateCustDetailsSQL);
					new Print("UPDATE_STATUS: "+getUpdateOrderStatus());
					if("Complete".equalsIgnoreCase(getUpdateOrderStatus())){
						sqlArrayList.add(paymentMethodDetails);
					}
				} else {
					updateCustDetailsSQL="UPDATE customer SET cust_title='"+getCustTitle()+"', company_name='"+getCompanyName()+"', cust_surname='"+getCustSurname()+"', cust_name='"+getCustName()+"', vat_num='"+getVatNumber()+"', cust_email=NULLIF('"+getCustEmail()+"',''),  address='"+getDelivery()+"', service='"+getInternetService()+"', refered_by='"+getReferedBy()+"', referer_ref=NULL, previous_isp='"+getPreviousISP()+"', install_additional_instruction='"+getInstallAdditionalInstruction()+"' WHERE cust_ref='"+getCustReference()+"' ";
					sqlArrayList.add(updateCustDetailsSQL);
					if("Complete".equalsIgnoreCase(getUpdateOrderStatus())){
						sqlArrayList.add(paymentMethodDetails);
					}
					String updateCompanyNameSql="UPDATE customer c SET company_name =NULL WHERE company_name IN('','null')";
					sqlArrayList.add(updateCompanyNameSql);
				}
				new Print("NUMBER_SQL: "+sqlArrayList.size());
				for(int i=0; i<sqlArrayList.size(); i++){
					InsertUpdateDeleteData insertData=new InsertUpdateDeleteData(sqlArrayList.get(i).toString());
				}
				if(getUpdateClientId()!=0){
					updateCustomerDetailOnUisp(new ConnectToUCRMRestAPI1("PATCH", "clients/"+getUpdateClientId()).getConnection());					
					if(!getCustEmail().equalsIgnoreCase(getUpdateCustEmail())){
						updateContactDetailOnUisp(new ConnectToUCRMRestAPI1("PATCH", "clients/contacts/"+getUpdateContactId()).getConnection());
					}	
				}				
				if(getPaymentMethod().equalsIgnoreCase("DEBIT_ORDER")){
					if(isMandateUpdating()){
						addEditElectronicMandate();
					}					
				}
			}			
		} catch(Exception e){
			new Print(e.toString());
			e.getStackTrace();
			e.printStackTrace();
			e.getMessage();
		}
	}
	
	private void updateContactDetailOnUisp(HttpURLConnection connection){
		try {
			JSONObject bodyPayload = new JSONObject();
			if(isCustRefChanging()){
				bodyPayload.put("phone", getCustReference());
			} else {
				bodyPayload.put("email", getCustEmail());
			}			
			
			new Print("CLIENT_CONTACT_UPDATE_Body_Pay_Load: "+bodyPayload.toString());		
			sendPayLoad(connection, bodyPayload);
			int responseCode = connection.getResponseCode();
			new Print("ResponseCode: "+responseCode);
			
			if (responseCode == HttpURLConnection.HTTP_OK||responseCode == 201){
				new Print("CLIENT_CONTACT_DETAIL PATCH Successfull..........");
				try(BufferedReader reader = new BufferedReader( new InputStreamReader(connection.getInputStream()))){
					String line;
					while ((line = reader.readLine()) != null){
					}
				} 
			} else {
				new Print("Error: HTTP Response code - " + responseCode);    
				printDetailApiFailure(connection);
			}
		} catch(Exception e){
			new Print(e.toString());
			e.getStackTrace();
			e.printStackTrace();
			e.getMessage();
		}
	}

	private void updateCustomerDetailOnUisp(HttpURLConnection connection){
		try {
			JSONObject bodyPayload = new JSONObject();
			if(getPreviousISP().equalsIgnoreCase("VenLink")){
				bodyPayload.put("previousIsp", "");
			} else {
				bodyPayload.put("previousIsp", getPreviousISP());
			}
			
			if(getReferedBy().equalsIgnoreCase("Own Client")){
				bodyPayload.put("referral", "");
			} else {
				bodyPayload.put("referral", getReferedBy());
			}
			bodyPayload.put("fullAddress", getDelivery());
			
			if(getCustTitle().equalsIgnoreCase("Company")||getCustTitle().equalsIgnoreCase("School")||
					getCustTitle().equalsIgnoreCase("Church")){
				bodyPayload.put("companyName", getCompanyName());
				bodyPayload.put("companyContactFirstName", getCustName());
				bodyPayload.put("companyContactLastName", getCustSurname());				
				bodyPayload.put("firstName", "");
				bodyPayload.put("lastName", "");
			} else {
				bodyPayload.put("companyName", "");
				bodyPayload.put("companyContactFirstName", "");
				bodyPayload.put("companyContactLastName", "");				
				bodyPayload.put("firstName", getCustName());
				bodyPayload.put("lastName", getCustSurname());
			}
			
			new Print("CLIENT_UPDATE_Body_Pay_Load: "+bodyPayload.toString());		
			sendPayLoad(connection, bodyPayload);
			int responseCode = connection.getResponseCode();
			new Print("ResponseCode: "+responseCode);
			
			if (responseCode == HttpURLConnection.HTTP_OK||responseCode == 201){
				new Print("CLIENT_DETAIL PATCH Successfull..........");
				try(BufferedReader reader = new BufferedReader( new InputStreamReader(connection.getInputStream()))){
					String line;
					while ((line = reader.readLine()) != null){
					}
				} 
			} else {
				new Print("Error: HTTP Response code - " + responseCode);      
				printDetailApiFailure(connection);
			}
			
			if(Integer.parseInt(getDebitPaymentDate())!=Integer.parseInt(getUpdateDebitOrderDate())){
				String getServiceIdSql="SELECT ucs.id SERV_ID FROM ucrm_client_service ucs WHERE ucs.client_id="+getUpdateClientId()+" ";
				connect=new ConnectToPostgresDatabase();
				ResultSet rs=connect.getStatement().executeQuery(getServiceIdSql);	
				ArrayList serviceIdArrayList=new ArrayList();
				while(rs.next()){
					serviceIdArrayList.add(rs.getString("SERV_ID"));
				}
				new Print("serviceIdArrayList SIZE: "+serviceIdArrayList.size());
				for(int i=0; i<serviceIdArrayList.size();i++) {
				} 
			}
			connection.disconnect();
		} catch(Exception e){
			new Print(e.toString());
			e.getStackTrace();
			e.printStackTrace();
			e.getMessage();
		}
	}
	
	private void moveNmsDeviceToNewSite(HttpURLConnection connection, String newSiteId) {
		new Print(new Object() {}.getClass().getEnclosingMethod().getName()+ ": 🚀 REASSIGN DEVICE to NEW SITE { "+newSiteId+" }");
		try {
			JSONObject bodyPayload = new JSONObject();
			bodyPayload.put("siteId", newSiteId);
			new Print("DEVICE_REASSIGN_Body_Pay_Load: "+bodyPayload.toString());
			sendPayLoad(connection, bodyPayload);
			int responseCode = connection.getResponseCode();
			new Print("ResponseCode: "+responseCode);
			
			if (responseCode == 200 || responseCode == 204) {
				new Print("✅ NMS: Hardware reassigned to new site " + newSiteId);
			} else if (responseCode == 422) {
				new Print("⚠️ Standard move blocked. Attempting forced reassignment...");
				printDetailApiFailure(connection);
			} else {
				printDetailApiFailure(connection);
			}
		} catch (Exception e) {
			new Print("NMS Move Error: " + e.getMessage());
		}
	}
	
	private void updateCustomerServiceOnUisp(int oldServiceId){
		new Print(new Object() {}.getClass().getEnclosingMethod().getName()+ ": 🚀 SERVICE UPDATE on UISP{ "+oldServiceId+" }");	
		try {
			String oldServiceInfo="SELECT ucs.client_id CLNT_ID, (SELECT service_plan_period_id SERV_PLAN_PER_ID FROM ucrm_service_plan WHERE service_plan_name=ucs.service_plan_name) SRV_PLAN_PERIOD_ID, ucs.unms_client_site_id CLNT_SITE_ID, ud.id DEV_ID FROM ucrm_client_service ucs\r\n"
					+"JOIN "
					+"unms_device ud ON ucs.unms_client_site_id =ud.site_id WHERE ucs.id="+oldServiceId+" ";
			new Print("OldServiceInfo: "+oldServiceInfo);
			ConnectToPostgresDatabase connect = new ConnectToPostgresDatabase();
			ResultSet rs = connect.getStatement().executeQuery(oldServiceInfo);
			int servicePlanPeriodId=0;
			String unmsClientSiteId="";
			int clientId=0;
			String deviceId="";
			if (rs.next()) {
				clientId = Integer.parseInt(rs.getString("CLNT_ID"));
				servicePlanPeriodId = Integer.parseInt(rs.getString("SRV_PLAN_PERIOD_ID"));
				unmsClientSiteId = rs.getString("CLNT_SITE_ID");
				deviceId = rs.getString("DEV_ID");
			}
			new Print("Old_Service_Id: "+oldServiceId+" Service_Plan_Period_Id: "+servicePlanPeriodId+" Unms_Client_Site_Id: "+unmsClientSiteId+" Device_Id:"+deviceId);
			endCustomerServiceOnUisp(new ConnectToUCRMRestAPI1("PATCH", "clients/services/"+oldServiceId).getConnection());	
			deleteCustomerServiceOnUisp(new ConnectToUCRMRestAPI1("DELETE", "clients/services/"+oldServiceId).getConnection());
			Thread.sleep(10000);
			JSONObject jsonReply=addClientServiceToUisp(new ConnectToUCRMRestAPI1("POST", "clients/"+clientId+"/services").getConnection(), servicePlanPeriodId, unmsClientSiteId);
			activateClientServiceToUisp(new ConnectToUCRMRestAPI1("PATCH", "clients/services/"+jsonReply.get("id").toString()).getConnection());
			Thread.sleep(5000);
		} catch (Exception e) {
			new Print("❌Critical Migration Error: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	private void endCustomerServiceOnUisp(HttpURLConnection connection){
		new Print(new Object() {}.getClass().getEnclosingMethod().getName()+ ": 🚀 END OLD SERVICE on UISP");		    
		try {
			int responseCode = connection.getResponseCode();
			new Print("ResponseCode: "+responseCode);
			if (responseCode == HttpURLConnection.HTTP_OK||responseCode == 201){
				new Print("🎯 SERVICE_END PATCH Successfull..........");
			} else {
				new Print("❌ Error: HTTP Response code - " + responseCode);     
				printDetailApiFailure(connection);
			}
		} catch(Exception e){
			new Print(e.toString());
			e.getStackTrace();
			e.printStackTrace();
			e.getMessage();
		}	
	}
	
	private void deleteCustomerServiceOnUisp(HttpURLConnection connection){
		new Print(new Object() {}.getClass().getEnclosingMethod().getName()+ ": 🚀 DDDELETE OLD SERVICE on UISP");		    
		try {
			int responseCode = connection.getResponseCode();
			new Print("ResponseCode: "+responseCode);
			if (responseCode == HttpURLConnection.HTTP_OK||responseCode == 201){
				new Print("🎯 SERVICE_DELETE PATCH Successfull..........");
			} else {
				new Print("❌ Error: HTTP Response code - " + responseCode);     
				printDetailApiFailure(connection);
			}
		} catch(Exception e){
			new Print(e.toString());
			e.getStackTrace();
			e.printStackTrace();
			e.getMessage();
		}	
	}
	
	private String getYesterdayDate() {
		return yesterdayDate;
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
	
	private JSONObject addClientServiceToUisp(HttpURLConnection connection, int servicePlanPeriodId, String unmsClientSiteId){
		new Print(new Object() {}.getClass().getEnclosingMethod().getName()+ ": 🚀 ADD NEW SERVICE on UISP{ "+servicePlanPeriodId+" }");	
		JSONObject data_obj=null;
		try {
			JSONObject bodyPayload = new JSONObject();		
			bodyPayload.put("servicePlanPeriodId", servicePlanPeriodId);
			bodyPayload.put("invoicingPeriodStartDay", Integer.parseInt(getDebitPaymentDate()));
			bodyPayload.put("invoicingStart", new DateTime(1).dateFormatChange("dd-MM-yyyy", "yyyy-MM-dd'T'HH:mm:ssXXX", getTodayDate()));
			bodyPayload.put("unmsClientSiteId", unmsClientSiteId); 
			
			new Print("Service_Body_Pay_Load: "+bodyPayload.toString());			
			sendPayLoad(connection, bodyPayload);
			int responseCode = connection.getResponseCode();
			new Print("ResponseCode: "+responseCode);
			if (responseCode == HttpURLConnection.HTTP_OK||responseCode == 201){
				new Print("🎯 CLIENT_SERVICE POST Successfull..........");
				JSONParser jasonParser = new JSONParser();
				data_obj= (JSONObject)jasonParser.parse(getResponse(connection).toString());
			} else {
				System.out.println("❌ Error: HTTP Response code - " + responseCode);
				printDetailApiFailure(connection);
			}
			connection.disconnect();          
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
		return data_obj;
	}
	
	private void activateClientServiceToUisp(HttpURLConnection connection){
		new Print(new Object() {}.getClass().getEnclosingMethod().getName()+ ": 🚀 ACTIVATE newly created SERVICE on UISP");	
		try {
			JSONObject activatePayload = new JSONObject();
			activatePayload.put("status", 1);
			new Print("Service_Activation_Pay_Load: "+activatePayload.toString());	
			sendPayLoad(connection, new JSONObject());
			int responseCode = connection.getResponseCode();
			new Print("ResponseCode: "+responseCode);
			
			if (responseCode == HttpURLConnection.HTTP_OK||responseCode == 201){
				new Print("🎯 SERVICE ACTIVATTION Successfull..........");
			} else {
				printDetailApiFailure(connection);
			}
		} catch (Exception e) {
			new Print("Linking Error: " + e.getMessage());
		}		
	}
	
	private void releaseSiteIdFromOldService(HttpURLConnection connection) {
		new Print(new Object() {}.getClass().getEnclosingMethod().getName()+ ": 🚀 RELEASE SITE FROM OLD SERVICE on UISP");	
		try {
			sendPayLoad(connection, new JSONObject());
			int responseCode = connection.getResponseCode();
			new Print("ResponseCode: "+responseCode);
			
			if (responseCode == HttpURLConnection.HTTP_OK||responseCode == 201){
				new Print("🎯 SITE RELEASED from SERVICE PATCH Successfull..........");
			} else {
				new Print("❌ Error: HTTP Response code - " + responseCode);   
				printDetailApiFailure(connection);
			}
		} catch (Exception e) {
			new Print("Linking Error: " + e.getMessage());
		}
	}
	
	private void printDetailApiFailure(HttpURLConnection connection) throws IOException{
		try {
			InputStream es = connection.getErrorStream();
			if (es != null) {
				BufferedReader reader = new BufferedReader(new InputStreamReader(es));
				String line;
				StringBuilder sb = new StringBuilder();
				while ((line = reader.readLine()) != null) { sb.append(line); }
				new Print("UISP Validation Detail: " + sb.toString());
			}
		} catch (Exception e) {
			new Print(e.getMessage());
		}
	}
	
	private void linkDeviceToNewService(HttpURLConnection connection, String unmsClientSiteId, int newServiceId) {
		new Print(new Object() {}.getClass().getEnclosingMethod().getName()+ ": 🚀 LINK DEVICE TO NEW SERVICE on UISP { "+newServiceId+" }"+" unms_Client_Site_Id: "+" { "+unmsClientSiteId+" }");	
		try {
			JSONObject bodyPayload = new JSONObject();
			bodyPayload.put("unmsClientSiteId", unmsClientSiteId);
			new Print("LINK_DEVICE_SERVICE_Body_Pay_Load: "+bodyPayload.toString());		
			sendPayLoad(connection, bodyPayload);
			int responseCode = connection.getResponseCode();
			new Print("ResponseCode: "+responseCode);
			
			if (responseCode == HttpURLConnection.HTTP_OK||responseCode == 201){
				new Print("🎯 DEVICE to SERVICE PATCH Successfull..........");
			} else {
				new Print("❌ Error: HTTP Response code - " + responseCode); 
				printDetailApiFailure(connection);
			}
		} catch (Exception e) {
			new Print("Linking Error: " + e.getMessage());
		}
	}

	private void sendPayLoad(HttpURLConnection connection, JSONObject bodyPayload){
		try {
			try(DataOutputStream os = new DataOutputStream(connection.getOutputStream())){
				os.writeBytes(bodyPayload.toString());
				os.flush();
			};
		} catch (Exception e) {
			new Print(e.toString());
			e.printStackTrace();
		}
	}
	
	public void addEditElectronicMandate(){
		final String MANDATE_ACTIVE="1";
		final String EMAIL_SEND_APPROVE_MANDATE="umanyuwa@gmail.com";
		final String PHONE_SEND_OTP="0729341206";
		final String IS_SA_ID="1";
		final String BANK_DETAIL_TYPE="1";
		final String DEBIT_FREQ="1";
		final String SEND_MANDATE="1";
		final String ADD_MASTER_FILE="1";	
		final String ALLOW_VARIABLE_AMOUNT="1";
		try {
			ArrayList mandateDateArrayList=new ArrayList();
			mandateDateArrayList.add("101:"+getCustReference()+"");					
			mandateDateArrayList.add("102:"+getCustSurname()+" "+getCustName()+"");	
			mandateDateArrayList.add("103:"+MANDATE_ACTIVE+"");						
			mandateDateArrayList.add("113:"+getCustSurname()+"");					
			mandateDateArrayList.add("114:"+getCustName()+"");						
			mandateDateArrayList.add("119:"+getCustTitle()+"");				
			 if(getUpdateCustTitle().equalsIgnoreCase("Company")
					 ||getUpdateCustTitle().equalsIgnoreCase("School")
					 ||getUpdateCustTitle().equalsIgnoreCase("Church")){
				 mandateDateArrayList.add("110:0");								
				 mandateDateArrayList.add("121:"+getCompanyName()+" ");			
				 mandateDateArrayList.add("122:"+getRegistrationNumber()+" ");	
				 mandateDateArrayList.add("123: "+getCompanyName()+"");			
			 } else {
				 mandateDateArrayList.add("110:1");								
				 mandateDateArrayList.add("119:"+getCustTitle()+"");			
				 mandateDateArrayList.add("121: ");								
				 mandateDateArrayList.add("122: ");								
				 mandateDateArrayList.add("123: ");								
			 }
			 
			mandateDateArrayList.add("126:"+getIdentityNum()+"");				
			mandateDateArrayList.add("127:"+IS_SA_ID+"");						
			mandateDateArrayList.add("131:"+BANK_DETAIL_TYPE+"");				
			mandateDateArrayList.add("132:"+getCustomerFullName()+"");			
			mandateDateArrayList.add("133:"+getBankAccTypeCode()+"");			
			mandateDateArrayList.add("134:"+getBankCode()+"");											
			mandateDateArrayList.add("136:"+getBankAccNumber()+"");								
			mandateDateArrayList.add("161:"+getUpdatePackageAmount()+"");		
			mandateDateArrayList.add("201:"+EMAIL_SEND_APPROVE_MANDATE+"");		
			mandateDateArrayList.add("202:"+PHONE_SEND_OTP+"");					
			mandateDateArrayList.add("281:"+getMasterFileGroupName()+"");		
			mandateDateArrayList.add("530:"+DEBIT_FREQ+"");						
			mandateDateArrayList.add("531:"+getCommencementMonth()+"");			
			mandateDateArrayList.add("532:"+getDebitPaymentDate()+"");			
			mandateDateArrayList.add("533:"+getDebitPaymentDate()+"");			
			mandateDateArrayList.add("534:"+getMandateAgreementDate()+"");		
			mandateDateArrayList.add("535:"+getCustReference()+"");				
			mandateDateArrayList.add("540:"+SEND_MANDATE+"");					
			mandateDateArrayList.add("542:"+ADD_MASTER_FILE+"");				
			//new AddEditElectronicMandate(mandateDateArrayList);
		} catch (Exception netcashEx) {
			new Print("Netcash upload failed:");
			new Print(netcashEx.getMessage());
			netcashEx.printStackTrace();
		}
	}
	
	private String getRegistrationNumber() {
		return "";
	}

	private String getMandateAgreementDate(){
		return getSoapDate(new DateTime().getCurrentDate(), "MM-dd-yyyy");
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
	
	public static String getSoapDate(String inputDateString, String inPutFormat){
		new Print("Input_Date_String: "+inputDateString);
		DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern(inPutFormat);
		LocalDate date = LocalDate.parse(inputDateString, inputFormatter);
		DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		String outputDateString = date.format(outputFormatter);        
		return outputDateString;
	}
	
	private void sendJsonError(HttpServletResponse response, String message, int statusCode) throws IOException {
		response.setStatus(statusCode);
		JSONObject error = new JSONObject();
		error.put("success", false);
		error.put("error", message);
		response.getWriter().print(error.toJSONString());
	}
	
	private String getUpdateReferenceNo(){
		return updateReferenceNo;
	}
	
	private String getUpdatePreviousISP(){
		return updatePreviousISP;
	}

	private String getUpdateDebitOrderDate(){
		return updateDebitOrderDate;
	}

	private String getUpdateAccountStatus(){
		return updateAccountStatus;
	}

	private String getUpdateCustEmail(){
		return updateCustEmail;
	}

	private String getUpdateReferedBy(){
		return updateReferedBy;
	}

	private String getUpdateService(){
		return updateService;
	}

	private String getUpdateDelivery(){
		return updateDelivery;
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

	private String getUpdateCustTitle(){
		return updateCustTitle;
	}
	
	private String getFromClass(){
		return fromClass;
	}

	private String getCashNoCoverageClient(){
		return cashNoCoverageClient;
	}
	
	private String getEmpSurname(){
		return empSurname;
	}

	private String getEmpName(){
		return empName;
	}

	private String getServerLink(){
		return serverLink;
	}

	private String getUserRight(){
		return userRight;
	}

	private String getPreviousISP(){
		return previousISP;
	}

	private int getVatNumber(){
		return 0000;
	}
	
	private String getCompanyName(){
		return companyName;
	}
	
	private String getTodayDate(){
		return todayDate;
	}

	private String getInternetService(){
		return internetService;
	}
	
	private String getNameSurname(){
		return nameSurname;
	}
	
	private String getMaxCustRef(){
		if(maxCustRef.length()==9){
			maxCustRef="0"+maxCustRef;
		}
		return maxCustRef;
	}

	private String isSendSmsSelected(){
		return isSendSmsSelected;
	}
	
	private String getReferedBy(){
		return referedBy;
	}

	private String getCustEmail(){
		return custEmail;
	}

	private String getDelivery(){
		return new CapitaliseFirstLetter().capitalizeFirstLetter(delivery);
	}
	
	private String getCustName(){
		new Print("custName: "+ custName);
		String [] cusName=custName.trim().split(" ");
		new Print("custName LENGTH: "+ custName.length());
		if(cusName.length==2){
			new Print("Length 2 Running....");
			custName=new CapitaliseFirstLetter().capitalizeFirstLetter(cusName[0].trim())+" "+new CapitaliseFirstLetter().capitalizeFirstLetter(cusName[1].trim());
		} else {
			new Print("Length NOT 2 Running....");
			custName=new CapitaliseFirstLetter().capitalizeFirstLetter(custName);
		}			
		new Print("CustName to RETURN: "+ custName);
		return custName;
	}

	private String getCustSurname(){
		return new CapitaliseFirstLetter().capitalizeFirstLetter(custSurname);
	}

	private String getCustTitle(){
		return new CapitaliseFirstLetter().capitalizeFirstLetter(custTitle);
	}

	private String getCustReference(){
		return custReference;
	}
}