/**
 * 
 */
package com.demo.employee.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.emploee.entity.Employee;
import com.demo.employee.repository.EmployeeRepository;
import com.demo.employee.utils.TaxCalculator;

/**
 * 
 */
@Service
public class EmployeeService {
	
	 private final EmployeeRepository employeeRepository;

	    @Autowired
	    public EmployeeService(EmployeeRepository employeeRepository) {
	        this.employeeRepository = employeeRepository;
	    }
	    
	    public Employee  saveEmployee( Employee employee) {
	    	return employeeRepository.save(employee);
	    }
	    public Employee  getEmployeeDetaiksWithTax( Employee employee) {
	    	Employee employee2=employeeRepository.findByemployeeId(employee.getEmployeeId());
	
	    	   	
	    	employee2.setTax(TaxCalculator.calculateTax(employee2.getSalary(), employee2.getDoj())+"");
	    	employee2.setTaxYear(new Date());
	    	
	    	return employee2;
	    	
	    	
	    	
	  //  	TaxCalculator.calculateTax(employee2.getSalary(), employee2.getDoj());
	    
	    	
	    	return employee2;
	    	
	    	
	    	
	    	
	    }
	    
	    public List<Employee>  getAllEmployee( Employee employee) {
	    	return employeeRepository.findAll();
	    }
	    
	    
	    public static String calculateIncome(Double double1,int i) {
	    	
	    	BigDecimal val=new BigDecimal(double1).multiply(new BigDecimal(i)).divide(new BigDecimal(100));
	    	
	    	return val.setScale(2, RoundingMode.HALF_EVEN).toString();
	    }
	   
}
