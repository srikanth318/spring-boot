package com.test;

public class Child extends Parent{

	
	public void m1() 
	{
		System.out.println("Child calling..");
	}
	
	public static void main(String[] args) {

		Parent p = new Parent();
		
		p.m1();
		
		Child c = new Child();
		c.m1();
		
		Parent p1 = new Child();
		
		p1.m1();
		
	}

}
