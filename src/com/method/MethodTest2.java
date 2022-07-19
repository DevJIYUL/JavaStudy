package com.method;

public class MethodTest2 {
	public static String getGreeting(String name) {
		return name + "...be happy";
	}
	public static boolean reverse(boolean flag) {
		return !flag;
	}
	public static String result(boolean a,boolean b) {
		if (a && b) {
			return "OK";
		}else {
			return "CANCLE";
		}
	}
	public static String loopString(int count,String msg) {
		String str = "";
		for (int i = 0; i < count; i++) {
			str += msg;
		}
		return str;
	}
	public static double getArea(int r) {
		return r*r*3.14;
	}
	public static void printCircum(int r) {
		double result = 2*r*3.14;
		System.out.println(result);
	}
	public static int[] makeArray(int len) {
		int [] a = new int[len];
		return a;
	}
	public static int total(int[] arr) {
		int sum = 0;
		for(int a :arr) {
			sum += a;
		}
		return sum;
	}
	public static int[] swap(int[] arr,int a,int b) {
		int temp = arr[a];
		arr[a]=b;
		arr[b] = temp;
		return arr;
	}
	public static int findMax(int[] arr) {
		int val = arr[0];
		int index = 0;
		for (int i = 1; i < arr.length; i++) {
			if (val < arr[i]) {
				val = arr[i];
				index = i;
			}
			
		}
		return index;
	}
	public static void main(String[] args) {
		System.out.println(loopString(4, "ÁöÀ²ÀÌ "));
		System.out.println(reverse(true));
	}

}
