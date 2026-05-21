package za.co.VenLinkWeb.Support;

import java.util.ArrayList;

public class SendClientBackToOrder {
	String reference;
	String refererSurnameName;
		
	public SendClientBackToOrder(String reference, String refererSurnameName){
		this.reference=reference;
		this.refererSurnameName=refererSurnameName;
		sendBackToOrders();
	}
	//The project: KDMDrilling which is referenced by the classpath, does not exist.
	protected void sendBackToOrders ( ){		
		try {
			String getRefererRefSQL=null;
			String deleteRefererCustomerInvoiceSQL=null;
			ArrayList SQLCommands=new ArrayList();
			if(!"Own Client".equalsIgnoreCase(getRefererSurnameName())){
				String[] surnameName=getRefererSurnameName().split(" ");
				if(surnameName.length==3){
					String refererSurname=surnameName[0];
					String refererName=surnameName[1]+" "+surnameName[2];
					getRefererRefSQL="SELECT cust_ref FROM customer WHERE cust_surname='"+refererSurname+"' AND cust_name='"+refererName+"' ";
				
				} else if(surnameName.length==2){
					String refererSurname=surnameName[0];
					String refererName=surnameName[1];
					getRefererRefSQL="SELECT cust_ref FROM customer WHERE cust_surname='"+refererSurname+"' AND cust_name='"+refererName+"' ";				
				}
				deleteRefererCustomerInvoiceSQL="DELETE FROM customer_invoice WHERE cust_ref = ("+getRefererRefSQL+") AND invoice_description LIKE 'Referal Program%' ";
				SQLCommands.add(deleteRefererCustomerInvoiceSQL);
			}/* else {
				//run this SQL to avould running null SQL if referer='Own Client'
				deleteRefererCustomerInvoiceSQL="DELETE FROM customer_invoice WHERE cust_ref = '"+getReference()+"' ";
			}*/
		
			String deleteCustomerInvoiceSQL="DELETE FROM customer_invoice WHERE cust_ref = '"+getReference()+"' ";
			//String deleteRefererCustomerInvoiceSQL="DELETE FROM customer_invoice WHERE cust_ref = ('"+getRefererRefSQL+"') AND invoice_description LIKE 'Referal Program%' ";
			String updateCustOrderSQL="UPDATE customer SET order_status='Scheduled', account_status= NULL WHERE cust_ref = '"+getReference()+"' ";
			SQLCommands.add(deleteCustomerInvoiceSQL);
			SQLCommands.add(updateCustOrderSQL);
			//String[] SQLCommands={updateCustOrderSQL, deleteCustomerInvoiceSQL, deleteRefererCustomerInvoiceSQL};
			
			for(int i=0;i<SQLCommands.size();i++){
				//new Print("SQLCommands["+i+"]: "+SQLCommands[i]);
				InsertUpdateDeleteData insertData=new InsertUpdateDeleteData(SQLCommands.get(i).toString());
			}
			//Delete same local_ucrm_client Data
			//deleteClientLocalUcrmData(selectedReference, selectedClientId);
	 
		} catch (Exception e) {
			// If any error occurs during api call it will go into catch block
			new Print(e.toString());
			e.printStackTrace();
		}
	}

	private String getReference() {
		return reference;
	}

	private String getRefererSurnameName() {
		return refererSurnameName;
	}
}