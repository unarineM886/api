package za.co.VenLinkWeb.Support;

import java.sql.SQLException;

public class InsertUpdateDeleteData {
	private boolean isInsertSuccesfull=false;
	private boolean isDeleteSuccesfull=false;
	private boolean isUpdateSuccesfull=true;
	private int numberOfInserts=0;
	private int numberOfUpdates=0;
	private int numberOfDeletes=0;
	
	public InsertUpdateDeleteData(String insertSQL) {
		insertUpdateDeleteData(insertSQL);
	}
	
	public void insertUpdateDeleteData(String insert){
		ConnectToPostgresDatabase connect=new ConnectToPostgresDatabase();
		  try {			  
			  if(insert.startsWith("UPDATE")){
				 //new Print("UPDATE SQL: "+insert);
			     connect.getStatement().executeUpdate(insert);
				 connect.getStatement().executeUpdate("COMMIT");
				 isUpdateSuccesfull=true;
				 numberOfUpdates+=1;
				 //new Print("UPDATE SQL Successfull------------ ");
		  	      
			  } else if(insert.startsWith("INSERT")){
				  //new Print("INSERT SQL: "+insert);
				  connect.getStatement().executeUpdate(insert);
				  connect.getStatement().executeUpdate("COMMIT");
				  isInsertSuccesfull=true;
				  numberOfInserts+=1;
				  //new Print("INSERT SQL Successfull------------ ");
			  
			  } else if(insert.startsWith("DELETE")){
				  //new Print("DELETE SQL: "+insert);
				  connect.getStatement().executeUpdate(insert);
				  connect.getStatement().executeUpdate("COMMIT");
				  isDeleteSuccesfull=true;
				  numberOfDeletes+=1;
				  //new Print("DELETE SQL Successfull------------ ");
			  }
			 
		 } catch(SQLException e){
			  isInsertSuccesfull=false;
			  new Print(e.toString());
			  new Print(e.getMessage());
			  e.printStackTrace();
			 	 	   
		 } finally{
				try{
				   connect.getConnection().close();
				   connect.getStatement().close();
				      
				} catch(Exception e){
					new Print(e.toString());
					new Print(e.getMessage());
					e.printStackTrace();
				}
		    }
	  }	
	 
	  public boolean  isInsertSuccesfull(){
		 return  isInsertSuccesfull;
	  }
	  
	  public boolean  isUpdateSuccesfull(){
		 return  isUpdateSuccesfull;
	  }
	  
	  public boolean  isDeleteSuccesfull(){
		 return  isDeleteSuccesfull;
	  }
	  
	  protected int  getNumberOfInserts(){
		 return numberOfInserts;
	  }
	  
	  protected int  getNumberOfUpdates(){
	     return numberOfUpdates;
	  }
	  
	  protected int  getNumberOfDeletes(){
	     return numberOfDeletes;
	  }
   }