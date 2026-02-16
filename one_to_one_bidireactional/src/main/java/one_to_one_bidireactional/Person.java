package one_to_one_bidireactional;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int id;
	private String name;
	private int phone_no;
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL )
	private Passport passport;
	
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
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
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", phone_no=" + phone_no + ", email=" + email + "]";
	}
	
	
	
	

}
