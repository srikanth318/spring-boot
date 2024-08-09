package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateFinder {

	public static void main(String[] args) {
        List<Integer> list = Arrays.asList(15, 8, 49, 25, 98, 98, 32, 15);

        List<Integer> duplicates = list.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        duplicates.forEach(System.out::println);
    }
}
