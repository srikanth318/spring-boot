package com.interview.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMain {

	public static void main(String[] args) {

		
		String name ="Srikanth";
		
		for(int i =0;i<=name.length()-1;i++)
		{

		char ch = name.toUpperCase().charAt(i); //s
		//System.out.println(ch+"A");

		}
		
		
		//name.chars().mapToObj(c->Character.valueOf((char) c)).forEach(s->System.out.println(s.toUpperCase((char) s)+"A"));
		
		List<Integer>list = Arrays.asList(2,5,7,3,8,9);//2,3,5,7,8,9


		List<Integer> list2 = list.stream().sorted(Comparator.reverseOrder()).limit(4).skip(2).toList();
		//System.out.println(list2);
		
		Map<Integer,Integer> hm = new HashMap<>();
		
		hm.put(1, 2);
		hm.put(2, 2);
		hm.put(3, 3);
		
		//hm.entrySet().forEach((k)->{System.out.println(k.getKey()+" "+k.getValue());});

		List<Employee> list3 = Arrays.asList(new Employee(1, "bangalore", 2000),new Employee(2, "bangalore", 9000),
				new Employee(3, "hyderabad", 5000),
				new Employee(4, "chennai", 8000));
		
		Map<String, Long> collect = list3.stream().filter(e->!e.getName().equals("bangalore")).collect(Collectors.groupingBy(Employee::getName,Collectors.counting()));

		collect.entrySet().forEach(s->System.out.println(s.getKey()+" "+s.getValue()));
		
		
		
	}

}
