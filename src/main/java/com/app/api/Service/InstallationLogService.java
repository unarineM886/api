package com.app.api.Service;

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

    // ✅ UPDATE CUSTOMER DETAILS
    public boolean updateCustomer(String custRef, Map<String, Object> body) {
        Optional<Customer> optionalCustomer = customerRepository.findByCustRef(custRef);

        if (optionalCustomer.isEmpty()) return false;

        Customer customer = optionalCustomer.get();

        // Update fields safely
        if (body.containsKey("cust_name"))
            customer.setCustName((String) body.get("cust_name"));

        if (body.containsKey("cust_surname"))
            customer.setCustSurname((String) body.get("cust_surname"));

        if (body.containsKey("cust_email"))
            customer.setCustEmail((String) body.get("cust_email"));

        if (body.containsKey("address"))
            customer.setAddress((String) body.get("address"));

        if (body.containsKey("orderStatus"))
            customer.setOrderStatus((String) body.get("orderStatus"));

        customerRepository.save(customer);
        return true;
    }

    // ✅ UPDATE INSTALLATION DETAILS
    public boolean updateInstallation(String custRef, Map<String, Object> body) {
        Optional<Customer> optionalCustomer = customerRepository.findByCustRef(custRef);

        if (optionalCustomer.isEmpty()) return false;

        Customer customer = optionalCustomer.get();

        if (body.containsKey("install_payment_method"))
            customer.setPaymentMethod((String) body.get("install_payment_method"));

        if (body.containsKey("payment_method"))
            customer.setPaymentMethod((String) body.get("payment_method"));

        if (body.containsKey("debit_payment_date")) {
            Object value = body.get("debit_payment_date");
            if (value != null) {
                try {
                    customer.setDebitPaymentDate(String.valueOf(value));
                } catch (Exception e) {
                    System.out.println("Invalid debit date format");
                }
            }
        }

        customerRepository.save(customer);
        return true;
    }

    // ✅ DELETE CUSTOMER
    public boolean deleteCustomer(String custRef) {
        Optional<Customer> optionalCustomer = customerRepository.findByCustRef(custRef);

        if (optionalCustomer.isEmpty()) return false;

        customerRepository.delete(optionalCustomer.get());
        return true;
    }
}