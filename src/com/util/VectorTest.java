package com.util;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> name = new Vector<String>();
		name.add("Spring");
		name.add("Summer");
		name.add("Fall");
		name.add("Winter");
		name.add(1, "엘리뇨");
//		name.remove(0);
//		name.remove("Spring");
		
//		name.clear();
//		System.out.println(name.size());
		for (String str : name) {
			System.out.println(str);
		}
		
		Vector v1 = new Vector(2,2);//Vector(내부 배열 크기,초과시 늘어나는크기)
		System.out.println(v1.capacity());
		v1.add(123);
		v1.add("hello");
		v1.add(true);
		System.out.println(v1.capacity());
		v1.add(11.20);
		v1.add("hello");
		System.out.println(v1.capacity());

		for (int i = 0; i < v1.size(); i++) { // v1.size() : v1안의 내용물 갯수
			System.out.println(v1.get(i));
		}
	}

}
