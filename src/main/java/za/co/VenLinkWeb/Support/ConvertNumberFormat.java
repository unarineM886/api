package za.co.VenLinkWeb.Support;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Locale.Category;

public class ConvertNumberFormat {

	public ConvertNumberFormat() {
		// TODO Auto-generated constructor stub
	}
	
	/* public String randCurrencyFormat(String number){ 			   	   
	     double totalDue=Double.valueOf(number);
	     Locale currentLocale = new Locale("en", "ZA");
	     NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale);
	     String currencyFormat=currencyFormatter.format(totalDue);
	     return currencyFormat;
	  }//End of currencyFormatDouble()	*/
	 
	 public String randCurrencyFormat(String number){ 
		 double totalDue = Double.valueOf(number);
		 DecimalFormat df = new DecimalFormat("R#,##0.00"); // Hardcoded SA style
		 return df.format(totalDue);
	}
	 
	 public String formatDouble(String number){ 
		  Locale fmtLocale = Locale.getDefault(Category.FORMAT);
		  NumberFormat formatter = NumberFormat.getInstance(fmtLocale);
		  formatter.setMaximumFractionDigits(2);
		  formatter.setMinimumFractionDigits(2);			   
		  double totalDue=Double.valueOf(number);
		  String formated=formatter.format(totalDue);
		  return formated;
	  }// End of formatDouble()
	 
	 public double roundDouble(double value/*, int numberOfDigitsAfterDecimalPoint*/) {
		 int numberOfDigitsAfterDecimalPoint=2;
	     BigDecimal bigDecimal = new BigDecimal(value);
	     bigDecimal = bigDecimal.setScale(numberOfDigitsAfterDecimalPoint, 
	     BigDecimal.ROUND_HALF_UP);
	     return bigDecimal.doubleValue();
	 }
	 
	 public double roundDouble(double value, int numberOfDigitsAfterDecimalPoint){
		 BigDecimal bigDecimal = new BigDecimal(value);
	     bigDecimal = bigDecimal.setScale(numberOfDigitsAfterDecimalPoint, BigDecimal.ROUND_HALF_UP);
	     return bigDecimal.doubleValue();
	 }
}