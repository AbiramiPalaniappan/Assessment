package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Student;

public interface StudentService {

	
	
	
	public List<Student> listStudents() ;
	public Student createStudent(Student student);
	public Student updateStudent(Student student);
	public String deleteStudent(Student student);
	
}
