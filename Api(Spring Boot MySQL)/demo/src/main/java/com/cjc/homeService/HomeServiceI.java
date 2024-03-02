package com.cjc.homeService;

import java.util.List;

import com.cjc.model.Student;

public interface HomeServiceI {

	public Student savestudent( Student s);

	public List<Student> getStudent();

	
}
