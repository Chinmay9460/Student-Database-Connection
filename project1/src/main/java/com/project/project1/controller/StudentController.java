package com.project.project1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.project1.entities.student;
import com.project.project1.services.StudentServices;

@Controller
public class StudentController {
	
	@Autowired
	StudentServices service;
	@PostMapping("/reg")
	public String addstudent(student st) {
		service.addStudent(st);
		return "index";
	}
	@PostMapping("/upd")
	String updateStudent(student st) {
		service.updateStudent(st);
		return "index";
	}
	@PostMapping("/del")
	String deleteStudent(int univId) {
		service.deleteStudent(univId);
		return "index";
	}
	@PostMapping("/search")
	String SearchStudent(int univId,Model m) {
		student s = service.searchStudent(univId);
		m.addAttribute("student", s);
		return "display student";
	}
	@PostMapping("/findAll")
	String fetchAllStudent(Model m) {
		List<student>sList = service.fetchAllStudents();
		m.addAttribute("stList", sList);
		return "display All student";
	}
}
