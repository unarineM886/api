// entity/Customer.java
package com.app.api.Entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "customer")
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "cust_ref", unique = true)
    private String custRef;
    
    @Column(name = "cust_name")
    private String custName;
    
    @Column(name = "cust_surname")
    private String custSurname;
    
    @Column(name = "cust_title")
    private String custTitle;
    
       
    @Column(name = "address")
    private String address;
    
    @Column(name = "cust_email")
    private String custEmail;
    
    @Column(name = "installer")
    private String installer;
    
    /*@Column(name = "service_plan")
    private String servicePlan;*/
    
    @Column(name = "install_date")
    private LocalDate installDate;
    
    /*@Column(name = "install_rate")
    private Integer installRate;*/
    
    @Column(name = "payment_method")
    private String paymentMethod;
    
    @Column(name = "order_status")
    private String orderStatus;
    
    @Column(name = "account_status")
    private String accountStatus;
    
    @Column(name = "debit_payment_date")
    private String debitPaymentDate;
    
    @Column(name = "id_num")
    private String idNum;
    
    @Column(name = "bank_name")
    private String bankName;
    
    @Column(name = "bank_acc_num")
    private String bankAccNum;
    
    @Column(name = "account_type")
    private String accountType;
    
    
    @Column(name = "refered_by")
    private String referedBy;
    
    @Column(name = "referer_ref")
    private String refererRef;
    
    /*@Column(name = "install_discount")
    private String installDiscount;
    
    @Column(name = "mini_ups")
    private String miniUps;
    
    @Column(name = "call_out")
    private String callOut;
    
    @Column(name = "labour_hours")
    private String labourHours;
    
    @Column(name = "kilometer")
    private String kilometer;
    */
    @Column(name = "company_name")
    private String companyName;
    
    @Column(name = "vat_num")
    private String vatNum;

    @Column(name = "order_date")
    private LocalDate orderDate;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public String getCustRef() { return custRef; }
    public void setCustRef(String custRef) { this.custRef = custRef; }
    
    public String getCustName() { return custName; }
    public void setCustName(String custName) { this.custName = custName; }
    
    public String getCustSurname() { return custSurname; }
    public void setCustSurname(String custSurname) { this.custSurname = custSurname; }
    
    public String getCustTitle() { return custTitle; }
    public void setCustTitle(String custTitle) { this.custTitle = custTitle; }
    
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    
    public String getCustEmail() { return custEmail; }
    public void setCustEmail(String custEmail) { this.custEmail = custEmail; }
    
    public String getInstaller() { return installer; }
    public void setInstaller(String installer) { this.installer = installer; }
    
    public LocalDate getInstallDate() { return installDate; }
    public void setInstallDate(LocalDate installDate) { this.installDate = installDate; }
    
    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }
    
    public String getOrderStatus() { return orderStatus; }
    public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }
    
    public String getAccountStatus() { return accountStatus; }
    public void setAccountStatus(String accountStatus) { this.accountStatus = accountStatus; }
    
    public String getDebitPaymentDate() { return debitPaymentDate; }
    public void setDebitPaymentDate(String debitPaymentDate) { this.debitPaymentDate = debitPaymentDate; }
    
    public String getIdNum() { return idNum; }
    public void setIdNum(String idNum) { this.idNum = idNum; }
    
    public String getBankName() { return bankName; }
    public void setBankName(String bankName) { this.bankName = bankName; }
    
    public String getBankAccNum() { return bankAccNum; }
    public void setBankAccNum(String bankAccNum) { this.bankAccNum = bankAccNum; }
    
    public String getAccountType() { return accountType; }
    public void setAccountType(String accountType) { this.accountType = accountType; }
    
    public String getReferedBy() { return referedBy; }
    public void setReferedBy(String referedBy) { this.referedBy = referedBy; }
    
    public String getRefererRef() { return refererRef; }
    public void setRefererRef(String refererRef) { this.refererRef = refererRef; }
    
    /*public String getInstallDiscount() { return installDiscount; }
    public void setInstallDiscount(String installDiscount) { this.installDiscount = installDiscount; }
    
    public String getMiniUps() { return miniUps; }
    public void setMiniUps(String miniUps) { this.miniUps = miniUps; }
    
    public String getCallOut() { return callOut; }
    public void setCallOut(String callOut) { this.callOut = callOut; }
    
    public String getLabourHours() { return labourHours; }
    public void setLabourHours(String labourHours) { this.labourHours = labourHours; }
    
    public String getKilometer() { return kilometer; }
    public void setKilometer(String kilometer) { this.kilometer = kilometer; }
    */
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
    
    public String getVatNum() { return vatNum; }
    public void setVatNum(String vatNum) { this.vatNum = vatNum; }
    
    public LocalDate getOrderDate() { return orderDate; }
    public void setOrderDate(LocalDate orderDate) { this.orderDate = orderDate; }
}