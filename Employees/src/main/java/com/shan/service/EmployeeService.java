package com.shan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shan.dao.EmployeeDAO;
import com.shan.model.Employee;

@Service
public class EmployeeService {
	
	
	@Autowired
	EmployeeDAO empdao;
	
	
	public List<Employee> getalldata(){
		List<Employee> employees =  empdao.findAll();
		return employees;
	}


	public List<Employee> getDetailsByCategory(String language) {
		
		return empdao.findByLanguage(language);
	}


	public String addEmployee(Employee employee) {
		empdao.save(employee);
		return "Success";
	}


	public String deleteEmployee(Integer id) {
		empdao.deleteById(id);
		return "Record deleted Successfully";
	}


	public String updateEmployee(Integer id, String language) {
		Optional existingEmployee=empdao.findById(id);
		if(existingEmployee.isPresent()) {
			Employee e = (Employee) existingEmployee.get();
			 e.setLanguage(language);
			
		}
	
		
		return "updated Successfully";
	}


	


	


	

}
