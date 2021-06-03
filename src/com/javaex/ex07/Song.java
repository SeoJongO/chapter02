package com.javaex.ex07;

public class Song {

	// 필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	// 생성자
//	public Song() {
//
//	}

	public Song(String artist, int year) {
		
		this.artist = artist;
		if (year < 0) {
			this.year = 0;
		} else {
			this.year = year;
		}
	}

	public Song(String artist, String title, String album, int year, int track, String composer) {
		this(artist, year);
		this.title = title;
		this.album = album;
		this.track = track;
		this.composer = composer;
	}

	// 세터
	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	// 게터
	public String getTitle() {
		return title;
	}

	public String getArtist() {
		return artist;
	}

	public String getAlbum() {
		return album;
	}

	public String getComposer() {
		return composer;
	}

	public int getYear() {
		return year;
	}

	public int getTrack() {
		return track;
	}

	// 일반
	public void showInfo() {
		System.out.println(
				artist + ", " + title + " ( " + album + ", " + year + ", " + track + "번 track, " + composer + " 작곡 )");
	}
}
