package com.singleton;
//�̱��� ���� Ŭ���� : ��ü ������ �ѹ��� �����ϰ� �� ���ķδ� ������ ��ü �������� ���
public class SingletonObject {
	// �̱��� ���� ��ü ����
	// 1.field : private static
	// 2.������ : private
	// 3.public static �޼ҵ� : ��ü�� �����ϰų� ������ ��ü�� ��������
	
	private static SingletonObject instance;
	private SingletonObject() {}
	
	public static SingletonObject getInstance() {
		// ��ü �ѹ��� �����ǰ� ��
		if(instance == null)
			instance = new SingletonObject();
		return instance;
	}
}
