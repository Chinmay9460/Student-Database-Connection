package com.project.project1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.project1.entities.student;
import com.project.project1.repositories.StudentRepo;

@Service
public class StudentServiceImplementation implements StudentServices{
	
	@Autowired
	StudentRepo repo;
	@Override
	public String addStudent(student st) {
		repo.save(st);
		return "Student added successfully!";
	}
	@Override
	public String updateStudent(student st) {
		repo.save(st);
		return "Student updated successfully";
	}
	@Override
	public List<student> fetchAllStudents() {
		return repo.findAll();
	}
	@Override
	public student searchStudent(int univId) {
		return repo.findById(univId).get();
		
	}
	@Override
	public String deleteStudent(int univId) {
		repo.deleteById(univId);
		return "Student deleted successfully";
	}
}
