package com.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class DuplicateNumberInArray {

	private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
	
	public static void main(String[] args) {

		int arr [] = {4,7,2,18,8,9,5,3,7,2};
		
		Set<Integer> set = new HashSet<>();
		
		//List<Integer> list = Arrays.stream(arr).boxed().filter(e->set.add(e)).toList();
		//System.out.println(list);
		
		String inputString = "example";

        // Convert the string to IntStream of characters
        IntStream.range(0, inputString.length())
                .filter(i -> isVowel(inputString.charAt(i)))
                .mapToObj(i -> inputString.charAt(i) + String.valueOf(inputString.charAt(i - 1)))
                .forEach(System.out::println);
    }

    // Helper method to check if a character is a vowel
    
		
}


