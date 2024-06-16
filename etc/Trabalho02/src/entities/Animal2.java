package entities;

public class Animal2 {
	
	protected String name;
	protected Integer age;
	
	protected static final StringBuilder sb =  new StringBuilder(); 
	
	public Animal2() {}
	
	public Animal2(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public final Integer getAge() {
		return this.age;
	}

	public final void setAge(Integer age) {
		this.age = age;
	}

	public final String getName() {
		return this.name;
	}

	public final void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		sb.setLength(0);
		sb.append(String.format("Animal Name: %s\n", this.name));
		sb.append(String.format("Animal Age: %d\n", this.age));
		return sb.toString();
	}
}

