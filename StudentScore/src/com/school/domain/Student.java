package com.school.domain;

import java.util.HashSet;
import java.util.Set;

public class Student {
	private Long id;
	private String snumber;
	private String name;
	private String department;
	private String specialty;	
    private Set scores=new HashSet();
    public Student() {
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSnumber() {
		return snumber;
	}

	public void setSnumber(String snumber) {
		this.snumber = snumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public Set getScores() {
		return scores;
	}

	public void setScores(Set scores) {
		this.scores = scores;
	}
	

}
