package com.torryharris.emppack;

public class Programmer extends Employee {
    private int noOfProjects;
    private String skillSet;

    public Programmer(int empId,String empName,int sal,int noOfProjects, String skillSet) {
        super(empId,empName,sal);
        this.noOfProjects = noOfProjects;
        this.skillSet = skillSet;
    }

    @Override
    public String getDetails() {
        return super.getDetails()+" "+noOfProjects+"  "+skillSet+" "+calNetSal();
    }

    @Override
    public double calNetSal() {
        return 33000;
    }


}
