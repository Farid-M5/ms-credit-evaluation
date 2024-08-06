package com.credit.evaluation;

import com.credit.evaluation.controller.CustomerController;
import com.credit.evaluation.model.dto.CustomerDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringEvaluationApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringEvaluationApplication.class, args);

		ConfigurableApplicationContext context = SpringApplication.run(SpringEvaluationApplication.class, args);

		CustomerController customerController = context.getBean(CustomerController.class);

		CustomerDto result = customerController.revealCustomerDetails("9JKMQHZ", "AZE901234567");

		System.out.println(result);
	}

}
