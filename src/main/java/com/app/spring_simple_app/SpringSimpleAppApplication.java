package com.app.spring_simple_app;

import com.app.spring_simple_app.service.CustomerService;
import com.app.spring_simple_app.service.CustomerServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringSimpleAppApplication {


	public static void main(String[] args) {
		//SpringApplication.run(SpringSimpleAppApplication.class, args);

		ApplicationContext appContext =
				new AnnotationConfigApplicationContext(AppConfig.class);

		CustomerService service = appContext.getBean("customerService", CustomerService.class);

		System.out.println(service.findAll().get(0).getLastName());

	}

}


