package com.javaex.ex17;

public class Shape {

	// 필드
	private String fillColor;
	private String lineColor;

	// 생성자
	public Shape() {
	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	// 게터세터
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}
	
	// 일반
	public void draw() {
		System.out.println("[면색:"+fillColor+" 선색:"+lineColor+"] 도형을 만들었습니다.");
	}
	
}
