package com.oasys.employee.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;

import com.oasys.employee.dao.EmployeeDao;
import com.oasys.employee.entity.Employee;
import com.oasys.employee.repository.EmployeeRepository;
//import com.oasys.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao empdao;

	public String insertEmployee(List<Employee> e) {
		return empdao.insertEmployee(e);
	}
	@GetMapping(value="/get/{num}")
	public Optional<Employee> getid(@PathVariable int num) {
		return empdao.getid(num);
	}
	public List<Employee>getvalue() {
		return empdao.getvalue();
	}
	public String updateEmployee(Employee e) {
		return empdao.updateEmployee(e);
	}
	public String deleteEmployee(@PathVariable int e) {
		return empdao.deleteEmployee(e);
	}
	public List<Employee> getEmpByGender(String gender) {
		List<Employee>allEmp=this.getvalue();
		return allEmp.stream().filter(y->y.getGender().equalsIgnoreCase(gender)).toList();
	}
	
}
