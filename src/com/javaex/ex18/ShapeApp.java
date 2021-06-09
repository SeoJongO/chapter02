package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		// 도형(Shape) 배열 만든다
		Shape[] sArray = new Shape[3];
		// 도형만들기
		Shape sr01 = new Rectangle("빨강", "검정", 13, 14);
		Shape sc01 = new Circle("노랑", "하양", 30);
		Shape st01 = new Triangle("주황", "초록", 11, 12);
		// 배열<-도형
		sArray[0] = sr01;
		sArray[1] = sc01;
		sArray[2] = st01;
		// 배열 이용 그리기
		for (int i = 0; i < sArray.length; i++) {
			sArray[i].draw();
			// 오버라이딩
			System.out.println("넓이=" + sArray[i].area());
		}
		// 오버라이딩 부작용 -> 추상 클래스, 메소드로 해결 가능
		Shape ss01 = new Shape("검정", "검정");
		System.out.println("Shape 넓이=" + ss01.area());
		// (업/다운) 업캐스팅
		System.out.println(((Rectangle) sr01).getWidth());
	}

}
