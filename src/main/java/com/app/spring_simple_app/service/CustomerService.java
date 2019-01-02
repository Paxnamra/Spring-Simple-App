package com.app.spring_simple_app.service;

import com.app.spring_simple_app.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
