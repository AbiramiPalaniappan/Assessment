package com.example.demo.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Teacher;
import com.example.demo.repository.TeacherRepository;
import com.example.demo.services.TeacherService;

@Service 
public class TeacherServicImp implements TeacherService {

	
	
	@Autowired
	private TeacherRepository  teacherRepository;
	
	@Override
	public List<Teacher> listTeacher() {

		return teacherRepository.findAll();
	}

	@Override
	public Teacher createTeacher(Teacher teacher) {
		
		return teacherRepository.save(teacher);
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		return teacherRepository.save(teacher);
	}

	@Override
	public String deleteTeacher(Teacher teacher) {
		
		 teacherRepository.delete(teacher);;
		
		 return"Delete"+deleteTeacher(teacher);
	}

}
