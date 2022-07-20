package com.ssafy;

public class User {
	// �ܺο��� ��ü ������ ������ ���� �������� ���ϵ��� ���� ������ ����
	String id;
	String password;
	String name;
	String email;
	int age;
	
	public User() {}

	public User(String id, String password, String name, String email, int age) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.age = age;
	}

	/*
	 * ��� ���� �̸��� ���� ���� �����ϴ� ���
	 * getter / setter �޼ҵ带 ���� �����Ҽ� �ֵ��� getter / setter �޼ҵ���� ������ּ���.
	 * ��) id�� �������� : getId() { .... / id�� �����ϱ� : setId(String id) { ...
	 */

	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + ", email=" + email + ", age=" + age
				+ "]";
	}
}
