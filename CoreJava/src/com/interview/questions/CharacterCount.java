package com.interview.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterCount {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("srikanth");
		list.add("mahesh");
		list.add("harsha");

		Map<String, Integer> charCountMap = list.stream()
											.collect(Collectors.toMap(str -> str,str -> str.length()));

		charCountMap.forEach((key, value) -> System.out.println(key + " - " + value + " (characters with count)"));
	}

}
