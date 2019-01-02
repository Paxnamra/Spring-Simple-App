package com.app.spring_simple_app.service;

import com.app.spring_simple_app.model.Customer;
import com.app.spring_simple_app.repository.CustomerRepository;
import com.app.spring_simple_app.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }


}
