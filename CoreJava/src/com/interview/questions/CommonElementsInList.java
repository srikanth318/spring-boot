package com.interview.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementsInList {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(2, 3, 4, 6, 7, 8, 8, 9, 10, 11);
		List<Integer> list2 = Arrays.asList(3,8, 11);
		List<Integer> list3 = Arrays.asList(8,11, 2, 12, 4);
		
		Set<Integer> set = new HashSet<>(list1);
		
		set.retainAll(list2);
		set.retainAll(list3);
        
        System.out.println(set);

	}
}
