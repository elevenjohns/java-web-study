package com.school.dao;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.school.domain.Course;
import com.school.domain.Score;
import com.school.domain.Student;

public class StudentDaoImpl extends HibernateDaoSupport implements StudentDao {

	public List findScoreBySnumber(Student student) {
		String sql = "from Student as s where s.snumber=?";		
		List list = getHibernateTemplate().find(sql, student.getSnumber());
		return list;

	}

}
