/**
 * 
 */
package com.demo.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.emploee.entity.Employee;

/**
 * 
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	Employee  findByemployeeId(Long employeeId);
}
