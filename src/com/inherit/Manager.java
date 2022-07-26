package com.inherit;


class Employee{
	int num; // 사번
	String name; // 이름
	int salary; // 연봉
	public Employee(int num, String name, int salary) {
		this.num = num;
		this.name = name;
		this.salary = salary;
	}
	
	double getBouns() { // 일반 사원 보너스 계산 공식
		return salary * 0.3;
	}
	
}

public class Manager extends Employee{
	int mcode; // 매니저 코드
 	public Manager(int num, String name, int salary, int mcode) {
		super(num,name,salary); // 부모의 생성자를 호출
		this.mcode = mcode;
	}

	@Override
	double getBouns() {
		return salary * 0.5;
	}
}
