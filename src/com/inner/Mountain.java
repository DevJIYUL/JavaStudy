package com.inner;
//3.local class : 
public class Mountain {
	int height = 1950;
	
	public void hello() {
//		Gold g = new Gold(); // error
	}
	
	public void work() {
		class Gold{ // local class : define inside of method, available in the method
			void dig() {
				System.out.println(height);
			}
		}
		Gold g = new Gold();
		g.dig();
		System.out.println(g.getClass().getName());
	}
	public static void main(String[] args) {
		Mountain m = new Mountain();
		m.work();

	}

}
