package hw2;

public class CourseManager {
	public void add(Course course, Student student, int order){
		System.out.println(student.studentFirstName + student.studentLastName +" : " + course.courseName +"kursuna başarıyla kaydedildi.");
		course.students[order] = student;
	}
	
	public void startCourse(Course course, Student student) {
		System.out.println(student.studentFirstName + " : " + course.courseName + " kursuna giriş yapıyorsunuz...");
	}
}
