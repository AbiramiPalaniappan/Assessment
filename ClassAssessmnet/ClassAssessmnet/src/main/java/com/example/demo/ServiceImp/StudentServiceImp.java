package com.example.demo.ServiceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.services.StudentService;

@Service
public class StudentServiceImp implements StudentService {

	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> listStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student createStudent(Student student) {
		return studentRepository.save( student);
		
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public String deleteStudent(Student student) {
		studentRepository.delete(student);
		return"Delete" +deleteStudent(student);
	}

}
