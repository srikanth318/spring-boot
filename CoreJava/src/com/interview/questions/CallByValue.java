package com.interview.questions;

public class CallByValue {
	
	public void m1(int number) 
	{
		number=number+1;
		System.out.println("value in the method= "+number);
	}
	
	public static void main(String[] args) {

		
		CallByValue t = new CallByValue();
		
		int number =100;
		
		System.out.println("value in the before method call= "+number);
		
		t.m1(number);
		
		System.out.println("value in the after method call= "+number);

	}

}
