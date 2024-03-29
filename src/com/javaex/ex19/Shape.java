package com.javaex.ex19;

public abstract class Shape {

	// 필드
	protected String fillColor;
	protected String lineColor;

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
	
	public abstract double area() ;
	
}
