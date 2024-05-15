package com.project.project1.services;

import java.util.List;

import com.project.project1.entities.student;

public interface StudentServices {
	String addStudent(student st);
	List<student> fetchAllStudents();
	student searchStudent(int univId);
	String updateStudent(student st);
	String deleteStudent(int univId);
}
