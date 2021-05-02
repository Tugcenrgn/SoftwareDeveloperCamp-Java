package kodlamaio;

public class InstructorManager extends UserManager{
	public void uploadCourse(Course course, Instructor instructor) {
		System.out.println(course.courseName + " kursuna " + instructor.firstName + instructor.lastName + " tarafindan guncelleme yapilmistir.");
	}
}
