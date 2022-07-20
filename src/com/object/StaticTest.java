package com.object;

public class StaticTest {
	//field
	// count�� �ν��Ͻ� ����
	int count;
	// scount�� Ŭ���� ���� -> ��ü ���� x -> Ŭ���� �̸����� ���� ����
	static int scount;
	static {
		System.out.println("static-1");
	}
	public void test() {
		System.out.println(this.count);
	}
	public static void hello() {
		System.out.println("hello~~~");
	}
	public static void main(String[] args) {
		double po = Math.pow(2, 3);
		System.out.println(po);
		StaticTest.hello();

		// static �޼ҵ� �ȿ����� this�� ���� ����. this�� ��ü�� �����ǰ� ��������µ� static�� ������ ������ ��������� ������
		// static �޼��� �ȿ��� this �� ���� �Ҽ� ����.
//		System.out.println(this.scount);
		// scount�� ��ü ������ ���� �ʾƵ� ������� �ִ�. scount�� �����Ҷ��� Ŭ���� ������ ���� �Ѵ�
		// �ٸ� Ŭ���������� �ش� Ŭ���� ������ ���� ������.�ٸ� Ŭ�������� StaticTest.scount �� ����.
		System.out.println(++StaticTest.scount);
		/*
		 * StaticTest s1 = new StaticTest(); StaticTest s2 = new StaticTest();
		 * StaticTest s3 = new StaticTest();
		 * 
		 * System.out.println(++s1.count+","+ ++s2.count + "," + ++s3.count);
		 * System.out.println(++s1.scount+","+ ++s2.scount + "," + ++s3.scount);
		 */	}
	static {
		System.out.println("static-2");
	}
}
