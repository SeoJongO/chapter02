package com.javaex.ex13;

public class PersonApp {

	public static void main(String[] args) {
		
		Student s01 = new Student();
		
		s01.setName("서종오");
		s01.setAge(20);
		s01.setSchoolName("서울사대부고");
		
//		System.out.println(s01.getName());
//		System.out.println(s01.getAge());
//		System.out.println(s01.getSchoolName());
		
		
		s01.showInfo();
	}

}
