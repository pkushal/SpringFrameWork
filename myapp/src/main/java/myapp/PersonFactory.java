package myapp;

public class PersonFactory {
	public Person personFactory(int id, String name) {
		System.out
				.println("Hi this person is being created using the factory method called personFactory");
		return new Person(id, name);
	}
}
