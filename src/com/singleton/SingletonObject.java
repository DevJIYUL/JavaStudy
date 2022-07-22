package com.singleton;
//싱글턴 패턴 클래스 : 객체 생성을 한번만 수행하고 그 이후로는 생성된 객체 공유에서 사용
public class SingletonObject {
	// 싱글턴 패턴 객체 조건
	// 1.field : private static
	// 2.생성자 : private
	// 3.public static 메소드 : 객체를 생성하거나 생선된 객체를 리턴해줌
	
	private static SingletonObject instance;
	private SingletonObject() {}
	
	public static SingletonObject getInstance() {
		// 객체 한번만 생성되게 함
		if(instance == null)
			instance = new SingletonObject();
		return instance;
	}
}
