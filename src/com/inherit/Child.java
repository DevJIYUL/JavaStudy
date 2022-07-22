package com.inherit;
// 부모 클래스 ,super class,base class
class Parent{
	String name = "stan smith";
	String address ="Seoul";
	
	Parent(){
		System.out.println("Parent 생성자");
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	
	
}
// 자식 클래스 ,sub class, derived class
public class Child extends Parent{
	String email;
	
	Child(){
		System.out.println("Child 생성자");
	}
	
	// getName() 재정의 : method overriding. 부모에게서 물려받은 메소드를 재정의.
	// method overridong 조건 : 메소드 리턴 타입, 메소드 이름, 파라메터리스트가 반드시 동일해야 함
	// 수식어 ( 접근 지정자 ) 는 변경 가능
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "tomson";
	}
	
	void callSuper() {
		System.out.println(super.getName());
	}
	// 자식 타입의 객체를 생성하면 메모리에 먼저 부모 객체가 생성이 되고 그 아래 자식 객체가 따라 붙음.
	public static void main(String[] args) {
		// 다형성 
		Child c = new Child();
		Parent x = new Child();
		Object o = new Child();
		
		System.out.println(x.getName());
		System.out.println();
		
		/*
		// 메소드 오버라이딩의 경우 무조건 자식 메소드가 호출됨.
		System.out.println(c.getName());
		//static method 안에서는 this, super를 사용할수 없다.
//		System.out.println(super.getName());
		c.callSuper();
		System.out.println(c.getAddress());
		System.out.println(c.name);*/
	}

}
