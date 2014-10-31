package DAO;

public class Offers {


	private int id;
	private String name;
	private String email;
	private String text;

	public Offers(int id, String name, String email, String text) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.text = text;
	}
	public Offers() {
		// this is just a default constructor
	}

	public Offers(String name, String email, String text) {
		// id is autoincremented
		this.name = name;
		this.email = email;
		this.text = text;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Offers [id=" + id + ", name=" + name + ", email=" + email
				+ ", text=" + text + "]";
	}
}
