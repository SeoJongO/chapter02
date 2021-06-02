package com.javaex.ex04;

public class SongApp {

	public static void main(String[] args) {
		//메소드
			Song IU = new Song();
			Song BiBa = new Song();
			Song BuBu = new Song();
			Song Scan = new Song();
		
		//아이유
			IU.setArtist("아이유");
			IU.setTitle("좋은날");
			IU.setAlbum("Real");
			IU.setYear(2010);
			IU.setTrack(3);
			IU.setComposer("이민수");
			
		//BIGBANG
			BiBa.setArtist("BIGBANG");
			BiBa.setTitle("거짓말");
			BiBa.setAlbum("Always");
			BiBa.setYear(2007);
			BiBa.setTrack(2);
			BiBa.setComposer("G-DRAGON");
			
		//버스커버스커
			BuBu.setArtist("버스커버스커");
			BuBu.setTitle("벚꽃엔딩");
			BuBu.setAlbum("버스커버스커1집");
			BuBu.setYear(2012);
			BuBu.setTrack(4);
			BuBu.setComposer("장범준");
			
		//출력
			IU.showInfo();
			BiBa.showInfo();
			BuBu.showInfo();
			Scan.showInfo2("실험그룹", "자바는재밌어", "실험1집", 2021, 3, "서종오");
	}

}
