package com.javaex.ex16;

public class RectangleApp {

	public static void main(String[] args) {

		Rectangle[] rArray = new Rectangle[3];
		Circle[] cArray = new Circle[3];
		Triangle[] tArray = new Triangle[3];
		
		Rectangle r01 = new Rectangle("빨강", "검정", 5, 5);
		Rectangle r02 = new Rectangle("노랑", "검정", 6, 6);
		Rectangle r03 = new Rectangle("초록", "검정", 7, 7);

		cArray[0] = new Circle("파랑", "검정", 5);
		cArray[1] = new Circle("연두", "검정", 6);
		cArray[2] = new Circle("하늘", "검정", 7);
		
		tArray[0] = new Triangle("파랑", "검정", 5, 5);
		tArray[1] = new Triangle("연두", "검정", 6, 6);
		tArray[2] = new Triangle("하늘", "검정", 7, 7);
		
		
		
		rArray[0] = r01;
		rArray[1] = r02; 
		rArray[2] = r03;

//		cArray[0] = c01;
//		cArray[1] = c02;
//		cArray[2] = c03;
			
//		r01.draw();
//		r02.draw();
//		r03.draw();
		
		for (int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}
		System.out.println("==========================================");
		
//		r01.setFillColor("파랑");
//		r02.setFillColor("파랑");
//		r03.setFillColor("파랑");
		
		for (int i = 0; i < rArray.length; i++) {
			rArray[i].setFillColor("파랑");
		}
		
		for (int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}
		System.out.println("==========================================");

		for (int i = 0; i < rArray.length; i++) {
			cArray[i].draw();
		}
		System.out.println("==========================================");
		
		for (int i = 0; i < rArray.length; i++) {
			tArray[i].draw();
		}
		System.out.println("==========================================");
		
	}

}
