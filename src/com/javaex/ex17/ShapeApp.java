package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		Shape s01 = new Shape("빨강", "검정");
		System.out.println(s01.toString());
		s01.draw();
		
		Rectangle[] rArray = new Rectangle[3];
		
		Rectangle r01 = new Rectangle("빨강", "검정", 3, 3);
		Rectangle r02 = new Rectangle("주황", "검정", 4, 4);
		Rectangle r03 = new Rectangle("초록", "검정", 5, 5);

		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		for (int i = 0 ; i < rArray.length; i++) {
			rArray[i].draw();
		}
	}

}
