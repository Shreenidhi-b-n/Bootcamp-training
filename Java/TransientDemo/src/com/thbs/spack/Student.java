package com.thbs.spack;

import java.io.Serializable;

public class Student implements Serializable {

    private int id;
    private int m1;
    private int m2;
    private int m3;
    private  transient int total;

    public Student(int id, int m1, int m2, int m3) {
        this.id = id;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void setTotal() {
        this.total = m1+m2+m3;
    }


    public int getId() {
        return id;
    }

    public int getM1() {
        return m1;
    }

    public int getM2() {
        return m2;
    }

    public int getM3() {
        return m3;
    }

    public int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", m1=" + m1 +
                ", m2=" + m2 +
                ", m3=" + m3 +
                ", total=" + total +
                '}';
    }
}