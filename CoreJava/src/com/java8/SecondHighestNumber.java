package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 2, 4, 7, 3,2, 9, 33, 22);

		//33,22,9,7,4,3,2,1
		
		Integer integer = asList.stream()
								.distinct()
								.sorted(Comparator.reverseOrder())
								.skip(1).findFirst()
								.get();

		System.out.println(integer);

	}

}
