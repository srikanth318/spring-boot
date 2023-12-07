package com.interview.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SynchronizedListEx {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		
		Map<String, String> hm = new HashMap<>();
		
		Collections.synchronizedList(list);
		
		Collections.synchronizedMap(hm);
		
		
		
		
		
	}

}
