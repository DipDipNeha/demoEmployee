/**
 * 
 */
package com.demo.emploee.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.emploee.entity.Employee;
import com.demo.employee.service.EmployeeService;

/**
 * 
 */
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	private final EmployeeService employeeServices;

	    public EmployeeController(EmployeeService employeeService) {
	        this.employeeServices = employeeService;
	    }
	    
	    @PostMapping("/saveemployee")
	    public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody  Employee employee) {
	        Employee newProduct = employeeServices.saveEmployee(employee);
	        return ResponseEntity.ok(newProduct);
	    }
	    
	    
	    @GetMapping("/getemployeetax/{id}")
	    public ResponseEntity<Employee> getEmployeeDetails(@Valid @PathVariable  Employee employee) {
	        Employee newProduct = employeeServices.getEmployeeDetaiksWithTax(employee);
	        
	        
	        return ResponseEntity.ok(newProduct);
	    }
	    
	    
	    

}
