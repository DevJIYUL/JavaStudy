package com.object;

import java.util.Iterator;

// wrapper class : �⺻�� �����͸� ���������� ��ȯ���� �ִ� Ŭ������.
public class WrapperClassTest {

	public static void main(String[] args) {
		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
//		for (String string : args) {
//			System.out.println(string);
//		}
		Integer t = Integer.parseInt("43");
		Double.parseDouble("2.7");
		int num = 88;
		// ��ü�� �ٲ�� ������ �ȵȴ�.
		Integer num2 = new Integer(num);
		
		num2 +=10;// auto-unboxing. ������ -> �⺻������ ��ȯ�� �ż� ������ �Ͼ
		System.out.println(num);
		System.out.println(num2);
		// auto-boxing �⺻�� 99 �� ��ü�� �����ش�.
		Integer i = 99;
		Double d = 3.14;
	}

}
