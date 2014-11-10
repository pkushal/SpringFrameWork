package com.kushal.springframework.web.DAO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.kushal.springframework.web.validations.ValidEmail;

public class Offers {

	private int id;
	@Size(min = 5, max = 20, message = "Name is too short or too long")
	private String name;

	@NotNull
	// @Pattern(regexp = ".*\\@.*\\..*", message =
	// "Enter a valid email address")
	@ValidEmail(min = 6, message="This email address is not correct")
	private String email;

	@Size(min = 10, max = 100, message = "Text too short or too long")
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
