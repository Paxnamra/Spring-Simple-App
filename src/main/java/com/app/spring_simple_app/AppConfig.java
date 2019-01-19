package com.app.spring_simple_app;

import com.app.spring_simple_app.repository.CustomerRepository;
import com.app.spring_simple_app.repository.HibernateCustomerRepositoryImpl;
import com.app.spring_simple_app.service.CustomerService;
import com.app.spring_simple_app.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.app.spring_simple_app"})
public class AppConfig {

    @Bean(name = "customerService")
    public CustomerService getCustomerService(){
        //CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
        CustomerServiceImpl service = new CustomerServiceImpl();
        //service.setCustomerRepository(getCustomerRepository());
        return service;
    }

    @Bean(name ="customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new HibernateCustomerRepositoryImpl();
    }
}
