package stu;

public class Students {

	public void getStudentInfo() {
		System.out.println("The ID is");
	}
	public void getStudentInfo(int id) {
		
	}
	public void getStudentInfo(int id,String name) {
		
	}
	public void getStudentInfo(String email,long phoneNumber) {
		
	}
	public static void main(String[] args) {
		
	
	Students s1=new Students();
	
	s1.getStudentInfo(11);
	s1.getStudentInfo(11, "sweatha");
	s1.getStudentInfo("sweath@gmail.com", 987654321);
	
	
	
	
	
}
}
