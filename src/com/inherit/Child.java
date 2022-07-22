package com.inherit;
// �θ� Ŭ���� ,super class,base class
class Parent{
	String name = "stan smith";
	String address ="Seoul";
	
	Parent(){
		System.out.println("Parent ������");
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	
	
}
// �ڽ� Ŭ���� ,sub class, derived class
public class Child extends Parent{
	String email;
	
	Child(){
		System.out.println("Child ������");
	}
	
	// getName() ������ : method overriding. �θ𿡰Լ� �������� �޼ҵ带 ������.
	// method overridong ���� : �޼ҵ� ���� Ÿ��, �޼ҵ� �̸�, �Ķ���͸���Ʈ�� �ݵ�� �����ؾ� ��
	// ���ľ� ( ���� ������ ) �� ���� ����
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "tomson";
	}
	
	void callSuper() {
		System.out.println(super.getName());
	}
	// �ڽ� Ÿ���� ��ü�� �����ϸ� �޸𸮿� ���� �θ� ��ü�� ������ �ǰ� �� �Ʒ� �ڽ� ��ü�� ���� ����.
	public static void main(String[] args) {
		// ������ 
		Child c = new Child();
		Parent x = new Child();
		Object o = new Child();
		
		System.out.println(x.getName());
		System.out.println();
		
		/*
		// �޼ҵ� �������̵��� ��� ������ �ڽ� �޼ҵ尡 ȣ���.
		System.out.println(c.getName());
		//static method �ȿ����� this, super�� ����Ҽ� ����.
//		System.out.println(super.getName());
		c.callSuper();
		System.out.println(c.getAddress());
		System.out.println(c.name);*/
	}

}
