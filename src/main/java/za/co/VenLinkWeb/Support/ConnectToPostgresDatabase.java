package za.co.VenLinkWeb.Support;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectToPostgresDatabase {	
	//Load POSTGRES JDBC driver
	private final String SERVER_NAME="host.docker.internal";
	private final String PORT_NO="5432";
	
	private String SID="venlink";
	//private final String SID1="VHAKWEVHO";
	//private final String SID2="VenLink";
	
	private String URL="jdbc:postgresql://" + SERVER_NAME + ":" + PORT_NO + "/" + SID;
	//private final String URL1="jdbc:oracle:thin:@" + SERVER_NAME + ":" + PORT_NO + ":" + SID1;
	//private final String URL2="jdbc:oracle:thin:@" + SERVER_NAME + ":" + PORT_NO + ":" + SID2;
	  
	private final String USERNAME="postgres"; //or SYS
	private String PASSWORD="VenLink7#%#"; //Production password KDMDrilling777
	//private final String PASSWORD1="vhakwevho777";
	//sprivate final String PASSWORD2="VenLink777";
	
	private final String DRIVER_NAME="org.postgresql.Driver";//oracle.jdbc.driver.OracleDriver

	private Connection connection;
	private Statement statement;
	private boolean areAllDataBasesAvailable=false;
	private String databasePointer;
	
	public ConnectToPostgresDatabase(int dbconTestOnly){
		//testConnectionToOracleDatabases();  
	}
	
	public ConnectToPostgresDatabase(){
	  connectToPostgresDatabase();
	}
	
	public ConnectToPostgresDatabase(String dbName){
	//	this.fromClient=fromClient;
	 	connectToPostgresDatabase(dbName);
	}
	
	public void connectToPostgresDatabase(){
		try{
			 //new Print("DatabasePointer: "+getDatabasePointer());
			 /*if(getDatabasePointer().equalsIgnoreCase("vhakwevhoburialsociety")){
				 SID=SID1;
				 PASSWORD=PASSWORD1;
				 URL=URL1;
				
			 } else if(getDatabasePointer().equalsIgnoreCase("VenLinkNetworks")){
				 SID=SID2;
				 PASSWORD=PASSWORD2;
				 URL=URL2;
			 }*/
			
			Class.forName(DRIVER_NAME);
		    //Create a connection to the database           
            //systemDisplay("CONNECTING to POSTGRESQL DATABASE........");
           // new Print("CONNECTING to POSTGRESQL DATABASE........ &&&&&&&&");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);//Making/establishing connection
	        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY,ResultSet.HOLD_CURSORS_OVER_COMMIT);
	        //systemDisplay("CONNECTED to POSTGRESQL DATABASE");
	        //new Print("CONNECTED to POSTGRESQL DATABASE........ &&&&&&&&");
	 
		} catch (Exception e){
			new Print(e.toString());
			new Print(e.getMessage());
   	        e.printStackTrace();
   	        
        } finally {
			if(connection!= null){
				try {
					//connection.close();    
				
				} catch (Exception e){    
		            // ignore    
				}
			}
		}
	}//End connectToDatabase() Method
	
	public void connectToPostgresDatabase1(){ 
		 try{ 
			 new Print("DatabasePointer1: "+getDatabasePointer());
			 /*if(getDatabasePointer().equalsIgnoreCase("vhakwevhoburialsociety")){
				 SID=SID1;
				 PASSWORD=PASSWORD1;
				
			 } else if(getDatabasePointer().equalsIgnoreCase("VenLinkNetworks")){
				 SID=SID2;
				 PASSWORD=PASSWORD2;
			 }*/
			 
		    Class.forName(DRIVER_NAME);
		    // Create a connection to the database           
		    new Print("CONNECTING to DATABASE........");
		    //String URL="jdbc:oracle:thin:@" + SERVER_NAME + ":" + PORT_NO + "/" + SID;
			
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);//Making/establishing connection
	        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY,ResultSet.HOLD_CURSORS_OVER_COMMIT);
	        new Print("CONNECTED to DATABASE");
	 
		} catch (Exception e){
           new Print(e.toString());
           new Print(e.getMessage());
  	       e.printStackTrace();
       
		} finally {    
			if(connection!= null){
				try {
					//connection.close();    
				} catch (Exception e) {    
		            // ignore    
				}  
			}
		}
    }//End connectToDatabase() Method
	
	private String getDatabasePointer() {
		return databasePointer;
	}

	public boolean testConnectionToPostgresDatabases(){
		 try{ 
		    Class.forName(DRIVER_NAME);
		    // Create a connection to the databases           
		    new Print("TESTING DATABASE CONNECTION........");
		    
		    String[] url={URL/*, URL1, URL2*/};
        	String[] passWord={PASSWORD/*, PASSWORD1, PASSWORD2*/};
        	int dbconCont=0;
        
        	for(int i=0;i<url.length;i++){
        		new Print("Connectin to...... "+url[i]);
        		connection = DriverManager.getConnection(url[i], USERNAME, passWord[i]);//Making/establishing connection
     
        		try {
        			 statement = connection.createStatement();
        			 ResultSet rs = statement.executeQuery("SELECT SYSDATE FROM DUAL");
        			 while(rs.next()){
        				new Print(url[i] +" DB Query Results: "+rs.getObject(1).toString());
        				dbconCont+=1;	
        				new Print("DataBasedConCount: "+dbconCont);
        			}
               
        		} finally {
        			connection.close();
        			statement.close();
        		}
        	}
        	
        	if(dbconCont==url.length) {
        		areAllDataBasesAvailable=true;
        		new Print("IsDataBasedAvailable: "+areAllDataBasesAvailable);
        	}
         
		} catch (Exception e){
			new Print(e.toString());
			new Print(e.getMessage());
			e.printStackTrace();
		
		} finally {    
			if (connection!= null){
				try {
					//connection.close();    
				} catch (Exception e) {    
		            // ignore    
				}
			}
		}
		 return areAllDataBasesAvailable;	         
   }//End connectToDatabase() Method
		
	public void connectToPostgresDatabase(String dbName){
		new Print("DBNamee: "+dbName);
		/*if(dbName.equalsIgnoreCase("vhakwevhoburialsociety")){
			SID=SID1;
			PASSWORD=PASSWORD1;
		
		} else if(dbName.equalsIgnoreCase("venLinkNetworks")){
			SID=SID2;
			PASSWORD=PASSWORD2;
		}*/
		
		 try{ 
		    Class.forName(DRIVER_NAME);
		    // Create a connection to the database 
		    new Print("CONNECTING to DATABASE........+++++++");
		    //String URL="jdbc:oracle:thin:@" + SERVER_NAME + ":" + PORT_NO + ":" + SID;
			
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);//Making/establishing connection
	        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY,ResultSet.HOLD_CURSORS_OVER_COMMIT);
	        new Print("CONNECTED to DATABASE........+++++++");
	        
	      /*  if (fromClient.startsWith("SELECT")){
	        	getDataFromDB(fromClient);
	        
	        } else if (fromClient.startsWith("INSERT")||fromClient.startsWith("UPDATE")) {
            	insertUpdateData(fromClient);
            		    
            } else if (fromClient.startsWith("DELETE")){
             	deleteData(fromClient);       		 
            }*/
	 
		} catch (Exception e){
 	        new Print(e.toString());
            new Print(e.getMessage());
 	        e.printStackTrace();
      }
   }//End connectToDatabase() Method
		
	/*protected String getReply(){
		return reply;
	}

	/*public String getDataFromDB(String statement){
		new Print("SELECT:  "+statement);		  
		try{
			 ResultSet rs=getStatement().executeQuery(statement);
	  		 ResultSetMetaData rsmd = rs.getMetaData();
	  		 columnCount = rsmd.getColumnCount();
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
  		           
	  	    } else{
	  	    	reply="NO_DATA";
	  	    }
	  		
	  	 } catch (SQLException e){
		   	new Print(e.toString());
		   	new Print(e.getMessage());
		 	e.printStackTrace();
		 	reply="SELECT_ERROR";
		 	 
	  	 } finally{
			  try{
				  getConnection().close();
				  getStatement().close();
			       
			  } catch(Exception e){
				  new Print(e.toString());
				  new Print(e.getMessage());
				  e.printStackTrace();
			 }
		 }
		return reply;
	 }
	
	 public String insertUpdateData(String insertUpdate){
		  	 
		 try {			 	 
			  if(insertUpdate.startsWith("UPDATE")){
			    getStatement().executeUpdate(insertUpdate);
			    getStatement().executeUpdate("COMMIT");
		  	    reply="UPDATE_Ack";
		  		    
			  } else if(insertUpdate.startsWith("INSERT")){
				 getStatement().executeUpdate(insertUpdate);
				 getStatement().executeUpdate("COMMIT");
			  	 reply="INSERT_Ack";
			  }
			  
		 } catch(SQLException e){
			 new Print(e.toString());
			 new Print(e.getMessage());
			 e.printStackTrace();
			 reply="INSERT/UPDATE_ERORR";
			 	   
		 } finally{
				try{
				  getConnection().close();
				  getStatement().close();
				      
				} catch(Exception e){
					System.out.println(e.toString());
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
		 }
		 
		 return reply;
	 }
	 
	 public String deleteData(String insert){
		  	 
		 try {
			  getStatement().executeUpdate(insert);
			  getStatement().executeUpdate("COMMIT");
		  	  reply="DELETE_Ack";
			  
		 } catch(SQLException e){
			  new Print(e.toString());
			  new Print(e.getMessage());
			  e.printStackTrace();
			  reply="DELETE_ERORR";
			 	   
		 } finally{
				try{
				  getConnection().close();
				  getStatement().close();
				      
				} catch(Exception e){
					System.out.println(e.toString());
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
		    }
		 
		 return reply;
	 }	*/
	
	/* public void systemDisplay(String display){
	   DateTime dt=new DateTime();
	   //new Print("SystemDispaly: "+dt.getDateTime()+"   "+display);
	   serverInternalListModel.addElement(dt.getDateTime()+"   "+display);
	 }//End of systemDisplay()*/
	 
	 public Connection getConnection(){
	    return connection;
	 }
	 
	 public Statement getStatement(){
		 return statement;
	 }	
	 
	 public static void main(String[] args){
		 new ConnectToPostgresDatabase("VenLink Networks");
		 //String statement="SELECT * FROM in_payment WHERE cust_ref='0847775021'";
		 //ConnectToOracleDatabase connectToOracleDatabase=new ConnectToOracleDatabase(/*).getDataFromDB(*/statement);
		// new Print("Resultss: "+ new ConnectToOracleDatabase(statement).getReply());
	 }
}