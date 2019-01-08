package com.app.spring_simple_app.repository;

import com.app.spring_simple_app.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {


    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstName("Uncle");
        customer.setLastName("Bob");

        customers.add(customer);
        return customers;
    }
}
