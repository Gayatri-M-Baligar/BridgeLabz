package com.bridgeLabz.EmployeeProblem;

public class EmployeeWageUC3 {
    static  void dailyEmployeeWage(int wagePerHour,int totalHour){
        System.out.print(wagePerHour*totalHour);
    }
    public static void main(String[] args) {
        //The Wage Per Hour
        int wagePerHour = 20;
        //The total number of hours per day
        int totalHour = 8;
        //calculate the total wage of a person
        dailyEmployeeWage(wagePerHour,totalHour);
    }
}
