package com.inter;

public class SandwichUser {

	public static void main(String[] args) {
		Sandwich[] sw = new Sandwich[2];
		sw[0] = new StackNcheese();
		sw[1] = new ItalianBMT();
		for (int i = 0; i < sw.length; i++) {
			System.out.println("-------------- "+sw[i].getClass().getSimpleName()+" --------------");
			sw[i].info();

		}

	}

}
