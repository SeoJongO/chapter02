package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {
		Person seo = new Person("서종오", 20);
		seo.showInfo();

		System.out.println(seo.toString());

		seo.setAge(21);
		seo.setName("seo");
		seo.showInfo();
		
		Student jong = new Student("seo", 24, "sejong");
		System.out.println(jong.toString());
	}

}
