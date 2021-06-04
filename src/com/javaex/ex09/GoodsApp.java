package com.javaex.ex09;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods computer = new Goods("그램", 1000000);
		
		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000 );
		
		computer.showInfo();
		camera.showInfo();
		cup.showInfo();
	}

}