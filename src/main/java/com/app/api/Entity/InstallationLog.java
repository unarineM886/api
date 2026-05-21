package com.app.api.Entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class InstallationLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cust_title;

    private String cust_name;
    private String cust_surname;
    @Column(name = "cust_ref")
    private String custRef;
    private String cust_email;
    private String phone_number;
    private String address;
    private String service;
    private String previous_isp;
    private String refered_by;

    
    private LocalDate order_date;

    private String filled_by;
    private String filled_through;
    private String order_number;

    private String account_status;
    private String install_payment_method;
    private String payment_method;
    private String debit_payment_date;

    @Column(name = "order_status")
    private String orderStatus;

    // getters and setters
    

    public String getCustRef() {
        return custRef;
    }

    public void setCustRef(String custRef) {
        this.custRef = custRef ;
        this.phone_number = custRef; // Set phone_number to the same value as cust_ref
    }

    // Getters and setters
    public Long getId() 
    { 
        return id; 
    }

    public void setId(Long id) 
    {
         this.id = id; 
    }

    public String getCust_name()
    {
        return cust_name; 
    }

    public void setCust_name(String cust_name) 
    {
        this.cust_name = cust_name;
    }

    public String getCust_surname()
    {
        return cust_surname; 
    }

    public void setCust_surname(String cust_surname) 
    {
        this.cust_surname = cust_surname;
    }

    
    public void setAddress(String address) 
    { 
        this.address = address;
    }

    public String getAddress() 
    { 
        return address; 
    }

    public void setCust_title(String cust_title) 
    { 
        this.cust_title = cust_title;
    
    }

    public String getCust_title() 
    { 
        return cust_title; 
    }


    public void setRefered_by(String refered_by) 
    { 
        this.refered_by = refered_by;
    
    }

    public String getRefered_by() 
    { 
        return refered_by; 
    }

    public void setService(String service) 
    { 
        this.service = service;
    
    }

    public String getService() 
    { 
        return service; 
    }

    public void setPrevious_isp(String previous_isp) 
    { 
        this.previous_isp = previous_isp;
    
    }

    public String getPrevious_isp() 
    { 
        return previous_isp; 
    }

    
    public String getOrderStatus() 
    { 
        return orderStatus; 
    }

    public void setOrderStatus(String orderStatus) 
    { 
        this.orderStatus = orderStatus; 
    }

    public String getAccount_status() 
    { 
        return account_status; 
    }

    public void setAccount_status(String account_status) 
    { 
        this.account_status = account_status; 
    }

    public LocalDate getOrder_date() 
    { 
        return order_date; 
    }
    public void setOrder_date(LocalDate order_date) 
    { 
        this.order_date = order_date; 
    }

    public String getFilled_by() {
       return filled_by;
    }   
    
    public void setFilled_by(String filled_by) {
        this.filled_by = filled_by;
    }

    public String getFilled_through() {
        return filled_through;
    }

    public void setFilled_through(String filled_through) {
        this.filled_through = filled_through;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public String getInstall_payment_method() {
        return install_payment_method;
    }

    public void setInstall_payment_method(String install_payment_method) {
        this.install_payment_method = install_payment_method;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getDebit_payment_date() {
        return debit_payment_date;
    }

    public void setDebit_payment_date(String debit_payment_date) {
        this.debit_payment_date = debit_payment_date;
    }
}