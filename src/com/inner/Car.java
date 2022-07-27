package com.inner;
//2.member class : 내부 클래스를 사용(생성)하기전에 먼저 외부 클래스가 생성되어있어야함.
//2.member class : Create constructor class Car(outer class) and then create constructor class Engine(inner class)
//top-level class could be : public, final, abstract, default 

class Boat{}// - public 수식어는 하나만 표기할 수 있다.
public class Car {
	int num = 1234;
	
	private class Engine{ // inner class could be : public, private, protected, default, static
		public void go() {
			System.out.println(num);
		}
	}
	public static void main(String[] args) {
		Car c = new Car();
//		System.out.println(c.num);

		Engine e = c.new Engine();
		e.go();
		System.out.println(e.getClass().getName());
	}

}
