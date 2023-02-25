package com.george.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.george.springboot.model.Student;
import com.george.springboot.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	
	public List<Student> getAllStudent(){
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(student -> students.add(student));
		return students;
	}
	
	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}
	
	public void saveOrUpdate(Student student) {
		studentRepository.save(student);
	}
	
	public void delete(int id) {
		studentRepository.deleteById(id);
	}
	
	public void update(Student student) {
		studentRepository.save(student);
	}
}
