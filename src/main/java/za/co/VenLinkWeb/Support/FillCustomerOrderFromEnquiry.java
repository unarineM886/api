package za.co.VenLinkWeb.Support;

public class FillCustomerOrderFromEnquiry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	private boolean isUpdateCustOrderSuccessfull=false;
	private boolean isAddCustomerFromEnquirySuccesfull=false;
	private String enquiryCustTitle;
	private String enquiryCustSurname;
	
	public FillCustomerOrderFromEnquiry(String newReference, String custTitle, String custSurname, String noDepositCust) {
	  new Print("Filling CUST_ORDER From ENQUIRY Table.....");
		fillCustomerOrderFromEnquiry(newReference, custTitle, custSurname, noDepositCust);
		
	}	
	
	public void fillCustomerOrderFromEnquiry(String newReference, String custTitle, String custSurname, String noDepositCust){
		try{
		  
		  new Print("Filling "+newReference+" from ENQUIRY table....");
		  //Get Data rows from the sent Data	 
		  String payDateSQL=null;	
		  //Update the CUST_ORDER TABLE
		  String custOrderTable="CUST_ORDER";
		  if("YES".equalsIgnoreCase(noDepositCust)){
		    payDateSQL="SELECT TO_CHAR(enquiry_date,'DD-MON-YYYY') FROM enquiry WHERE cust_ref='"+newReference+"'";
		  
		  } else{
			 payDateSQL="SELECT MAX(TO_CHAR(pay_date,'DD-MON-YYYY')) FROM in_payment WHERE cust_ref='"+newReference+"'";
		  }
			      
		  //Update the CUST_ORDER TABLE 
          String custOrderColumns="cust_title, cust_surname, cust_name, cust_ref, phone_number, order_date, delivery, cust_email, order_status, service, filled_by, filled_through, refered_by, order_number";
          String custOrderValues="SELECT cust_title, cust_surname, cust_name, cust_ref, cust_ref, ("+payDateSQL+"), delivery, cust_email, 'Scheduled',  service, 'ENQUIRY', 'ENQUIRY', refered_by, order_number.NEXTVAL FROM enquiry WHERE cust_ref ='"+newReference+"' AND secured IS NULL";
                  
          String insertCustOrderSQL="INSERT INTO "+custOrderTable+" ("+custOrderColumns+") "+custOrderValues+" ";
          String updateInPaymentRefSQL="UPDATE in_payment SET new_cust='NO' WHERE cust_ref='"+newReference+"' ";	
          InsertUpdateDeleteData insertData=null ;
  		  
          String[] oracleSQL= {insertCustOrderSQL, updateInPaymentRefSQL};
          for(int i=0; i<oracleSQL.length; i++){
        	  insertData =new InsertUpdateDeleteData(oracleSQL[i]/*insertCustOrderSQL*/);
          }
        	      
		  if(insertData.isInsertSuccesfull()){
			isUpdateCustOrderSuccessfull=true;
			isAddCustomerFromEnquirySuccesfull=true;
			          
			//Update the IN_PAYMENT TABLE by setting NEW_CUST=NO
			String inPaymentTable="IN_PAYMENT";
			String inPaymentColumns="CUST_REF";
			String updateInPaymentSQL="UPDATE "+inPaymentTable+" SET NEW_CUST='NO' WHERE "+inPaymentColumns+"='"+newReference+"'";
					         
			//Set "secured" column to "YES" on the "ENQUIRY" Table
			String updateEnquiryTableSQL="UPDATE enquiry SET secured='YES' WHERE cust_ref ='"+newReference+"' ";
			String[] SQL={updateInPaymentSQL, updateEnquiryTableSQL};
				  	 
			for(int i=0; i<SQL.length;i++){
			  insertData =new InsertUpdateDeleteData(SQL[i]);
			}		
		    
			String textTo="27"+newReference.substring(1);
		    String textMessage="Dear "+custTitle+" "+custSurname+"; Your order for BOREHOLE drilling has been scheduled. We will be in touch w.r.t drilling date. Regards; KDM Drilling 072 776 6163";
		    //ClickatellSMS clickatellSMS=new ClickatellSMS(textMessage,textTo);
		            
		 } else {
		  	  isUpdateCustOrderSuccessfull=false;
		      isAddCustomerFromEnquirySuccesfull=false;
		 }
				
	  /*} else{
					
	    }*/
			
	  } catch(Exception e){
		new Print(e.toString());
		e.getStackTrace();
		e.printStackTrace();
		e.getMessage();				   
	  }
	}

	protected String getEnquiryCustSurname() {
		return enquiryCustSurname;
	}

	protected String getEnquiryCustTitle() {
		return enquiryCustTitle;
	}
	
	protected boolean isUpdateCustOrderSuccessfull(){
		return isUpdateCustOrderSuccessfull;
	}
	
	public boolean isAddCustomerFromEnquirySuccesfull(){
		return  isAddCustomerFromEnquirySuccesfull;
	}
}