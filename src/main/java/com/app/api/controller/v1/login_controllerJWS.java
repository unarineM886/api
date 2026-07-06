package com.app.api.controller.v1;

import com.app.api.Util.ReallyStrongSecuredPassword;
import com.app.api.Entity.Customer_login;
import com.app.api.Entity.Employee;
//import com.app.api.Entity.ServicePlan;
import com.app.api.Security.JWS_utility;
import com.app.api.respitory.customer_login_respority;
import com.app.api.respitory.employee_respitory;
//import com.app.api.respitory.customer_login_respitory_service;

import za.co.VenLinkWeb.Support.Print;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/v1/users")
public class login_controllerJWS {

    @Autowired
    private customer_login_respority customerRepo;

    @Autowired
    private employee_respitory employeeRepo;
    
    @Autowired
    private JWS_utility jwtUtil;
    
    @PostMapping("/loginjws")
    public Map<String, Object> loginUser(@RequestBody Map<String, String> loginRequest) {

        Map<String, Object> response = new HashMap<>();

        String usernameNumber = loginRequest.get("username_number");
        String password = loginRequest.get("password");

        try {

            String encrypedPassword = ReallyStrongSecuredPassword.generateStrongPasswordHash(password);

            // =========================
            // 1. CHECK EMPLOYEE (username)
            // =========================
            Optional<Employee> employee = employeeRepo.findByEmpUsername(usernameNumber);
            
            if (employee.isPresent()) {
            	
            	if (encrypedPassword.equals(employee.get().getEmpPassword())) {
            		
            	    String token = jwtUtil.generateToken(
            	            usernameNumber,
            	            "employee"
            	    );
            	    
            	    
            	    response.put("success", true);
            	    response.put("type", "employee");
            	    response.put("token", token);
            	    response.put("user", employee.get());
            	    
            	    return response;
            	}
            }

            // =========================
            // 2. CHECK CUSTOMER (cust_ref)
            // =========================
            Optional<Customer_login> customer = customerRepo.findByNumber(usernameNumber);
            

            if (customer.isPresent()) {
            	
            	Customer_login cust = customer.get();
            
            	if (encrypedPassword.equals(cust.getPassword())) {

            	    String token = jwtUtil.generateToken(
            	            usernameNumber,
            	            "customer"
            	    );
            	    
            	    //List<ServicePlan> plans = cust.getServicePlans();

            	    response.put("success", true);
            	    response.put("type", "customer");
            	    response.put("token", token);
            	    response.put("user", customer.get());
            	    //response.put("plans", plans);

            	    return response;
            	}
            }

            response.put("success", false);
            response.put("message", "Invalid credentials");

        } catch (Exception e) {
            response.put("success", false);
            response.put("message", "Server error");
            response.put("error", e.getMessage());
        }

        return response;
    }

    /*@PostMapping("/login")
    public Map<String, Object> loginUser(@RequestBody Map<String, String> loginRequest) {

        Map<String, Object> response = new HashMap<>();

        String number = loginRequest.get("number");
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
                    customerRepo.findByNumberAndPassword(number, encryptedPassword);

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
    }*/
    
    
    @PostMapping("/signupjws")
    public Map<String, Object> setCustomerPassword(@RequestBody Map<String, String> request) {

        Map<String, Object> response = new HashMap<>();

        try {
            String number = request.get("number");
            String password = request.get("password");

            Optional<Customer_login> customerNumber = customerRepo.findByNumber(number);

            if (customerNumber.isEmpty()) {
                response.put("success", false);
                response.put("message", "Customer not found");
                return response;
            }

            Customer_login customer = customerNumber.get();

            // 🔐 hash password before saving
            String hashedPassword = ReallyStrongSecuredPassword.generateStrongPasswordHash(password);

            customer.setPassword(hashedPassword);

            customerRepo.save(customer);

            response.put("success", true);
            response.put("message", "Password updated successfully");

        } catch (Exception e) {
            response.put("success", false);
            response.put("message", "Server error");
            response.put("error", e.getMessage());
        }

        return response;
    }
}