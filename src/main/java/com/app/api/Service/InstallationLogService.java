/*package com.app.api.Service;

import com.app.api.Entity.Customer;
import com.app.api.respitory.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class InstallationLogService {

    @Autowired
    private CustomerRepository customerRepository;

    // ✅ GET scheduled customers
    public List<Customer> getScheduledCustomers() {
        return customerRepository.findByOrderStatus("Scheduled");
    }

    // ✅ DELETE CUSTOMER
    public boolean deleteCustomer(String custRef) {
        Optional<Customer> optionalCustomer = customerRepository.findByCustRef(custRef);

        if (optionalCustomer.isEmpty()) return false;

        customerRepository.delete(optionalCustomer.get());
        return true;
    }
}*/