package com.cjc.homeServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.dao.HomeDaoI;
import com.cjc.homeService.HomeServiceI;
import com.cjc.model.Student;

@Service
public class HomeServiceIMPL implements HomeServiceI {
	@Autowired
	HomeDaoI hd;

	@Override
	public Student savestudent(Student s) {

		return hd.save(s);
	}

	@Override
	public List<Student> getStudent() {
		
		return hd.findAll();
	}

	

}
