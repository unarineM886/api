package za.co.VenLinkWeb.Support;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class CalculateWirelessInternetCost{
	private String internetService;
	private String installEndDate;
	private String callOut;
	private String miniUPS;
	//private String referal;
	private String referedBy;
	private String refereeFullName;
	
	private int labourHour=0;
	private int kiloMeter=0;				
	private int installRate;
	private int kilometerRate=0;
	private int miniUPSRate;
	private int labourRate;
	private int callOutRate;
	
	private int discount;
	private int installationCost;
	private int miniUPSCost;
	private int labourCost;
	private int kilometerCost;
	private int totalInstallationCostVatExcl;
	private int callOutCost;
	private int refererReferalRate;
	private int refereeReferalRate;
	private int refererReferalCost;
	private int refereeReferalCost;
	private int installDiscount;
	
	private boolean isVatCheckBoxSelected=false;
	private boolean isNoInstallCost=false;
	
	private double vatAmount;
	private double balance;
	private double totalInstallationCostVatInc;
	private double vatRate=15;
	
	private ArrayList depositRowDataArrayList=new ArrayList();
	private ArrayList labourRowDataArrayList=new ArrayList();
	private ArrayList callOutRowDataArrayList=new ArrayList();
	private ArrayList kilometerRowDataArrayList=new ArrayList();
	
	private ArrayList totalCostRowDataArrayList=new ArrayList();
	private ArrayList totalDueRowDataArrayList=new ArrayList();
	private ArrayList totalVATRowDataArrayList=new ArrayList();
	private ArrayList totalIncCostRowDataArrayList=new ArrayList();
	private ArrayList allInstallationDataArrayList= new ArrayList();
	private ArrayList customerInvoiceDataArrayList= new ArrayList();
	
	private ArrayList installationRowDataArrayList=new ArrayList();
	private ArrayList refererProgramRowDataArrayList=new ArrayList();
	private ArrayList refereeProgramRowDataArrayList=new ArrayList();
	private ArrayList installationDiscountRowDataArrayList=new ArrayList();	
	private ArrayList miniUPSRowDataArrayList=new ArrayList();
	private ArrayList discountRowDataArrayList=new ArrayList();	
	
	final String columnNames[]=new String[]{"Description", "Unit", "Qty", "Rate", "Total"};
	private DefaultTableModel installInfoTableModel= new DefaultTableModel(null,columnNames);
	private DefaultTableModel referalProgramTableModel= new DefaultTableModel(null,columnNames);
	
	private int numberOfMonthBetween;
	private int numberOfProRataDays;
	/*private String monthlyInvoiceStartDate;
	private String monthlyInvoiceEndDate;*/
			
	public CalculateWirelessInternetCost(ArrayList variableQty, ArrayList variableRate, ArrayList variableOther){
		new Print("calculateWirelessInternetCost() Class..... ");
		//Used by InstallLog() And QuotationHandler()
		
		//Quantity
		this.kiloMeter=Integer.parseInt(variableQty.get(0).toString());
		new Print("Kilo_Meter: "+kiloMeter);
		this.labourHour=Integer.parseInt(variableQty.get(1).toString());
		new Print("Labour_Hour: "+getLabourHour());
		
		//Rates
		new Print("Calc() VariableRate Size: "+variableRate.size());
		this.installRate=Integer.parseInt(variableRate.get(0).toString());
		new Print("Install_Rate: "+getInstallRate());
		this.miniUPSRate=Integer.parseInt(variableRate.get(1).toString());
		new Print("mini_UPS_Rate: "+getMiniUPSRate());
		this.kilometerRate=Integer.parseInt(variableRate.get(2).toString());
		new Print("Kilo_Meter_Rate: "+getKilometerRate());
		this.labourRate=Integer.parseInt(variableRate.get(3).toString());
		new Print("Labour_Rate: "+getLabourRate());
		this.callOutRate=Integer.parseInt(variableRate.get(4).toString());
		new Print("call_Out_Rate: "+getCallOutRate());
		this.installDiscount=Integer.parseInt(variableRate.get(5).toString());
		new Print("CalculateWirelessInternetCost() Install_Discount: "+getInstallDiscount());
		this.refererReferalRate=Integer.parseInt(variableRate.get(6).toString());
		new Print("CalculateWirelessInternetCost() Referer_Referal_Rate: "+getRefererReferalRate());		
		this.refereeReferalRate=Integer.parseInt(variableRate.get(7).toString());
		new Print("CalculateWirelessInternetCost() Referee_Referal_Rate: "+getRefereeReferalRate());		
		
		//Other
		this.internetService=variableOther.get(0).toString();
		new Print("Internet_Service: "+getInternetService());
		this.callOut=variableOther.get(1).toString();
		new Print("Call_Out: "+getCallOut());
		this.miniUPS=variableOther.get(2).toString();
		new Print("Mini_UPS: "+getMiniUPS());
		/*this.referal=variableOther.get(3).toString();
		new Print("Referal: "+getReferal());*/
		this.refereeFullName=variableOther.get(3).toString();
		new Print("Referee_Full_Name: "+getRefereeFullName());
		this.referedBy=variableOther.get(4).toString();
		new Print("Refered_By: "+getReferedBy());
		this.isVatCheckBoxSelected=(boolean)variableOther.get(5);
		new Print("isVatCheckBoxSelected: "+isVatCheckBoxSelected());
		this.isNoInstallCost=(boolean)variableOther.get(6);
		new Print("CALC*() isNoInstallCost: "+isNoInstallCost());
		
		this.numberOfMonthBetween=(int) variableOther.get(7);
		new Print("CALC*() NumberOfMonthBetween: "+getNumberOfMonthBetween());
		this.numberOfProRataDays=(int)variableOther.get(8);
		/*this.monthlyInvoiceStartDate=(String)variableOther.get(9);
		new Print("CALC*() MonthlyInvoiceStartDate: "+getMonthlyInvoiceStartDate());
		this.monthlyInvoiceEndDate=(String)variableOther.get(10);
		new Print("CALC*() MonthlyInvoiceEndDate: "+getMonthlyInvoiceEndDate());*/		
		calculateWirelessInternetCost();
	}	

	private int getNumberOfProRataDays() {
		return numberOfProRataDays;
	}
	
	/*private String getMonthlyInvoiceEndDate() {
		return monthlyInvoiceEndDate;
	}

	private String getMonthlyInvoiceStartDate() {
		return monthlyInvoiceStartDate;
	}*/

	private int getNumberOfMonthBetween() {
		return numberOfMonthBetween;
	}

	public CalculateWirelessInternetCost(ArrayList variableQty, ArrayList variableRate, ArrayList variableOther, String other) {
		//Used by CustomerVatInvoice()
		//Quantity
		this.kiloMeter=Integer.parseInt(variableQty.get(0).toString());
		new Print("kiloMeter: "+getKiloMeter());
		this.labourHour=Integer.parseInt(variableQty.get(1).toString());
		new Print("labourHour: "+getLabourHour());
		
		//Rate
		this.installRate=Integer.parseInt(variableRate.get(0).toString());
		new Print("installRate: "+getInstallRate());
		this.miniUPSRate=Integer.parseInt(variableRate.get(1).toString());
		new Print("miniUPSRate: "+getMiniUPSRate());
		this.labourRate=Integer.parseInt(variableRate.get(2).toString());
		new Print("LabourRate: "+getLabourRate());
		this.kilometerRate=Integer.parseInt(variableRate.get(3).toString());
		new Print("KilometerRate: "+getKilometerRate());
	
		//Other
		this.internetService=variableOther.get(0).toString();
		new Print("internetService: "+getInternetService());
		this.isVatCheckBoxSelected=(boolean)variableOther.get(1);
		this.installEndDate=variableOther.get(2).toString();
		new Print("installEndDate: "+getInstallEndDate());
		this.isNoInstallCost=(boolean)variableOther.get(3);
		new Print("CALC*() IsNoCostInstalling: "+isNoInstallCost());		
		calculateWirelessInternetCost();
	}
	
	public void calculateWirelessInternetCost(){
		try{			
			installationCost=getInstallRate()*1;
			new Print("IstallationCost: "+getInstallationCost());			
			
			if(getMiniUPS().equalsIgnoreCase("NO")){
				miniUPSCost=0;
				new Print("MiniUPSCost: "+getMiniUPSCost());
				
			} else {
				miniUPSCost=getMiniUPSRate()*1;
				new Print("MiniUPSCost: "+getMiniUPSCost());
			}
			
			if("Own Client".equalsIgnoreCase(getReferedBy())){
				refererReferalCost=0;
				new Print("RefererReferalCost: "+getRefererReferalCost());
				refereeReferalCost=0;
				new Print("RefereeReferalCost: "+getRefereeReferalCost());
				
			} else {
				refererReferalCost=getRefererReferalRate()*1;
				new Print("refererReferalCost: "+getRefererReferalCost());
				refereeReferalCost=getRefereeReferalRate()*1;
				new Print("refereeReferalCost: "+getRefereeReferalCost());
			}
			
			if(getCallOut().equalsIgnoreCase("NO")){
				callOutCost=0;
				new Print("CallOutCost: "+getCallOutCost());
				labourCost=0;
				new Print("labourCost: "+getLabourCost());
				kilometerCost=0;
				new Print("KilometerCost: "+getKilometerCost());
				
			} else {
				callOutCost=getCallOutRate()*1;
				new Print("CallOutCost: "+getCallOutCost());
				
				labourCost=getLabourHour()*getLabourRate();
				new Print("labourCost: "+getLabourCost());
				
				kilometerCost=getKiloMeter()*getKilometerRate();
				new Print("KilometerCost: "+getKilometerCost());
			}			
			
			totalInstallationCostVatExcl=getInstallationCost()+getMiniUPSCost()+getCallOutCost()+getLabourCost()+getKilometerCost()-getInstallDiscount();
		    new Print("totalInstallationCostVatExcl: "+getTotalInstallationCostVatExcl());
			
		    if(isNoInstallCost()){
		    	totalInstallationCostVatExcl=0;
		    }
		    
		    totalInstallationCostVatInc=totalInstallationCostVatExcl+getVatAmount();
		    new Print("totalInstallationCostVatInc: "+getTotalInstallationCostVatInc());		    
		    new Print("VatAmount: "+getVatAmount());
		    
	    } catch(Exception e) {
			new Print(e.toString());
			e.getStackTrace();
			e.printStackTrace();
			e.getMessage();
		}
	}
	
	public void populateRereralProgramTable(String quoteInstallLogInvoice){
		new Print("populateReferalProgramTable Method()....." );	
		/*new Print("Customer_Invoice_Data_ArrayList Size BEFORE: "+customerInvoiceDataArrayList.size());
		customerInvoiceDataArrayList.clear();		
		new Print("Customer_Invoice_Data_ArrayList Size AFTER: "+customerInvoiceDataArrayList.size());*/
		if(getRefererReferalCost()>0){
			refereeProgramRowDataArrayList.clear();
			refereeProgramRowDataArrayList.add("Referal Program (Refered by: "+getReferedBy()+")");
			refereeProgramRowDataArrayList.add("SUM");
			refereeProgramRowDataArrayList.add("1");
			refereeProgramRowDataArrayList.add(-(getRefereeReferalRate()));
			refereeProgramRowDataArrayList.add(new ConvertNumberFormat().randCurrencyFormat(String.valueOf(-getRefereeReferalCost())));
			customerInvoiceDataArrayList.add(getRefereeProgramRowDataArrayList()); 
			referalProgramTableModel.addRow(getRefereeProgramRowDataArrayList().toArray()); 
			allInstallationDataArrayList.add(getRefereeProgramRowDataArrayList());
				
			refererProgramRowDataArrayList.clear();
			refererProgramRowDataArrayList.add("Referal Program (Refered: "+getRefereeFullName()+")");
			refererProgramRowDataArrayList.add("SUM");
			refererProgramRowDataArrayList.add("1");
			refererProgramRowDataArrayList.add(-(getRefererReferalRate()));
			refererProgramRowDataArrayList.add(new ConvertNumberFormat().randCurrencyFormat(String.valueOf(-getRefererReferalCost())));
			customerInvoiceDataArrayList.add(getRefererProgramRowDataArrayList()); 
			referalProgramTableModel.addRow(getRefererProgramRowDataArrayList().toArray()); 
			allInstallationDataArrayList.add(getRefererProgramRowDataArrayList());			
		}
	}
	
	public void populateInternetServiceInstallationCostTable(String quoteInstallLogInvoice){
		new Print("populateInternetServiceInstallationCostTable Method()....." );
		/*new Print("Customer_Invoice_Data_ArrayList Size BEFORE: "+customerInvoiceDataArrayList.size());
		//customerInvoiceDataArrayList.clear();		
		new Print("Customer_Invoice_Data_ArrayList Size AFTER: "+customerInvoiceDataArrayList.size());*/
		
		if(getInstallationCost()>0){
			installationRowDataArrayList.clear();		
			installationRowDataArrayList.add("Supply and Installation of Customer Premises Equipmentng (CPE)");
			installationRowDataArrayList.add("SUM");
			installationRowDataArrayList.add("1");
			installationRowDataArrayList.add(getInstallRate());
			installationRowDataArrayList.add(new ConvertNumberFormat().randCurrencyFormat(String.valueOf(getInstallationCost())));
			installInfoTableModel.addRow(installationRowDataArrayList.toArray());
			customerInvoiceDataArrayList.add(getInstallationRowDataArrayList()); 
			allInstallationDataArrayList.add(getInstallationRowDataArrayList());
		}
		
		if(getInstallDiscount()>0){
			new Print("Install_Discount: "+getInstallDiscount());
			installationDiscountRowDataArrayList.clear();
			installationDiscountRowDataArrayList.add("Discount: CPE Installation");
			installationDiscountRowDataArrayList.add("SUM");
			installationDiscountRowDataArrayList.add("1");
			installationDiscountRowDataArrayList.add(-getInstallDiscount());
			installationDiscountRowDataArrayList.add("-"+new ConvertNumberFormat().randCurrencyFormat(String.valueOf(getInstallDiscount())));
			installInfoTableModel.addRow(installationDiscountRowDataArrayList.toArray()); 
			customerInvoiceDataArrayList.add(getInstallationDiscountRowDataArrayList()); 
			allInstallationDataArrayList.add(getInstallationDiscountRowDataArrayList());
		}		
		
		if(getMiniUPSCost()>0){
			miniUPSRowDataArrayList.clear();
			miniUPSRowDataArrayList.add("Supply and Installation of mini UPS");
			miniUPSRowDataArrayList.add("SUM");
			miniUPSRowDataArrayList.add("1");
			miniUPSRowDataArrayList.add(getMiniUPSRate());
			miniUPSRowDataArrayList.add(new ConvertNumberFormat().randCurrencyFormat(String.valueOf(getMiniUPSCost())));
			installInfoTableModel.addRow(miniUPSRowDataArrayList.toArray()); 
			customerInvoiceDataArrayList.add(getMiniUPSRowDataArrayList()); 
			allInstallationDataArrayList.add(getMiniUPSRowDataArrayList());
		}
		 
		//----------------------------------------------------------------------------------------------------------------------------------------------   
		 if(getLabourCost()>0){
			 labourRowDataArrayList.clear();
			 labourRowDataArrayList.add("Labour");
			 labourRowDataArrayList.add("Hour");
			 labourRowDataArrayList.add(getLabourHour());
			 labourRowDataArrayList.add(getLabourRate());
			 labourRowDataArrayList.add(new ConvertNumberFormat().randCurrencyFormat(String.valueOf(getLabourCost())));
			 installInfoTableModel.addRow(getLabourRowDataArrayList().toArray()); 
			 customerInvoiceDataArrayList.add(getLabourRowDataArrayList()); 
			 allInstallationDataArrayList.add(getLabourRowDataArrayList());
		 }
		 
		//----------------------------------------------------------------------------------------------------------------------------------------------   
		 if(getCallOutCost()>0){
			 callOutRowDataArrayList.clear();
			 callOutRowDataArrayList.add("Call Out");
			 callOutRowDataArrayList.add("SUM");
			 callOutRowDataArrayList.add(/*getLabourHour()*/"1");
			 callOutRowDataArrayList.add(getCallOutRate());
			 callOutRowDataArrayList.add(new ConvertNumberFormat().randCurrencyFormat(String.valueOf(getCallOutCost())));
			 installInfoTableModel.addRow(getCallOutRowDataArrayList().toArray());
			 customerInvoiceDataArrayList.add(getCallOutRowDataArrayList()); 
			 allInstallationDataArrayList.add(getCallOutRowDataArrayList());
		}
		 
		if (getKilometerCost()>0){
			kilometerRowDataArrayList.clear();
			kilometerRowDataArrayList.add("Travelling kilometers");
			kilometerRowDataArrayList.add("km");
			kilometerRowDataArrayList.add(getKiloMeter());
			kilometerRowDataArrayList.add(getKilometerRate());
			kilometerRowDataArrayList.add(new ConvertNumberFormat().randCurrencyFormat(String.valueOf(getKilometerCost())));
			installInfoTableModel.addRow(getKilometerRowDataArrayList().toArray()); 
			customerInvoiceDataArrayList.add(getKilometerRowDataArrayList()); 
			allInstallationDataArrayList.add(getKilometerRowDataArrayList());
		}
		 //----------------------------------------------------------------------------------------------------------------------------------------------   
	
   	  if(getDiscount()>0) {
   		  discountRowDataArrayList.clear();
   		  discountRowDataArrayList.add("Discount");
   		  discountRowDataArrayList.add("Sum");
   		  discountRowDataArrayList.add(1);
   		  discountRowDataArrayList.add(getDiscount());
   		  discountRowDataArrayList.add(new ConvertNumberFormat().randCurrencyFormat(String.valueOf(getDiscount())));
     
   		  installInfoTableModel.addRow(getDiscountRowDataArrayList().toArray());
   		  customerInvoiceDataArrayList.add(getDiscountRowDataArrayList()); 
   		  allInstallationDataArrayList.add(getDiscountRowDataArrayList());
       }
       
       //----------------------------------------------------------------------------------------------------------------------------------------------   
   		totalCostRowDataArrayList.add("Sub Total (Excl VAT)");
      	totalCostRowDataArrayList.add(" ");
      	totalCostRowDataArrayList.add(" ");
      	totalCostRowDataArrayList.add(" ");
      	totalCostRowDataArrayList.add(new ConvertNumberFormat().randCurrencyFormat(String.valueOf(getTotalInstallationCostVatExcl())));
      	//----------------------------------------------------------------------------------------------------------------------------------------------   
    	  	   
      	totalVATRowDataArrayList.add("VAT (@"+getVATRate()+"%)");
    	totalVATRowDataArrayList.add(" ");
    	totalVATRowDataArrayList.add(" ");
    	totalVATRowDataArrayList.add(" ");
    	totalVATRowDataArrayList.add(new ConvertNumberFormat().randCurrencyFormat(String.valueOf(getVatAmount())));
    	//----------------------------------------------------------------------------------------------------------------------------------------------   
    	
    	if(isVatCheckBoxSelected){
    		installInfoTableModel.addRow(getTotalCostRowDataArrayList().toArray());
          	allInstallationDataArrayList.add(getTotalCostRowDataArrayList()); 
        	
          	installInfoTableModel.addRow(getTotalVATRowDataArrayList().toArray());
          	allInstallationDataArrayList.add(getTotalVATRowDataArrayList()); 
    	}
    	//----------------------------------------------------------------------------------------------------------------------------------------------   
    	
    	totalIncCostRowDataArrayList.add("Total (Incl VAT)");
    	totalIncCostRowDataArrayList.add(" ");
    	totalIncCostRowDataArrayList.add(" ");
    	totalIncCostRowDataArrayList.add(" ");
    	totalIncCostRowDataArrayList.add(new ConvertNumberFormat().randCurrencyFormat(String.valueOf(getTotalInstallationCostVatInc())));
    	installInfoTableModel.addRow(getTotalIncCostRowDataArrayList().toArray());
    	allInstallationDataArrayList.add(getTotalIncCostRowDataArrayList());       		 	    
    	//----------------------------------------------------------------------------------------------------------------------------------------------   
          
       if("installLog".equalsIgnoreCase(quoteInstallLogInvoice)/*||	
    	  "invoice".equalsIgnoreCase(quoteInstallLogInvoice)*/){
    	   //totalDueRowDataArrayList=new ArrayList();
    	   totalDueRowDataArrayList.add("Total Due");
    	   totalDueRowDataArrayList.add(" ");
    	   totalDueRowDataArrayList.add(" ");
    	   totalDueRowDataArrayList.add(" ");
    	   totalDueRowDataArrayList.add(new ConvertNumberFormat().randCurrencyFormat(String.valueOf(getBalance())));
    	   installInfoTableModel.addRow(getTotalDueRowDataArrayList().toArray());
    	   allInstallationDataArrayList.add(getTotalDueRowDataArrayList()); 
       }
    }	
	
	private int getDiscount(){
		return discount;
	}
		
	private String getReferedBy(){
		return referedBy;
	}

	private String getRefereeFullName(){
		return refereeFullName;
	}

	private String isVatCheckBoxSelected(){
		return null;
	}

	private int getRefererReferalRate(){
		return refererReferalRate;
	}
	
	private int getRefereeReferalRate(){
		return refereeReferalRate;
	}

	/*private String getReferal(){
		return referal;
	}*/

	private String getMiniUPS(){
		return miniUPS;
	}

	private int getInstallDiscount(){
		return installDiscount;
	}

	private String getCallOut(){
		return callOut;
	}
	
	private int getCallOutCost(){
		return callOutCost;
	}

	private double getTotalInstallationCostVatInc(){
		return totalInstallationCostVatInc;
	}

	protected int getTotalInstallationCostVatExcl(){
		return totalInstallationCostVatExcl;
	}

	private int getKilometerCost(){
		return kilometerCost;
	}

	private int getLabourCost(){
		return labourCost;
	}

	private int getMiniUPSCost(){
		return miniUPSCost;
	}

	private int getInstallationCost(){
		return installationCost;
	}
	
	private boolean isNoInstallCost(){
		return isNoInstallCost;
	}
	
	private int getRefererReferalCost(){
		return refererReferalCost;
	}
	
	private int getRefereeReferalCost(){
		return refereeReferalCost;
	}	
	
	private ArrayList getRefereeProgramRowDataArrayList(){
		return refereeProgramRowDataArrayList;
	}

	private ArrayList getRefererProgramRowDataArrayList(){
		return refererProgramRowDataArrayList;
	}
	
	private ArrayList getMiniUPSRowDataArrayList(){
		return miniUPSRowDataArrayList;
	}

	private ArrayList getInstallationDiscountRowDataArrayList(){
		return installationDiscountRowDataArrayList;
	}

	private ArrayList getInstallationRowDataArrayList(){
		return installationRowDataArrayList;
	}

	private ArrayList getCallOutRowDataArrayList(){
		return callOutRowDataArrayList;
	}

	private ArrayList getDiscountRowDataArrayList(){
		return discountRowDataArrayList;
	}

	private ArrayList getKilometerRowDataArrayList(){
		return kilometerRowDataArrayList;
	}
	
	private double getVATRate(){
		return vatRate;
	}

	private ArrayList getTotalIncCostRowDataArrayList(){
		return totalIncCostRowDataArrayList;
	}

	private ArrayList getTotalVATRowDataArrayList(){
		return totalVATRowDataArrayList;
	}
	
	protected int getMiniUPSRate(){
		return miniUPSRate;
	}

	protected int getInstallRate(){
		return installRate;
	}
	
	protected ArrayList getTotalDueRowDataArrayList(){
		return totalDueRowDataArrayList;
	}

	protected ArrayList getDepositRowDataArrayList(){
		return depositRowDataArrayList;
	}

	protected double getBalance(){
		return new ConvertNumberFormat().roundDouble(balance,2);
	}	

	protected int getKilometerRate(){
		return kilometerRate;
	}

	protected int getLabourRate(){
		return labourRate;
	}

	protected int getCallOutRate(){
		return callOutRate;
	}

	protected int getKiloMeter(){
		return kiloMeter;
	}
	
	protected String getInternetService(){
		return internetService;
	}

	protected int getLabourHour(){
		return labourHour;
	}	
	
	public double getVatAmount(){
		vatAmount=0;
		if(isVatCheckBoxSelected){
		  vatAmount=new ConvertNumberFormat().roundDouble(getTotalInstallationCostVatExcl()*(getVATRate()/100),2);
			
		} else{
		  vatAmount=0;
		}		
		return vatAmount;
	}	
	
	protected DefaultTableModel getInstallInfoTableModel(){
		return installInfoTableModel;
	}

	protected ArrayList getLabourRowDataArrayList(){
		return labourRowDataArrayList;
	}	

	public ArrayList getTotalCostRowDataArrayList(){
		return totalCostRowDataArrayList;
	}	
	
	public ArrayList getAllInstallationDataArrayList(){
		return allInstallationDataArrayList;
	}
	
	protected String getInstallEndDate(){
		return installEndDate;
	}

	public TableModel getReferalProgramTableModel() {
		return referalProgramTableModel;
	}

	public ArrayList getCustomerInvoiceDataArrayList() {
		return customerInvoiceDataArrayList;
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
	}
}