package com.in28minutes.spring.basics.springin5steps;

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


	
	public BinarySearchImpl(SortAlgorithm bubbleSortAlgorithm) {
		super();
		this.sortAlgorithm = bubbleSortAlgorithm;
	}



	public int binarySearch(int[] numbers, int number) {
		
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		return 3;
	}



	public SortAlgorithm getBubbleSortAlgorithm() {
		return sortAlgorithm;
	}



	public void setBubbleSortAlgorithm(SortAlgorithm bubbleSortAlgorithm) {
		this.sortAlgorithm = bubbleSortAlgorithm;
	}
}
