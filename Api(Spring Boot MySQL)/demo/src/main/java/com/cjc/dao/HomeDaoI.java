package com.cjc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Student;

@Repository
public interface HomeDaoI extends JpaRepository<Student, Integer>{

}
