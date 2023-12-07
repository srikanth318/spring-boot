package com.interview.questions;

public final class CustomImmutableClass {

	final int id;
	final String name;
	
	public CustomImmutableClass(int id,String name) 
	{
		this.id=id;
		this.name=name;
	}
	
	public int getId() 
	{
		return id;
	}
	public String getName() 
	{
		return name;
	}
	
	public static void main(String[] args) {

		CustomImmutableClass c = new CustomImmutableClass(10,"srikanth");
		
		System.out.println(c.getId());
		System.out.println(c.getName());
		
		System.out.println("once assign the final variable we can't modifying values..");
		
		
	}

}
