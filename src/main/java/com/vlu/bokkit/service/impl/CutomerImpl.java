package com.vlu.bokkit.service.impl;

import com.vlu.bokkit.dto.CustomerDTO;
import com.vlu.bokkit.entity.Customer;
import com.vlu.bokkit.repository.CustomerRepo;
import com.vlu.bokkit.service.CustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.lang.model.type.IntersectionType;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
@Service
public class CutomerImpl implements CustomerService {
    private final CustomerRepo customerRepository;


    public CutomerImpl(CustomerRepo customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();
        return customers.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }


    @Override
    public CustomerDTO getCustomerById(Integer customerId) {
        Customer customer = customerRepository.getCustomerById(customerId);
        return convertToDTO(customer);
    }

    private CustomerDTO convertToDTO(Customer customer) {
        CustomerDTO customerDTO = new CustomerDTO();
        BeanUtils.copyProperties(customer, customerRepository);
        return customerDTO;
    }

    private Customer validateCustomerExists(Integer identityNumber) {
        Customer existCutomer = customerRepository.getCustomerById(identityNumber);
        if (Objects.nonNull(existCutomer)) {
            //throw new UserAlreadyExistsException(USER_ALREADY_EXISTS, new Object[]{identityNumber});
        }
        return existCutomer;
    }
}
