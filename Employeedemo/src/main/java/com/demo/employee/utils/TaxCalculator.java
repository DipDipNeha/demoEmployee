package com.demo.employee.utils;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class TaxCalculator {
    
    public static double calculateTax(double annualSalary, Date inputdate) {
    	
    	LocalDate	dateOfJoining=inputdate.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        LocalDate startOfYear = LocalDate.of(dateOfJoining.getYear(), 4, 1);
        
        long daysInYear = 365; 
        long daysWorked = ChronoUnit.DAYS.between(dateOfJoining, startOfYear.plusYears(1));
        
        double proratedSalary = (annualSalary * daysWorked) / daysInYear;
        
        double tax = 0;
        if (proratedSalary > 250000) {
            if (proratedSalary <= 500000) {
                tax += (proratedSalary - 250000) * 0.05;
            } else if (proratedSalary <= 1000000) {
                tax += 250000 * 0.05;  
                tax += (proratedSalary - 500000) * 0.10; 
            } else {
                tax += 250000 * 0.05; 
                tax += 500000 * 0.10; 
                tax += (proratedSalary - 1000000) * 0.20;  
            }
        }
        
        if (proratedSalary > 2500000) {
            double cessAmount = (proratedSalary - 2500000) * 0.02; 
            tax += cessAmount;
        }
        
        return tax;
    }

    
}
