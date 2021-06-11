package com.javaex.ex22;

import java.io.IOException;

public class FileReader {

	// 필드

	// 생성자

	// 게터세터

	// 메소드
	
	// 정상메소드
	public void Read(String path) {
		// 파일을 읽는다
		String file = "학교종이 땡땡땡 어서모이자 선생님이 우리를 기다리신다.";
		System.out.println(file);
	}

	// 예외발생 메소드
	public void Read2(String path) {

		try {
			throw new IOException(); // 파일이 없다
		} catch (IOException e) {
			System.out.println("파일이 없습니다.");
		}
	}

	// 예외발생 처리
	public void Read3(String path) throws IOException {

		throw new IOException();
	}
}
