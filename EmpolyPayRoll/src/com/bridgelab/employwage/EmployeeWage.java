package com.bridgelab.employwage;

public class EmployeeWage {
    public static void main(String[] args) {
        //System.out.printf("Welcome to the Employee Wage Computation.");
        int IS_FULL_TIME = 1;
        int EMPLOYEE_RATE_PER_HOUR=10;
        int employeehrs=0;
        int employeewage = 0;

        double empcheck = Math.floor(Math.random()*10)%2;



        if (empcheck == IS_FULL_TIME) {
            //System.out.printf("Employee is Present.");
            employeehrs=8;

        }else {
            //System.out.printf("Employee is Absent.");
            employeehrs=0;
        }
            employeewage=employeehrs*EMPLOYEE_RATE_PER_HOUR;
            System.out.println(employeewage);




    }
}
