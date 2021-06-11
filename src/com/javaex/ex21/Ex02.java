package com.javaex.ex21;

public class Ex02 {

	public static void main(String[] args) {

		int[] iArray = new int[3];

		iArray[0] = 1;
		iArray[1] = 2;
		iArray[2] = 3;

		try {
			System.out.println(iArray[3]);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}
}
