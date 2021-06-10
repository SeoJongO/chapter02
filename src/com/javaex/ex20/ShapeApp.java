package com.javaex.ex20;

public class ShapeApp {

	public static void main(String[] args) {

//		Point p01 = new Point(5,5);
//		p01.draw();
//		
//		DrawAble dp01 = new Point(6,6);
//		dp01.draw();

		DrawAble[] dArray = new DrawAble[4];

		DrawAble r01 = new Rectangle("빨강", "검정", 7, 7); // draw() 만 쓸수있다.
		DrawAble c01 = new Circle("빨강", "검정", 7);
		DrawAble t01 = new Triangle("빨강", "검정", 7, 7);
		DrawAble p01 = new Point(7, 7);

		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;
		
		for(int i = 0 ; i < dArray.length; i++) {
			dArray[i].draw();
		}

		System.out.println(((Rectangle)r01).area());	
		System.out.println(((Shape)r01).area());
		
		for(int i = 0 ; i < dArray.length; i++) {
			if(dArray[i] instanceof Shape) {
				System.out.println(((Shape)r01).area());
			} else {
					System.out.println("도형 아님");
					System.out.println("=================");
				}
			
			}
		
		for(int i = 0 ; i < dArray.length; i++) {
			if(dArray[i] instanceof DrawAble) {
				System.out.println(((Shape)r01).area());
			} else {
					System.out.println("도형 아님");
				}
			
			}
			
		}
	}
