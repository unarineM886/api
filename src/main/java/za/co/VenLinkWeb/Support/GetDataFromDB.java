package za.co.VenLinkWeb.Support;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class GetDataFromDB {
	
	/*public GetDataFromDB(String sqlStatement) {
		//getDataFromDB(sqlStatement);
	}*/
	
	public String getDataFromDB(String sqlStatement/*, String databasePointer*/){
		ConnectToPostgresDatabase connectToDB=  new ConnectToPostgresDatabase(/*serverInternalListModel, databasePointer*/);
		String reply="";
			
 		  try{
 			 ResultSet rs=connectToDB.getStatement().executeQuery(sqlStatement.replace("#", ""));
	  		 ResultSetMetaData rsmd = rs.getMetaData();
	  		 int columnCount = rsmd.getColumnCount();
	  		 String row="";
	  		 String colNames="";
	  		 
	  		 while(rs.next()){
	  			 row="";
	  			 colNames="";
	  			 for(int i = 1;i<=columnCount;i++){
	  				 row +=rs.getString(i)+"##";
	  				 colNames+=rsmd.getColumnName(i)+"@";
	  			 }
	  			 reply += "&&"+row;
	  		 }
	  		
	  		 //Get number of columns
	  		 rs.last();      
	  		 int rowCount = rs.getRow();      
	  		 if(rowCount>0){
	  			 //Add Column Name to the reply back to Client
	  			 reply=colNames+" $$ "+reply;  			     
  		           
	  		 } else {
	  			 //reply=getFirstColumnIdentifier()+" $$ && NO_DATA";
	  		 }
	  		
	  	 } catch (SQLException e){
		      //JOptionPane.showMessageDialog(null, e, "Error",JOptionPane.ERROR_MESSAGE);
		   	 new Print(e.toString());
		   	 new Print(e.getMessage());
		 	 e.printStackTrace();
		 	 //replyToClient("SELECT_ERROR");
		 	 
	  	 } finally{
			  try{
				  //systemDisplay("CLOSING CONNECTION TO THE DB...");
				  connectToDB.getConnection().close();
				  connectToDB.getStatement().close();
			      //systemDisplay("CONNECTION TO THE DB CLOSED");
			       
			  } catch(Exception e){
				 //logger.error(new DateTime().getDateTime()+"   "+e);
				 new Print(e.toString());
				 new Print(e.getMessage());
				 e.printStackTrace();
			 }
		 }
 		  new Print("DATE: "+reply);
		return reply;
	}

	public static void main(String[] args) {
		String statement="SELECT INITCAP(CO.cust_title) #VENLINK_UPDATE_TITLE#, INITCAP(CO.cust_surname) SURNAME, INITCAP(CO.cust_name) NAMES, TO_CHAR(CO.order_date,'DD-MON-YYYY') ORDER_DATE, INITCAP(CO.address), service, CO.refered_by, COALESCE(cust_email,''), COALESCE(vat_num, ''), COALESCE(debit_payment_date, ''), COALESCE(previous_isp, 'VenLink') DEBIT_ORDER_DATE, INITCAP(CO.company_name) COMPANY_NAME FROM customer CO WHERE cust_ref='0825227322' ";
		new GetDataFromDB(/*statement*/).getDataFromDB(statement);
		// TODO Auto-generated method stub

	}

}
