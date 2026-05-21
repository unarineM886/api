package za.co.VenLinkWeb.Support;

public class DeleteDuplicateRow {
	private String databasePointer="VenLinkNetworks";
	
	public DeleteDuplicateRow(String tableName, String columnGroup, String dabasePointer) {		
		String deleteDuplicateSQL="DELETE FROM "+tableName+" WHERE ctid NOT IN (SELECT MIN(ctid) FROM "+tableName+" GROUP BY "+columnGroup+")";
		new Print("Delete_Duplicate_SQL: "+deleteDuplicateSQL);
		InsertUpdateDeleteData insertCustomerInvoiceData=new InsertUpdateDeleteData(deleteDuplicateSQL/*, getDatabasePointer()*/);	  
		//insertData=new InsertUpdateDeleteData(deleteDuplicateSQL, getDatabasePointer());;
	}

	private String getDatabasePointer() {
		return databasePointer;
	}

	public static void main(String[] args) {
	   String columnGroup="cust_ref, cust_name, cust_surname";
       String tableName="customer";
       new DeleteDuplicateRow(tableName, columnGroup, "VenLinkNetworks");
	}
}