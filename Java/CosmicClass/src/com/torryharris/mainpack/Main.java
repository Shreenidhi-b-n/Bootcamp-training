package com.torryharris.mainpack;

import com.torryharris.mydatepack.MyDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyDate md1=new MyDate(27,9,2021);
        MyDate md2=new MyDate(27,9,2021);
        MyDate md3=md1;

        System.out.println(md1.equals(md3));
        System.out.println(md1==md2);
        System.out.println("hashcode: "+md1.hashCode());
        System.out.println(md1==md2);

    }
}
