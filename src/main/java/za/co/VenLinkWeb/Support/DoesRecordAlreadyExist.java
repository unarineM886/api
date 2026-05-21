package za.co.VenLinkWeb.Support;

import java.sql.ResultSet;
import javax.swing.DefaultListModel;

public class DoesRecordAlreadyExist {
	private boolean doesRecordAlreadyExist=false;
	private DefaultListModel serverInternalListModel=new DefaultListModel();
	protected ConnectToPostgresDatabase connectToDB=null /*new ConnectToOracleDatabase(serverInternalListModel)*/;
	ResultSet resultSet=null;
	
	public DoesRecordAlreadyExist(String sql){
		setDoesRecordAlreadyExist(sql);		
	}
	
	public static void main(String[] args){
		new Print("DoesRecordAlreadyExist: "+new DoesRecordAlreadyExist("SELECT  * FROM out_payment WHERE transfer_amount=8917.27 AND transfer_account='cheq a/c..839944' AND transfer_ref='Jj Lim Truck' AND transfer_type='Online Banking' AND transfer_date=TO_DATE('27-Feb-2015 21:11:00','DD-MM-YYYY HH24:MI:SS')").doesRecordAlreadyExist());
	}
	
	public void setDoesRecordAlreadyExist(String sql){
		try{
		   new Print("Search SQL: "+sql); 
	 	   connectToDB=  new ConnectToPostgresDatabase();      
	 	  resultSet=connectToDB.getStatement().executeQuery(sql);
       	   int count=0;
       	  
       	   while(resultSet.next()){
       		 count+=1;
       		 doesRecordAlreadyExist=true;	
       	  }
       
       	new Print("DoesRecordAlreadyExist: "+doesRecordAlreadyExist());     
	
		} catch(Exception e){
			new Print(e.toString());
			e.getStackTrace();
			e.printStackTrace();
			e.getMessage();
			
	   }  finally{
	      	 try{
	      		resultSet.close();
	       		connectToDB.getConnection().close();
	       		connectToDB.getStatement().close();
	       		 
	       	 } catch(Exception e){
	       	    //logger.log(Level.ERROR,e);
	 	        //logger.error(new DateTime().getDateTime()+": "+e);
	 	        new Print(e.toString());
	 	        new Print(e.getMessage());
	 	        e.printStackTrace();
	 	     }
	     }
	}	
    
	public boolean doesRecordAlreadyExist(){
		return doesRecordAlreadyExist;
	}
}
