package com.java8;

public class FindVowels {

	public static void main(String[] args) {

		String s = "Srikanth Kuluri";

		s.chars().mapToObj(ch -> Character.valueOf((char) ch)).filter(i -> "aeiou".indexOf(i) == -1)
				.forEach(System.out::println);

	}

}
