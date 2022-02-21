package com.example.demo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ServiceImp.CourseServiceImp;
import com.example.demo.model.Courses;
import com.example.demo.model.Student;


@RestController
@RequestMapping("/course")

public class CourseRestController {

	
	@Autowired 
	private CourseServiceImp courseServiceImp;
	 @GetMapping("/all")
	  public List<Courses> coursesList()
	  {
		    return courseServiceImp.listCourses();
		    
	  }
	  @PostMapping("/add")
	public Courses addCourse(@RequestBody Courses courses   )
	{
		   return courseServiceImp.createCourses(courses);
		   
		   
	}
	  
	  @PutMapping("/update")
	  public Courses updateCourses(@RequestBody Courses courses)
	  {
		  return courseServiceImp.updateCourses(courses);
		  
	  }
@DeleteMapping("/delete")
 public String deleteCourse(@RequestBody Courses courses)
 {
	courseServiceImp.deleteCourses(courses);
	     return" deletd Course record"+deleteCourse(courses);
 }	


}
