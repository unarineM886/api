package com.app.api.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ucrm_client_service")
public class ServicePlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "client_id")
    private Long clientId;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private Double price;

    public Long getClientId() 
    { 
        return clientId; 
    }

    public void setClientId(long clientId) 
    { 
        this.clientId = clientId; 
    }

    public String getName() 
    { 
        return name; 
    }

    public void setName(String name) 
    { 
        this.name = name; 
    }
    
    public Double getPrice() 
    { 
        return price; 
    }

    public void setPrice(Double price) 
    { 
        this.price = price; 
    }

    

}


