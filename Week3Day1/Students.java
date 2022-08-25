package Week3Day1;

public class Students {

	public void getStudentInfo(int id, String name) {
		System.out.println("Student name is " + name + "and id is "+ id);
	}
	
	public void getStudentInfo(int id) {
		System.out.println("Student id is"+ id);
	}
	
	public void getStudentInfo(long phonenumber, String email) {
		System.out.println("Student phonenumber is" + phonenumber + "and email is"+ email);
	}
	
	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(45720);
		stud.getStudentInfo(45720, "Dilip");
		stud.getStudentInfo(1234567890, "dilipnncr@gmail.com");
	}
}
