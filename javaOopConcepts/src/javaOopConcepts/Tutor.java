package javaOopConcepts;

public class Tutor {

	public Tutor() {
		System.out.println("Tutor called... ");
	}
	
	public Tutor(int id, String name, String surname) {
		this();
		this.id = id;
		this.name = name;
		this.surname = surname;
	
	}
	
	int id;
	String name;
	String surname;
	
}
