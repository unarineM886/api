package za.co.VenLinkWeb.Support;

public class RemoveAmount0FromInPayment{
	
	public RemoveAmount0FromInPayment(String reference){
		removeAmount0FromInPayment(reference);
	}

	private void removeAmount0FromInPayment(String reference){
		String checkRef0SQL="SELECT cust_ref REF_AMOUNT_0 FROM customer_payment WHERE cust_ref='"+reference+"' AND amount=0";
		
		if(new DoesRecordAlreadyExist(checkRef0SQL).doesRecordAlreadyExist()){
		  String deleteRecord="DELETE FROM customer_payment WHERE cust_ref='"+reference+"' AND amount=0 ";
		  new Print("Deleting Paymet with Amount=0..... ");
		  InsertUpdateDeleteData insertUpdateDeleteData = new InsertUpdateDeleteData(deleteRecord);
		  if(insertUpdateDeleteData.isDeleteSuccesfull()){
			 new Print("Paymet with Amount=0 Deleted..... ");
		  }
		}
	}
}