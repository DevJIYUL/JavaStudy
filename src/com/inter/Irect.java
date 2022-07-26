package com.inter;

public class Irect implements Ishape{
	int width, height;	
	
	public Irect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getCircum() {
		return 2*(width + height);
	}

}
