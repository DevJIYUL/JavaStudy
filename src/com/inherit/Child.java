package com.inherit;

import com.exception.MyException;

// �θ� Ŭ���� ,super class,base class
class Parent {
	String name = "stan smith";
	String address = "Seoul";

	Parent() {
		System.out.println("Parent ������");
	}

	public String getName() {
		return name;
	}

	public String getAddress() throws Exception{
		return address;
	}

}

// �ڽ� Ŭ���� ,sub class, derived class
public class Child extends Parent {
	String email;

	Child() {
		System.out.println("Child ������");
	}

	// getName() ������ : method overriding. �θ𿡰Լ� �������� �޼ҵ带 ������.
	// method overridong ���� : �޼ҵ� ���� Ÿ��, �޼ҵ� �̸�, �Ķ���͸���Ʈ�� �ݵ�� �����ؾ�
	// ��
	// ���ľ� ( ���� ������ ) �� ���� ����
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "tomson";
	}

	void callSuper() {
		System.out.println(super.getName());
	}
	// 부모 클래스가 예외 클래스를 (throw) 를 쓰면 자식은 throw 해도 되고 안해도 된다.
	// 부모 클래스가 throw 하지 않는데 자식은 throw 를 할수 없다.
	public String getAddress() throws Exception {
		if (address.equals("")) {
			throw new Exception();
		}
		return "london";
	}

	// �ڽ� Ÿ���� ��ü�� �����ϸ� �޸𸮿� ���� �θ� ��ü�� ������ �ǰ� �� �Ʒ� �ڽ� ��ü�� ����
	// ����.
	public static void main(String[] args) {
		// ������
		Child c = new Child();
		Parent x = new Child();
		Object o = new Child();

		System.out.println(x.getName());
		System.out.println();

		/*
		 * // �޼ҵ� �������̵��� ��� ������ �ڽ� �޼ҵ尡 ȣ���.
		 * System.out.println(c.getName()); //static method �ȿ����� this, super�� ����Ҽ�
		 * ����. // System.out.println(super.getName()); c.callSuper();
		 * System.out.println(c.getAddress()); System.out.println(c.name);
		 */
	}

}
