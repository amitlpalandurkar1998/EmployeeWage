package com.bridgelab.employwage;

public class EmployeeWage {
    public static void main(String[] args) {
        //System.out.printf("Welcome to the Employee Wage Computation.");
        int IS_FULL_TIME = 1;
        double empcheck = Math.floor(Math.random()*10)%2;

        if (empcheck == IS_FULL_TIME) {
            System.out.printf("Employee is Present.");
        }else {
            System.out.printf("Employee is Absent.");
        }


    }
}
