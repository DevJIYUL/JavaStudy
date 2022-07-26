package com.generic;

public class GenericNumber<X extends Number> {
	private X what;
	public X getWhat() {
		return what;
	}
	public void setWhat(X what) {
		this.what = what;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericNumber<Integer> intnum = new GenericNumber<Integer>();
		GenericNumber<Double> doublenum = new GenericNumber<Double>();
//		GenericNumber<String> strin = new GenericNumber<String>();
		GenericNumber<Float> floatnum = new GenericNumber<Float>();
		intnum.setWhat(9);
		doublenum.setWhat(5.5);
		floatnum.setWhat(11.2f);
		System.out.println(intnum.getClass().getSimpleName()+"의 수는 "+intnum.getWhat());
		System.out.println(doublenum.getClass().getSimpleName()+"의 수는 "+doublenum.getWhat());
		System.out.println(floatnum.getClass().getSimpleName()+"의 수는 "+floatnum.getWhat());
	}

}
