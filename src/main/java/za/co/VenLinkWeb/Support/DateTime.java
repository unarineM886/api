package za.co.VenLinkWeb.Support;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
//import java.util.TimeZone;

public class DateTime {
	private String dateTime;
	private String date;
	private String time;
	private String year;
	private String month;
	private String day;
	private String week;
	private String dayOfWeek;
	private String abbrDayOfWeek;
	
	private int intDayOfWeek;
	private int intDayOfMonth;
	private int intWeekOfMonth;
	private int lastDayOfCurrentMonth;
	
	public DateTime() {
		//get current date time with Date()
		Date toDay = new Date();
		setDateTime(toDay);		 
	}
	
	public DateTime(int num) {
		
	}
	
	public DateTime(String dateString) {
	  
	  try{
		  DateFormat dateTimeFormat = new SimpleDateFormat("dd/MM/yyyy");
		  Date date = dateTimeFormat.parse(dateString);
		  setDateTime(date);	
	  
	  } catch (ParseException e) {
		 e.printStackTrace();
	  }
    }	
	
	public static String dateFormatChange(String oldFormat, String newFormat, String oldDateString){
		String newDateString=null;
		try{
			final String OLD_FORMAT = oldFormat;
			new Print("OLD_FORMAT: "+OLD_FORMAT);
			final String NEW_FORMAT = newFormat;
			new Print("NEW_FORMAT: "+NEW_FORMAT);
			
			SimpleDateFormat sdf = new SimpleDateFormat(OLD_FORMAT);
			new Print("OldDateString: "+oldDateString);
			Date d = sdf.parse(oldDateString);
			sdf.applyPattern(NEW_FORMAT);
		  
			newDateString = sdf.format(d);
			new Print("NewDateString: "+newDateString);
	  
	  } catch(Exception e){
		  e.printStackTrace();
	  }
		return newDateString;
    }
	
	public void setDateTime(Date dateDate){
		 DateFormat dateTimeFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		 DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		 DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		 
		 DateFormat yearFormat = new SimpleDateFormat("yyyy");
		 DateFormat monthFormat = new SimpleDateFormat("MM");
		 DateFormat dayFormat = new SimpleDateFormat("dd");
		 DateFormat weekFormat = new SimpleDateFormat("w");
		 
		 SimpleDateFormat abbrDayNameformat = new SimpleDateFormat("E"); // the day of the week abbreviated
		 SimpleDateFormat fullDayNameformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
		 
		 //get current date time with Date()
		 //Date toDay = new Date();
		 dateTime= dateTimeFormat.format(dateDate);
		 date= dateFormat.format(dateDate);
		 time= timeFormat.format(dateDate);
		 
		 year= yearFormat.format(dateDate);
		 month= monthFormat.format(dateDate);
		 day= dayFormat.format(dateDate);	
		 week=weekFormat.format(dateDate);	
		 
		 abbrDayOfWeek=abbrDayNameformat.format(dateDate);
	     dayOfWeek=fullDayNameformat.format(dateDate);
	     		 
		// System.out.println("Abbriviated Day Name: "+getAbbrDayOfWeek());
	    // System.out.println("Full Day Name: "+getDayOfWeek());
	 
	     
	     Calendar calendar = Calendar.getInstance();
	     calendar.setTime(dateDate);
	     intDayOfWeek=calendar.get(Calendar.DAY_OF_WEEK); // the day of the week in numerical format
	     intDayOfMonth=calendar.get(Calendar.DAY_OF_MONTH); // the day of the week in numerical format
	     
	     intWeekOfMonth=calendar.get(Calendar.WEEK_OF_MONTH); // the day of the week in numerical format
	     lastDayOfCurrentMonth=calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // the day of the week in numerical format
	     //System.out.println("Last Day Of Month: "+getLastDayOfMonth());
	     //System.out.println("dayOfWeek: "+getDayOfWeek());		 
	     //int dayOfWeek=dateFormat.DAY_OF_WEEK_FIELD;
		 //System.out.println("IntDayOfWeek: "+getIntDayOfWeek());
		 //System.out.println("IntDayOfMonth: "+getIntDayOfMonth());
		 //System.out.println("IntWeekOfMonth: "+getIntWeekOfMonth());
	}
	
	
	public int getLastDayOfCurrentMonth() {
		return lastDayOfCurrentMonth;
	}

	public  String getAbbrDayOfWeek() {
		return abbrDayOfWeek;
	}

