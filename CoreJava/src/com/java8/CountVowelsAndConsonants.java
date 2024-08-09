package com.java8;

import java.util.List;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {

		String str = "Helloworld kuluri";
		
				// s->s=='a' || s=='e' || s=='i' || s=='o' || s=='u'

		/*
		 * long count = str.chars() .filter(ch->"aeiou".contains((char)ch+"")).count();
		 * System.out.println(count);
		 */

		//long count = str.chars().filter(s -> "aeiou".contains(String.valueOf((char) s))).count();

	}

}
