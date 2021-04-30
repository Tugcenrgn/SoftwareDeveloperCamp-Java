package hw2;

public class Course {

	int courseId;
	String courseName;
	Category category;
	Instructor instructor;
	Student[] students;
	
	public Course(int courseId, String courseName , Category category, Instructor instructor) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.category = category;
		this.instructor = instructor;
		this.students = new Student[10];
	}
}
