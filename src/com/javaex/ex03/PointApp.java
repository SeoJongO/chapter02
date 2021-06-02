package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		Point Draw = new Point();
		Point P01 = new Point();
		Point P02 = new Point();
		
		P01.setX(1);
		P02.setY(2);
		System.out.println("점[x="+P01.getX()+", y="+P02.getY()+"]를 그렸습니다.");
		System.out.println("====================");
		Draw.draw(5,5);
		Draw.draw(10,23);

	}

}
