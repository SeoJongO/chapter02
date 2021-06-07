package com.javaex.ex05;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		camera.setName("니콘");
		camera.setPrice(400000);
		camera.showInfo();
//		Goods camera = new Goods("니콘2",400000); 오류
//		camera.showInfo();
		camera = new Goods("니콘3", 400000);
		camera.showInfo();
		camera = new Goods("니콘4", 400000);
		camera.showInfo();
		
		Goods computer = new Goods("그램", 1000000);
		computer.showInfo();
	}

}
