package kodlamaio;

public class Main {

	public static void main(String[] args) {
		
		Instructor engin = new Instructor("Engin", "Demirog", "Java", 1, "mail", "1234");
		Course course = new Course("java ogreniyorum", engin );
		Student tugce = new Student("tugce","ergen","info","email", "2345" ,2);
		User ayse = new User(2, "email1" , "abc");
		
		StudentManager studentManager = new StudentManager();
		studentManager.addToCourse(tugce, course);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.uploadCourse(course, engin);
		
		UserManager userManager = new UserManager();
		userManager.add(ayse);
		userManager.update(ayse);
		userManager.add(ayse);
	}

}
