package com.example.item_service.controller;

import com.example.customer_service.controller.CustomerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 5/31/2024
 */

@RestController
@RequestMapping("api/v1/item")
public class itemController {


    @Autowired
    public RestTemplate restTemplate;

    @GetMapping("/getItem")
    public String getItem(){
        return "Item Service Works!";
    }

    @PostMapping("/save-item")
    public String saveItem(){
        System.out.println("item save  wade hari machan");
        CustomerDto customerDto = new CustomerDto("C001","navishka","matara");
        return restTemplate.postForObject("http://localhost:8082/api/v1/customer/saveCustomer",customerDto,String.class);
    }
}
