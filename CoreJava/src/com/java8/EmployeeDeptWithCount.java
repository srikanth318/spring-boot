package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import com.test.Employee;

public class EmployeeDeptWithCount {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(new Employee(1, "srikanth", 29, 20000, "Hr"),
				new Employee(2, "mahi", 30, 30000, "It"), new Employee(3, "aarthi", 25, 10000, "account"),
				new Employee(4, "vamsi", 89, 50000, "account"));

		Map<String, Long> collect = list.stream()
				.collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));

		Set<Entry<String, Long>> entrySet = collect.entrySet();
		for (Entry<String, Long> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
