package com.javaex.ex21;

public class Rectangle {
	//필드
		private int width;
		private int height;
		private String fillColor;
		private String lineColor;
	//생성자
		public Rectangle() {
			
		}
		public Rectangle(String fillColor, String lineColor, int width, int height) {
			
			this.fillColor = fillColor;
			this.lineColor = lineColor;
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
			return "Rectangle [fillColor=" +fillColor + ", lineColor=" + lineColor + ", width=" + width + ", height="
					+ height + "]";
		}
	
		public void draw() {
			System.out.println("[면색:"+fillColor+" 선색:"+lineColor+" 가로:"+width+" 세로:"+height+"] 사각형을 그렸습니다.");
		}
}
