package com.app.api.controller.v2;
import com.app.api.Entity.InstallationLog;
import com.app.api.Entity.addCustomer;
//import com.app.api.respitory.InstallationLog_respitory;
import com.app.api.respitory.addCustomer_respitory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v2/customers")
public class customer_login_respority {

    @Autowired
    private addCustomer_respitory customerRepo;

    
    @GetMapping("/scheduled")
    public Map<String, Object> getScheduledCustomers() {

        Map<String, Object> response = new HashMap<>();

        try {
            var customers = customerRepo.findByOrderStatus("Scheduled");

            response.put("success", true);
            response.put("customers", customers);

        } catch (Exception e) {
            response.put("success", false);
            response.put("message", "Failed to fetch scheduled customers");
            response.put("error", e.getMessage());
        }

        return response;
    }

    // =========================
    // INSTALLATION
    // =========================
    @PutMapping("/installation/{cust_ref}")
    public Map<String, Object> updateInstallation(
            @PathVariable String cust_ref,
            @RequestBody addCustomer updated
    ) {

        Map<String, Object> response = new HashMap<>();

        try {
            addCustomer existing = customerRepo.findByCustRef(cust_ref)
                    .orElseThrow(() -> new RuntimeException("Customer not found"));

            //existing.setInstallation_notes(updated.getInstallation_notes());
            //existing.setInstallation_status(updated.getInstallation_status());
            //existing.setInstallation_technician(updated.getInstallation_technician());
            //existing.setInstallation_date(updated.getInstallation_date());

            //existing.setServicePlan(updated.getServicePlan());

            existing.setInstall_payment_method(updated.getInstall_payment_method());
            existing.setPayment_method(updated.getPayment_method()); 
            existing.setDebit_payment_date(updated.getDebit_payment_date());
            existing.setAccount_status("ACTIVE");

            addCustomer saved = customerRepo.save(existing);

            response.put("success", true);
            response.put("message", "Installation updated successfully");
            response.put("customer", saved);

        } catch (Exception e) {
            response.put("success", false);
            response.put("message", "Installation update failed");
            response.put("error", e.getMessage());
        }

        return response;
    }

    @PutMapping("/ping")
public String ping() {
    return "PUT WORKS";
}
}