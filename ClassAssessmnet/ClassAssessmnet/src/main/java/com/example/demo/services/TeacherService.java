package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Student;
import com.example.demo.model.Teacher;

public interface TeacherService {

	
	public List<Teacher> listTeacher() ;
	public Teacher createTeacher(Teacher teacher) ;
	public Teacher updateTeacher(Teacher teacher);
	public String deleteTeacher(Teacher teacher);
}
