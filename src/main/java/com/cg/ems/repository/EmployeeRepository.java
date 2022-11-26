package com.cg.ems.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.ems.model.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
