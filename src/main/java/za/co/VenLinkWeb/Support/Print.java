package za.co.VenLinkWeb.Support;

public class Print {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	new Print("Duncan Manyuwa");
	}
	
	public Print(String s) {
		prt(s);
	}
	
	public void prt(String s){
	  System.out.println(new DateTime().getDateTime()+": "+s);
    }//End of prt() method

}