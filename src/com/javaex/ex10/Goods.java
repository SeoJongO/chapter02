package com.javaex.ex10;

public class Goods {
	// 필드
	private String name;
	private int price;

	// 생성자
	public Goods() {

	}

	public Goods(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	// 게터세터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		int sale = 0;
		if (price > 0) {
			this.price = price;
		} else {
			this.price = 0;
			sale = 100;
		}

		System.out.println(sale);

	}

	// 일반
	public void showInfo() {
		System.out.println("상품이름: " + name + "\n가격: " + price + "\n");
	}
}
