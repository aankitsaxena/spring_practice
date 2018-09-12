package com.in28minutes.spring.basics.springin5steps.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public BinarySearchImpl(SortAlgorithm bubbleSortAlgorithm) {
		super();
		this.sortAlgorithm = bubbleSortAlgorithm;
	}

	public int binarySearch(int[] numbers, int number) {
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		return 3;
	}
	
	@PostConstruct
	public void postConstruct() {
		logger.info("Post Construct****");
	}

	@PreDestroy
	public void preDestroy() {
		logger.info("Pre Destroy****");
	}
}
