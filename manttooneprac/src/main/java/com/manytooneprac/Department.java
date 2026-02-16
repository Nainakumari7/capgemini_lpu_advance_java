package com.manytooneprac;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "number_sequence")
	@SequenceGenerator(name = "number", sequenceName = "number_sequence", initialValue = 100, allocationSize = 1)
    private int id;

    private String name;
    private double salary;
    private String designation;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}
    
    

}
