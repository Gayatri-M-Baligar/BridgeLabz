package com.bridgeLabz.EmployeeProblem;

public class EmployeeWageUC6 {
    public static void main(String[] args) {
        //The Wage Per Hour
        int wagePerHour = 20;
        //The total number of hours per day
        int totalHour = 8;
        //The number of working days per month
        int days=20;
        //calculating employee wage for month
        int totalWage=wagePerHour*totalHour*days;
        //Printing the total wage of an employee for the month
        System.out.print(totalWage);
    }
}
