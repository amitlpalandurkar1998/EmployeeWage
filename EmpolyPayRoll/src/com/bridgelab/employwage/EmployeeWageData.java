package com.bridgelab.employwage;

public class EmployeeWageData {
    private String NAME_OF_COMPANY;
    private int WAGE_OF_COMPANY;
    public  EmployeeWageData(String nameCompany, int companyWage){
        this.NAME_OF_COMPANY= nameCompany;
        this.WAGE_OF_COMPANY= companyWage;
    }

    public String getNAME_OF_COMPANY() {return NAME_OF_COMPANY;}
    public void setNAME_OF_COMPANY(String NAME_OF_COMPANY) {
        this.NAME_OF_COMPANY = NAME_OF_COMPANY;
    }
    public int getWAGE_OF_COMPANY() {return WAGE_OF_COMPANY;}
    public void setWAGE_OF_COMPANY(int WAGE_OF_COMPANY) {
        this.WAGE_OF_COMPANY = WAGE_OF_COMPANY;
    }

    @Override
    public String toString() {
        return "\nCompany Name : "+ NAME_OF_COMPANY+
                "\nWage Of Company : "+ WAGE_OF_COMPANY;
    }
}
