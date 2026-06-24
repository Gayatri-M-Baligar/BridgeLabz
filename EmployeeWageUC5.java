package com.bridgeLabz.EmployeeProblem;

public class EmployeeWageUC5 {
    public static void main(String[] args) {

        // Define  variables
         int isPartTime = 1;
         int isFullTime = 2;

        // Define wage per hour and working hours
         int empRatePerHour = 20;
         int partTimeHours = 4;
         int fullTimeHours = 8;

        int empHours = 0;

        // Generate random attendance value
        int empCheck = (int) (Math.floor(Math.random() * 10) % 3);

        // Determine employee working hours using switch case
        switch (empCheck) {

            case 1:
                empHours = partTimeHours;
                System.out.println("Employee is Part Time");
                break;

            case 2:
                empHours = fullTimeHours;
                System.out.println("Employee is Full Time");
                break;

            default:
                empHours = 0;
                System.out.println("Employee is Absent");
                break;
        }

        // Calculate employee wage
        int empWage = empHours * empRatePerHour;

        // Display employee wage
        System.out.println("Employee Wage: " + empWage);
    }
}


