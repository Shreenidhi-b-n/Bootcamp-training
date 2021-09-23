package com.torryharris.emppack;

public class Manager extends Employee {
    private String depName;
    private int empCount;

    public Manager(int empId,String empName,int sal,String depName, int empCount) {
        super(empId,empName,sal);
        this.depName = depName;
        this.empCount = empCount;
    }

    @Override
    public String getDetails() {
        return super.getDetails()+" "+depName+"  "+empCount+" "+calNetSal();
    }

    @Override
    public double calNetSal() {
        return 22000;
    }
}
