package helloSpring;

public class Person {

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId
				+ ", address=" + address + "]";
	}

	private int id;
	private String name;

	private int taxId;
	private Address address;

	public Person() {

	}
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void onCreate() {
		System.out.println("Person created " + this);
	}

	public void onDestroy() {
		System.out.println("Person destoyed");
	}


	public static Person getInstance(int id, String name) {
		System.out.println("Creating a Person using a factory method (getInstance wala bata ho hai)");
		return new Person(id, name);
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void speak() {
		System.out.println("Hello I am a Person");
	}
}
