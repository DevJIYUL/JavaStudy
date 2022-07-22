package com.object;
class Tom{
	int age = 50;
	
	protected void hello() {
		System.out.println("Tom-Hello");
	}
}

class Bill{
	
}
public class LittleTom extends Tom{
	int age = 20;
	
	@Override
	protected void hello() {
		System.out.println("LittleTom-Hello");
	}

	public void test() {
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
	}
	
	public static void main(String[] args) {
		Tom t = new LittleTom();
		// 오버라이딩은 메소드에만 적용되는 것이다.
		t.hello(); // "LittleTom-Hello"가 출력된다
		// 필드 데이터는 오버라이딩 되지 않는다.
		System.out.println(t.age); // 필드는 레퍼런스의 타입을 따른다. "50"이 출력된다.
		LittleTom lt = new LittleTom();
		lt.hello();
		lt.test();
		if(lt instanceof LittleTom) {
			System.out.println("instance of LitleTom");
		}
		
		if (lt instanceof Tom) {
			System.out.println("instance of Tom");
		}
		if (lt instanceof Object) {
			System.out.println("instance of Object");
		}
	}
}
