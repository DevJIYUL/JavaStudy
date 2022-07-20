package com.object;

import java.util.Iterator;

// wrapper class : 기본형 데이터를 참조형으로 변환시켜 주는 클래스들.
public class WrapperClassTest {

	public static void main(String[] args) {
		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
//		for (String string : args) {
//			System.out.println(string);
//		}
		Integer t = Integer.parseInt("43");
		Double.parseDouble("2.7");
		int num = 88;
		// 객체로 바뀌면 연산이 안된다.
		Integer num2 = new Integer(num);
		
		num2 +=10;// auto-unboxing. 참조형 -> 기본형으로 변환이 돼서 연산이 일어남
		System.out.println(num);
		System.out.println(num2);
		// auto-boxing 기본형 99 를 객체로 씌어준다.
		Integer i = 99;
		Double d = 3.14;
	}

}
