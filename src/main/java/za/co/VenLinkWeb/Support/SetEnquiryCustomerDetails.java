package za.co.VenLinkWeb.Support;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SetEnquiryCustomerDetails {
	private String enquiryCustCell;
	private String enquiryCustTitle;
	private String enquiryCustSurname;
	private String enquiryNoCoverageCust;
	
	public SetEnquiryCustomerDetails(String checkRefOnEnquirySQL) {
		setEnquiryCustomerDetails(checkRefOnEnquirySQL);		
	}
	
	private void setEnquiryCustomerDetails(String checkRefOnEnquirySQL) {
		//Get Customer details and Send SMS to the customer
		try {
			ConnectToPostgresDatabase connect=new ConnectToPostgresDatabase();
		  ResultSet rs;		
		  rs = connect.getStatement().executeQuery(checkRefOnEnquirySQL);	
	  	 	
	       while(rs.next()){
			 enquiryCustCell= rs.getString("cust_ref");
			 new Print("EnquiryCustCell: "+getEnquiryCustCell());
	    	 enquiryCustTitle=rs.getString("cust_title");
	    	 new Print("EnquiryCustTitle: "+getEnquiryCustTitle());
	    	 enquiryCustSurname=rs.getString("cust_surname");
	    	 new Print("EnquiryCustSurname: "+getEnquiryCustSurname());
	    	 enquiryNoCoverageCust=rs.getString("no_deposit_cust");
	    	 new Print("EnquiryNoCoverageCust: "+getEnquiryNoCoverageCust());
		  }
	       
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public String getEnquiryCustCell(){
		return enquiryCustCell;
	}
	
	public String getEnquiryCustTitle(){
		return enquiryCustTitle;
	}
	
	public String getEnquiryCustSurname(){
		return enquiryCustSurname;
	}
	
	public String getEnquiryNoCoverageCust(){
		return enquiryNoCoverageCust;
	}	
}