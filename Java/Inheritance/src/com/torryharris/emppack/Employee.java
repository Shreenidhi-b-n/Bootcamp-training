package com.torryharris.emppack;

public class Employee {
    private int empId;
    private String empName;
    protected int sal;

    public Employee(int empId, String empName, int sal) {
        this.empId = empId;
        this.empName = empName;
        this.sal = sal;
    }

    public String getDetails(){
        return empId+"  "+empName+" "+sal;
    }

    public int getSal() {
        return sal;
    }


}
