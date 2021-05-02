package kodlamaio;

public class StudentManager extends UserManager{

	public void addToCourse(Student student , Course course) {
		System.out.println(course.courseInstructor.firstName + " " + course.courseInstructor.lastName + " ile " + course.courseName + " kursuna " 
							+ student.firstName +" ogrencisinin kaydi yapilmistir.");
	}
}
