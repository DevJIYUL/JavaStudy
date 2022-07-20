package com.object;

public class StaticTest {
	//field
	// count는 인스턴스 변수
	int count;
	// scount는 클래스 변수 -> 객체 생성 x -> 클래스 이름으로 접근 가능
	static int scount;
	static {
		System.out.println("static-1");
	}
	public void test() {
		System.out.println(this.count);
	}
	public static void hello() {
		System.out.println("hello~~~");
	}
	public static void main(String[] args) {
		double po = Math.pow(2, 3);
		System.out.println(po);
		StaticTest.hello();

		// static 메소드 안에서는 this를 쓸수 없다. this는 객체가 생성되고 만들어지는데 static은 컴파일 이전에 만들어지기 때문에
		// static 메서드 안에서 this 는 존재 할수 없다.
//		System.out.println(this.scount);
		// scount는 객체 생성을 하지 않아도 만들어져 있다. scount에 접근할때는 클래스 명으로 접근 한다
		// 다른 클래스에서도 해당 클래스 명으로 접근 가능함.다른 클래스에서 StaticTest.scount 로 접근.
		System.out.println(++StaticTest.scount);
		/*
		 * StaticTest s1 = new StaticTest(); StaticTest s2 = new StaticTest();
		 * StaticTest s3 = new StaticTest();
		 * 
		 * System.out.println(++s1.count+","+ ++s2.count + "," + ++s3.count);
		 * System.out.println(++s1.scount+","+ ++s2.scount + "," + ++s3.scount);
		 */	}
	static {
		System.out.println("static-2");
	}
}
