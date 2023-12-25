package com.vlu.bokkit.service;

import com.vlu.bokkit.dto.CustomerDTO;

import javax.lang.model.type.IntersectionType;
import java.util.List;

public interface CustomerService {
    List<CustomerDTO> getAllCustomers();

    CustomerDTO getCustomerById(Integer customerId);

}
