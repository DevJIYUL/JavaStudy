package com.util;

import java.util.HashSet;

// set : 중복 x 순서 x
public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("one");
		set.add("moon");
		set.add("sun");
		set.add("cloud");
		set.add("rainy");
		set.add("hail");
		set.add("a");
		set.add("b");
		set.add("cloud");
		set.add("rainy");
		set.add("hail");
		set.remove("one");
		for (String str : set) {
			System.out.println(str);
		}
	}

}
