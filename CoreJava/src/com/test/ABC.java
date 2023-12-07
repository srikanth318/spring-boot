package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 5, 2, 2, 3, 3, 2 };
	Map<Integer,Long>uu=Arrays.stream(arr).boxed().collect(Collectors.groupingBy(u->u,Collectors.counting()));
		  
	List<Integer>mv=uu.entrySet().stream().filter(k->k.getValue()%2!=0).map(k->k.getKey()).collect(Collectors.toList());
		
		System.out.println(mv);

	}

}
