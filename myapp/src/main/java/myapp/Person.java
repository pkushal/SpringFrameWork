package myapp;

import java.util.List;

public class Person {
	private int id;
	private String name;
	private List<String> fruits;

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Person(int id, String name, List<String> fruits) {
		this.id = id;
		this.name = name;
		this.fruits = fruits;
	}

	public void speak() {
		System.out.println("Hello Kushal");
	}

	public void init() {
		System.out.println("This is the init method in the Person Class");
		System.out.println("Person Created, onCreate: " + this);
	}

	public void destroy() {
		System.out.println("This is the destroy method in the Person Class");
	}

	public static Person getInstance(int id, String name) {
		System.out.println("Creating the Person using the getInstance method");
		return new Person(id, name);
	}

	public String personFruit() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.name);
		sb.append("\n");
		for (String st : this.fruits) {
			sb.append(st);
			sb.append("\n");
		}
		return sb.toString();
	}
}
