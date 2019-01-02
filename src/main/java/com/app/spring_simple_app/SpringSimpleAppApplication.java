package com.app.spring_simple_app;

import com.app.spring_simple_app.service.CustomerService;
import com.app.spring_simple_app.service.CustomerServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSimpleAppApplication {

	/*
	public static void main(String[] args) { SpringApplication.run(SpringSimpleAppApplication.class, args); {

			CustomerService service = new CustomerServiceImpl();
			System.out.println(service.findAll().get(0).getLastName());


		}
		*/

		public static void main (String[]args){

			CustomerService service = new CustomerServiceImpl();
			System.out.println(service.findAll().get(0).getLastName());

		}
	}

//}


