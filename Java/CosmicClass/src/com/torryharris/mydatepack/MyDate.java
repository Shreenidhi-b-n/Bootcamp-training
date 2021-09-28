package com.torryharris.mydatepack;

public class MyDate {
    private int dd;
    private int mm;
    private int yy;

    public MyDate(int dd, int mm, int yy) {
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }


    @Override
    public boolean equals(Object obj) {
        MyDate md=(MyDate)obj;

        if((this.dd==md.dd)&&(this.mm==md.mm)&&(this.yy==md.yy))
            return true;
        else
            return false;

    }

    @Override
    public int hashCode() {
        return (this.dd+this.mm+this.yy);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "dd=" + dd +
                ", mm=" + mm +
                ", yy=" + yy +
                '}';
    }
}
