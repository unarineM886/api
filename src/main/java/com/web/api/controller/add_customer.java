/*package com.web.api.controller;


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
@RequestMapping("/v1/web")
@CrossOrigin
public class add_customer {

    @Autowired
    private addCustomer_respitory customerRepo;

    // =========================
    // ADD CUSTOMER
    // =========================
    @PostMapping("/add")
    public Map<String, Object> addCustomer(@RequestBody addCustomer Addcustomer) {

        Map<String, Object> response = new HashMap<>();

        try {

            Addcustomer.setOrderStatus("PENDING");
            Addcustomer.setService("Wireless_Internet");
            Addcustomer.setPrevious_isp("VenLink");
            Addcustomer.setRefered_by("Own Client");
            Addcustomer.setOrder_date(LocalDate.now());
            Addcustomer.setFilled_through("WEBSITE");

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
}*/