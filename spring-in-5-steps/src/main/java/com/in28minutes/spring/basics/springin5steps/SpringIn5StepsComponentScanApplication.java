package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.spring.basics.componentScan.ComponentDAO;
import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;
import com.in28minutes.spring.basics.springin5steps.scope.PersonDAO;

@Configuration
@ComponentScan("com.in28minutes.spring.basics.componentScan")
public class SpringIn5StepsComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);
	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringIn5StepsComponentScanApplication.class);
		ComponentDAO componentDAO = context.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", componentDAO);
	}
}
