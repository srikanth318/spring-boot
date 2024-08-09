package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveElementExample {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5, 76, 2, 9, 7, 1);

		int remove = 9;

		List<Integer> list2 = list.stream().filter(s -> s != remove).collect(Collectors.toList());
		System.out.println(list2);
		
		//List<Integer> list2 = list.stream().filter(s -> s == remove).collect(Collectors.toList());
		//System.out.println(list2); this is for identify the particular element
	}

	public static void main1(String[] args) {
		
		List<String> list = Arrays.asList("srikanth","mahesh","srinu","ksr");

		
		List<String> collect = list.stream().filter(s->!s.equals("ksr")).collect(Collectors.toList());
		System.out.println(collect);
	}

}
