package com.training.ecommerce.dao;

import com.training.ecommerce.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByEmail(String theEmail);
}
//spring data jpa we define the interface and it gives us all the functionalities