package com.member;
// 회원 정보 저장
public class Member {
	// 필드(데이터):클래스 내부에서만 사용가능, encapsulation 캡슐화
	private int num;
	private String name;
	private String address;
	private int age;
	// 생성자
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
