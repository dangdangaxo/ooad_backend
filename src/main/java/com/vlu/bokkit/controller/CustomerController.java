package com.vlu.bokkit.controller;

import com.vlu.bokkit.dto.CustomerDTO;
import com.vlu.bokkit.service.CustomerService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.lang.model.type.IntersectionType;
import java.util.List;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RestController
//@Autowired
@RequestMapping("customer")
public class CustomerController {
    private final CustomerService CustomerService;


    public CustomerController(CustomerService customerService) {
        this.CustomerService = customerService;
    }

    @GetMapping
    public List<CustomerDTO> getAllCutomer(){
        return CustomerService.getAllCustomers();
    }

    @RequestMapping("/id")
    @GetMapping
    public CustomerDTO getCustomerById(@Validated @RequestParam(name = "id") Integer id){
        return  CustomerService.getCustomerById(id);
    }



}
