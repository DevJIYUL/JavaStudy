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
		// �������̵��� �޼ҵ忡�� ����Ǵ� ���̴�.
		t.hello(); // "LittleTom-Hello"�� ��µȴ�
		// �ʵ� �����ʹ� �������̵� ���� �ʴ´�.
		System.out.println(t.age); // �ʵ�� ���۷����� Ÿ���� ������. "50"�� ��µȴ�.
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
