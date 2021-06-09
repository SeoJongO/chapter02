package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
//		Shape s01 = new Shape("빨강", "검정");
//		System.out.println(s01.toString());
//		s01.draw();
		
		Rectangle[] rArray = new Rectangle[3];
		Circle[] 	cArray = new Circle[3];
		Triangle[] 	tArray = new Triangle[3];
		
		Rectangle r01 = new Rectangle("빨강", "검정", 3, 3);
		Rectangle r02 = new Rectangle("주황", "검정", 4, 4);
		Rectangle r03 = new Rectangle("초록", "검정", 5, 5);
		
		Circle 	  c01 = new Circle("빨강", "검정", 3);
		Circle 	  c02 = new Circle("주황", "검정", 4);
		Circle	  c03 = new Circle("초록", "검정", 5);
		
		Triangle  t01 = new Triangle("빨강", "검정", 3, 3);
		Triangle  t02 = new Triangle("주황", "검정", 4, 4);
		Triangle  t03 = new Triangle("초록", "검정", 5, 5);

		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;
		
		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;
		
		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;
		
		for (int i = 0 ; i < rArray.length; i++) {
			rArray[i].draw();
			cArray[i].draw();
			tArray[i].draw();
		}
	}

}
