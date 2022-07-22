package com.member;

// �̸� ���� �˻� �ϴ� �޼ҵ� : findByname()
// �ּҷ� �˻��ϴ� �޼ҵ� : findByname()
// ��ȣ �������� �ּҸ� �����ϴ� �޼ҵ� : updateAddress()
public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberManager manager = new MemberManager();
		Member m1 = new Member(100,"�� ���̽�","seoul",30);
		Member m2 = new Member(200,"�ڳ�","paris",40);
		Member m3 = new Member(300,"���̵�","seattle",70);
		
		boolean flag = manager.addMember(m1);
		if (!flag) {
			System.out.println("�� �̻� �߰��� �ȵ˴ϴ�.");
		}
		flag = manager.addMember(m2);
		if (!flag) {
			System.out.println("�� �̻� �߰��� �ȵ˴ϴ�.");
		}
		flag = manager.addMember(m3);
		if (!flag) {
			System.out.println("�� �̻� �߰��� �ȵ˴ϴ�.");
		}
		flag = manager.addMember(new Member(555,"jim carry","LA",52));
		if (!flag) {
			System.out.println("�� �̻� �߰��� �ȵ˴ϴ�.");
		}
		System.out.println("�߰��� ȸ����===================================");
		Member[] list = manager.getMembers();
		printMembers(list);
		System.out.println();
//		for (Member member : list) {
//			System.out.println(member);
//		}
		System.out.println("ȸ�� ����======================================");
		manager.deleteMember(300);
		printMembers(manager.getMembers());
		System.out.println();
		System.out.println("ȸ�� �˻�======================================");
		Member find;
		find=manager.findByNum(555);
		if (find == null) {
			System.out.println("�ش� ȸ���� ã���� �����ϴ�");
		}else {
			System.out.println(find);
		}
		System.out.println();
		System.out.println("ȸ�� �˻�======================================");
		Member[] findbname = manager.findByname("�� ���̽�");
		if (findbname == null) {
			System.out.println("�ش� ȸ���� ã���� �����ϴ�");
		}else {
			for (Member fbn : findbname) {
				if (fbn == null) {
					break;
				}
				System.out.println(fbn);
				
			}
		}
		System.out.println();
		System.out.println("ȸ�� ���� �����˻�======================================");
		find = manager.updateAddress(200, "Vancouver");
		if (find == null) {
			System.out.println("�ش� ȸ���� ã���� �����ϴ�");
		}else {
			System.out.println(find);
		}
	}
	
	static void printMembers(Member[] list) {
		for (Member member : list) {
			System.out.println(member);
		}
	}

}
