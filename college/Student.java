package org.college;



public class Student extends Department {

	public void studentName() {
		System.out.println("student name:sweatha");

	}
	public void studentDept() {
		System.out.println("student dept:CSE");
		
	}
	public void studentId() {
		System.out.println("student id:11");
	}
	public static void main(String[] args) {
		System.out.println("********single inheritance*******");
		System.out.println("********College*********");
		College col=new College();
		col.collegeName();
		col.collegeCode();
		col.collegeRank();
		System.out.println("*******multiple inheritance******");
		System.out.println("*******Deprtment*******");
		Department dept=new Department();
		dept.deptName();
		System.out.println("********multiple inheritance*****");
		System.out.println("******Student******");
		Student stud=new Student();
		stud.studentName();
		stud.studentId();
		stud.studentDept();
	
		
	}

}
