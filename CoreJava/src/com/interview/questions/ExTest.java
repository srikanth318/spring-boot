package com.interview.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExTest {

	public static void main(String[] args) {

		
		  List<String> list = Arrays.asList("srikanth", "madhu", "harsha");
		  
		  List<String> list2 = Arrays.asList("srikanth1","madhu", "harsha");
		  
		  list.retainAll(list2);
		  
		  System.out.println(list);
		  
		  List<String> list3 = Stream.concat(list.stream(),
		  list2.stream()).distinct().toList();
		  
		  List<String> list4 = list.stream().filter(list2::contains).toList();
		  
		  // System.out.println(list4);
		 		
		
		
	}
}
