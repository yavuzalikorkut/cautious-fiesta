package homework2;

public class InstructorManager extends UserManager{

	@Override
	public void addComment(String comment) {
		System.out.println(comment+ " added ur comment as a instructor");
	}
	
	public void addCourse(String course) {
		System.out.println(course+ " added to the system...");
	}
	
	public void editCourse(String course) {
		System.out.println(course+ " edited from the system...");
	}
	
	public void removeCourse(String course) {
		System.out.println(course+ " removed from the system...");
	} 
	
	public void addHomework(String homework) {
		System.out.println(homework+ "homework added to the system...");
	}
	
	public void banUser(String id) {
		System.out.println(id+ " banned from the system...");
	}
	
}
