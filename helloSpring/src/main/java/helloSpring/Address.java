package helloSpring;

public class Address {
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	private String street;
	private String postcode;

	public Address() {

	}

	public Address(String street, String postcode) {
		super();
		this.street = street;
		this.postcode = postcode;
	}

	public void init() {
		System.out.println("Bean created in the address.java: " + this);
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", postcode=" + postcode + "]";
	}

}
