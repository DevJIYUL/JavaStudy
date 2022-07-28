package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

	public static void main(String[] args) {
		try {

			FileInputStream fis = new FileInputStream("src\\com\\io\\FileCopy.java");//원본
			FileOutputStream fos = new FileOutputStream("src\\com\\io\\Other.java");// 복사본
			// fis fos 라인 연결만됨
			for (int i = 0; (i = fis.read()) != -1;) {				
				fos.write(i);
			}

			fis.close();
			fos.close();

			System.out.println("file copied");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
