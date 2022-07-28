package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*try with resource : 예외 발생 여부와 관계없이 스트림 사용 후 자동으로 close 시켜주는 기능
 * try (스트림 생성 문장;스트림 생성 문장;...){
 * 	스트림 사용...
 * }catch(){}
 * */
public class FileCopy2 {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("src\\com\\io\\FileCopy.java"); // 원본
				FileOutputStream fos = new FileOutputStream("src\\com\\io\\Other.java");// 복사본
		) {
			for (int i = 0; (i = fis.read()) != -1;) {
				fos.write(i);
			}
			// fis fos pipe 라인 연결만됨
			System.out.println("file copied");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
