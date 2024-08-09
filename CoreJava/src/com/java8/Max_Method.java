package com.java8;

import java.util.Arrays;
import java.util.List;

public class Max_Method {

	public static void main(String[] args) {

		int[] array = { 4, 6, 2, 1, 88, 6, 9, 44 };

		int maxElement = Arrays.stream(array).max().getAsInt();

		System.out.println("Maximum Element: " + maxElement);

	}

	public static void main1(String[] args) {

		List<Integer> list = Arrays.asList(4, 6, 2, 1, 88, 6, 9, 44);

		Integer integer = list.stream().max(Integer::compare).get();
		System.out.println(integer);

	}

}
