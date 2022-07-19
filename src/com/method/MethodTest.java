package com.method;


public class MethodTest {
	//method define
	public static void hello() {
		System.out.println("hello!!!");
	}
	// 이름을 파라메터로 받아서 이름 뒤에 " bye!"를 연결해서 리턴하는 메서드
	public static String bye(String name){
		return name + " bye!!!";
	}
	// 메서드 이름 sum; 파라미터 정수형 2개 ;합 리턴
	public static int sum(int a,int b) {
		return a+b;
	}
	public static void sum2(int a,int b) {
		System.out.println(a+b);
		return ;
	}
	public static void main(String[] args) {
		hello();
		hello();
		hello();
		System.out.println(bye("Jul"));
		System.out.println(sum(11,20));
		sum2(7,18);
	}

}
