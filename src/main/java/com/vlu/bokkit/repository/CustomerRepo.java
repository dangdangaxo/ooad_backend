package com.vlu.bokkit.repository;

import com.vlu.bokkit.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {
    Customer getCustomerById(Integer id);
}
