package com.HibernateAnnotation;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE", uniqueConstraints = {
        @UniqueConstraint(columnNames = "ID") })
public class Employee implements Serializable {

	 private static final long serialVersionUID = -1798070786993154676L;
	 
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
//@Column(name = "ID", unique = true, nullable = false)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "FIRSTNAME", unique = true, nullable = false, length = 100)
	private String firstName;
	
	@Column(name = "LASTNAME", unique = true, nullable = false, length = 100)
	private String lastName;
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}