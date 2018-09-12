package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm bubbleSortAlgorithm;


	
	public BinarySearchImpl(SortAlgorithm bubbleSortAlgorithm) {
		super();
		this.bubbleSortAlgorithm = bubbleSortAlgorithm;
	}



	public int binarySearch(int[] numbers, int number) {
		
		
		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
		System.out.println(bubbleSortAlgorithm);
		
		return 3;
	}



	public SortAlgorithm getBubbleSortAlgorithm() {
		return bubbleSortAlgorithm;
	}



	public void setBubbleSortAlgorithm(SortAlgorithm bubbleSortAlgorithm) {
		this.bubbleSortAlgorithm = bubbleSortAlgorithm;
	}
}
