package com.bridgelab.employwage;

public class EmployeeWage {
    public static void main(String[] args) {
        //System.out.printf("Welcome to the Employee Wage Computation.");
        int IS_FULL_TIME = 2;
        int EMPLOYEE_RATE_PER_HOUR=10;
        int employeehrs=0;
        int employeewage = 0;
        int IS_PART_TIME=1;


        double empcheck = Math.floor(Math.random()*10)%3;



        if (empcheck == IS_PART_TIME) {
            //System.out.printf("Employee is Present.");
            employeehrs=4;

        } else if (empcheck == IS_FULL_TIME) {
            employeehrs=8;
        } else {

            //System.out.printf("Employee is Absent.");
            employeehrs=0;
        }
            employeewage=employeehrs*EMPLOYEE_RATE_PER_HOUR;
            System.out.println(employeewage);




    }
}
