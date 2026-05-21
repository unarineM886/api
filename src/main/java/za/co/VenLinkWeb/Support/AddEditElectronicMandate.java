package za.co.VenLinkWeb.Support;

import java.util.ArrayList;
import za.co.WebServices.INIWSNIF;
import za.co.WebServices.clients.INIWSNIF_BasicHttpBindingINIWSNIF_Client;


public class AddEditElectronicMandate {	
	final String DEBIT_ORDER_SERVICE_KEY="d0a5c3ef-98ef-4f9a-b8d7-c6503721a8ff";
	final String VENDOR_KEY="24ade73c-98cf-47b3-99be-cc7b867b3080";		
	final String SEND_MANDATE="1";
	final String ADD_MASTER_FILE="1";
	final String EMAIL_SEND_APPROVE_MANDATE="umanyuwa@gmail.com";
	final String PHONE_SEND_OTP="0729341206";	
	final String ALLOW_VARIABLE_AMOUNT="1";
	
	private String accountReference;
	private String customerFullName;
	private String customerName;
	private String customerSurname;
	private String isMandateActive;
	private String isConsumer;
	private String bankName;
	private String bankAccountNum;
	private String defaultMandateAmount;
	private String identityNum;
	private String isSAIdNum;
	private String debitPaymentDate;
	private String tradingName;
	private String registrationNumber;
	private String registereredName;
	private String customerTitle;
	private String masterFileGroupName;
	private String bankCode;
	private String mandateAgreementDate;
	private String bankDetailType;
	private String bankAccountType;
	private String debitFrequency;
	private String debitCommencementMonth;
	
	public AddEditElectronicMandate (ArrayList mandateDateArrayList){		
		// This block runs only if the customer chose Debit Order
		new Print("Customer chose DEBIT_ORDER as payment_method");
		//new Print("Serivce_Plan: " +getServicePlan());					
		for(int i=0; i<mandateDateArrayList.size();i++){
			//new Print("["+i+"]: "+mandateDateArrayList.get(i));
			String[] keyTrantactionSplit=mandateDateArrayList.get(i).toString().split(":");
			String key=keyTrantactionSplit[0];
			String transaction=keyTrantactionSplit[1];
			//new Print("Key: "+key+"\tTransaction: "+transaction);
			if(key.equalsIgnoreCase("101")){
				this.accountReference=transaction;
				//new Print("Reference_Number: " +getAccountReference());
					
			} else if(key.equalsIgnoreCase("102")){
				this.customerFullName=transaction;
				//new Print("Full_Name: " +getCustomerFullName());
				
			} else if(key.equalsIgnoreCase("103")){
				this.isMandateActive=transaction;
				//new Print("IS_MANDATE_ACTIVE: " +isMandateActive());
				
			} else if(key.equalsIgnoreCase("110")){
				this.isConsumer=transaction;
				//new Print("isConsumer: " +isConsumer);
				
			} else if(key.equalsIgnoreCase("113")){
				this.customerSurname=transaction;
				//new Print("Customer_Surname: " +getCustomerSurname());
					
			} else if(key.equalsIgnoreCase("114")){
				this.customerName=transaction;
				//new Print("Customer_Name: " +getCustomerName());
			
			} else if(key.equalsIgnoreCase("119")){
				this.customerTitle=transaction;
				//new Print("Consumer_Title: " +getCustomerTitle());
				
			} else if(key.equalsIgnoreCase("121")){
				this.tradingName=transaction;
				//new Print("Trading_Name: " +getTradingName());
				
			} else if(key.equalsIgnoreCase("122")){
				this.registrationNumber=transaction;
				//new Print("Registered_Number: " +getRegistrationNumber());
				
			} else if(key.equalsIgnoreCase("123")){
				this.registereredName=transaction;
				new Print("Registered_Name: " +getRegistereredName());
				
			} else if(key.equalsIgnoreCase("126")){
				this.identityNum=transaction;
				//new Print("Id_Number: " +getIdentityNum());
				//new Print("Bank_Name: "+getBankName());
				
			} else if(key.equalsIgnoreCase("127")){
				this.isSAIdNum=transaction;
			
			} else if(key.equalsIgnoreCase("131")){
				this.bankDetailType=transaction;
				
			} else if(key.equalsIgnoreCase("132")){
				//this.bankAccountType=transaction;
				
			} else if(key.equalsIgnoreCase("133")){
				this.bankAccountType=transaction;
				//new Print("Bank_Account_Type: "+getBankAccountType());
				
			} else if(key.equalsIgnoreCase("134")){
				this.bankCode=transaction;
				new Print("Bank_Code: " +getBankCode());
				
			} else if(key.equalsIgnoreCase("136")){
				this.bankAccountNum=transaction;
				//new Print("Account_Number: " +getBankAccountNum());
					
			} else if(key.equalsIgnoreCase("161")){
				this.defaultMandateAmount=transaction+".00";
				//new Print("Default_Mandate_Amount: " +getDefaultMandateAmount());
				
			} else if(key.equalsIgnoreCase("201")){
				//this.sendApproveMandateEmail=transaction;
				
			} else if(key.equalsIgnoreCase("202")){
				//this.sendOtpMobileNum=transaction;
				
			} else if(key.equalsIgnoreCase("281")){
				this.masterFileGroupName=transaction;
				//new Print("Master_File_Group: " +getMasterFileGroupName());
				
			} else if(key.equalsIgnoreCase("530")){
				this.debitFrequency=transaction;
				
			} else if(key.equalsIgnoreCase("531")){
				this.debitCommencementMonth=transaction;
				
			} else if(key.equalsIgnoreCase("532")){
				this.debitPaymentDate=transaction;
				//new Print("Debit_Date: " +getDebitPaymentDate());
				
			} /*else if(key.equalsIgnoreCase("533")){
				//this.debitPaymentDate=transaction;
				
			}*/ else if(key.equalsIgnoreCase("534")){
				this.mandateAgreementDate=transaction;
				//new Print("Mandate_Agreement_Date: " +getMandateAgreementDate());
				
			}/* else if(key.equalsIgnoreCase("535")){
				//this.accountReference=transaction;
				
			}*/ else if(key.equalsIgnoreCase("540")){
				//this.sendMandate=transaction;
				
			} else if(key.equalsIgnoreCase("542")){
				//this.addToMasterFile=transaction;
			}
		}
		addEditElectronicMandate();
	}
	
