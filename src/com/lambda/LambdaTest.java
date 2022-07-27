package com.lambda;

//@FunctionalInterface : 인터페이스 안에 추상 메소드가 하나만 존재하는 경우
@FunctionalInterface
interface Something{
	int some(int a, int b);
}
class Robot{
	public void work(Something s, int x,int y) {
		int result = s.some(x, y);
		System.out.println(result);
	}
}

public class LambdaTest {
	public static void main(String[] args) {
		
		// lambda
		Robot jane = new Robot();
		jane.work((a,b)->{
			return a-b;
		},5, 6);
		
		jane.work((a,b)->a*b, 3, 8);
		
		// non-lambda
		Robot tom = new Robot();
		tom.work(new Something() {
			
			@Override
			public int some(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		}, 5, 6);
	}
	
	
	
	
	
	
	
	
	
	
	
	
//	// 1.
//	int max(int a,int b) {
//		return a>b? a:b;
//	}
//	// 메소드 이름 ,리턴타입 ,파라미터타입 x, 실행문장이 1개인 경우 {} 생략
//	//(a,b)->a>b?a:b
//	// 2.
//	void printName(String name, int i) {
//		System.out.println(name+"="+i);
//	}
//	
////	(name,i)-> System.out.println(name+"="+i)
//	
//	//3.
//	int square(int x) {
//		return x*x;
//	}
////	(x)-> x*x;
//	
//	//4.
//	int read() {
//		return (int)(Math.random()*6);
//	}
////	()->(int)(Math.random()*6);
//	//5.
//	int sun(int[] arr) {
//		int sum = 0;
//		for (int i : arr) {
//			sum += i;
//		}
//		return sum;
//	}
////	arr ->{
////		int sum = 0;
////		for (int i : arr) {
////			sum += i;
////		}
////		return sum;
////	}
}
