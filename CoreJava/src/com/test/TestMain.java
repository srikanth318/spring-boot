package com.test;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class TestMain {

	public static void main(String[] args) {

		 String  str = "javaisjava";
		 
		 Map<Character, Long> collect = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(n->n,Collectors.counting()));
  
		 List<Entry<Character, Long>> list = collect.entrySet().stream().filter(e->e.getValue()>1).toList();
		 
		  System.out.println(list);
		  
	}
	

}