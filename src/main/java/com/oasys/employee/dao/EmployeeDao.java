package com.oasys.employee.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import com.oasys.employee.entity.Employee;
import com.oasys.employee.repository.EmployeeRepository;

public class EmployeeDao {
	@Autowired
	 EmployeeRepository emprepo;
	
	public String insertEmployee(List<Employee> e) {
		emprepo.saveAll(e);
		return "welcome";
	}
	public Optional<Employee> getid(@PathVariable int num) {
		return emprepo.findById(num);
	}
	public List<Employee>getvalue() {
		return emprepo.findAll();
	}
	public String updateEmployee(Employee e) {
	emprepo.save(e);
	return "thank you";
	}
	public String deleteEmployee(@PathVariable int e) {
		emprepo.deleteById(e);
		return "dont disturb me";
	}
}