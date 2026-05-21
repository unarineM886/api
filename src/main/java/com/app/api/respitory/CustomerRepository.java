package com.app.api.respitory;

import com.app.api.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Optional<Customer> findByCustRef(String custRef);

    List<Customer> findByOrderStatus(String orderStatus);
}