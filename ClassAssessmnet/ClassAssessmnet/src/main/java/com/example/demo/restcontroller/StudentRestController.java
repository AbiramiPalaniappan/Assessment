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

import com.example.demo.ServiceImp.StudentServiceImp;
import com.example.demo.model.Student;

@RestController
@RequestMapping("/student")
public class StudentRestController {
    
	@Autowired

	private  StudentServiceImp studentServiceImp;

	  @GetMapping("/all")
	  public List<Student> studentsList()
	  {
		    return studentServiceImp.listStudents();
		    
	  }
	  @PostMapping("/add")
	public Student addStudent(@RequestBody Student student   )
	{
		   return studentServiceImp.createStudent(student);
		   
		   
	}
	  
	  @PutMapping("/update")
	  public Student updateStudent(@RequestBody Student student)
	  {
		  return studentServiceImp.updateStudent(student);
		  
	  }
 @DeleteMapping
  public String deleteStudent(@RequestBody Student student)
  {
	     studentServiceImp.deleteStudent(student);
	     return" deletd Studtn record"+deleteStudent(student);
  }
}
