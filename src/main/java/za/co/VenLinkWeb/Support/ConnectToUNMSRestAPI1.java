package za.co.VenLinkWeb.Support;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ConnectToUNMSRestAPI1 {
	//String endPoint="sites";
	String endPoint="devices";
	final String UNMS_API_URL ="https://10.10.10.110/nms/api/v2.1/";
	final String UNMS_API_KEY="x-auth-token";
	final String UNMS_API_TOKEN= "cdeb6bdf-0647-4142-97d9-35f1b70458a7";
	
    static HttpURLConnection connection;
	
    ConnectToUNMSRestAPI1(){
		connectTo_UNMS_RestAPIServer("GET", endPoint);
		//connectTo_UNMS_RestAPIServer("GET", /*endPoint*/"devices");		
	}

    ConnectToUNMSRestAPI1(String method, String endPoint){
    	connectTo_UNMS_RestAPIServer(method, endPoint);			
	}
	
	public void connectTo_UNMS_RestAPIServer(String method, String endPoint){
		try {
			doTrustToCertificates();
			// Creating a URL object
			URL url = new URL(UNMS_API_URL+endPoint);
	    	new Print("URL: "+url);  
			// Opening a connection
			/*HttpURLConnection*/ connection = (HttpURLConnection) url.openConnection();
	    	  
			// Including OAuth token in the request header
			connection.setRequestProperty(UNMS_API_KEY, UNMS_API_TOKEN);	            
			connection.setRequestProperty("Content-Type","application/json; charset=UTF-8" );
			
			// Setting the request method to GET
			connection.setRequestMethod(method);						
			connection.setDoOutput(true);//additionally added
			
			/*Map headerFields = connection.getHeaderFields();
	        new Print("header fields are: " + headerFields);*/
	        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	        
	       /* if(method.equalsIgnoreCase("GET")){
	        	sendGET(connection);
	        
	        } else if(method.equalsIgnoreCase("POST")){
	        	sendPOST(connection);
	        }*/       
			
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
			if (responseCode == HttpURLConnection.HTTP_OK){
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
			body.put("firstName", "Khathutshelo Duncan");
			body.put("lastName", "Manyuwa");
			body.put("age", "20");
			//String data_to_send = "{\"data\": \"Sample Data\"}";
			// connection.getOutputStream() purpose is to obtain an output stream for sending data to the server.
			try(DataOutputStream os = new DataOutputStream(connection.getOutputStream())){
				os.writeBytes(body.toString());
				os.flush();
			}
			
			// Get response code and handle response
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK){
                // HTTP_OK or 200 response code generally means that the server ran successfully without any errors
                StringBuilder response = new StringBuilder();

                // Read response content
                // connection.getInputStream() purpose is to obtain an input stream for reading the server's response.
                try (
                    BufferedReader reader = new BufferedReader(new InputStreamReader( connection.getInputStream()))) {
                    String line;
                    while ((line = reader.readLine()) != null){
                        response.append(line); // Adds every line to response till the end of file.
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
		new ConnectToUNMSRestAPI1("GET", "devices").sendGET(getConnection());;
	 }
}