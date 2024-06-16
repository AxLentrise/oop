package entities;

public class Student {
	
	private static final StringBuilder builder = new StringBuilder();
	
	private String name;
	private String course;
	private Integer age;
	
	public Student() {}
	
	public Student(String name, String course, Integer age) {
		this.name = name;
		this.course = course;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return this.course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		builder.setLength(0);
		builder.append(String.format("Name: %s\n", this.name));
		builder.append(String.format("Course	: %s\n", this.course));
		builder.append(String.format("Age: %d\n", this.age));
		return builder.toString();
	}
}
