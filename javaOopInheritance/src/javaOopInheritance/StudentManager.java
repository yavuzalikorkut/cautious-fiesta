package homework2;

public class StudentManager extends UserManager{
	
	@Override
    public void addComment(String comment) {
		System.out.println(comment + " added ur comment as a student");
    }
	
	public void enrollCourse(String course) {
		System.out.println(course+ " enrolled...");
	}
	
	public void resetProgress(String course) {
		System.out.println(course+ " progress has been resetted...");
	}
	
	public void removeEnrollment(String course) {
		System.out.println(course+ " enrollment has been removed...");
	}
}
