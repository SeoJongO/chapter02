package com.javaex.ex14;

public class PersonApp {

	public static void main(String[] args) {
		
		//Student 생성자(3) 사용
		//생성자 순서(부모까지 포함)
		
//		Student s01 = new Student ("서종오", 20, "종로산업정보학교");
//		s01.showInfo();
		
//		부모의 디폴트 생성자 사용 확인
		Student s03 = new Student();
		
		
		Student s04 = new Student ("서종오", 20, "종로산업정보학교");
		s04.showInfo();
		
		Person P = new Person();
		P.name = "바보야";//다른패키지면사용불가
		P.showInfo();
	}

}
