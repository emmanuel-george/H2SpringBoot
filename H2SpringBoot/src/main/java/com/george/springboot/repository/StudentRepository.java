package com.george.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.george.springboot.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
