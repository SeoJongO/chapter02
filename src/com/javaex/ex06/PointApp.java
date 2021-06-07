package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		Point P01 = new Point();
		P01.setX(5);
		P01.setY(5);
		P01.draw();
		
		Point P02 =  new Point(6,6);
		P02.draw();
		
		Point P03 = new Point(7);
		P03.setY(8);
		P03.draw();
		
		Point P04 = new Point();
		P04.draw();
	}
}
