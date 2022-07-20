package com.bridgelabz.EmployeeWage;

/**
 * 
 * @author LENOVO
 *
 */
public class EmployeeWage {

	static final int WagePerHour = 20;
	static final int FullDayHours = 8;
	static final int PartTimeHour = 4;
/**
 * 
 * @param args
 */
    public static void main(String[] args) {
    	/**
    	 * calculating employee wage for Present Employee and Part time Employee
    	 */
        System.out.println("Welcome to Employee Wage Problem::");
        int dailyWages = 0;
        int attendance = (int) Math.floor(Math.random()*10)%3;
        if (attendance == 0)
            System.out.println("Emloyee is absent");
        else if (attendance == 1) {
            System.out.println("Employee is present");
            dailyWages = WagePerHour * FullDayHours;
            System.out.println("Wages of the day is  "+dailyWages);
        }
        else {
            System.out.println("Employee is present for the Half day");
            dailyWages = WagePerHour * PartTimeHour;
            System.out.println("Wages of the day for part time "+dailyWages);
        }
    }
}