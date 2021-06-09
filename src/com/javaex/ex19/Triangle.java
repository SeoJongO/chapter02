package com.javaex.ex19;

public class Triangle extends Shape {

	private int width;
	private int height;

	public Triangle() {

	}

	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

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

	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}

	public void draw() {
		System.out.println(
				"[면색:" + getFillColor() + " 선색:" + getLineColor() + " 가로:" + width + " 세로:" + height + "] 삼각형을 그렸습니다.");
	}
	public double area() {
		return width*height;
	}

}
