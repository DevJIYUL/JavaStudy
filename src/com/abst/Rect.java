package com.abst;

public class Rect extends Shape {
	int width,height;
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}

	@Override
	public double getCircum() {
		// TODO Auto-generated method stub
		return (width+height) * 2;
	}

}
