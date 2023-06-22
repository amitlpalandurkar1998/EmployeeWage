package com.bridgelab.employwage;


public class EmployeeWage {

    public static final int IS_FULL_TIME = 2;
    public static final int EMPLOYEE_RATE_PER_HOUR = 10;
    public static final int TOTAL_WORKING_DAYS = 20;
    public static final int IS_PART_TIME = 1;

    public static final int TOTAL_HOUR = 100;


    public static void main(String[] args) {
        //System.out.printf("Welcome to the Employee Wage Computation.");
        int employeehrs=0;
        int employeewage = 0;
        int emoployeetotalwage=0;

        for (int i=1; i<=TOTAL_WORKING_DAYS; i++) {


            int empcheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empcheck) {
                case 0:
                    employeehrs = 0;
                    break;
                case 1:
                    employeehrs = 4;
                    break;
                case 2:
                    employeehrs = 8;
                    break;
                default:
                    System.out.println("invalid choice.");
                    break;
            }

            if (employeehrs<=TOTAL_HOUR){
                employeewage = employeehrs * EMPLOYEE_RATE_PER_HOUR;
                emoployeetotalwage += employeewage;
            }
        }
        System.out.println("Total Employee Wage : "+emoployeetotalwage+" Rs.");
    }
}
