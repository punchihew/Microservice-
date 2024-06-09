package com.example.customer_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @version: v0.0.1
 * @author: navishka
 * @date: 5/31/2024
 */

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
    public RestTemplate restTemplate;

    @GetMapping("/getCustomer")
    public String getCustomer(){
        System.out.println("wade hari machan");
        return restTemplate.getForObject("http://ITEM-SERVICE/api/v1/item/getItem",String.class);

    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@RequestBody CustomerDto customerDto){
        System.out.println("customer save wade hari machan");
        System.out.println(customerDto);
        return customerDto.toString();


    }
}
