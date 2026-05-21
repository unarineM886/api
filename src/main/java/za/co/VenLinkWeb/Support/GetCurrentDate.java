package za.co.VenLinkWeb.Support;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
//import java.util.Calendar;


public class GetCurrentDate {
	
   public String getCurrentDate() {

   DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
   //get current date time with Date()
   Date date = new Date();
   //System.out.println(dateFormat.format(date)); //don't print it, but save it!
   String yourDate = dateFormat.format(date);
   return yourDate;

 }
   
   public String getYesterdayDate() {
	    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy"); // Note: use lowercase 'yyyy'
	    Calendar cal = Calendar.getInstance();
	    
	    // Subtract one day from the current date
	    cal.add(Calendar.DATE, -1);
	    
	    return dateFormat.format(cal.getTime());
	}

   
   public static void main(String []args ){
	   System.out.println("Today's date: "+new GetCurrentDate().getCurrentDate());
	   
   }
}