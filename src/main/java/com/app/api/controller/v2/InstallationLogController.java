package com.app.api.controller.v2;

import com.app.api.Entity.Customer;
import com.app.api.Service.InstallationLogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/v2/customers")
@CrossOrigin(origins = "*")
public class InstallationLogController {

    @Autowired
    private InstallationLogService installationLogService;


    // ✅ GET scheduled customers
    @GetMapping("/scheduled")
    public Map<String, Object> getScheduledCustomers() {
        List<Customer> customers = installationLogService.getScheduledCustomers();

        Map<String, Object> response = new HashMap<>();
        response.put("customers", customers);

        return response;
    }

    // ✅ UPDATE CUSTOMER DETAILS
    @PutMapping("/update/{custRef}")
    public Map<String, Object> updateCustomer(
            @PathVariable String custRef,
            @RequestBody Map<String, Object> body) {

        boolean updated = installationLogService.updateCustomer(custRef, body);

        Map<String, Object> response = new HashMap<>();
        response.put("success", updated);

        return response;
    }

    // ✅ UPDATE INSTALLATION DETAILS
    @PutMapping("/installation/{custRef}")
    public Map<String, Object> updateInstallation(
            @PathVariable String custRef,
            @RequestBody Map<String, Object> body) {

        boolean updated = installationLogService.updateInstallation(custRef, body);

        Map<String, Object> response = new HashMap<>();
        response.put("success", updated);

        return response;
    }

    // ✅ DELETE CUSTOMER
    @DeleteMapping("/delete/{custRef}")
    public Map<String, Object> deleteCustomer(@PathVariable String custRef) {

        boolean deleted = installationLogService.deleteCustomer(custRef);

        Map<String, Object> response = new HashMap<>();
        response.put("success", deleted);

        return response;
    }
}