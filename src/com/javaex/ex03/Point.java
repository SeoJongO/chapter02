package com.javaex.ex03;

public class Point {
	// 필드
	private int x;
	private int y;

	// 겟터, 셋터
	public void setX(int s_x) {
		x = s_x;
	}

	public void setY(int s_y) {
		y = s_y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	// 일반
	public void draw(int x, int y) {
		System.out.println("점[x=" + x + ", y=" + y + "]를 그렸습니다.");
	}

	public void draw(boolean flag) {
		if (flag == true) {
			System.out.println("점[x=" + x + ", y=" + y + "]를 그렸습니다.");
		} else {
			System.out.println("점[x=" + x + ", y=" + y + "]를 지웠습니다.");
		}
	}
}
