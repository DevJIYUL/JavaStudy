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
//		Circle 생성자에서 명시해줌
//		c.radius = 4;
		System.out.println("원의 둘래는 : "+c.getArea());
		System.out.println("원의 넓이는 : "+c.getCircum());
	}

}
