// src/main/java/com/example/payfastdemo/controller/PaymentController.java
package com.app.api.controller.v2;

import org.springframework.web.bind.annotation.*;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v2/api")
public class paymentController {

    @PostMapping("/create-payment")
    public Map<String, String> createPayment(@RequestBody PaymentRequest request) {
        try {
            String merchantId = "23705102"; // Sandbox Merchant ID
            String merchantKey = "wzjujgcqkjmrc"; // Sandbox Merchant Key
            //String returnUrl = "https://example.com/payment-success";
            //String cancelUrl = "https://example.com/payment-cancel";
            String notifyUrl = "https://example.com/payfast-ipn";

            Map<String, String> params = new HashMap<>();
            params.put("merchant_id", merchantId);
            params.put("merchant_key", merchantKey);
            params.put("amount", String.format("%.2f", request.getAmount()));
            params.put("item_name", request.getItemName());
            //params.put("return_url", returnUrl);
            //params.put("cancel_url", cancelUrl);
            params.put("notify_url", notifyUrl);
            params.put("m_payment_id", request.getRef_Number());

            // Build query string
            StringBuilder query = new StringBuilder();
            for (Map.Entry<String, String> entry : params.entrySet()) {
                if (query.length() > 0) query.append("&");
                query.append(URLEncoder.encode(entry.getKey(), StandardCharsets.UTF_8));
                query.append("=");
                query.append(URLEncoder.encode(entry.getValue(), StandardCharsets.UTF_8));
            }

            String payfastUrl = "https://www.payfast.co.za/eng/process?" + query.toString();
            Map<String, String> response = new HashMap<>();
            response.put("payfastUrl", payfastUrl);
            return response;

        } catch (Exception e) {
            throw new RuntimeException("Failed to generate PayFast URL", e);
        }
    }

    // Request body class
    public static class PaymentRequest {
        private double amount;
        private String itemName;
        private int userId;
        private String ref_Number;

        // getters and setters
        public double getAmount() { return amount; }
        public void setAmount(double amount) { this.amount = amount; }
        public String getItemName() { return itemName; }
        public void setItemName(String itemName) { this.itemName = itemName; }
        public int getUserId() { return userId; }
        public void setUserId(int userId) { this.userId = userId; }
        public String getRef_Number() { return ref_Number; }
        public void setRef_Number(String ref_Number) { this.ref_Number = ref_Number; }
    }
}