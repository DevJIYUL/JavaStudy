package com.exception;

import com.object.Car;

// ArrayIndexOutOfBoundsException, ArithmeticException, NullPointerException : Runtime Exception
public class ArrayTest {
	int num;
	public static void main(String[] args) {

		int a = 0, b = 8;
		int result = -99;

		Car c = null; // 지역변수. 사용전에 초기화 시켜줘야 함.
		int age;
		//System.out.println(age); 컴파일 자체에서 에러가 발생한다.
		try {
			c.info();
			result = b / a; // 나눗셈에서 분모에 0이 들어오면 예외 발생.ArithmeticException
			// catch 문은 작은 순에서 큰순으로 구현한다 exception 은 모든 예외의 부모이다.
		} catch (ArithmeticException ar) {
			result = 100; // 예외 발생시 설정할 값
		} catch (NullPointerException n) {
			n.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
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
