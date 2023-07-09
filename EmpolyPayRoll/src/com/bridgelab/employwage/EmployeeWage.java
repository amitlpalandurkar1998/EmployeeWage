package com.bridgelab.employwage;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeWage {
    Scanner scanner = new Scanner(System.in);
    private final List<EmployeeWageData> saveWage;
    public EmployeeWage(){
        saveWage = new ArrayList();
    }
    public void addEmployeeWage(EmployeeWageData employeeWageData){
        saveWage.add(employeeWageData);
    }
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
    public void firstPage(){
        System.out.println("\nWellCome To Employee Wage Project.\n");

        while (true){
            System.out.println("Enter '1' to Add Company and Calculate the Employee Wage.");
            System.out.println("Enter '2' to Display a contact.");
            System.out.println("Enter '0' To Exit .");

            System.out.print("\nEnter the input : ");
            int input = scanner.nextInt();

            switch (input) {
                case 0:
                    exit();
                    break;
                case 1:
                    addCompany();
                    break;
                case 2:
                    display();
                    break;
                default:
                    break;
            }
        }
    }
    public void display(){
        System.out.println("-----------------------------------------------");
        if (!saveWage.isEmpty()){
            for (EmployeeWageData employeeWageData : saveWage) {
                System.out.println(employeeWageData);
                System.out.println();
            }
        }else {
            System.out.println("no data found . data base is Empty."+"\n");
        }
        System.out.println("-----------------------------------------------");
    }
    public void addCompany(){
        System.out.println("Follow the Formate (Company Xxxx_xxxxx) & Avoid Free Space.");
        System.out.print("Enter The Name Of Company : ");
        String nameCompany = scanner.next();

        // ex. int company1 = employeeWage.calculateEmpWage(10,20,100);
        // ex. int company2 = employeeWage.calculateEmpWage(8,22,110);
        //company 1  has its own wage, number of working days && Total hours .
        System.out.print("Enter The Employee Rate Per Hour : ");
        int EmployeeRatePerHour = scanner.nextInt();
        System.out.print("Enter The Total Working Days in Month : ");
        int totalWorkingDays= scanner.nextInt();
        System.out.print("Enter The Maximum Total Hour of the Month : ");
        int totalHour= scanner.nextInt();
        int companyWage =calculateEmpWage(EmployeeRatePerHour,totalWorkingDays,totalHour);

        EmployeeWageData employeeWageData = new EmployeeWageData(nameCompany,companyWage,EmployeeRatePerHour,totalWorkingDays,totalHour);
        addEmployeeWage(employeeWageData);
    }
    void exit(){System.out.println("Thank you...............");}
}
