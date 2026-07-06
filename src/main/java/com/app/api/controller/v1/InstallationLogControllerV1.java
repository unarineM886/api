package com.app.api.controller.v1;

import com.app.api.Entity.Customer;
//import com.app.api.Service.InstallationLogService;
import com.app.api.respitory.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/v1/customers")
@CrossOrigin(origins = "*")
public class InstallationLogControllerV1 {

    /*@Autowired
    private InstallationLogService installationLogService;
    */
    
    @Autowired
    private CustomerRepository customerRepository;

    
    // ✅ GET ALL CUSTOMERS
    @GetMapping("/all")
    public Map<String, Object> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();

        Map<String, Object> response = new HashMap<>();
        response.put("customers", customers);

        return response;
    }
    
    

    // ✅ GET scheduled customers
    /*@GetMapping("/scheduled")
    public Map<String, Object> getScheduledCustomers() {
        List<Customer> customers = installationLogService.getScheduledCustomers();

        Map<String, Object> response = new HashMap<>();
        response.put("customers", customers);

        return response;
    }*/
    
    // ✅ GET SCHEDULED CUSTOMERS
    @GetMapping("/scheduled")
    public Map<String, Object> getScheduledCustomers() {

        List<Customer> customers = customerRepository.findByOrderStatus("Scheduled");

        Map<String, Object> response = new HashMap<>();
        response.put("customers", customers);

        return response;
    }



    // ✅ DELETE CUSTOMER
    @DeleteMapping("/delete/{custRef}")
    public Map<String, Object> deleteCustomer(@PathVariable String custRef) {

        Map<String, Object> response = new HashMap<>();

        Optional<Customer> customer = customerRepository.findByCustRef(custRef);

        if (customer.isEmpty()) {
            response.put("success", false);
            response.put("message", "Customer not found");
            return response;
        }

        customerRepository.delete(customer.get());

        response.put("success", true);
        response.put("message", "Customer deleted");

        return response;
    }
}