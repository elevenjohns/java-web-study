package com.school.dao;

import java.util.List;

import com.school.domain.Student;

public interface StudentDao {
	public List findScoreBySnumber(Student student);
}