	private String isMandateActive() {
		return isMandateActive;
	}

	public void addEditElectronicMandate(){
		new Print("EMAIL_SEND_APPROVE_MANDATE: "+EMAIL_SEND_APPROVE_MANDATE+" PHONE_SEND_OTP: "+PHONE_SEND_OTP);		
		INIWSNIF port=new INIWSNIF_BasicHttpBindingINIWSNIF_Client().getPort();
		try {
			// Build mandate_data using actual customer values
			StringBuilder file = new StringBuilder();
			// Header record (H)
			file.append("H\t")
            .append(DEBIT_ORDER_SERVICE_KEY).append("\t") 			// Service Key
            .append("1\t")                                			// Version
            .append("Mandates\t")                        			// Instruction
            .append("E-MandateBatch\t")               				// Batch name
            .append(getMandateAgreementDate()).append("\t") 		// Action date (CCYYMMDD)
            .append(VENDOR_KEY).append("\n");             			// Vendor key

			// Key record (K): mandatory fields for updating mandate
			// Add banking fields to Key record
			//file.append("K\t101\t102\t103\t113\t114\t110\t119\t121\t122\t123\t126\t127\t131\t132\t133\t134\t136\t161\t201\t202\t281\t530\t531\t532\t533\t534\t535\t537\t540\t542\n");
			file.append("K\t101\t102\t103\t113\t114\t110\t121\t122\t123\t126\t127\t131\t132\t133\t134\t136\t161\t201\t202\t281\t530\t531\t532\t533\t534\t535\t537\t540\t542\n");
			// Then in Transaction record (example)
			file.append("T\t")
            .append(getAccountReference()).append("\t")        		// 101 	Reference Number
            .append(getCustomerFullName()).append("\t")  			// 102  Mandate Name
            .append(isMandateActive()).append("\t")      			// 103  Mandate ACTIVE(1)/INACTIVE(0)
            .append(getCustomerName()).append("\t")      			// 113  First Name
            .append(getCustomerSurname()).append("\t");   			// 114  Surname
			
            if(getCustomerTitle().equalsIgnoreCase("Company")
            	||getCustomerTitle().equalsIgnoreCase("School")
            	||getCustomerTitle().equalsIgnoreCase("Church")){
				file.append("0").append("\t")						// 110  is company
				
				.append(getTradingName()).append("\t")   			// 121  Trading Name
	            .append(getRegistrationNumber()).append("\t")		// 122  Co* Registration Number
	            .append(getRegistereredName()).append("\t");		// 123	Co* Registration Name

			} else {
				file.append("1").append("\t")						// 110  is consumer
				//.append(getCustomerTitle()).append("\t")			// 119  Customer Title	
				.append("").append("\t")   		          			// 121  Trading Name
	            .append("").append("\t")                  			// 122  Co* Registration Number
	            .append("").append("\t");                  			// 123	Co* Registration Name
			}
            
            file.append(getIdentityNum()).append("\t")	   			// 126	Bank Verification Number
            .append(isSAIdNum()).append("\t")     					// 127 	is SA Id Number(0:foreign, 1:SA)            
            .append(getBankDetailType()).append("\t")     			// 131 	Bank Detail Type(1:bank Account, 2:CREDT CARD)
            .append(getCustomerFullName()).append("\t") 			// 132  Bank Account Name
            .append(getBankAccountType()).append("\t")              // 133  Bank Account Type (BDT:1(SEVINGS, CURRENT), BDT:2(VISA, MASTER CARD)
            .append(getBankCode()).append("\t")             		// 134  Bank Branch Code
            .append(getBankAccountNum()).append("\t")       		// 136  Bank Account Number
            
            .append(getDefaultMandateAmount()).append("\t")    		// 161 	Amount
            .append(EMAIL_SEND_APPROVE_MANDATE).append("\t")		// 201 	Email /*getSendApproveMandateEmail()*/
            .append(PHONE_SEND_OTP).append("\t")         			// 202  Mobile Number	/*getSendOtpMobileNum()*/
            .append(getMasterFileGroupName()).append("\t")  		// 281  Master File Group
            .append(getDebitFrequency()).append("\t")               // 530  Frequency
            .append(getDebitCommencementMonth()).append("\t")      	// 531  Debit Month
            .append(getDebitPaymentDate()).append("\t")     		// 532  Debit Day
            .append(getDebitPaymentDate()).append("\t")     		// 533 	December Debit
            .append(getMandateAgreementDate()).append("\t") 		// 534 	Agreement Date Send Mandate
            .append(getAccountReference()).append("\t")      		// 535 	Agreement Reference Number
            .append(getAccountReference()).append("\t")      		// 535 	Agreement Reference Number
            .append(ALLOW_VARIABLE_AMOUNT).append("\t")      		// 537 	Allow Variable Amount
            .append(SEND_MANDATE).append("\t")                  	// 540 	Send Mandate
            .append(ADD_MASTER_FILE).append("\n");                	// 542 	Add to Master File           
            // final String ="1";
            // Footer record (F)
            file.append("F\t1\t0\t9999\n"); 						// 1 transaction, sum=0, EOF indicator
            // Final mandate_data string
            String mandate_data = file.toString();
            //new Print("DATA_TO_SEND:\n"+mandate_data);
            try{
            	new Print("Uploading mandate_data to Netcash...");
            	String fileToken = port.batchFileUpload(DEBIT_ORDER_SERVICE_KEY, mandate_data);
            	new Print("SUCCESS: File uploaded");
            	//new Print("File Token: " + fileToken);
            	String debit_mandate_upload_report = "";
            	for (int i = 0; i < 10; i++){
            		Thread.sleep(5000);
            		debit_mandate_upload_report = port.requestFileUploadReport(DEBIT_ORDER_SERVICE_KEY, fileToken);
            		if (!"File not ready".equalsIgnoreCase(debit_mandate_upload_report)){
            			break;
            		}
            		new Print("Waiting for report...");
            	}
            	new Print("Final Netcash Report:");
            	//###BEGIN	E-MANDATEBATCH	SUCCESSFUL	23:07	R0.00	20260221
            	new Print(debit_mandate_upload_report);
            	String[] reportSplit=debit_mandate_upload_report.split("\t");
            	if(reportSplit[2].equals("SUCCESSFUL")){
            		new Print("MANDATE ADDED SUCCESSFULLY...");	
            		//new ProcessNetcashDebitOrderMandate();
            		
            	} else {
            		new Print("MANDATE ADDING NOT SUCCESSFULLY...");	
            	}            	

            } catch (Exception netcashEx) {
            	new Print("Netcash upload failed:");
            	new Print(netcashEx.getMessage());
            	netcashEx.printStackTrace();
            }

		} catch (Exception netcashEx) {
	        new Print("Netcash upload failed:");
	        new Print(netcashEx.getMessage());
	        netcashEx.printStackTrace();
	    }
	}
	
