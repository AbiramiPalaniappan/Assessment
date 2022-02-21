package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Courses;

public interface CourseService {
	public List<Courses> listCourses() ;
	public Courses createCourses(Courses courses);
	public Courses updateCourses(Courses courses);
	public String deleteCourses(Courses courses);
}
