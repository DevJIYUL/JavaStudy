package com.exception;
// throws : 예외가 발생힌 곳에서 바로 처리하지 않고 호출자로 예외를 보내서 그곳에서 처리하도록 함.
public class ThrowsTest {

	public static void main(String[] args){
		ThrowsTest tt = new ThrowsTest();

		try {
			tt.work(5,3);
			tt.work(4, 4);
			tt.work(5, 10);
		} catch (MyException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (YourException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
//		try {
//			tt.test(0);
//		}catch (MyException me) {
//			System.out.println(me);// 레퍼런스를 출력하면 클래스 안의 toString()가 자동 호출된다.
//		}
//		catch (Exception e) {
//			System.out.println("파라메터는 양수이여야 합니다.");
////			e.printStackTrace();
//		}

	}

	private void work(int input1, int input2) throws MyException,YourException {
		if (input1 > input2) {
			System.out.println(input1-input2+" 정상 출력 됩니다.");
		}else if (input1 == input2) {
			throw new MyException("잘못된 입력 !! 입력 한 두 수가 같아서 0이 출력됩니다.");
		}else {
			throw new YourException("잘못된 입력!! 음수 발생");
		}
	}

	private void test(int num) throws MyException,Exception {// throws Exception -> 예외 발생 시 , 메인 tt.test()로 예외를 던짐
		if (num > 0) { // 정상 실행 
			System.out.println(++num);
		}else if (num == 0) { // 비정상인 경우
			throw new MyException(" 파라미터가 0 입니다. 양수를 입력해 주세요.");
		}
		else { // 비정상인 경우. Exception 예외를 발생 시킴.
			throw new Exception();// 예외 발생 시키는 문장 
		}
	}

}