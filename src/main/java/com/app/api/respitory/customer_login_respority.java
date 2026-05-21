package com.app.api.respitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.api.Entity.Customer_login;

import java.util.Optional;

public interface customer_login_respority extends JpaRepository<Customer_login, Long> 
{
    Optional<Customer_login> findByUsernameAndPassword(String username, String password);
}