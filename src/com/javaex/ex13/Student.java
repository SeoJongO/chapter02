package com.javaex.ex13;

public class Student extends Person {

		private String schoolName;

		public Student() {
			
		}
		
		public Student(String schoolName) {
			super();
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
			System.out.println("이름:"+getName()+" 나이:"+getAge()+" 학교명:"+schoolName);
		}

		
		
		
}
