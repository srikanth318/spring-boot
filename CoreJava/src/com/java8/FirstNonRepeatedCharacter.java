package com.java8;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {

	public static void main(String[] args) {
		
		String str ="sreekanthr";
		
		Character character = str.chars().mapToObj(c->Character.toLowerCase((char)c))
					.collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting()))
					.entrySet()
					.stream()
					.filter(entry->entry.getValue()>1)
					.map(entry->entry.getKey())
					.findFirst().get();
		
		System.out.println(character);
	}

}
