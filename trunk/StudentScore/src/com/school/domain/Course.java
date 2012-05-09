package com.school.domain;

import java.util.HashSet;
import java.util.Set;

public class Course {
	private Long id;
	private String name;
	private Set scores=new HashSet();
	public Course(){}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set getScores() {
		return scores;
	}
	public void setScores(Set scores) {
		this.scores = scores;
	}
	
	
}
