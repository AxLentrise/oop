package entities;

public class Worker {

	private static final StringBuilder builder = new StringBuilder();
	
	private String name;
	private String role;
	private Integer age;
	
	public Worker() {}
	
	public Worker(String name, String role, Integer age) {
		this.name = name;
		this.role = role;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
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
		builder.append(String.format("Age: %d\n", this.age));
		builder.append(String.format("Role: %s\n", this.role));
		return builder.toString();
	}
	
}
