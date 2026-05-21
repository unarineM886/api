package com.app.api.controller.v1;

import com.app.api.Entity.InstallationLog;
import com.app.api.Entity.addCustomer;
//import com.app.api.respitory.InstallationLog_respitory;
import com.app.api.respitory.addCustomer_respitory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;




@RestController
@RequestMapping("/v1/addcustomers")
@CrossOrigin
public class add_customerV1 {

    @Autowired
    private addCustomer_respitory customerRepo;

    // =========================
    // ADD CUSTOMER
    // =========================
    @PostMapping("/add")
    public Map<String, Object> addCustomer(@RequestBody addCustomer Addcustomer) {

        Map<String, Object> response = new HashMap<>();

        try {

            Addcustomer.setOrderStatus("Scheduled");
            Addcustomer.setService("Wireless_Internet");
            Addcustomer.setPrevious_isp("VenLink");
            Addcustomer.setRefered_by("Own Client");
            Addcustomer.setOrder_date(LocalDate.now());
            Addcustomer.setFilled_through("MOBILE_APP");

            addCustomer savedCustomer = customerRepo.save(Addcustomer);

            response.put("success", true);
            response.put("message", "Customer created successfully");
            response.put("customer", savedCustomer);

        } catch (Exception e) {
            response.put("success", false);
            response.put("message", "Failed to create customer");
            response.put("error", e.getMessage());
        }

        return response;
    }

    // =========================
    // GET ALL CUSTOMERS
    // =========================
    @GetMapping
    public List<addCustomer> getAllCustomers() {
        return customerRepo.findAll();
    }

    // =========================
    // GET SINGLE CUSTOMER
    // =========================
    @GetMapping("/{cust_ref}")
    public addCustomer getCustomer(@PathVariable String cust_ref) {
        return customerRepo.findByCustRef(cust_ref)
                .orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    // =========================
    // UPDATE CUSTOMER
    // =========================
    @PutMapping("/update/{cust_ref}")
    public Map<String, Object> updateCustomer(
            @PathVariable String cust_ref,
            @RequestBody addCustomer updated
    ) {

        Map<String, Object> response = new HashMap<>();

        try {
            addCustomer existing = customerRepo.findByCustRef(cust_ref)
                    .orElseThrow(() -> new RuntimeException("Customer not found"));

            // ===== CUSTOMER INFO =====
            existing.setCust_title(updated.getCust_title());
            existing.setCust_name(updated.getCust_name());
            existing.setCust_surname(updated.getCust_surname());
            //existing.setCust_email(updated.getCust_email());
            existing.setAddress(updated.getAddress());
            
            // ===== INSTALLATION INFO (YOUR NEW FEATURE) =====
            //existing.setInstallation_notes(updated.getInstallation_notes());
            //existing.setInstallation_status(updated.getInstallation_status());
            //existing.setInstallation_technician(updated.getInstallation_technician());
            //existing.setInstallation_date(updated.getInstallation_date());

            addCustomer saved = customerRepo.save(existing);

            response.put("success", true);
            response.put("message", "Customer updated successfully");
            response.put("customer", saved);

        } catch (Exception e) {
            response.put("success", false);
            response.put("message", "Update failed");
            response.put("error", e.getMessage());
        }

        return response;
    }

    

    // =========================
    // DELETE CUSTOMER
    // =========================
    /*@DeleteMapping("/delete/{cust_ref}")
    public Map<String, Object> deleteCustomer(@PathVariable String cust_ref) {

        Map<String, Object> response = new HashMap<>();

        try {
            addCustomer customer = customerRepo.findByCustRef(cust_ref)
                    .orElseThrow(() -> new RuntimeException("Customer not found"));

            customerRepo.delete(customer);

            response.put("success", true);
            response.put("message", "Customer deleted successfully");

        } catch (Exception e) {
            response.put("success", false);
            response.put("message", "Delete failed");
            response.put("error", e.getMessage());
        }

        return response;
    }*/
}