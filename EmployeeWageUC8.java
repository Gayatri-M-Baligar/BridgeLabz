package com.bridgeLabz.EmployeeProblem;

public class EmployeeWageUC8 {
    //class Variables
    static final int IS_PART_TIME=1;
    static final int IS_FULL_TIME=2;
    static final int WAGE_PER_HOUR = 20;
    static final int PART_TIME_HOURS = 4;
    static final int FULL_TIME_HOURS = 8;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;
    public static void calculateEmployeeWage(){
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalEmployeeWage = 0;
        while (totalWorkingDays < MAX_WORKING_DAYS &&
                totalWorkingHours < MAX_WORKING_HOURS) {
            totalWorkingDays++;
            int empHours = 0;
            // Generate random attendance
            int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
            // Find employee working hours
            switch (empCheck) {
                case IS_PART_TIME:
                    empHours = PART_TIME_HOURS;
                    break;
                case IS_FULL_TIME:
                    empHours = FULL_TIME_HOURS;
                    break;
                default:
                    empHours = 0;
                    break;
            }
            totalWorkingHours += empHours;
            if (totalWorkingHours > MAX_WORKING_HOURS) {
                totalWorkingHours = MAX_WORKING_HOURS;
            }
            totalEmployeeWage += empHours * WAGE_PER_HOUR;
        }
        // Display final result
        System.out.println("Total Working Days : " + totalWorkingDays);
        System.out.println("Total Working Hours : " + totalWorkingHours);
        System.out.println("Total Employee Wage : " + totalEmployeeWage);
    }
    public static void main(String[] args) {
        // Call the method to compute employee wage
        calculateEmployeeWage();
    }
}


