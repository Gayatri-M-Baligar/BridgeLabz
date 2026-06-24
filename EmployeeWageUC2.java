package com.bridgeLabz.EmployeeProblem;

public class EmployeeWageUC2 {


        public static void main(String[] args) {

            // UC1: Display welcome message for Employee Wage Computation Program
            System.out.println("Welcome to Employee Wage Computation Program");

            // UC1: Define constant to represent employee presence
            int IS_PRESENT = 1;

            // UC1: Generate random attendance value (0 = Absent, 1 = Present)
            int empCheck = (int)(Math.floor(Math.random() * 10) % 2);

            if (empCheck == IS_PRESENT) {
                System.out.println("Employee is Present");
            } else {
                System.out.println("Employee is Absent");
            }
        }

}
