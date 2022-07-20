package com.member;
// 회원 정보 저장
public class Member {
	// 필드(데이터)
	int num;
	String name;
	String address;
	int age;
	// 생성자
	public Member() {}
	public Member(int num, String name, String address, int age) {
		this.num = num;
		this.name = name;
		this.address = address;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Member [num=" + num + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}

}
