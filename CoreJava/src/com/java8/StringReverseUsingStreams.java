package com.java8;

public class StringReverseUsingStreams {

	public static void main(String[] args) {

		String str ="srikanth";
		
		String string = str.chars()
							.mapToObj(c->(char)c)
							.reduce("",(s,c)->c+s,(s1,s2)->s1+s2);
	
		System.out.println(string);
	}

}
