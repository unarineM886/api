package za.co.VenLinkWeb.Support;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.sql.ResultSet;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ConnectToUCRMRestAPI1 {
	final String UCRM_API_URL ="https://10.10.10.110/crm/api/v1.0/";
	private String endPoint="clients";	
	final String UCRM_API_KEY="DYGz/gWwBq8NqpX52oauezJcuMoNRkEU6tu+yHm+5S89ZAVFUGOgslfLWCMWRxDB";
	private int servicePlanId;
	private int servicePlanPeriodId;
	private int servicePlanPrice;
	
    static HttpURLConnection connection;
	
    ConnectToUCRMRestAPI1(){
		connectTo_UCRM_RestAPIServer("GET", getEndPoint());
		//connectTo_UNMS_RestAPIServer("GET", /*endPoint*/"devices");		
	}	

    private String getEndPoint() {
		return endPoint;
	}

	public ConnectToUCRMRestAPI1(String method, String endPoint){
		connectTo_UCRM_RestAPIServer(method, endPoint);			
	}	
	
	public void connectTo_UCRM_RestAPIServer(String method, String endPoint){
		new Print("method: "+method+" End_Point: "+endPoint);
		try {
			doTrustToCertificates();
			// Creating a URL object
			URL url = new URL(UCRM_API_URL+endPoint);
			new Print("URL: "+url);  
	    	  
			// Opening a connection
			/*HttpURLConnection*/ connection = (HttpURLConnection) url.openConnection();
	    	  
			// Including OAuth token in the request header
			connection.setRequestProperty("X-Auth-App-Key", UCRM_API_KEY);	            
			connection.setRequestProperty("Content-Type","application/json" );
			
			/*// Setting the request method to GET
			connection.setRequestMethod(method);*/
						
			connection.setDoOutput(true);//additionally added
						
			// Setting the request method to GET
			if(method.equalsIgnoreCase("PATCH")){
				connection.setRequestMethod("POST");
				connection.setRequestProperty("X-HTTP-Method-Override", "PATCH"); // Override with PATCH		        
							
			} else {
				connection.setRequestMethod(method);
			}	
			
			/*Map headerFields = connection.getHeaderFields();
	        new Print("header fields are: " + headerFields);*/
	        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	        			
	        /*if(method.equalsIgnoreCase("GET")){
	        	sendGET(connection);
	        
	        } else if(method.equalsIgnoreCase("POST")){
	        	addClientServiceToUisp(connection);
	        	//sendPOST(connection);
	        }   */ 
			
		} catch (Exception e){
			e.printStackTrace();
		}		
		//return connection;
	}	
	
	public void sendGET(HttpURLConnection connection){
		try {
			// Retrieving the response code
			int responseCode = connection.getResponseCode();
			new Print("ResponseCode: "+ responseCode);
			
			// Processing the response
			if (responseCode == HttpURLConnection.HTTP_OK||responseCode == 201){
				//new Print()
				BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				String inputLine;
				StringBuilder response = new StringBuilder();
				
				while ((inputLine = in.readLine()) != null){
					response.append(inputLine+"\n");
				}
							
				in.close();
				//new Print("API Response: " + response.toString());				
				//Using the JSON simple library parse the string into a json object
				JSONParser jasonParser = new JSONParser();
				JSONArray dataArray=(JSONArray)jasonParser.parse(response.toString());
				//JSONObject data_obj = (JSONObject) jasonParser.parse(response.toString());
				
				for(int i=0; i<dataArray.size();i++){
					JSONObject data_obj= (JSONObject) dataArray.get(i);
					//Get the required object from the above created object
					//JSONObject obj = (JSONObject) data_obj.get("firstName");
					new Print("Client#: ["+i+"]");
					//Get the required data using its key				
					new Print("ID: "+data_obj.get("id")+"; FISRT_NAME: "+data_obj.get("firstName")+"; LAST_NAME: "+data_obj.get("lastName")+"; FULL_ADDRESS: "+data_obj.get("fullAddress"));
					//new Print("FISRT_NAME: "+data_obj.get("firstName"));
					//new Print("LAST_NAME: "+data_obj.get("lastName"));
					//new Print("FULL_ADDRESS: "+data_obj.get("fullAddress"));
				
					//Fetch nested JSON using JSONArray
					JSONArray arrayObj=(JSONArray)data_obj.get("contacts");
					for(int j=0; j<arrayObj.size(); j++){
						JSONObject contact = (JSONObject)arrayObj.get(j);
						new Print("EMAIL: "+contact.get("email")+ "; PHONE: "+contact.get("phone"));
						//new Print("PHONE: "+contact.get("phone"));
					}
				}
				                
			} else {
				new Print("API Call Failed. Response Code: " + responseCode);
			}
        
		} catch (Exception e) {
            // If any error occurs during api call it will go into catch block
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }	
	
	public void sendPOST(HttpURLConnection connection){
		try {
			//Calling the API and send request data
			//JSON String which will be sent to the API.
			JSONObject body = new JSONObject();
			//body.put("userIdent", "Khathutshelo Duncan");
			body.put("firstName", "Khathutshelo Duncan");
			body.put("lastName", "Manyuwa");
			//body.put("age", "20");
			//new Print("Body:  "+body.toString());
			//String data_to_send = "{\"data\": \"Sample Data\"}";
			// connection.getOutputStream() purpose is to obtain an output stream for sending data to the server.
			DataOutputStream os = new DataOutputStream(connection.getOutputStream());
				os.writeBytes(body.toString());
				os.flush();
				os.close();
			//}
			
			// Get response code and handle response
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK||responseCode == 201){
                // HTTP_OK or 200 response code generally means that the server ran successfully without any errors
                StringBuilder response = new StringBuilder();

                // Read response content
                // connection.getInputStream() purpose is to obtain an input stream for reading the server's response.
                try (
                    BufferedReader reader = new BufferedReader(new InputStreamReader( connection.getInputStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null){
                    	new Print("Line: "+ line);
                        response.append(line); //Adds every line to response till the end of file.
                    }
                }
                System.out.println("Response: " + response.toString());
            
            } else {            	
                System.out.println("Error: HTTP Response code - " + responseCode);
            }
            connection.disconnect();
        
		} catch (Exception e) {
            // If any error occurs during api call it will go into catch block
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }	
	
	private void setServicePlanPeriodId(String getServicePlanIdSQL){
		new Print("Service_Plan_Id_SQL: "+getServicePlanIdSQL);
		ConnectToPostgresDatabase connect=new ConnectToPostgresDatabase();
		   try{
			   ResultSet rs=connect.getStatement().executeQuery(getServicePlanIdSQL);
	    	   while(rs.next()){
	    		   servicePlanId=Integer.parseInt(rs.getString("SERV_PLAN_ID"));
	    		   servicePlanPeriodId=Integer.parseInt(rs.getString("SERV_PLAN_PER_ID"));
	    		   servicePlanPrice=Integer.parseInt(rs.getString("SERV_PLAN_PRICE"));	   	    	
	    	   }
	    	   new Print("Service_Plan_Id: "+getServicePlanId()+" Service_Plan_Period_Id: "+getServicePlanPeriodId()+" Service_Plan_Price: "+getServicePlanPrice());
	    	
		   } catch (Exception e) {
	            // If any error occurs during api call it will go into catch block
	            System.out.println(e.toString());
	            e.printStackTrace();
	       
		   } finally {
				try {
					new Print("CLOSING CONNECTION TO THE DB...");					  
					connect.getConnection().close();
					connect.getStatement().close();
					new Print("CONNECTION TO THE DB CLOSED");
					       
				} catch(Exception e){
					new Print(e.toString());
					new Print(e.getMessage());
					e.printStackTrace();
				}
		   }
	}
	
	private int getServicePlanPrice() {
		return servicePlanPrice;
	}

	private int getServicePlanId() {
		return servicePlanId;
	}

	private int getServicePlanPeriodId() {
		return servicePlanPeriodId;
	}

	private void addClientServiceToUisp(HttpURLConnection connection){
		try {
			String getServicePlanSQL="SELECT service_plan FROM customer WHERE cust_ref='0847775021' ";
			String getServicePlanIdSQL="SELECT id SERV_PLAN_ID, service_plan_period_id SERV_PLAN_PER_ID, service_plan_price SERV_PLAN_PRICE FROM ucrm_service_plan WHERE service_plan_name=("+getServicePlanSQL+") AND service_plan_period=1 ";
			setServicePlanPeriodId(getServicePlanIdSQL);
		    
			//Calling the API and send request data
			//JSON String which will be sent to the API.
			JSONObject bodyPayload = new JSONObject();
			//bodyPayload.put("servicePlanId", getServicePlanId());
			//bodyPayload.put("clientId", 807);
			bodyPayload.put("servicePlanPeriodId", getServicePlanPeriodId());
			//bodyPayload.put("prepaid", false);
			//bodyPayload.put("activeFrom", new DateTime(1).dateFormatChange("MM/dd/yyyy", "yyyy-MM-dd'T'HH:mm:ssXXX", "02/03/2024"));
			//bodyPayload.put("price", getServicePlanPrice());
			//bodyPayload.put("invoicingPeriodType", 1);
			//bodyPayload.put("invoicingProratedSeparately", true);
			//bodyPayload.put("invoicingSeparately", false);
			bodyPayload.put("invoicingPeriodStartDay", Integer.parseInt("22"));
			bodyPayload.put("invoicingStart", new DateTime(1).dateFormatChange("MM/dd/yyyy", "yyyy-MM-dd'T'HH:mm:ssXXX", "02/03/2024"));
			//2016-09-12T00:00:00+0000
			new Print("Service_Body_Pay_Load: "+bodyPayload.toString());
			
			try(DataOutputStream os = new DataOutputStream(connection.getOutputStream())) {
				os.writeBytes(bodyPayload.toString());
				os.flush();
			};
			
			// Get response code and handle response
            int responseCode = connection.getResponseCode();
            new Print("ResponseCode: "+responseCode);

            if (responseCode == HttpURLConnection.HTTP_OK||responseCode == 201) {
            	new Print("CLIENT_SERVICE POST Successfull..........");
                // HTTP_OK or 200 response code generally means that the server ran successfully without any errors
                StringBuilder response = new StringBuilder();

                // Read response content
                // connection.getInputStream() purpose is to obtain an input stream for reading the server's response.
                try (
                    BufferedReader reader = new BufferedReader( new InputStreamReader( connection.getInputStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        response.append(line); // Adds every line to response till the end of file.
                    }
                }
                System.out.println("Response: " + response.toString());               
                //updateCustomerServiceId(response);
                
            } else {
                System.out.println("Error: HTTP Response code - " + responseCode);
                StringBuilder response = new StringBuilder();
                try (
                        BufferedReader reader = new BufferedReader( new InputStreamReader( connection.getInputStream()))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                        	new Print("Line:   "+line);
                            response.append(line); // Adds every line to response till the end of file.
                        }
                    }                
            }
            connection.disconnect();
		
		} catch (Exception e) {
            // If any error occurs during api call it will go into catch block
            System.out.println(e.toString());
            e.printStackTrace();
        }
	}
	
	 public void doTrustToCertificates() throws Exception {
	        //Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider()); /*has been diabled due to error*/
	        TrustManager[] trustAllCerts = new TrustManager[]{
	                new X509TrustManager() {
	                    public X509Certificate[] getAcceptedIssuers() {
	                        return null;
	                    }

	                    public void checkServerTrusted(X509Certificate[] certs, String authType) throws CertificateException {
	                        return;
	                    }

	                    public void checkClientTrusted(X509Certificate[] certs, String authType) throws CertificateException {
	                        return;
	                    }
	                }
	        };

	        SSLContext sc = SSLContext.getInstance("SSL");
	        sc.init(null, trustAllCerts, new SecureRandom());
	        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
	        HostnameVerifier hv = new HostnameVerifier() {
	            public boolean verify(String urlHostName, SSLSession session) {
	                if (!urlHostName.equalsIgnoreCase(session.getPeerHost())) {
	                    System.out.println("Warning: URL host '" + urlHostName + "' is different to SSLSession host '" + session.getPeerHost() + "'.");
	                }
	                return true;
	            }
	        };
	        HttpsURLConnection.setDefaultHostnameVerifier(hv);
	}
	 
	 public static HttpURLConnection getConnection(){
		 return connection;
	 }

	 public static void main(String[] args){
		new ConnectToUCRMRestAPI1("POST", "clients/807/services")/*.sendPOST(getConnection())*/;
	 }
}