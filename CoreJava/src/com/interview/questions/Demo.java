package com.interview.questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
	
	public static void main(String[] args) {
		
		String str ="sreekanth1";
		
		Map<Character, Long> hm = new LinkedHashMap<>();
		
		Map<Character, Long> collect = str.chars().mapToObj(c ->(char) c).collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting()));
		
		collect.forEach((k,v)->
		{
			if(v==1) 
			{
				System.out.print(k);
			}
			
		});
	}
}
