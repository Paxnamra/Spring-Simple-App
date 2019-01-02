package com.app.spring_simple_app.repository;

import com.app.spring_simple_app.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
