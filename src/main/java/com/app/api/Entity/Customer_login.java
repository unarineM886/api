package com.app.api.Entity;

import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "customer") 
public class Customer_login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cust_surname")
    private String username;
    
    @Column(name = "cust_name")
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "cust_ref")
    private String number;
    
    @Column(name ="cust_email")
    private String email;
    
    @Column(name = "client_id")
    private Long clientId;

    
    
    /*@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "client_id",
        referencedColumnName = "client_id",
        insertable = false,
        updatable = false
    )
    private ServicePlan servicePlan; */
    
    
    
    /*public List<ServicePlan> getServicePlans() {
        return servicePlans;
    }
    
    

    public void setServicePlans(List<ServicePlan> servicePlans) {
        this.servicePlans = servicePlans;
    }*/
    
    
    /*public ServicePlan getServicePlan() {
        return servicePlan;
    }

    public void setServicePlan(ServicePlan servicePlan) {
        this.servicePlan = servicePlan;
    }*/

    /*@Column(name = "cust_title")
    private String title; */

    
    /*private String plan;
    private String address; */

    

    /*public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }*/

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    public String getEmail() {
    	return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }


    // Getters and setters
    /*public Long getId() 
    { 
        return id; 
    }

    public void setId(Long id) 
    {
         this.id = id; 
    }*/

    public String getUsername()
    {
        return username; 
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }
    
    public String getName()
    {
        return name; 
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getPassword() 
    { 
        return password; 
    }

    public void setPassword(String password) 
    { 
        this.password = password;
    }
    
    
    public long getClientId() 
    { 
        return clientId; 
    }

    public void setClientId(long clientId) 
    { 
        this.clientId = clientId;
    }

    
    /*public void setAddress(String address) 
    { 
        this.address = address;
    }

    public String getAddress() 
    { 
        return address; 
    }*/

    
}