package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	// variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "Full_Name")
	private String full_Name;

	@Column(name = "Standard")
	private int Standard;

	@Column(name = "School_Name")
	private String school_Name;

	// default constructor
	public Student() {

	}

	// parameterized constructor
	public Student(int id, String full_Name, int standard, String School_Name) {

		this.id = id;
		this.full_Name = full_Name;
		this.Standard = standard;
		this.school_Name = school_Name;

	}

}