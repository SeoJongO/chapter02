package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {

		Goods[] goodsArray = new Goods[3];
//		System.out.println(goodsArray.length);

		Goods computer = new Goods("그램", 1000000);
		Goods camera = new Goods("니콘", 400000);
//		Goods cup = new Goods("머그컵", 2000);

		goodsArray[0] = computer;
		goodsArray[1] = camera;
//		goodsArray[2] = cup;

//		System.out.println(computer.getName());
//		System.out.println(goodsArray[0].getName());
		int count = 0;
		for (int i = 0; i < goodsArray.length; i++) {
			if (goodsArray[i] != null) {
				count++;
				goodsArray[i].showInfo();
			}
		}
		System.out.println("카운트: "+count);

	}

}
