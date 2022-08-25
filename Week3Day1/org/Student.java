package org.student;

import org.department.Department;

public class Student extends Department {

		
		public void studentName() {
			System.out.println("Dilip");
		}

		public void studentDept() {
			System.out.println("Bcom cs");
		}
		
		public void studentId() {
			System.out.println("DN45720");
		}
		
		public static void main(String[] args) {
			Student student = new Student();
			student.collegeName();
			student.collegeCode();
			student.collegeRank();
			student.departmentName();
			student.studentName();
			student.studentDept();
			student.studentId();
			
		}
}
