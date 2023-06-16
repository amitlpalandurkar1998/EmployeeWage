package com.bridgelab.employwage;

public class EmployeeWage {
    public static void main(String[] args) {
        //System.out.printf("Welcome to the Employee Wage Computation.");
        int IS_FULL_TIME = 2;
        int EMPLOYEE_RATE_PER_HOUR=10;
        int employeehrs=0;
        int employeewage = 0;
        int IS_PART_TIME=1;


        int empcheck = (int)Math.floor(Math.random()*10)%3;

        switch (empcheck){
            case 0:
                employeehrs=0;
                break;
            case 1:
                employeehrs=4;
                break;
            case 2:
                employeehrs=8;
                break;
            default:
                System.out.println("invalid choice.");
                break;
        }
        employeewage=employeehrs*EMPLOYEE_RATE_PER_HOUR;
        System.out.println(employeewage);
    }
}
