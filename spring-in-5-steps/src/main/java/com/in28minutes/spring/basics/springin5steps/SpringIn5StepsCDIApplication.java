package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.springin5steps.cdi.SomeCDIBusiness;
import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication
public class SpringIn5StepsCDIApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCDIApplication.class);
	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		ApplicationContext context = SpringApplication.run(SpringIn5StepsCDIApplication.class, args);
		SomeCDIBusiness someCDIBusiness = context.getBean(SomeCDIBusiness.class);
		
		LOGGER.info("{} dao-> {}", someCDIBusiness, someCDIBusiness.getSomeCdiDao());
	}
}
