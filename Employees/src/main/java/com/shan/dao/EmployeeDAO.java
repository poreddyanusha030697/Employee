package com.shan.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shan.model.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer> {
	
	List<Employee>findByLanguage(String language);
	
	 




}
