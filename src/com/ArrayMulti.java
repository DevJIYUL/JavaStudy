package com;

public class ArrayMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] score = {
				{1,2,3,7,6,5},
				{4,5,6},
				{7,8,9}
		};
		System.out.println(score.hashCode());
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+ " ");
			}// ���࿡ �ִ� ��� ���� ��µ�. �ϳ��� �� ó���� �Ϸ�.
			System.out.println();//�ٹٲ�
		}
	}

}
