package com.empl.oyee.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeService {
	
	@GetMapping(path = "/emp")
	public String employee(String id)  {
		return "Success..";
	}

}
