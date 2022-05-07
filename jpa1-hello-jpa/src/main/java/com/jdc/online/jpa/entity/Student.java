package com.jdc.online.jpa.entity;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;
import static javax.persistence.GenerationType.AUTO;
import static javax.persistence.TemporalType.DATE;
import static javax.persistence.EnumType.STRING;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity
@Table(name = "student_tbl")
@SequenceGenerator(name = "student_sequence")
public class Student implements Serializable {

	public enum Gender{Male, Female}
	@Id
	@GeneratedValue(strategy = AUTO, generator = "student_sequence")
	private int id;
	@Temporal(DATE)
	private Date dateOfBirth;
	@Enumerated(STRING)
	@Column(length = 10)
	private Gender gender;
	private String name;
	private String mobileNumber;
	private String email;
	private SecurityInfo security;
	@Transient
	private boolean selected;
	private static final long serialVersionUID = 1L;

	public Student() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public SecurityInfo getSecurity() {
		return security;
	}
	public void setSecurity(SecurityInfo security) {
		this.security = security;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
   
}
