package za.co.VenLinkWeb.Support;

//import za.co.KDMDrilling.Server.Print;

//package za.co.KDMDrilling.KDMDrillingServer;

//import za.co.KDMDrilling.KDMDrillingServer.IsNumeric;

public class IsNumeric {

	private boolean isNumeric=false;

	/**
	 * @param args
	 */
	
	public IsNumeric (String str){
		setIsNumeric(str);
	}	
	
	public void setIsNumeric(String str){
	    if (str == null) {
	    	isNumeric= false;
	    	
	    } else{	
	    	try {
	    		new Print("CHECK: "+str);
	    		Double.parseDouble(str);
	    		isNumeric= true;
	    		
	    	} catch(Exception e) {
	    		isNumeric= false;
	    	}
	    }
	    
	    /*int sz = str.length();
	    for (int i = 0; i < sz; i++) {
	         if (Character.isDigit(str.charAt(i)) == false) {	        	
	        	 isNumeric= false;	        	
	         }
	    }*/
	    //}
	    
	}
	
	public boolean isNumeric(){
	  return isNumeric;
	}
	
	public static void main(String[] args){
		System.out.println(new IsNumeric("77").isNumeric());
	}
}