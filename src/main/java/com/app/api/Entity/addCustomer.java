package com.app.api.Entity;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "enquiry")
public class addCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cust_title;

    @Column(name = "cust_ref")
    private String custRef;

    private String cust_name;
    private String cust_surname;
    private String cust_email;
    private String phone_number;
    private String address;
    private String service;
    private String previous_isp;
    private String refered_by;
    private String service_plan;
    private String install_additional_instruction;

    private String account_status;
    private LocalDate order_date;

    private String filled_by;
    private String filled_through;
    private String order_number;

    

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
    
    public String getCust_email() {
        return cust_email;
    }

    public void setCust_email(String cust_email) {
        this.cust_email = cust_email ;
        
    }
    
    public String getService_plan() {
        return service_plan;
    }

    public void setService_plan(String service_plan) {
        this.service_plan = service_plan ;
    }
    
    public String getInstall_additional_instruction() {
        return install_additional_instruction;
    }

    public void setinstall_additional_instruction(String install_additional_instruction) {
        this.install_additional_instruction = install_additional_instruction ;
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

}