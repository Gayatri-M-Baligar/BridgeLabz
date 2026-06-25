package com.bridgeLabz.EmployeeProblem;

public class EmployeeWageUC7 {

    public static void main(String[] args) {
        // Employee type
        final int IS_PART_TIME = 1;
        final int IS_FULL_TIME = 2;
        // Wage per hour
        int wagePerHour = 20;
        // Working hours
        int partTimeHours = 4;
        int fullTimeHours = 8;
        // Maximum working days and hours
        int maxWorkingDays = 20;
        int maxWorkingHours = 100;
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalEmployeeWage = 0;
        // Calculate wage until maximum working days or hours is reached
        while (totalWorkingDays < maxWorkingDays && totalWorkingHours < maxWorkingHours) {
            totalWorkingDays++;
            int empHours = 0;
            // Generate random employee check
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
            // Check employee type
            switch (empCheck) {
                case IS_PART_TIME:
                    empHours = partTimeHours;
                    break;
                case IS_FULL_TIME:
                    empHours = fullTimeHours;
                    break;
                default:
                    empHours = 0;
            }
            totalWorkingHours += empHours;
            // Stop if working hours become greater than 100
            if (totalWorkingHours > maxWorkingHours) {
                totalWorkingHours = maxWorkingHours;
            }
            // Calculate daily wage
            int dailyWage = empHours * wagePerHour;
            // Add daily wage to total wage
            totalEmployeeWage += dailyWage;
        }
        // Display total result
        System.out.println("Total Working Days : " + totalWorkingDays);
        System.out.println("Total Working Hours : " + totalWorkingHours);
        System.out.println("Total Employee Wage : " + totalEmployeeWage);
    }
}