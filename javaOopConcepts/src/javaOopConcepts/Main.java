package javaOopConcepts;

public class Main {

	public static void main(String[] args) {
		
		Tutor tutor1 = new Tutor(0, "Mike", "Bald");
		Tutor tutor2 = new Tutor(1, "Carry", "Hunson");
		Tutor tutor3 = new Tutor(2, "John", "Man");
		
		Category category = new Category(0, "programming");
		
		Course course1 = new Course(0, "java", tutor1.name, category.name, "Java tutorials for beginners");
		Course course2 = new Course(1, "javascript", tutor2.name, category.name, "Javascript tutorials for beginners");
		Course course3 = new Course(2, "python", tutor3.name, category.name, "Python tutorials for beginners");
		
		Course[] courses = {course1, course2, course3};
		
		System.out.println("\nNumber of courses: " +courses.length +"\n");
		
		for (Course course : courses) {
			System.out.println(course.detail + " with " + course.tutor + " in " + course.category);
		}
		
		CourseManager coursemanager = new CourseManager();
		coursemanager.addToCart(course1);
		coursemanager.removeFromCart(course2);
		

	}

}
