package com.member;
// ȸ�� ���� ����
public class Member {
	// �ʵ�(������):Ŭ���� ���ο����� ��밡��, encapsulation ĸ��ȭ
	private int num;
	private String name;
	private String address;
	private int age;
	// ������
	public Member() {}
	public Member(int num, String name, String address, int age) {
		this.num = num;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	public int getNum() {
		if (num > 0) {
			this.num = num;
		}
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name.length() > 0) {
			this.name = name;
		}
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}

}
