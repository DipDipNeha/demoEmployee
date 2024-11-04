/**
 * 
 */
package com.demo.emploee.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


/**
 * 
 */
@Entity
@Table
public class Employee {
	
	@NotNull(message = "Employee Id should be not be blank")
	@Column
	private long employeeId;
	@NotBlank(message = "Employee First Name should be not be blank or empty")
	@Column
	private String firstName;
	@NotBlank(message = "Employee Last Name should be not be blank or empty")
	@Column
	private String lastName;
	@NotBlank(message = "Employee email should be not be blank or empty")
	@Column
	private String email;
	@NotBlank(message = "Employee phone Number should be not be blank")
	@Column
	private ArrayList<String> phoneNumnber;
	@NotNull(message = "Employee salary should be not be blank")
	@Column
	private Double salary;
	@NotBlank(message = "Employee date Off Join should be not be blank")
	@Column
	private Date doj;
	
	private String tax;
	private Date taxYear;
	
	
	
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	public Date getTaxYear() {
		return taxYear;
	}
	public void setTaxYear(Date taxYear) {
		this.taxYear = taxYear;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<String> getPhoneNumnber() {
		return phoneNumnber;
	}
	public void setPhoneNumnber(ArrayList<String> phoneNumnber) {
		this.phoneNumnber = phoneNumnber;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	
	

}
