package com.javaex.ex16;

public class Triangle extends Shape{

	//필드
		private int width;
		private int height;
	//생성자
		public Triangle() {
			
		}
		public Triangle(String fillColor, String lineColor, int width, int height) {
			super();
			super.setFillColor(fillColor);
			super.setLineColor(lineColor);
			this.width = width;
			this.height = height;
		}
	//게터세터
		public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
	//일반
		@Override
		public String toString() {
			return "Triangle [fillColor=" + getFillColor() + ", lineColor=" + getLineColor() + ", width=" + width + ", height="
					+ height + "]";
		}
	
		public void draw() {
			System.out.println("[면색:"+getFillColor()+" 선색:"+getLineColor()+" 가로:"+width+" 세로:"+height+"] 삼각형을 그렸습니다.");
		}
}
