package com.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {
 @Autowired
 private RestTemplate restTemplate;
 @GetMapping("/employee")
    public String getEmpAddress(){
       String address= restTemplate.getForObject("http://localhost:8081/address",String.class);
        return "Sandeep Kumar Patel"+address;
    }
}
