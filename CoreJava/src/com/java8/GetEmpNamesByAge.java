package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.test.Employee;

public class GetEmpNamesByAge {

	public static void main1(String[] args) {

		List<Employee> list = Arrays.asList(new Employee(1, "srikanth",29 , 20000,"Hr"),
											new Employee(2, "mahi",30 , 30000,"It"),
											new Employee(3, "aarthi",25 , 10000,"sales"),
											new Employee(4, "vamsi",89 , 50000,"account"));
		
		
		List<String> collect = list.stream().filter(emp->emp.getAge()>=10).sorted(Comparator.comparing(Employee::getName)).map(Employee::getName).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		
	}
	
	public static void main(String [] args) {
		
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4); 
		List<Integer> distinct = numbers.stream() .map( i -> i*i) .distinct() .collect(Collectors.toList());

		System.out.println(distinct);
	}

}
