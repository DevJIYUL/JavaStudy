package com.method;


public class MethodTest {
	//method define
	public static void hello() {
		System.out.println("hello!!!");
	}
	// �̸��� �Ķ���ͷ� �޾Ƽ� �̸� �ڿ� " bye!"�� �����ؼ� �����ϴ� �޼���
	public static String bye(String name){
		return name + " bye!!!";
	}
	// �޼��� �̸� sum; �Ķ���� ������ 2�� ;�� ����
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
