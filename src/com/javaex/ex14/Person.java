package com.javaex.ex14;

public class Person {
	// 필드
		protected String name;
		protected int age;

		// 생성자
		public Person() {
			System.out.println("Person(0)");
		}

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
			System.out.println("Person(2)");
		}

		// 게터세터
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		//데이터확인용
		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
		
		// 일반
		public void showInfo() {
			System.out.println("이름:" + name + " 나이:" + age);
		}
}
