package com;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayMulto2D2 {
	static int[] dx = {-1,1,0,0};
	static int[] dy = {0,0,-1,1};
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
			if (nx < 0 || nx >= a.length || ny <0 || ny >= a.length) continue;
			
			System.out.print(a[nx][ny]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("("+i+", "+j+") = "+a[i][j]);
				move_4d(i, j);
			}
		}
//		move_4d(0, 4);
	}

}
