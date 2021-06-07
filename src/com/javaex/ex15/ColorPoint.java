package com.javaex.ex15;

public class ColorPoint extends Point {

	// 필드
	protected String color;

	// 생성자
	public ColorPoint() {

	}

	public ColorPoint(String color) {
		super();
		super.setX(x);
		super.setY(y);
		this.color = color;
	}

	public ColorPoint(int x, int y, String color) {
		super();
		super.setX(x);
		super.setY(y);
		this.color = color;
	}

	// 게터세터
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// 일반
	public void showInfo() {
		if (x == 0 && y == 0) {
			System.out.println("color=" + color);
		} else {
			System.out.println("x=" + x + " y=" + y + " color=" + color);
		}
	}
}
