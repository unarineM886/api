package com.app.api.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "customer") 
public class Customer_login {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cust_surname")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "cust_ref")
    private String phone_number;

    @Column(name = "cust_title")
    private String title;



    private String plan;
    private String address;

    

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
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

    public String getUsername()
    {
        return username; 
    }

    public void setUsername(String username) 
    {
        this.username = username;
    }

    public String getPassword() 
    { 
        return password; 
    }

    public void setPassword(String password) 
    { 
        this.password = password;
    }

    
    public void setAddress(String address) 
    { 
        this.address = address;
    }

    public String getAddress() 
    { 
        return address; 
    }

    
}