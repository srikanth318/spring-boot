package com.interview.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMain {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(20,40,0,10,60,80);

		list.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

	}

}
