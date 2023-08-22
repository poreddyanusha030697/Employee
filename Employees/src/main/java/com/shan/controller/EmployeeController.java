package com.shan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shan.model.Employee;
import com.shan.service.EmployeeService;

@RestController
@RequestMapping("/controller")
public class EmployeeController {

	@Autowired
	EmployeeService empservice;

	@GetMapping("/alldata")
	public List<Employee> getdetails() {
		return empservice.getalldata();
		
	}
	
	@GetMapping("/category/{language}")
	public List<Employee> getDetailsByCategory(@PathVariable String language){
		return empservice.getDetailsByCategory(language);
	}
	
	
	@PostMapping("/add")
	public String addEmployee(@RequestBody Employee employee) {
		return empservice.addEmployee(employee);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable Integer id) {
		return empservice.deleteEmployee(id);
	}
	
	
	@PutMapping("/update/{id}")
	public String updateEmployee(@PathVariable Integer id, @RequestBody String language) {
		return empservice.updateEmployee(id, language);
		
	}

}
