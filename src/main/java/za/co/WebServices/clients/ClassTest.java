package za.co.WebServices.clients;

//import za.co.VenLink.WebServices.Clients.ProcessNetcashMerchantStatement;

//import za.co.VenLink.WebServices.Clients.ProcessNetcashMerchantStatement;
import java.net.URL;

import javax.xml.namespace.QName;


import za.co.WebServices.INIWSNIF;
import za.co.WebServices.NIWSNIF;

public class ClassTest {
	
	private static final String DEBIT_ORDER_SERVICE_KEY = "d0a5c3ef-98ef-4f9a-b8d7-c6503721a8ff";
	 private static final QName SERVICE_NAME = new QName("http://tempuri.org/", "NIWS_NIF");

	public static void main(String[] args) {		
		
		/*Thread currentThread = Thread.currentThread();
		ClassLoader oldCL = currentThread.getContextClassLoader();*/
		try {
			System.out.println("Connecting...");
			URL wsdlURL = new URL("https://ws.netcash.co.za/NIWS/NIWS_NIF.svc?wsdl"); // Or a local file path
			// URL wsdlURL = NIWSNIF.WSDL_LOCATION;
			NIWSNIF ss = new NIWSNIF(wsdlURL, SERVICE_NAME);
			INIWSNIF port = ss.getBasicHttpBindingINIWSNIF();
			System.out.println("Connected...");
			System.out.println("Invoking retrieveMultipleBatchStatus...");
            String _retrieveMultipleBatchStatus_serviceKey = DEBIT_ORDER_SERVICE_KEY;
            Integer _retrieveMultipleBatchStatus_numberOfBatches = Integer.valueOf(200);
            String _retrieveMultipleBatchStatus__return = port.retrieveMultipleBatchStatus(_retrieveMultipleBatchStatus_serviceKey, _retrieveMultipleBatchStatus_numberOfBatches);
            System.out.println("retrieveMultipleBatchStatus.result=\n" + _retrieveMultipleBatchStatus__return);
            
		    
		    } catch (Exception e) {
		    	
		} finally {
		   // currentThread.setContextClassLoader(oldCL);
		}		
		//new ProcessNetcashMerchantStatement();
	}

}
