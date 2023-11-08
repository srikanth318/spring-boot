package com.interview.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ExTest {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,6,8,55,89,12,34);
		Integer integer = list.stream().sorted(Comparator.reverseOrder()).skip(1).max(Integer::compare).get();
		System.out.println(integer);
	}
}
