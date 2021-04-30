package hw2;

public class Main {

	public static void main(String[] args) {
		
		Category category = new Category(0, "Tümü");
		Instructor instructor = new Instructor(00, "Tümü");
		Course course = new Course(000, "Yazılım Geliştiri Yetiştirme Kampı", category, instructor);

		Category category2 = new Category(1, "Programlama");
		Instructor instructor2 = new Instructor(11 ,"Engin Demirog");
		Course course2 = new Course(111, "Programlamaya Giriş", category2, instructor2);
		
		CourseManager manage = new CourseManager();
		Student student = new Student("Tuğçe Nur", " Ergen");
		manage.add(course2, student,0);
		
		Student student2 = new Student("Melek", " üreni");
		manage.add(course2, student2, 1);
		
		manage.startCourse(course2, student);
		manage.startCourse(course2, student2);
		
		Course[] courses = {course, course2};
		Instructor[] instructors = {instructor , instructor2};
		Category[] categories = {category , category2};
		
		System.out.println("Kurslar: ");
		for (Course courseIn : courses) {
			System.out.println(courseIn.courseName);
		}
		
		System.out.println("\nEğitmenler: ");
		for (Instructor instr : instructors) {
			System.out.println(instr.instructorName);
		}
		
		System.out.println("\nKategoriler:");
		for (Category categ : categories) {
			System.out.println(categ.categoryName);
		}
	}

}
