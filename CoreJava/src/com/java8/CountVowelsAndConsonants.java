package com.java8;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {

		String str = "Helloworld kuluri";
		
		//s->s=='a' || s=='e' || s=='i' || s=='o' || s=='u'
		
		long count = str.chars()
		.filter(ch->"aeiou".contains((char)ch+"")).count();
		System.out.println(count);
		
		
	}

}
