package com.object;

public class Car {
	// member,field,data,attribute
	int num;
	String model;
	String owner;
	// defualt constructor
	public Car(){
		this(0);
	}
	
	public Car(int num) {
		this(num,"¿¬½À Ä«Æ®");
	}
	
	public Car(int num, String model) {
		this(num,model,"Dao");
	}

	public Car(int num, String model, String owner) {
		this.num = num;
		this.model = model;
		this.owner = owner;
	}


	public void info() {
		System.out.println("num : "+num);
		System.out.println("model : "+model);
		System.out.println("owner: "+owner);
	}
	public void run() {
		System.out.println("ºÎ¸ª ºÎ¸ª ºÎ¸ª...");
	}
	public void stop() {
		System.out.println("³¢ÀÌÀÌÀÌÀÌÀÍ!!");
	
	}
	
	
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(1234);
		Car c3 = new Car(4567,"Solid pro");
		Car c4 = new Car(3847,"Solid pro","Bazzi");
		c1.info();
		c2.info();
		c3.info();
		c4.info();

	}

}
