package kodlamaio;

public class Student extends User {
	String firstName;
	String lastName;
	String studentInfo;
	
	
	
	public Student(String firstName, String lastName, String studentInfo, String email, String password, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.id = id;
	}
}
