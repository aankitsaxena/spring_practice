package com.in28minutes.spring.basics.springin5steps;

public class BinarySearchImpl {
	
	SortAlgorithm sortAlgorithm;
	
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}


	public int binarySearch(int[] numbers, int number) {
		
		
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		return 3;
	}
}
