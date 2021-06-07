package com.javaex.ex11;



public class MyMath {
	
	private static double pi = 3.14;
	
	public static int plus(int a, int b) {
		int result = a + b;
		return result;
	}

	public static double plus(double a, double b) {
		double result = a + b;
		return result;
	}

	public static double plus(int a, double b) {
		double result = a + b;
		return result;
	}

	public static double plus(double a, int b) {
		double result = a + b;
		return result;
	}
	public static double circleArea(int radious) {
		double result = radious* radious * pi;
		return result;
	}
}
