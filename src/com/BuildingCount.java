package com;

import java.util.Arrays;
import java.util.Scanner;

public class BuildingCount {
	static String src = "3\r\n" + 
			"6\r\n" + 
			"G B G G B B\r\n" + 
			"G B G G B G\r\n" + 
			"B B B B G B\r\n" + 
			"B G B B B B\r\n" + 
			"G B B B B G\r\n" + 
			"G B B B B G\r\n" + 
			"5\r\n" + 
			"G B G G B\r\n" + 
			"G B G G B\r\n" + 
			"B B B B G\r\n" + 
			"B G B B B\r\n" + 
			"G B B B B\r\n" + 
			"3\r\n" + 
			"G G B\r\n" + 
			"G B B\r\n" + 
			"B B B";
	static int[] dx = {-1,1,0,0,-1,-1,1,1};
	static int[] dy = {0,0,-1,1,-1,1,1,-1};
	static boolean move_8d(int x,int y,char[][] a) {
		for (int i = 0; i < 8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if (nx < 0 || nx >= a.length || ny <0 || ny >= a.length) continue;
			if (a[nx][ny] == 'G') return false;
			
			
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(src);
		int tc = sc.nextInt();
		for (int test_case = 1; test_case <= tc; test_case++) {
			int n = sc.nextInt();
			int result = 0;
			char[][] graph = new char [n][n];
			for (int i = 0; i < graph.length; i++) {
				for (int j = 0; j < graph.length; j++) {
					graph[i][j] = sc.next().charAt(0);
				}
			}
			// 입력 받고 데이터가 잘 들어갔는지 확인 하기!!
			for (int i = 0; i < graph.length; i++) {
				for (int j = 0; j < graph.length; j++) {
					int sum = 0;
					if (graph[i][j] == 'B') {
						if(move_8d(i, j, graph)) {
							for (int j2 = 0; j2 < n; j2++) {
								if (graph[i][j2] == 'B') {
									sum++;
								}
								if (graph[j2][j] == 'B') {
									sum++;
								}
							}
							sum--;
						}else {
							sum = 2;
						}
					}
					if (result < sum) {
						result = sum;
					}
				}
			}
			System.out.println("#"+test_case+" "+result);
			
			
		}
	}
}
