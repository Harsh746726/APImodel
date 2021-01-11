package com.exampleapi.demoapi.service;
import com.exampleapi.demoapi.model.Employees;
import com.exampleapi.demoapi.virtualdata.Vrtual;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeesController {
	
	@Autowired
	private Vrtual virtual;
	
	@GetMapping("/employee")
	public List<Employees> getEmployee() {
		
		return this.virtual.getallemp();
	}
	
}
