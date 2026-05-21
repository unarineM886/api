package za.co.VenLinkWeb.Support;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import za.co.VenLinkWeb.Support.ConnectToPostgresDatabase;
import za.co.VenLinkWeb.Support.DateTime;
import za.co.VenLinkWeb.Support.Print;

public class MethodTest {
	
	public MethodTest() {
		//setInsertMonthlySubscriptionCustomerInvoiceRowSQL();
		monthBetween() ;
	}
	
	public void monthBetween() {
		ConnectToPostgresDatabase connect=new ConnectToPostgresDatabase();
		try {
		//get Install_Date and getDebitPaymentDate())
		int debitPayDate=15;
		new Print("DebitPayDate: "+debitPayDate);
		
		String today=new DateTime().getCurrentDate();
		new Print("Today's Date: "+today);
		
		String[] dayMonthYear=today.split("-");
		String invoiceEndDay=dayMonthYear[1];
		String invoiceEndMonth=dayMonthYear[0];
		String invoiceEndYear=dayMonthYear[2];
		new Print("Day: "+invoiceEndDay+" Month: "+invoiceEndMonth+" Year: "+invoiceEndYear);
		
		String invoiceEndDate=null;
		if(debitPayDate==1){
			invoiceEndDate=invoiceEndMonth+"-"+debitPayDate+"-"+invoiceEndYear;
	    	new Print("Nga dzi 1: "+invoiceEndDate);
	    	invoiceEndDate=new DateTime(0).addSubtractMonth(invoiceEndDate, -1);
	    	new Print("This Month ooo: "+invoiceEndDate);
	    	
		} else {
		    if(Integer.parseInt(invoiceEndDay)> debitPayDate){
		    	invoiceEndDate=invoiceEndMonth+"-"+debitPayDate+"-"+invoiceEndYear;
		    	new Print("This Month: "+invoiceEndDate);
			
		    } else{
		    	//invoiceStartDate=addSubtractMonth(debitPayDate+"-"+(Integer.parseInt(month)-1)+"-"+year),-1);
		    	invoiceEndDate=invoiceEndMonth+"-"+debitPayDate+"-"+invoiceEndYear;
		    	new Print("-----: "+invoiceEndDate);				
		    	invoiceEndDate=new DateTime(0).addSubtractMonth(invoiceEndDate, -1);
		    	new Print("Last Month: "+invoiceEndDate);
		    }
		}
		new Print("InvoiceEndDateToUse: "+invoiceEndDate+"\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			
		String installCompDate="06-24-2023";
		new Print("InstallCompDate: "+installCompDate);
		String[] dayMonthYear1=installCompDate.split("-");
		String invoiceStartDay=dayMonthYear1[1];
		String invoiceStartMonth=dayMonthYear1[0];
		String invoiceStartYear=dayMonthYear1[2];
		new Print("invoiceStartDay: "+invoiceStartDay+" invoiceStartMonth: "+invoiceStartMonth+" invoiceStartYear: "+invoiceStartYear);
		
		String invoiceStartDate=null;
		if(Integer.parseInt(invoiceStartDay)> debitPayDate){
			//invoiceStartDate=addSubtractMonth(debitPayDate+"-"+(Integer.parseInt(month)-1)+"-"+year),-1);
			invoiceStartDate=invoiceStartMonth+"-"+debitPayDate+"-"+invoiceStartYear;
			new Print("-----: "+invoiceStartDate);				
			invoiceStartDate=new DateTime(0).addSubtractMonth(invoiceStartDate, +1);
			//new Print("Last Month111111: "+invoiceStartDate);	
			
		} else{
			invoiceStartDate=invoiceStartMonth+"-"+debitPayDate+"-"+invoiceStartYear;
			//new Print("This Month11111: "+invoiceStartDate);	
		}
		
		new Print("invoiceStartDateToUse: "+invoiceStartDate);
		/*firstDayOfNextMonthAfterInstalation=new DateTime(0).getFirstDayOfNextMonthMM_DD_YYYY(getInstallCompDate());
		new Print("First_Day_Of_Next_Month_After_Instalation: "+getFirstDayOfNextMonthAfterInstalation());*/		
		
		String monthBetweenSQL="SELECT FLOOR((TO_DATE('"+invoiceEndDate/*lastDayOfThisMonth*/+"', 'MM-DD-YYYY')::date - TO_DATE('"+/*getFirstDayOfNextMonthAfterInstalation()*/invoiceStartDate+"','MM-DD-YYYY')::date)::numeric /30.43) AS MONTHS";
		new Print("Month_Between_SQL: "+monthBetweenSQL);
			 	
		ResultSet rs=connect.getStatement().executeQuery(monthBetweenSQL);
 	    	
		while(rs.next()){
			int numberOfMonthBetween=Integer.parseInt(rs.getString("MONTHS"))+1;
			new Print("Number_Of_Months_Between: "+numberOfMonthBetween);
		}
		} catch(Exception e){
			//isUpdateCustOrderSuccesfull=false;
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
	
	public void setInsertMonthlySubscriptionCustomerInvoiceRowSQL(){
		new Print("SetInsertMonthlySubscriptionCustomerInvoiceRowSQL()() RUNNING........");	
		//insertMonthlySubscriptionCustomerInvoiceSQLArrayList.clear();
		
		try {
			int numberOfMonth=0;
			//get Install_Date and 
			String lastDayOfMonth=new DateTime(0).getLastDayOfNextMonthMM_DD_YYYY(new DateTime().getCurrentDate());
			String firstDayOfNextMonth=new DateTime(0).getFirstDayOfNextMonthMM_DD_YYYY(getInstallCompDate());
			String monthBetweenSQL="SELECT FLOOR((TO_DATE('"+lastDayOfMonth+"', 'MM-DD-YYYY') ::date - TO_DATE('"+firstDayOfNextMonth+"','MM-DD-YYYY')::date)::numeric /30.43) AS MONTHS";
			new Print("Month_Between_SQL: "+monthBetweenSQL);
					 		   
			ConnectToPostgresDatabase connect=new ConnectToPostgresDatabase();		 	
			ResultSet rs=connect.getStatement().executeQuery(monthBetweenSQL);
		 	    	
			while(rs.next()){
				numberOfMonth=Integer.parseInt(rs.getString("MONTHS"));
				new Print("Number_Of_Months_Between: "+numberOfMonth);
			}
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
			Date convertedDate=dateFormat.parse(firstDayOfNextMonth);
			new Print ("Converted_Date: "+convertedDate);
			
			Calendar calendar = Calendar.getInstance();
			
			for(int i=0; i<numberOfMonth; i++){
				calendar.setTime(convertedDate);
				calendar.add(Calendar.MONTH, i);				
				new Print(i+ " MONTH: "+dateFormat.format(calendar.getTime()));		
				
				
			}
			
		} catch(Exception e){
       	   	 //isUpdateCustOrderSuccesfull=false;
       	     new Print(e.toString());
			 new Print(e.getMessage());
			 e.printStackTrace();	
        }		
	}	
	
	private String getInstallCompDate() {
		return "02-15-2024";
	}

	public static void main(String[] args) {
		new MethodTest();

	}
}
