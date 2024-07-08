package com.emp.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/emp")
	public String getEmp() {
		return "Response from Employee";
	}
}

