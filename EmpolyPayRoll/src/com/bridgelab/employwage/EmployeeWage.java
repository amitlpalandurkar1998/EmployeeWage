package com.bridgelab.employwage;


public class EmployeeWage {

    public int employeehrs=0;
    public int employeewage = 0;
    public int emoployeetotalwage=0;
    public int totalEmpHour =0;

    public int calculateEmpWage(int EMPLOYEE_RATE_PER_HOUR , int TOTAL_WORKING_DAYS , int TOTAL_HOUR){

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

            totalEmpHour+=employeehrs;

            if (totalEmpHour<=TOTAL_HOUR){
                employeewage = employeehrs * EMPLOYEE_RATE_PER_HOUR;
                emoployeetotalwage += employeewage;
            }
        }

        return emoployeetotalwage;
    }

    public static void main(String[] args) {
        EmployeeWage employeeWage = new EmployeeWage();

        //company 1  has its own wage, number of working days && Total hours .
        int company1 = employeeWage.calculateEmpWage(10,20,100);
        System.out.println("Company Name 1 : "+company1);

        // company 2  has its own wage, number of working days && Total hours .
        int company2 = employeeWage.calculateEmpWage(8,22,110);
        System.out.println("Company Name 2 : "+company2);

    }
}
