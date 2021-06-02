package com.javaex.ex02;

public class Goods {

	// 필드
	private String name;
	private int price;

	// 생성자

	// 메소드-겟터세터
	// 메소드-일반
	public void setName(String n) {
		name = n;
	}

	public void setPrice(int p) {
		if (p < 0) {
			this.price = 0;

		} else {
			price = p;
		}
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		if (this.price < 0) {
			return 0;
		} else {
			return price;
		}
	}

	public void showInfo() {
		System.out.println("상품이름: " + name + "\n가격: " + getPrice());
	}

}
