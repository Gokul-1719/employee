package com.oasys.employee.controller;

import java.util.List;




import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.employee.entity.Employee;
import com.oasys.employee.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService empser;
	@PostMapping(value="/add")
	public String insertEmployee(@RequestBody List<Employee> e) {
		return empser.insertEmployee(e);
	}
	@GetMapping(value="/get/{num}")
	public Optional<Employee> getid(@RequestBody int num) {
		return empser.getid(num);
	}
	@GetMapping(value="/get")
	public List<Employee> getvalue() {
		return empser.getvalue();
	}
	@PostMapping(value="/update")
	public String updateEmployee(@RequestBody Employee e) {
		return empser.updateEmployee(e);
	}
	@DeleteMapping(value="/delete")
	public String deleteEmployee(@PathVariable int  e) {
		return empser.deleteEmployee(e);
	}
	@GetMapping(value="/getByGender/{gender}")
	public List<Employee>getEmpByGender(@PathVariable String gender) {
		return empser.getEmpByGender(gender);
	}
	

}
