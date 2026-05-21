package za.co.VenLinkWeb.Support;

import java.sql.ResultSet;

public class UpdateEnquiryTable {
	private boolean isCustomerAlreadyInEnquiryTable;
	private boolean isUpdateEquiryTableSuccessfull;
	private String custCell;
	private String referedBy;
	private String nameSurname;
	private String delivery;
	private String todayDate;
	private String custEmail;
	private String custName;
	private String custSurname;
	private String custTitle;
	private String internetService;
	private String noDepositCust;
	private int quotationNumber; 
	
	public UpdateEnquiryTable(String custCell, String referedBy, String nameSurname, String  delivery, String  todayDate, String custEmail, String custName, String custSurname, String custTitle, String internetService, String noDepositCust){
		this.custCell=custCell;
		this.referedBy=referedBy;
		this.nameSurname=nameSurname;
		this.delivery=delivery;
		this.todayDate=todayDate;
		this.custEmail=custEmail; 
		this.custName=custName;
		this.custSurname=custSurname;
		this.custTitle=custTitle;
		this.internetService=internetService;
		this.noDepositCust=noDepositCust;
		if("YES".equalsIgnoreCase(getNoDepositCust())){
			addNoDepositClient();
		
		} else{
			updateInsertEnquiryTable();
		}
	}

    public void updateInsertEnquiryTable(){
	  try{					
	     //Check if the customer already exixt in the ENQUIRY table
	     String checkCustomerSQL="SELECT cust_ref CHECK_REF FROM enquiry WHERE cust_ref='"+getCustCell()+"' ";
	      
	  if(new DoesRecordAlreadyExist(checkCustomerSQL).doesRecordAlreadyExist()){
		//Update the Customer into ENQUIRY Table...
		String table="enquiry";
  	    String udateEnquirySql="UPDATE "+table+" SET service='"+getInternetService()+"', cust_title='"+getCustTitle()+"', cust_surname='"+getCustSurname()+"', cust_name='"+getCustName()+"', cust_ref='"+getCustCell()+"', cust_email='"+getCustEmail()+"', delivery='"+getDelivery()+"', channel='WEB_APP', filled_by='"+getNameSurname()+"', refered_by=(SELECT value FROM venlink_system WHERE sys_name='REFERAL' and value LIKE '%"+getReferedBy()+"%') WHERE cust_ref='"+getCustCell()+"' ";
  	    InsertUpdateDeleteData insertData=new InsertUpdateDeleteData(udateEnquirySql);
  	     
  	    if(insertData.isUpdateSuccesfull()){
  	      isUpdateEquiryTableSuccessfull=true;
  	    }
  	    
	  } else {
	      //Insert the Customer into ENQUIRY Table...
	      String table="enquiry";	
	      String columns="service, cust_title, cust_surname, cust_name, cust_ref, cust_email, order_date, address, channel, filled_by, refered_by, no_deposit_cust, quotation_num";
          String oracleValues= "'"+getInternetService()+"', '"+getCustTitle()+"', '"+getCustSurname()+"', '"+getCustName()+"', '"+getCustCell()+"', '"+getCustEmail()+"', TO_DATE('"+getTodayDate()+"', 'DD-MM-YYYY'), '"+getDelivery()+"', 'WEB_APP', '"+getNameSurname()+"', (SELECT value FROM venlink_system WHERE sys_name='REFERAL' and value LIKE '%"+getReferedBy()+"%'), '"+getNoDepositCust()+"', quotation_num.NEXTVAL ";
                    
          String insertEnquirySql="INSERT INTO "+ table+"("+columns+") VALUES("+oracleValues+")";
          InsertUpdateDeleteData insertData=new InsertUpdateDeleteData(insertEnquirySql);
          
          if(insertData.isInsertSuccesfull()){
        	  isUpdateEquiryTableSuccessfull=true;
	  	  }
      }
	  
	  //Get the Quotation Number
	  ConnectToPostgresDatabase connect=new ConnectToPostgresDatabase();
      String quoteNumberSQL="SELECT quotation_num QUOTE_NUM FROM enquiry WHERE cust_ref='"+getCustCell()+"' AND cust_surname='"+getCustSurname()+"' AND cust_name='"+getCustName()+"' ";
      ResultSet rs=connect.getStatement().executeQuery(quoteNumberSQL);
	
      while(rs.next()){
    	quotationNumber= Integer.parseInt(rs.getString("QUOTE_NUM"));
    	new Print("QuotationNumber: "+getQuotationNumber());
	  }
	
	} catch (Exception e){
		e.printStackTrace();
	}
  }
    
    public void addNoDepositClient(){
  	  	try{  	   
  	  		//Insert the Customer into ENQUIRY Table...
  	  		String table="enquiry";	
  	  		String columns="service, cust_title, cust_surname, cust_name, cust_ref, cust_email, order_date, address, channel, filled_by, refered_by, no_deposit_cust";
            String oracleValues= "'"+getInternetService()+"', '"+getCustTitle()+"', '"+getCustSurname()+"', '"+getCustName()+"', '"+getCustCell()+"', '"+getCustEmail()+"', TO_DATE('"+getTodayDate()+"', 'DD-MM-YYYY'), '"+getDelivery()+"', 'WEB_APP', '"+getNameSurname()+"', (SELECT value FROM venlink_system WHERE sys_name='REFERAL' and value LIKE '%"+getReferedBy()+"%'), '"+getNoDepositCust()+"' ";
                      
            String insertEnquirySql="INSERT INTO "+ table+"("+columns+") VALUES("+oracleValues+")";
            InsertUpdateDeleteData insertData=new InsertUpdateDeleteData(insertEnquirySql);
            
            if(insertData.isInsertSuccesfull()){
          	  isUpdateEquiryTableSuccessfull=true;
  	  	  	}	 
  	
  	  	} catch (Exception e){
  	  		e.printStackTrace();
  	  	}
    }

  protected int getQuotationNumber() {
	return quotationNumber;
  }

  protected String getNoDepositCust() {
	return noDepositCust;
  }

  protected String getReferedBy(){
	 return referedBy;
  }

  protected String getNameSurname(){
	 return nameSurname;
  }

  protected String getDelivery(){
	 return delivery;
  }

  protected String getTodayDate(){
	 return todayDate;
  }

  protected String getCustEmail(){
	 return custEmail;
  }

  protected String getCustCell(){
	 return custCell;
  }

  protected String getCustName(){
	 return custName;
  }

  protected String getCustSurname(){
	 return custSurname;
  }

  protected String getCustTitle(){
	 return custTitle;
  }

  protected String getInternetService(){
     return internetService;
  }

  protected boolean isCustomerAlreadyInEnquiryTable(){
     return isCustomerAlreadyInEnquiryTable;
  }
  
  public boolean isUpdateEquiryTableSuccessfull(){
		return isUpdateEquiryTableSuccessfull;
  }
}