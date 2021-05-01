package homework2;

public class Instructor extends User{
	
	private String[] courses;
	private String[] certificates;
	
	public Instructor() {
		
	}

	public Instructor(int id, String name, String surname, String email, String[] courses, String[] certificates) {
		super();
		setId(id);
	    setName(name);
	    setSurname(surname);
	    setEmail(email);
	    setCourses(courses);
	    setCertificates(certificates);
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String[] getCertificates() {
		return certificates;
	}

	public void setCertificates(String[] certificates) {
		this.certificates = certificates;
	}

}
