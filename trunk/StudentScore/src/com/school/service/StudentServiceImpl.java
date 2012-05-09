package com.school.service;

import java.util.Iterator;
import java.util.List;

import com.school.dao.StudentDao;
import com.school.domain.Course;
import com.school.domain.Score;
import com.school.domain.Student;

public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public List findScoreBySnumber(Student student) {

		return studentDao.findScoreBySnumber(student);
	}

}
