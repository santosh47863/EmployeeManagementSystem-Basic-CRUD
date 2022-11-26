package com.cg.ems.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ems.model.Employee;
import com.cg.ems.services.EmployeeService;

@RequestMapping(value = "/cg/ems")
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	
	//get list of all employee
	//http://localhost:9090/cg/ems/employee
	@GetMapping("/employee")
	public List<Employee> getAllEmployees() 
	{
		return employeeService.getAllEmployees();
	}
	
	//get the detail employee using empId
	//http://localhost:9090/cg/ems/employee/45
		@GetMapping("/employee/{empId}")
		public Optional<Employee> getEmployeeById(@PathVariable Integer empId) {
			return employeeService.getEmployeeById(empId);
		}
	
	//add employee
	@PostMapping(value="/addEmployee")
   public void addEmployee(@RequestBody Employee employee) {
	  employeeService.addEmployee(employee); 
   }
	
	//http://localhost:9090/cg/ems/updateEmployee/45
	//update employee using empId
		@PutMapping(value="/updateEmployee/{empId}")
	  public void updateEmployee(@PathVariable Integer empId, @RequestBody Employee employee ) 
		{
			employeeService.updateEmployee(empId,employee);
		}
		
	//http://localhost:9090/cg/ems/deleteEmployee/2
	// delete employee on the basis of empid	
		@DeleteMapping(value="/deleteEmployee/{empId}")
		public void deleteEmployee(@PathVariable Integer empId ) {
			employeeService.deleteEmployee(empId);
		}
	
}















