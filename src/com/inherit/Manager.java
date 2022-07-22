package com.inherit;


class Employee{
	int num; // ���
	String name; // �̸�
	int salary; // ����
	public Employee(int num, String name, int salary) {
		this.num = num;
		this.name = name;
		this.salary = salary;
	}
	
	double getBouns() { // �Ϲ� ��� ���ʽ� ��� ����
		return salary * 0.3;
	}
	
}

public class Manager extends Employee{
	int mcode; // �Ŵ��� �ڵ�
 	public Manager(int num, String name, int salary, int mcode) {
		super(num,name,salary); // �θ��� �����ڸ� ȣ��
		this.mcode = mcode;
	}

	@Override
	double getBouns() {
		return salary * 0.5;
	}
}
