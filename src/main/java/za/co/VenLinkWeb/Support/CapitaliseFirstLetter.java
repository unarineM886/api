package za.co.VenLinkWeb.Support;

public class CapitaliseFirstLetter {
	
	public CapitaliseFirstLetter() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("This is it: "+ new CapitaliseFirstLetter().capitalizeFirstLetter("MANYUWA"));
	}
	
	public String capitalizeFirstLetter(String original){
	    if(original.length()==0){
	        return original;
	    } else
	    	return original.substring(0, 1).toUpperCase() + original.substring(1).toLowerCase();
	}
}