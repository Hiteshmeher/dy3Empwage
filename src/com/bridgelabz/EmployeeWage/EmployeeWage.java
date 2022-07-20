package com.bridgelabz.EmployeeWage;
/**
 * 
 * @author LENOVO
 *
 */
public class EmployeeWage {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		/**
		 * Checking Employee Attendance whether Present or Absent
		 */
		System.out.println("Welcome to Employee Wage");
		int employeePresent = 1;
		int isPresent = (int) (Math.floor(Math.random() * 10) % 2);
		if (isPresent == employeePresent)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is not Present");
	}

}
