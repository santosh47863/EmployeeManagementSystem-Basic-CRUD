package com.cg.ems.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ems.model.Employee;
import com.cg.ems.repository.EmployeeRepository;


@Service
public class EmployeeService {

	@Autowired
    public EmployeeRepository employeeRepository ;
	
	public List<Employee> getAllEmployees()
	{
		List<Employee> employees= new ArrayList<>();
		employeeRepository.findAll().forEach(employees::add);
		 return employees;
	}
	public Optional<Employee> getEmployeeById(Integer empId) {
		// TODO Auto-generated method stub
		return  employeeRepository.findById(empId);
	}
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}

	public void updateEmployee(Integer empId, Employee employee) {
		
		employeeRepository.save(employee);
		
	}

	public void deleteEmployee(Integer empId) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(empId);
		
	}

	

	

	

	
	
	
}
