package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(
				new Employee(1, "srikanth", 29, 20000, "Hr"),
				new Employee(2, "mahi", 30, 30000, "It"), 
				new Employee(3, "aarthi", 25, 10000, "account"),
				new Employee(4, "vamsi", 89, 50000, "account"));
				
		
		Map<String, List<Employee>> collect = list.stream().filter(e->e.getAge()>28).collect(Collectors.groupingBy(Employee::getDept,Collectors.toList()));
		
		System.out.println(collect);
		
	}

}
