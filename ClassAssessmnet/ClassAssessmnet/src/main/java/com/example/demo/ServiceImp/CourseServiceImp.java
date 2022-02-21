package com.example.demo.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Courses;
import com.example.demo.repository.CourseRepository;
import com.example.demo.services.CourseService;

@Service
public class CourseServiceImp  implements CourseService{

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public List<Courses> listCourses() {
		return courseRepository.findAll();
	}

	@Override
	public Courses createCourses(Courses courses) {
		
		return courseRepository.save(courses);
	}

	@Override
	public Courses updateCourses(Courses courses) {
		
		return courseRepository.save(courses);
	}

	@Override
	public String deleteCourses(Courses courses) {
		courseRepository.save(courses);
		
		return "delete"+deleteCourses(courses);
	}

}
