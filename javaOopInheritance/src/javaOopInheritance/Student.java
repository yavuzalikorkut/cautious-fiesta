package homework2;

public class Student extends User{
	
	private String enrolledCourse;
	private int courseCompletionPercentage;
	
	Student() {
		
	}
	
	Student(int id, String name, String surname, String email, String enrolledCourse, int courseCompletionPercentage) {
        setId(id);
        setName(name);
        setSurname(surname);
        setEmail(email);
        setEnrolledCourse(enrolledCourse);
        setCourseCompletionPercentage(courseCompletionPercentage);
    }
	
	public String getEnrolledCourse() {
		return enrolledCourse;
	}
	public void setEnrolledCourse(String enrolledCourse) {
		this.enrolledCourse = enrolledCourse;
	}
	public int getCourseCompletionPercentage() {
		return courseCompletionPercentage;
	}
	public void setCourseCompletionPercentage(int courseCompletionPercentage) {
		this.courseCompletionPercentage = courseCompletionPercentage;
	}

}
