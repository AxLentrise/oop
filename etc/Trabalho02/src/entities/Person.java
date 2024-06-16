package entities;

public class Person {
	
	protected String name;
	protected Integer age;
	
	protected static final StringBuilder sb = new StringBuilder();
	
	public Person() {}
	
	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public final String getName() {
		return this.name;
	}
	
	public final void setName(String name) {
		this.name = name;
	}
	
	public final Integer getAge() {
		return this.age;
	}
	
	public final void setAge(Integer age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		sb.setLength(0);
		sb.append(String.format("Person name: %s\n", this.name));
		sb.append(String.format("Person age: %d\n", this.age));
		return sb.toString();
	}
}
