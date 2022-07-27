package com.exception;
// throws : 예외가 발생힌 곳에서 바로 처리하지 않고 호출자로 예외를 보내서 그곳에서 처리하도록 함.
public class ThrowsTest3 {

	public static void main(String[] args) throws Exception {// throws Exception -> main에서 실행되다가 발생하는 예외를 JVM에게 던진다.
		ThrowsTest3 tt = new ThrowsTest3();
		tt.test(3);


	}

	private void test(int num) throws Exception {
		if (num >= 0) { // 정상 실행 된다.
			System.out.println(++num);
		}else { // 비정상인 경우. 예외를 발생 시킴.
			throw new Exception();// 예외 발생 시키는 문장 -> 메인 tt.test()로 예외를 던짐
		}
	}

}