package com.object;
class Tom{
	int age = 50;
	
	protected void hello() {
		System.out.println("Tom-Hello");
	}
}
interface Hillary{
	int age = 48;
}
class Bill{
	
}
public class LittleTom extends Tom implements Hillary{
	// little tom의 필드는 
	int age = 20;
	
	@Override
	protected void hello() {
		System.out.println("LittleTom-Hello");
	}

	public void test() {
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
		System.out.println(Hillary.age);
	}
	
	public static void main(String[] args) {
		Tom t = new LittleTom();
		t.hello();
		System.out.println(t.age);
		LittleTom lt = new LittleTom();
		lt.hello();
		lt.test();
		if(lt instanceof LittleTom) {
			System.out.println("instance of LitleTom");
		}
		
		if (lt instanceof Tom) {
			System.out.println("instance of Tom");
		}
		if (lt instanceof Hillary) {
			System.out.println("instance of Hillary");
		}
		if (lt instanceof Object) {
			System.out.println("instance of Object");
		}
	}
}
