package com.bridgelabz.EmployeeWage;

/**
 * 
 * @author LENOVO
 *
 */
public class EmployeeWage {

	static final int WagePerHour = 20;
	static final int FullDayHours = 8;
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		/**
		 * Checking Employee Attendance whether Present or Absent or Doing Half day
		 * if employee is Present the calculating its Daily wages
		 */
		System.out.println("Welcome to Employee Wage Computation Problem ");
		int dailyWages = 0;
		int attendance = (int) Math.floor(Math.random() * 10) % 3;
		if (attendance == 0)
			System.out.println("Emloyee is absent");
		else if (attendance == 1) {
			System.out.println("Employee is present");
			dailyWages = WagePerHour * FullDayHours;
			System.out.println("Daily Wages of Employee: " + dailyWages);
		} else {
			System.out.println("Employee is present for the Half day");
		}
	}
}