package one_to_one_bidireactional;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Passport {
	
	@Id
	private int id;
	private String name;
	private int dob;
	
//	@OneToOne(mappedBy = "passport")
	private Person person;
	
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
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
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "Passport [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}

}
