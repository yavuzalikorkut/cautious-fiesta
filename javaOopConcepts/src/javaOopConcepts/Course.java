package javaOopConcepts;

public class Course {

	public Course() {
		System.out.println("Course called... ");
	}
	
	public Course(int id, String name, String tutor, String category, String detail) {
		this.id = id;
		this.name = name;
		this.tutor = tutor;
		this.category = category;
		this.detail = detail;
	}
	
	int id;
	String name;
	String tutor;
	String category;
	String detail;
	
}
