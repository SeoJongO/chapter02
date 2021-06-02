package com.javaex.ex03;

public class Point_ex {

	//필드
	private int x;
	private int y;
	
	//생성자
	
	//메소드-겟터셋터
	public void setX(int x) {
		this.x = x; 
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int geyY() {
		return y;
	}
	
	
	//메소드-일반
	public void draw() {
		//그리는 과정
		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
	}
}
