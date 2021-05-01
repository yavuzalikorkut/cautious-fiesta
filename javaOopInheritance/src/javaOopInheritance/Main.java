package homework2;

public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(1, "berk", "blabla", "berk@gmail.com");
		
		UserManager userManager = new UserManager();
		userManager.signUp(user1.getName(), user1.getSurname(), user1.getEmail());
		
		Student student1 = new Student(2, "ali", "blabla", "ali@gmail.com", "Java", 25);
		StudentManager studentManager = new StudentManager();
		studentManager.signUp(student1.getName(), student1.getSurname(), student1.getEmail());

		String[] courses = {"java", "python", "javascript"};
		String[] certficates = {"PMP", "MCT", "ITIL"};
		Instructor instructor1 = new Instructor(3, "brad",  "traversy", "traversy@gmail.com", courses, certficates);
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.signUp(instructor1.getName(), instructor1.getSurname(), instructor1.getEmail());
		instructorManager.addCourse("Relational Databases");
		
	}

}
