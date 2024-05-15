package com.project.project1.repositories;

import org.hibernate.query.criteria.JpaCriteriaNode;
import org.springframework.data.jpa.repository.JpaRepository;

import com.project.project1.entities.student;

public interface StudentRepo extends JpaRepository<student, Integer>{
	
}
