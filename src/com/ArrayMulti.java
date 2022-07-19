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
			}// 한행에 있는 모든 열이 출력됨. 하나의 행 처리가 완료.
			System.out.println();//줄바꿈
		}
	}

}
