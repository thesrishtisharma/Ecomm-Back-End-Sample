package com.srishti.flowers.controller;

import com.srishti.flowers.model.customer;
import com.srishti.flowers.service.customerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200")
public class customerController {

    @Autowired
    private customerService customerService;
    @Autowired
    public com.srishti.flowers.service.emailService emailService;

    @GetMapping("/customer-list")
    public List<customer> getCustomerList(){
        return customerService.getCustomerList();
    }

    @PostMapping("/new-customer")
    public customer addCustomer(@RequestBody customer customer){
        return customerService.addCustomer(customer);
    }

    @GetMapping("/customer-by-email/{email}")
    public List<customer> getCustomerByEmail(@PathVariable String email){
        return customerService.getCustomerByEmail(email);
    }
}