	public static void main(String[] args){
		ArrayList mandateDateArrayList=new ArrayList();
		mandateDateArrayList.add("101:0847775021");					//101	Account/Mandate reference
		mandateDateArrayList.add("102:Manyuwa Khathu Duncan");		//102	Account/Mandate name
		mandateDateArrayList.add("103:1");							//103	Mandate active
		mandateDateArrayList.add("110:1");							//110	Consumer/Commercial(N1){0=Company, 1=Individual}
		mandateDateArrayList.add("113:Khathu Duncan");				//113	Surname
		mandateDateArrayList.add("114:Manyuwa");					//114	First name
																	//117	Date of Birth (N8){CCYYMMDD}
		mandateDateArrayList.add("119:Mr");							//119	Title(N1) {1=Mr,2=Mrs,3=Ms,4=Miss,5=Dr,6=Prof}
		mandateDateArrayList.add("121: ");							//121	Co* Trading name
		mandateDateArrayList.add("122: ");							//122	Co* Registration number
		mandateDateArrayList.add("123: ");							//123	Co* Registered name
		mandateDateArrayList.add("126:7707035645087");				//126	Bank account verification number (ID#/Co* reg* #)
		mandateDateArrayList.add("127:1");							//127	Is SA ID number{ndicates whether 126 is SA_Id_Number.(0=Not_SA_ID#, 1=SA_Id#)}
		mandateDateArrayList.add("131:1");							//131#	Banking Detail Type{1= Bank account, 2=Credit card}
		mandateDateArrayList.add("132:Manyuwa Khathu Duncan");      //132#	Bank account name/Name on Credit card	
		mandateDateArrayList.add("133:1");							//133#	Bank account type/Credit card type{If(Bank acc){1=Current,2=Savings}else If(Credit card){1=MasterCard, 2=Visa}	
		mandateDateArrayList.add("134:051001");						//134#	Branch code/Expiry month	
																	//135#	Filler/Expiry year
		mandateDateArrayList.add("136:002461544");					//136#	Bank Account number/Credit card token							
		mandateDateArrayList.add("161:10");							//161	Default mandate amount	
		mandateDateArrayList.add("201:dmanyuwa@gmail.com");			//201	Email address	
		mandateDateArrayList.add("202:0832661815");					//202	Mobile number{Of person signing the mandate} (N10) eg. 0832661815	
																	//241	Include DebiCheck authentication	
		mandateDateArrayList.add("281:1st");						//281	Debit Masterfile group
																	/*242	DebiCheck mandate template Identifier	
																	243		DebiCheck collection amount	
																	246		DebiCheck first collection differs	
																	247		DebiCheck first collection amount	
																	248		DebiCheck first collection date	
																	250		Collection frequency day code*/		
		//mandateDateArrayList.add("341:27159730012");				//341	Phone number{Of person signing the mandate} (N11) .g 27159730012
		mandateDateArrayList.add("530:1");							//530	Debit Frequency	
		mandateDateArrayList.add("531:03");							//531	Commencement month{01 – 12 (MM)}
		mandateDateArrayList.add("532:1");							//532	Commencement day (debit day options)	
		mandateDateArrayList.add("533:1");							//533	December debit day	
		mandateDateArrayList.add("534:20260221");					//534	Agreement date	
		mandateDateArrayList.add("535:0832661815");					//535	Agreement reference number	
																	/*536	Cancellation notice period	
																	537		Allow variable debit amounts	
																	538		Request AVS	
																	539		Additional clauses	*/
		mandateDateArrayList.add("540:1");							//540	Send mandate	
																	//541	Debit day on a public holiday	
		mandateDateArrayList.add("542:1");							//542	Add to Masterfile		
		new AddEditElectronicMandate(mandateDateArrayList);
	}
	
	private String getDebitCommencementMonth(){
		return debitCommencementMonth;
	}

	private String getDebitFrequency(){
		return debitFrequency;
	}

	private String isSAIdNum(){
		return isSAIdNum;
	}

	private Object getBankDetailType(){
		return bankDetailType;
	}

	private String getMandateAgreementDate(){
		return mandateAgreementDate;
	}

	private String getBankCode(){
		return bankCode;
	}

	private String getMasterFileGroupName(){
		return masterFileGroupName;
	}

	private String getCustomerTitle(){
		return customerTitle;
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

	private String getDebitPaymentDate(){
		return debitPaymentDate;
	}

	private String getDefaultMandateAmount(){
		return defaultMandateAmount;
	}

	private String getIdentityNum(){
		return identityNum;
	}

	private String getBankAccountNum(){
		return bankAccountNum;
	}

	private String getBankAccountType(){
		return bankAccountType;
	}

	private String getBankName(){
		return bankName;
	}

	private String getCustomerSurname(){
		return customerSurname;
	}

	private String getCustomerName(){
		return customerName;
	}

	private String getCustomerFullName(){
		return customerFullName;
	}

	private String getAccountReference(){
		return accountReference;
	}
}