	public static Date convertStringDate(String date){		
		DateFormat format = new SimpleDateFormat("DD/MM/YYYY", Locale.ENGLISH);
		Date convertDate=null;
		try {
			convertDate = format.parse(date);
		
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(convertDate); // Sat Jan 02 00:00:00 GMT 2010
		
	  return convertDate;
		
	}
	
	public String addSubtractMonth(String date, int addSubtract) {
		new Print("DateToAddSubtract: "+date);;
		String addedSubtractedDate =null;
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
			Date convertedDate=dateFormat.parse(date);
			new Print ("Converted_Date: "+convertedDate);
		
			Calendar calendar = Calendar.getInstance();	
			calendar.setTime(convertedDate);
			calendar.add(Calendar.MONTH, /*-1*/addSubtract);
			addedSubtractedDate = dateFormat.format(calendar.getTime());
			new Print("AddedSubtractedDate: "+addedSubtractedDate);
	
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
	
		return addedSubtractedDate;	
	}
	
	public String addSubractDaysToToday(int daysToAddSubtract) {
	  
	        LocalDate today = LocalDate.now();
	        LocalDate futureDate = today.plusDays(daysToAddSubtract);

	        System.out.println("Today's Date: " + today);
	        System.out.println("Date after "+daysToAddSubtract+" days: " + futureDate);
	        return futureDate.toString();
	}
	
	public static String getFirstDayOfNextMonthMM_DD_YYYY(String installDate){		
		new Print("Install_Date: "+installDate);
		new Print("Converted_Install_Date: "+dateFormatChange("MM/dd/yyyy", "MM-dd-yyyy", installDate));
		
		String[] monthDayYear=dateFormatChange("MM/dd/yyyy", "MM-dd-yyyy",installDate).split("-");
		
		String firstDayOfThisMonth=monthDayYear[0]+"-01-"+monthDayYear[2];
		new Print("First_Day_Of_This_Month: "+firstDayOfThisMonth); 
		String firstDayOfNextMonth=null;
		
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
			Date convertedDate=dateFormat.parse(firstDayOfThisMonth);
			new Print ("Converted_Date: "+convertedDate);
			
			Calendar calendar = Calendar.getInstance();		
			calendar.setTime(convertedDate);
			new Print("CAL_FIRST_DAY_THIS_MONTH: "+dateFormat.format(calendar.getTime()));
			
			calendar.add(Calendar.MONTH, 1);
			firstDayOfNextMonth=dateFormat.format(calendar.getTime());
			new Print("RETURN_CAL_FIRST_DAY_NEXT_MONTH: "+firstDayOfNextMonth);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return firstDayOfNextMonth;		
	}
	
	public static String getLastDayOfNextMonthMM_DD_YYYY(String thisMonthDate){
		new Print("This_Month_Date: "+thisMonthDate);
		String lastDayOfTheMonth=null;
		DateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
			try {
				Date convertedDate = dateFormat.parse(thisMonthDate);
		
				DateFormat yearFormat = new SimpleDateFormat("yyyy");
				DateFormat monthFormat = new SimpleDateFormat("MM");
				//DateFormat dayFormat = new SimpleDateFormat("dd");		
		
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(convertedDate);
		
				String year= yearFormat.format(convertedDate);
				new Print("Year: "+year/*getYear()*/);
				String month= monthFormat.format(convertedDate);
				new Print("Month: "+month/*getMonth()*/);
				//day= dayFormat.format(thisMonthDate);	
				int lastDayOfCurrentMonth=calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // the day of the week in numerical format
				new Print("Last_Day_Of_This_Month: "+lastDayOfCurrentMonth);
				
				lastDayOfTheMonth= month+"-"+lastDayOfCurrentMonth+"-"+year;
				new Print("Return_Last_Day_Of_The_Month: "+lastDayOfTheMonth);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			return lastDayOfTheMonth;
	}
	
	public int getMaxWeekNumber(){	
		new Print("YEAR: "+getYear());
		new Print("MONTH: "+getMonth());
		YearMonth ym = YearMonth.of(Integer.parseInt(getYear()), Integer.parseInt(getMonth()));
		String firstDayOfMonth = ym.atDay(1).getDayOfWeek().name();
		String lastDayOfMonth = ym.atEndOfMonth().getDayOfWeek().name();
		new Print("FirstDayOfMonth: "+firstDayOfMonth);
		new Print("LastDayOfMonth: "+lastDayOfMonth);
		Calendar cal = Calendar.getInstance();
		int weekOfMonth=0;
		if("SUNDAY".equalsIgnoreCase(firstDayOfMonth)){
			weekOfMonth=cal.getActualMaximum(Calendar.WEEK_OF_MONTH)+2;
			
		} else{
			weekOfMonth=cal.getActualMaximum(Calendar.WEEK_OF_MONTH)+1;
		}
	  
		new Print("WeekOfMonth: "+weekOfMonth);
		return weekOfMonth;
    }
	
	public String getCurrentDateDD_MM_YYYY(){
	   DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
	   //get current date time with Date()
	   Date date = new Date();
	   //System.out.println(dateFormat.format(date)); //don't print it, but save it!
	   String yourDate = dateFormat.format(date);
	   return yourDate;
	}
	
	public String getCurrentDate() {
	   DateFormat dateFormat = new SimpleDateFormat("MM-dd-YYYY");
	   //get current date time with Date()
	   Date date = new Date();
	   //System.out.println(dateFormat.format(date)); //don't print it, but save it!
	   String yourDate = dateFormat.format(date);
	   return yourDate;
	}	  
	
	public String getCurrentDate(String newDateFormat) {
	   DateFormat dateFormat = new SimpleDateFormat(newDateFormat);
	   //get current date time with Date()
	   Date date = new Date();
	   //System.out.println(dateFormat.format(date)); //don't print it, but save it!
	   String yourDate = dateFormat.format(date);
	   return yourDate;
	}	  
	
	protected  int getIntWeekOfMonth() {
		return intWeekOfMonth;
	}

	protected  int getIntDayOfMonth() {
		return intDayOfMonth;
	}

	protected String getDayOfWeek() {
		return dayOfWeek;
	}

	public int getIntDayOfWeek() {
		return intDayOfWeek-1;
	}

	public String getDateTime(){
		return dateTime;
    }
	
	public String getDate(){
		return date;
	}
	
	public String getTime(){
		return time;
	}
	
	public String getYear(){
		return year;
	}
	
	public String getMonth(){
		return month;
	}
	
	public String getDay(){
		return day;
	}
	
	public String getWeek(){
		return week;
	}
	
	public static String dateChooserDateFormat(String dateToSet) {
		new Print("DateToSet: "+dateToSet);
		return 	dateFormatChange("MM-dd-yyyy","MM/dd/yyyy", /*new DateTime().getCurrentDate()*/dateToSet);
	}
	
	public static void main(String... aArgs) throws IOException{
		/*DateTime dateTime=new DateTime(/*"01/05/2015"**);
		//new Print("Week Number: "+dateTime.getMaxWeeknumber());
		new Print(new DateTime("01/07/2016").getAbbrDayOfWeek().toUpperCase());
		//new Print("Today is: "+ new DateTime().getCurrentDate());
		new Print("Today is: "+new DateTime().getCurrentDate());
		new Print("Today After is: "+new DateTime().dateChooserDateFormat());
		
		getFirstDayOfNextMonthMM_DD_YYYY("12/15/2023");
		new Print("\n+++++++++++++++++++++++++++++++++\n");
		getLastDayOfNextMonthMM_DD_YYYY("07-16-2024");*/
		
		//new Print("DAYS_BETWEEN_2_DATES: "+new DateTime(1).dateFormatChange("yyyy-MM-dd", "yyyy-MM-dd'T'HH:mm:ssXXX", "2025-05-03"));
		//new Print("DAYS_BETWEEN_2_DATES: "+new DateTime(1).addSubractDaysToToday(1));
		new Print("JSON DATE: "+new DateTime(1).dateFormatChange("dd-MM-yyyy", "yyyy-MM-dd'T'HH:mm:ssXXX", new GetCurrentDate().getCurrentDate()));
	}
		
	public int getDaysBetweenDates(String date1, String date2){
		//LocalDate now = LocalDate.now();
		new Print("DAYS_BETWEEN_DATE: "+ /*now*/date1+ " and "+date2);
		//new Print("NOW: "+now);
        LocalDate dt1 = LocalDate.parse(date1);
        LocalDate dt2= LocalDate.parse(date2);

        long diffDays = ChronoUnit.DAYS.between(dt1, dt2);

        return Math.abs((int)diffDays);
    }
	
	public void setDateTime(){
	  DateFormat dateTimeFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	  DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	  DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		 
	  DateFormat yearFormat = new SimpleDateFormat("yyyy");
	  DateFormat monthFormat = new SimpleDateFormat("MM");
	  DateFormat dayFormat = new SimpleDateFormat("dd");
		 
	  //get current date time with Date()
	  Date DaTe = new Date();
	  dateTime= dateTimeFormat.format(DaTe);
	  date= dateFormat.format(DaTe);
	  time= timeFormat.format(DaTe);
		 
	  year= yearFormat.format(DaTe);
	  month= monthFormat.format(DaTe);
	  day= dayFormat.format(DaTe);
		 
	}

	public String getAddMinusDayFromDate(String dateString, int numDays) {		
        // Parse the string into a LocalDate object
        LocalDate date = LocalDate.parse(dateString);
        // Add days (positive number)
        LocalDate dateAfterAddition = date.plusDays(numDays);
        //new Print("Date before/after "+ numDays+" days: " + dateAfterAddition + " FROM "+dateString); 
        // Output: Date after 10 days: 2024-02-25     
        return dateAfterAddition.toString();
	}
	
	/*public String getDateTime(){
		return dateTime;
	  }
	
	public String getDate(){
		return date;
	  }
	
	public String getTime(){
		return time;
	  }
	
	public String getYear(){
		return year;
	  }
	
	public String getMonth(){
		return month;
	  }
	
	public String getDay(){
		return day;
	  }
	
	public static void main(String... aArgs) throws IOException {
		  new Print("Year: "+new DateTime().getYear());
	  }
	  
	//new DateTime().getYear()
}*/
}
