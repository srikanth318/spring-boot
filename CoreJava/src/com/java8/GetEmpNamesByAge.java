package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.test.Employee;

public class GetEmpNamesByAge {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(new Employee(1, "srikanth",29 , 20000,"Hr"),
											new Employee(2, "mahi",30 , 30000,"It"),
											new Employee(3, "aarthi",25 , 10000,"sales"),
											new Employee(4, "vamsi",89 , 50000,"account"));
		
		
		List<String> collect = list.stream().filter(emp->emp.getAge()>2).map(Employee::getName).collect(Collectors.toList());
		
		collect.forEach(System.out::println);
		
	}

}
