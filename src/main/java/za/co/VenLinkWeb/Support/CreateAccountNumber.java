package za.co.VenLinkWeb.Support;

import java.sql.ResultSet;

public class CreateAccountNumber {	
	private String custSurname;
	private String custName;
	private String custTitle;
	
	public CreateAccountNumber(String custSurname, String custName, String custTitle){
		this.custSurname=custSurname.trim();
		new Print("Cust_Surname: "+getCustSurname());		
		this.custName=custName.trim();
		new Print("Cust_Name: "+getCustName());		
		this.custTitle=custTitle.trim();
		new Print("Cust_Title: "+getCustTitle());		
	}
	
	public static void main(String[] args){
		new CreateAccountNumber( "Manyuwa", "Duncan  Khathu", "Mr").getAccountNumber();
	}
	
	public String getClient3Initial(String fullName){
		new Print("Full_Name: "+fullName);
		String initials=null;
		String[] initial=fullName.split(" ");
		if(initial.length==3){
			initials=initial[0].substring(0,1).toUpperCase()+initial[1].substring(0,1).toUpperCase()+initial[2].substring(0,1).toUpperCase();	
			new Print("Initials_3: "+initials);
		
		} else if(initial.length==2){
			initials=initial[0].substring(0,1).toUpperCase()+initial[1].substring(0,1).toUpperCase();	
			new Print("Initials_2: "+initials);
		
		} else if(initial.length==1) {
			initials=getCustName().substring(0, 1).toUpperCase()+"0";
			new Print("Initials_1: "+initials);
		}
		return initials;
	}
	
	protected String getAccountNumber(){
		String nextAccountNumber=null;
		String accountNumInitial=null;
		
		if("Company".equalsIgnoreCase(getCustTitle())){
			accountNumInitial=getClient3Initial(getCustSurname());
			new Print("Company_AccountNumInitial: "+accountNumInitial);
			if(accountNumInitial.length()==2) {
				accountNumInitial=accountNumInitial+"0";
			}
			new Print("Company_AccountNumInitial: "+accountNumInitial);
			
		} else if("School".equalsIgnoreCase(getCustTitle())){
			accountNumInitial=getClient3Initial(getCustSurname());
			if(accountNumInitial.length()==2) {
				accountNumInitial=accountNumInitial+"0";
			}
			new Print("School_AccountNumInitial: "+accountNumInitial);
		
		} else{			
			accountNumInitial=getCustSurname().substring(0, 1)+getClient3Initial(getCustName());
			new Print("AccountNumInitial: "+accountNumInitial);
		}
		
		//Check if the initial already exist as someone account number and if so increase the number by 1
		String checkCustomerSQL="SELECT account_num MAX_ACC_NUM FROM customer WHERE account_num LIKE '"+accountNumInitial+"%' ";			  
		if(new DoesRecordAlreadyExist(checkCustomerSQL).doesRecordAlreadyExist()){
			new Print ("ACCOUNT_EXISTS.... ");
			try{
				String[] getAccountNumberSQL={"SELECT MAX(account_num) MAX_ACC_NUM FROM customer WHERE account_num LIKE '"+accountNumInitial+"%' "};
			
		       int nextAccountNum=0;
		       for(int i=0; i<getAccountNumberSQL.length; i++){ 	    	
		    	   ConnectToPostgresDatabase  connect=new ConnectToPostgresDatabase();
		    	   ResultSet rs=connect.getStatement().executeQuery(getAccountNumberSQL[i]);			 	    	
		    	   while(rs.next()){
		    		   String currentMaxAccountNum=rs.getString("MAX_ACC_NUM");
		    		   new Print("CurrentMaxAccountNum: "+currentMaxAccountNum);
		    		   nextAccountNum=Integer.parseInt(currentMaxAccountNum.replace(accountNumInitial, ""))+1;
		    		   new Print("nextAccountNum: "+nextAccountNum+ " NumberOfInteger: "+String.valueOf(nextAccountNum).length());			 			
		    	   }
		       }
		       
		       if(String.valueOf(nextAccountNum).length()==1){
		    	   nextAccountNumber=accountNumInitial+"00"+nextAccountNum;
			
		       } else if(String.valueOf(nextAccountNum).length()==2){
		    	   nextAccountNumber=accountNumInitial+"0"+nextAccountNum;
			
		       } else if(String.valueOf(nextAccountNum).length()==3){
		    	   nextAccountNumber=accountNumInitial+nextAccountNum;
		       }		
		       new Print ("NextAccountNumber: "+nextAccountNumber);
			
			} catch(Exception e){
		    	 new Print(e.getMessage());
		    	 e.printStackTrace();
			}
			
		} else {
			new Print ("NO_ACCOUNT_EXISTS.... ");
			nextAccountNumber=accountNumInitial+"001";
			new Print ("NextAccountNumber: "+nextAccountNumber);			
		}		 
		 return nextAccountNumber;			
	}

	private String getCustSurname(){
		return custSurname;
	}
	
	private String getCustTitle(){
		return custTitle;
	}
	
	private String getCustName(){
		return custName;
	}
}