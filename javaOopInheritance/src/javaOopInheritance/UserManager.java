package homework2;

public class UserManager {

	public void signUp(String name, String surname, String email) {
		System.out.println("Registration successfully completed! Welcome " +name+ " " +surname);
	}
	
	public void login(String email) {
		System.out.println(email+ "logged in");
	}
	
	public void editProfile(String name, String surname, String email, String password) {
		System.out.println(name+ " successfully edited ur profile");
    }
	
	public void addComment(String comment) {
		System.out.println(comment+ " added ur comment");
	}
	
	public void logout(String email) {
		System.out.println(email+ " logged out");
	}

}
