package com.object;

public class Circle {
	int radius;
	
	public Circle() {
		this(0);
	}
	
	public Circle(int radius) {
		this.radius = radius;
	}

	public double getArea() {
		return 2*radius*3.14;
	}
	public double getCircum() {
		return radius*radius*3.14;
	}
	public static void main(String[] args) {
		Circle c = new Circle();
//		Circle �����ڿ��� �������
//		c.radius = 4;
		System.out.println("���� �ѷ��� : "+c.getArea());
		System.out.println("���� ���̴� : "+c.getCircum());
	}

}
