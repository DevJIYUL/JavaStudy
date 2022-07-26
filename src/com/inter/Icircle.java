package com.inter;

interface Seoul{}
class Boat{}

//interface IShape를 상속 받아 추상메소드를 완성 시켜 놔야 됨 
public class Icircle implements Ishape{
	int r;
	public Icircle(int r) {
		
		this.r = r;
	}

	@Override
	public double getArea() {
		return Math.PI * r * r;
	}

	@Override
	public double getCircum() {
		return 2 * Math.PI * r;
	}
}

