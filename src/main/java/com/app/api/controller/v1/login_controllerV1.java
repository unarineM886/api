package com.app.api.controller.v1;

import com.app.api.Util.ReallyStrongSecuredPassword;
import com.app.api.Entity.Customer_login;
import com.app.api.Entity.Employee;
import com.app.api.respitory.customer_login_respority;
import com.app.api.respitory.employee_respitory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/v1/users")
public class login_controllerV1 {

    @Autowired
    private customer_login_respority customerRepo;

    @Autowired
    private employee_respitory employeeRepo;

    @PostMapping("/login")
    public Map<String, Object> loginUser(@RequestBody Map<String, String> loginRequest) {

        Map<String, Object> response = new HashMap<>();

        String username = loginRequest.get("username");
        String password = loginRequest.get("password");

        try {
            // 🔐 STEP 1: HASH PASSWORD (VERY IMPORTANT)
            String encryptedPassword =
                    ReallyStrongSecuredPassword.generateStrongPasswordHash(password);

            // =========================
            // CUSTOMER LOGIN
            // =========================
            Optional<Customer_login> customer =
                    customerRepo.findByUsernameAndPassword(username, encryptedPassword);

            if (customer.isPresent()) {
                response.put("success", true);
                response.put("type", "customer");
                response.put("user", customer.get());
                return response;
            }

            // =========================
            // EMPLOYEE LOGIN
            // =========================
            Optional<Employee> employee =
                    employeeRepo.findByEmpUsernameAndEmpPassword(username, encryptedPassword);

            if (employee.isPresent()) {
                response.put("success", true);
                response.put("type", "employee");
                response.put("user", employee.get());
                return response;
            }

            // ❌ INVALID LOGIN
            response.put("success", false);
            response.put("message", "Invalid credentials");

        } catch (Exception e) {
            response.put("success", false);
            response.put("message", "Server error");
            response.put("error", e.getMessage());
        }

        return response;
    }
}