package com.javaex.ex03;

public class PointApp_ex {

	public static void main(String[] args) {
		
		Point_ex P01 = new Point_ex();
		Point_ex P02 = new Point_ex();
		
		P01.setX(5);
		P01.setY(5);
		P02.setX(10);
		P02.setY(23);
		
		P01.draw();
		P02.draw();
	}

}
