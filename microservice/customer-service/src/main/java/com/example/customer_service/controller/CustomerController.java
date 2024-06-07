package com.example.customer_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 5/31/2024
 */

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @GetMapping("/getCustomer")
    public String getCustomer(){
        return "Customer Service Works!";
    }
}
