package javaOopConcepts;

public class CourseManager {
	public void addToCart(Course course) {
		System.out.println("\nCourse added to the cart: " + course.name);
	}
	
	public void removeFromCart(Course course) {
		System.out.println("Course removed from the cart: " + course.name);
	}
	
	
}
