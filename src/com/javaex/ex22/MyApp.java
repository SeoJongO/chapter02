package com.javaex.ex22;

import java.io.IOException;

public class MyApp {

	public static void main(String[] args) {

		FileReader fr = new FileReader();
		// 파일 O
		fr.Read("C:/school.text");
		// 파일 X
		fr.Read2("C:/school.text");
		// 예외발생
		try {
			fr.Read3("C:/school.text");
		} catch (IOException e) {
			System.out.println("no file");
		}

	}

}
