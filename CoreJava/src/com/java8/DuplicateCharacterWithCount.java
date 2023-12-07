package com.java8;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacterWithCount {

public static void main(String[] args) {
		
		String str ="sreekanth";
		
		
		Map<Character, Long> collect = str.chars().mapToObj(c ->(char) c).collect(Collectors.groupingBy(s->s,Collectors.counting()));
		
		collect.forEach((k,v)->
		{
			if(v>1) 
			{
				System.out.println(k+" "+v);
			}
		});
	}
}
