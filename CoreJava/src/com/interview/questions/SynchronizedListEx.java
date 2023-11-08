package com.interview.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedListEx {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		Collections.synchronizedList(list);
		
		
	}

}
