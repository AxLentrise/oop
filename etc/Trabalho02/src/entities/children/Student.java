package entities.children;

import entities.Person;

public class Student extends Person {
	
	private String enrollment;
	
	public Student () {}
	
	public Student(String name, Integer age, String enrollment) {
		super(name, age);
		this.enrollment = enrollment;
	}
	
	public final String getEnrollment() {
		return this.enrollment;
	}
	
	public final void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}
	
	@Override
	public String toString() {
		sb.setLength(0);
		sb.append(String.format("Student name: %s\n", super.name));
		sb.append(String.format("Student age: %d\n", super.age));
		sb.append(String.format("Student enrollment: %s\n", this.enrollment));
		return sb.toString();
	}
}
