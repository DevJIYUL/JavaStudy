package com;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayMulto2D {
	static int[] dx = {0,-1,0,1};
	static int[] dy = {-1,0,1,0};
	static int [][] a = {
			{1,2,3,4,5},
			{2,3,4,5,6},
			{3,4,5,6,7},
			{4,5,6,7,8},
			{5,6,7,8,9},
	};
	static void move_4d(int x,int y) {
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx < 0 || nx > a.length || ny <0 || ny > a.length) continue;
			
			System.out.println(a[nx][ny]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
//		move_4d(i, j);
		int up = i-1;
		int down = i+1;
		int left = j-1;
		int right = j+1;
//		System.out.println(Arrays.deepToString(a));
		if (up >=0)
			System.out.println("up : "+a[up][j]);
		if (down <= a.length)
			System.out.println("down : "+a[down][j]);
		if (left >=0)
			System.out.println("left : "+a[i][left]);
		if (right <=a.length)
			System.out.println("right : "+a[i][right]);
	}

}
