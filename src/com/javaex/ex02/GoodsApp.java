package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {

		Goods camera = new Goods();
		Goods computer = new Goods();
		Goods cup = new Goods();
		
		camera.setName("니콘");
		camera.setPrice(-400000);
		
		computer.setName("그램");
		computer.setPrice(1000000);
		
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		String cameraName = camera.getName();
		
		System.out.println(cameraName);
		System.out.println("=========== ");
		
		camera.showInfo();
		System.out.println("=========== ");
		
		System.out.println("상품명:"+camera.getName() + ", 가격:" + camera.getPrice());
		System.out.println("상품명:"+computer.getName() + ", 가격:" + computer.getPrice());
		System.out.println("상품명:"+cup.getName() + ", 가격:" + cup.getPrice());
	}

}
