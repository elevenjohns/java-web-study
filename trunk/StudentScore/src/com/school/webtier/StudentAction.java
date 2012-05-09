package com.school.webtier;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import com.school.domain.Student;
import com.school.service.StudentService;

public class StudentAction extends ActionSupport {
	private StudentService studentService;
	private String snumber;

	public String getSnumber() {
		return snumber;
	}

	public void setSnumber(String snumber) {
		this.snumber = snumber;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

	@Override
	public String execute() throws Exception {
		Student student = new Student();
		student.setSnumber(snumber);
		List list = studentService.findScoreBySnumber(student);

		if (list != null && list.size() > 0) {
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("list", list);
		}
		return SUCCESS;
	}



}
