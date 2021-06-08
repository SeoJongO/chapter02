package com.javaex.ex16;

public class Circle extends Shape{
	
	//필드
		private int radius;
	
	//생성자
		public Circle() {
			
		}
		public Circle(String fillColor, String lineColor, int radius) {
			super();
			super.setFillColor(fillColor);
			super.setLineColor(lineColor);
			this.radius = radius;
		}
	
	//게터세터
		
		public int getRadius() {
			return radius;
		}
		public void setRadius(int radius) {
			this.radius = radius;
		}
	
	//일반
		@Override
		public String toString() {
			return "Circle [fillColor=" + getFillColor() + ", lineColor=" + getLineColor() + ", radius=" + radius + "]";
		}
	
		public void draw() {
			System.out.println("[면색:"+getFillColor()+" 선색:"+getLineColor()+" 반지름:"+radius+"] 원을 그렸습니다.");
		}	
}
