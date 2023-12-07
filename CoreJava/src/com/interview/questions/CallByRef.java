package com.interview.questions;

public class CallByRef {

	int number=10;

	public static void m1(CallByRef ref) {
		ref.number = ref.number + 1;
		System.out.println("Value in the method = "+ref.number);
	}

	public static void main(String[] args) {

		CallByRef ref = new CallByRef();

		
		System.out.println("value in the before method call= " + ref.number);

		m1(ref);

		System.out.println("value in the after method call= " + ref.number);

	}

}
