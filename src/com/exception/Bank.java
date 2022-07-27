package com.exception;

public class Bank {

	public static void main(String[] args) {
		Bank b = new Bank();
		b.transfer(); // 이체 메소드 호출
	}

	private void transfer() {
		withdraw(); // 출금 메소드
		try {
			deposit();
		} catch (MyException e) {
			System.out.println(e);
			System.out.println("출금취소");// 예외 발생 후 뒷 처리
		} 
	}

	private void deposit() throws MyException {
		throw new MyException("입금예외");
	}

	private void withdraw() {
		System.out.println("출금성공");
	}

}
