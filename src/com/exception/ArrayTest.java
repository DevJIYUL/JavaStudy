package com.exception;
// ArrayIndexOutOfBoundsException, ArithmeticException, NullPointerException : Runtime Exception
public class ArrayTest {

	public static void main(String[] args) {
		
		int a =0, b = 8;
		int result=-99;
		try {
			result = b / a; // 나눗셈에서 분모에 0이 들어오면 예외 발생.ArithmeticException
		} catch (ArithmeticException ar) {
			result = 100; // 예외 발생시 설정할 값
		}
		System.out.println(result);
		
		
		
		
		
//		int [] num = {1,2,3,4,5};
//		for (int i = 0; i <= num.length; i++) {
//			try {
//				System.out.println(num[i]); //
//			}catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println(e.toString());
//				System.out.println("Ooops,,, sorry!");
//			}finally { // 예외 발생 여부와 관계없이 매번 실행되는 부분
//				System.out.println("finally...");
//			}
//		}
//		System.out.println("done.....");
	}

}
