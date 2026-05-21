package com.app.api.respitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.api.Entity.addCustomer;

import java.util.List;
import java.util.Optional;

public interface addCustomer_respitory extends JpaRepository<addCustomer, Long> 
{
    List<addCustomer> findByOrderStatus(String orderStatus);
    Optional<addCustomer> findByCustRef(String cust_ref);

}