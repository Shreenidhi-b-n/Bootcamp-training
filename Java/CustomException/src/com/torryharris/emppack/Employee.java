package com.torryharris.emppack;

import com.torryharris.exceptionpack.InsufficientLeaveException;

public class Employee {
    private int empId;
    private int bLeave;

    public Employee(int empId, int bLeave) {
        this.empId = empId;
        this.bLeave = bLeave;
    }

    public String applyLeave(int n) throws InsufficientLeaveException {
        if(bLeave<n)
            throw new InsufficientLeaveException("Insufficient leave");
        else{
            bLeave-=n;
            return("Your leave sanctioned!");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", bLeave=" + bLeave +
                '}';
    }
}
