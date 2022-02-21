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

import com.example.demo.ServiceImp.TeacherServicImp;
import com.example.demo.model.Courses;
import com.example.demo.model.Teacher;

@RestController
@RequestMapping("/teacher")
public class TeacherRestController {

	
	@Autowired
	private TeacherServicImp teacherServicImp;
	
	 @GetMapping("/all")
	  public List<Teacher> coursesTeacheras()
	  {
		    return teacherServicImp.listTeacher();
		    
	  }
	  @PostMapping("/add")
	public Teacher addTeacher(@RequestBody Teacher teacher    )
	{
		   return teacherServicImp.createTeacher(teacher);
		   
		   
	}
	  
	  @PutMapping("/update")
	  public Teacher updateTeacher(@RequestBody Teacher teacher)
	  {
		  return teacherServicImp.updateTeacher(teacher);
		  
	  }
@DeleteMapping("/delete")
public String deleteTeacher(@RequestBody Teacher teacher)
{
	teacherServicImp.deleteTeacher(teacher);
	     return" deletd Course record"+deleteTeacher(teacher);
}	

}
