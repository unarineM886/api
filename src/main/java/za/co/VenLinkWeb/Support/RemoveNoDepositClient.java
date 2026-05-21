package za.co.VenLinkWeb.Support;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.Vector;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class RemoveNoDepositClient
 */
public class RemoveNoDepositClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String nameSurname;
	private String empName;
	private String empSurname;
	private String userRight;
	private String clientReference;
	String pressedButtom=null;
	
	private String serverLink="http://10.10.10.202";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveNoDepositClient(){
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		removeNoDepClientHandler(request, response)	;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		new Print(" RemoveNoDepositClient() Servlet doPost() Method...........");
		try{
			pressedButtom=request.getParameter("submit");
			new Print("Add Pressed: "+ request.getAttribute("addPressed"));
			new Print("This is POST() Method....  "+getPressedButtom());
			
			if(pressedButtom!=null){
				new Print("Pressed Button: "+ getPressedButtom()+" ChangeRef: "+request.getAttribute("fromChangeRef"));
				if(getPressedButtom().equalsIgnoreCase("RemoveNoCoverageClient")||getPressedButtom().equalsIgnoreCase("DeleteClient")){
					removeNoDepClientPage(request, response);
				}
			
			} else{
				removeNoDepClientPage(request, response);
			}
			
		  } catch(Exception e){
			  new Print(e.toString());
			  new Print(e.getMessage());
			  e.printStackTrace();  
		  }
	}
	
	private String getPressedButtom() {
		return pressedButtom;
	}

	protected void removeNoDepClientPage(HttpServletRequest request, HttpServletResponse response/*, String method, String url, String message, String color*/) throws ServletException, IOException {
		try{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
  	
			HttpSession sesion=request.getSession(true);
			long sessionCreationTime=sesion.getCreationTime();
			long sessionLastAccessedTime=sesion.getLastAccessedTime();
			int maxInactiveInterval=sesion.getMaxInactiveInterval();
			new Print("sesionCreationTime: "+sessionCreationTime+" sesionLastAccessedTime: "+sessionLastAccessedTime+" maxInactiveInterval: "+maxInactiveInterval);
		  
			//String nameSurnameRight=(String)sesion.getAttribute("nameSurnameRight");
			final String nameSurnameRight = request.getAttribute("nameSurnameRight").toString();
			
			try{
				String[] NameSurnameRight=nameSurnameRight.split("##");
				nameSurname=NameSurnameRight[0]+" "+NameSurnameRight[1];
				new Print("Name Surname: "+getNameSurname());
				
				String []empNameSurname=nameSurname.split(" ");
				empName=empNameSurname[0];
				empSurname=empNameSurname[1];
				new Print("EmpName: "+getEmpName()+" EmpSurname: "+getEmpSurname());
				
				userRight=NameSurnameRight[2];
				new Print("UserRight: "+getUserRight());
				
			} catch(NullPointerException e){				
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Authenticator");
			    dispatcher.include(request, response);		    	
		        out.flush();
		        out.close();
			}
		
		String getRefSQL=null;
			
		if(getPressedButtom().equalsIgnoreCase("RemoveNoCoverageClient")) {
			getRefSQL="SELECT cust_ref||'##'||cust_surname||'_'|| cust_name CELL_REF FROM enquiry WHERE no_deposit_cust='YES' AND secured IS NULL";
		
		} else if(getPressedButtom().equalsIgnoreCase("DeleteClient")) {
			getRefSQL="SELECT CO.cust_ref||'##'||CO.cust_surname||'_'|| CO.cust_name CELL_REF FROM customer CO, in_payment IP WHERE CO.cust_ref=IP.cust_ref GROUP BY CO.cust_name, CO.cust_ref, CO.order_date, CO.order_status, CO.cust_surname, CO.order_date, IP.cust_ref HAVING CO.order_status IN('Scheduled') AND SUM(IP.amount)=0 ORDER BY CO.order_date";
			
		}
		 	Vector referenceVector = new Vector();
		 	referenceVector.add("-Select-");
		 			 	 
	 	    String[][] data={
	 	    				{getRefSQL, "CELL_REF"},
	 	    			};
	 	    
	 	    for(int i=0;i<data.length;i++){
	 	    	ConnectToPostgresDatabase connect=new ConnectToPostgresDatabase();
		 	      
	 	    	try{
	 	    		new Print("SQL: "+data[i][0]);
	 	    		ResultSet rs=connect.getStatement().executeQuery(data[i][0]);
	 	    	
	 	    		if(i==0){
	 	    			while(rs.next()){
	 	    				referenceVector.add(rs.getString("CELL_REF").replace(" ", "@"));		 	    		 
	 	    			}
		 			}
	 	    		
	 	    	} catch(Exception e){
	 	    		new Print(e.toString());
	 	    		new Print(e.getMessage());
	 	    		e.printStackTrace();
			   
	 	    	} finally{
	 	    		try{
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
		 	  
	 	     out.println("<HTML><TITLE>VenLink Networks Managemnet System</TITLE>"+		
						  "<BODY bgcolor=grey>"+
	
			"<table title=shell id=shell width=700 border=0 cellspacing=5 cellpadding=1 bgcolor=white>"+
  			
			//"<!-- Heading/Banner Panel -->"
	
	             "<tr bgcolor=brown height=60>"+
	        	   "<td colspan=8>"+
	
			//Sign in Form
				 "<TABLE width=700 border=1 cellspacing=1 cellpadding=1 id=main>"+    
	             	"<tr bgcolor=brown>" +
	             	  "<td width=270><img WIDTH=270  HEIGHT=50 src=Images/KDMDrilling_Logo.JPG></td>"+
             	 	  "<td width=350><H1>Management System</H1></td>" +
	             	"</tr>"+
	              "</table>"+
		        "</td>"+
		       "</tr>"+
	
			//"<!-- Top Navigation Panel -->"
				"<tr bgcolor=brown height=30>"+
				   "<td colspan=8>"+	
					"<TABLE width=700 border=1 cellspacing=1 cellpadding=1 id=main>"+	    
						   
						"<tr bgcolor=red height=10>"+
							"<td width=50><a href="+""+getServerLink()+":8080/VenLinkWeb/DashBoard"+" style=text-decoration:none;>Orders</a></td>"+
							//"<td width=70><a href="+""+getServerLink()+":8080/VenLinkWeb/Accounts"+" style=text-decoration:none;>Accounts</a></td>"+
							//"<td width=70><a href="+""+getServerLink()+":8080/VenLinkWeb/drillLogCustomerReferenceSelection"+" style=text-decoration:none;>Drill Log</a></td>"+
                        	//"<td width=70><a href="+""+getServerLink()+":8080/VenLinkWeb/DrillingLog"+" style=text-decoration:none;>Drill Log</a></td>"+
							//"<td width=100><a href="+""+getServerLink()+":8080/VenLinkWeb/DrillingReport"+" style=text-decoration:none;>Daily Report</a></td>"+
							//"<td width=70><a href="+""+getServerLink()+":8080/VenLinkWeb/ReceiptHandling"+" style=text-decoration:none;>Receipts</a></td>"+
							//"<td width=70><a href="+""+getServerLink()+":8080/VenLinkWeb/QuotationHandling"+" style=text-decoration:none;>Quotation</a></td>"+
							"<td colspan=4 align=center><font size=3>&nbsp</font></td>"+
						"</tr>"+	

					"</table>"+
				  "</td>"+
				"</tr>"+
			       	 	          
        	    "<tr bgcolor=brown>" +
        	      "<td align=center>" +
        	    
        	       "<FORM name='form1' METHOD='GET' ACTION='"+getServerLink()+":8080/VenLinkWeb/RemoveNoDepositClient' id='drillLogCustomerReferenceSelection'>"+
        		     "<TABLE width=150 border=1 cellspacing=1 cellpadding=1 name=serviceSelection>"+
					 	
					 //Row2
						"<TR bgcolor=white>"+
							"<TD><font color=red> Ref/Phone#:&nbsp</font></TD>"+
	 	    		 		"<TD><SELECT NAME=custReference>");
	 	     				for(int l=0; l<=(referenceVector.size()-1); l++){
	 	     					out.println("<OPTION VALUE="+referenceVector.elementAt(l)+">"+referenceVector.elementAt(l)+"</OPTION>");
	 	     				}
	 	     			out.println("</SELECT>"+
							"</TD>"+
				    	"</TR>"+					 
				    	
				    	"<TR>"+		
	             		  // "<TD>&nbsp</TD>"+
	             		 "<td colspan=2 align=center><INPUT TYPE=SUBMIT VALUE=Submit NAME=submit></td>"+
	             		  // "<TD align=center colspan=2><INPUT TYPE=SUBMIT VALUE=Add NAME=submit</TD>"+
	             		"</TR>"+
		        
			      "</TABLE>"+//end of table "serviceSelection"
			    "</FORM>"+

		   "</table>"+		//end of table "shell"
	  	 "</BODY></HTML>" );
		 out.flush();
		 out.close();
	  	   
      } catch(Exception e){
    	  new Print(e.getMessage());
    	  e.printStackTrace();
	  }
	}
	
	private String getUserRight() {
		return userRight;
	}

	private String getEmpSurname() {
		return empSurname;
	}

	private String getEmpName() {
		return empName;
	}

	private String getNameSurname() {
		return nameSurname;
	}
	
	private String getServerLink() {
		return serverLink;
	}

	private void removeNoDepClientHandler(HttpServletRequest request, HttpServletResponse response){
		try{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();	
		
			String []referenceSurname=request.getParameter("custReference").split("##");
			clientReference=referenceSurname[0];
			new Print("ClientReference: "+getClientReference());
			/*String surnameName=referenceSurname[1];
			new Print("SurnameName: "+surnameName);*/
		
			if(getClientReference().length()==0){
				new Print("No reference Data.....");
				alert(out,"Input Reference Number!");
				
			} else{
				new Print("removeNoDepClientHandler() PressedButtom: "+ getPressedButtom());
				
				if(getPressedButtom().equalsIgnoreCase("RemoveNoDepClient")) {
				String[] removeNoDepositCustSQL={"UPDATE enquiry SET no_deposit_cust='NO' WHERE cust_ref='"+getClientReference()+"' "};    
				for(int j=0; j<removeNoDepositCustSQL.length; j++){
					new Print("InsertInPaymentSQL: "+removeNoDepositCustSQL[j]);
					InsertUpdateDeleteData updateData=new InsertUpdateDeleteData(removeNoDepositCustSQL[j]);
				} 
				//if(isUpdateCustOrderSuccesfull()){		    	
				alert(out,"NoCoverage Client Deleted Successfully!");	 
				//}
				
				} else if(getPressedButtom().equalsIgnoreCase("DeleteClient")) {
					String deleteInPayment="DELETE FROM in_payment WHERE cust_ref='"+getClientReference()+"' ";
					String deleteCustOrderPayment="DELETE FROM customer WHERE cust_ref='"+getClientReference()+"' ";
					String[] deleteInPaymentCustOrder={deleteInPayment,deleteCustOrderPayment};
		  	
					for(int j=0; j<deleteInPaymentCustOrder.length; j++){
						new Print("InsertInPaymentSQL: "+deleteInPaymentCustOrder[j]);
						InsertUpdateDeleteData updateData=new InsertUpdateDeleteData(deleteInPaymentCustOrder[j]);
					}				
					
					//if(isUpdateCustOrderSuccesfull()){		    	
						alert(out,"Client Deleted Successfully!");	 
					
					//}
				}
				
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/DashBoard");
				dispatcher.include(request, response);			    	
				out.flush();
				out.close();
			}
			
		} catch(Exception e){
			new Print(e.toString());
			new Print(e.getMessage());
			e.printStackTrace();
		}		
	}
	
	public void alert(PrintWriter out, String alertMessage){
		new Print("Alert Running...."+ alertMessage);
		out.println("<HTML><TITLE>VenLink Networks Log</TITLE>"+
		  		"<body>"+
  				   "<script language='javascript' type='text/javascript'>"+
  			 	      "alert('"+alertMessage+"');"+
  			 	     // "return false;"+
  			 	   "</script>"+						  
		        "</body>"+
		       "</HTML>");	
	}

	private String getClientReference() {
		return clientReference;
	}
}