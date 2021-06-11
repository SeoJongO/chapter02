package com.javaex.ex21;

import java.util.Scanner;

public class ArithException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = 0;
		int num;

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자: ");
		num = sc.nextInt();

		try {
			result = 100 / num;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println("0을 1로 처리했습니다.");
			result = 100 / 1;
			System.out.println(result);
		} finally {
			System.out.println("finally영역");
		}

		sc.close();
	}

}
