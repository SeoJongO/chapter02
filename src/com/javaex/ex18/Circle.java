package com.javaex.ex18;

public class Circle extends Shape {

	private int radius;

	public Circle() {
	}

	public Circle(String fillColor, String lineColor, int radius) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", FillColor=" + fillColor + ", LineColor=" + lineColor + "]";
	}
	public void draw() {
		System.out.println("[면색:"+fillColor+" 선색:"+lineColor+" 반지름:"+radius+"] 원을 그렸습니다.");
	}
	public double area() {
		return radius*radius*3.14;
	}
}
