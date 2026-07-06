package com.app.api.respitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.api.Entity.Customer_login;
//import com.app.api.Entity.ServicePlan;

import java.util.Optional;

public interface customer_login_respority extends JpaRepository<Customer_login, Long> 
{
    Optional<Customer_login> findByNumberAndPassword(String number, String password);
    Optional<Customer_login> findByNumber(String number);
    Optional<Customer_login> findByEmail(String email);
    
    
}


