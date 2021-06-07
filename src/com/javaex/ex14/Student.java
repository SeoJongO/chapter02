package com.javaex.ex14;

public class Student extends Person {

		private String schoolName;

		public Student() {
			System.out.println("Student(0)");
		}
		
//		public Student(String name, int age, String schoolName) {
////			this.setName(name);
////			this.setAge(age);
////			super();
//			super(name, age);
//			this.schoolName = schoolName;
//			System.out.println("Student(3)");
//		}
		
		public Student(String name, int age, String schoolName) {
			super();
			super.setName(name);
			super.setAge(age);
			this.schoolName = schoolName;
		}
		
		
		public String getSchoolName() {
			return schoolName;
		}

		public void setSchoolName(String schoolName) {
			this.schoolName = schoolName;
		}

		@Override
		public String toString() {
			return "Student [schoolName=" + schoolName + "]";
		}
		
		public void showInfo() {
			System.out.println("이름:"+name+" 나이:"+age+" 학교명:"+schoolName);
		}

		
		
		
}
