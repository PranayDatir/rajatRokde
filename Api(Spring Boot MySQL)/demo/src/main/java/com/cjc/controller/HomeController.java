package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.homeService.HomeServiceI;
import com.cjc.model.Student;

@CrossOrigin("*")
@RestController
public class HomeController 
{
  @Autowired 
  HomeServiceI hs;
  
	@PostMapping("savestu")
	public Student savedata(@RequestBody Student s) 
	{
		Student ss=hs.savestudent(s);
		return ss;
	}
	
	@GetMapping("getstu")
	public List<Student> getdata() 
	{
		List<Student> listStu = hs.getStudent();
		return listStu ;
	}
}
