package com.javaex.ex19;

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
		//area() 부모는 내용을 만둘 수 없는 상황
//		Shape ss01 = new Shape("검정", "검정"); // area()는 함수의 내용이 이상함
//		System.out.println("Shape 넓이=" + ss01.area());
		
//		1. Shape ss01 = new Shape("검정", "검정");    (X)
//		2. 섞어쓰기 했을때는 오버라이딩 되도록 한다 
//			-> 메소드 제목만 만들어줌
//			 -> abstract를 이용해서 추상 메소드를 만든다
//			  -> 제목만 있기 때문에 자식이 내용을 만들어서 오버라이딩 되어야한다
//			   ->반드시 자식이 같은 이름의 메소드를 만들어야 한다.
//		3. 추상메소드가 1개라도 있는 클래스는 메모리에 인스턴스화 하면 오류발생
		
		// (업/다운) 업캐스팅
		System.out.println(((Rectangle) sr01).getWidth());
	}

}
