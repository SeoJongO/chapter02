package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		Song S = new Song("SEO", -2002);
		Song IU = new Song("아이유", "좋은날", "Real", 2010, 3,"이민수");
		Song BiBa = new Song("빅뱅", "거짓말", "Always", -2007, 2,"G-DRAGON");
		Song BuBu = new Song("버스커버스커", "벚꽃엔딩", "버스커버스커1집", 2012, 4,"장범준");
		S.showInfo();
		IU.showInfo();
		BiBa.showInfo();
		BuBu.showInfo();

	}

}
