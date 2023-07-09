package com.bridgelab.employwage;
public class EmployeeWageData {
    private String NAME_OF_COMPANY;
    private int EMPLOYEE_RATE_PER_HOUR;
    private int TOTAL_WORKING_DAYS;
    private int TOATL_HOUR;
    private int WAGE_OF_COMPANY;
    public  EmployeeWageData(String nameCompany, int companyWage,int EmployeeRatePerHour,int totalWorkingDays,int totalHour){
        this.NAME_OF_COMPANY= nameCompany;
        this.WAGE_OF_COMPANY= companyWage;
        this.EMPLOYEE_RATE_PER_HOUR = EmployeeRatePerHour;
        this.TOTAL_WORKING_DAYS = totalWorkingDays;
        this.TOATL_HOUR = totalHour;
    }
    public String getNAME_OF_COMPANY() {return NAME_OF_COMPANY;}
    public void setNAME_OF_COMPANY(String NAME_OF_COMPANY) {this.NAME_OF_COMPANY = NAME_OF_COMPANY;}
    public int getWAGE_OF_COMPANY() {return WAGE_OF_COMPANY;}
    public void setWAGE_OF_COMPANY(int WAGE_OF_COMPANY) {this.WAGE_OF_COMPANY = WAGE_OF_COMPANY;}
    public int getEMPLOYEE_RATE_PER_HOUR() {return EMPLOYEE_RATE_PER_HOUR;}
    public void setEMPLOYEE_RATE_PER_HOUR(int EMPLOYEE_RATE_PER_HOUR) {this.EMPLOYEE_RATE_PER_HOUR = EMPLOYEE_RATE_PER_HOUR;}
    public int getTOTAL_WORKING_DAYS() {return TOTAL_WORKING_DAYS;}
    public void setTOTAL_WORKING_DAYS(int TOTAL_WORKING_DAYS) {this.TOTAL_WORKING_DAYS = TOTAL_WORKING_DAYS;}
    public int getTOATL_HOUR() {return TOATL_HOUR;}
    public void setTOATL_HOUR(int TOATL_HOUR) {this.TOATL_HOUR = TOATL_HOUR;}
    @Override
    public String toString() {
        return "\nCompany Name : "+ NAME_OF_COMPANY+
                "\nEmployee Rate Per Hour : "+EMPLOYEE_RATE_PER_HOUR+
                "\nTotal Working Days : "+TOTAL_WORKING_DAYS+
                "\nTotal Hour in a Month : "+TOATL_HOUR+
                "\nWage Of Company : "+ WAGE_OF_COMPANY;
    }
}
