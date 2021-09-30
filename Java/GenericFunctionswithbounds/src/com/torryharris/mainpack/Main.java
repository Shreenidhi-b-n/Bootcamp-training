package com.torryharris.mainpack;

import com.torryharris.tpack.Test;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Double> al=new ArrayList<Double>();
        al.add(23.4455);
        al.add(244.4455);
        al.add(3.4455);
        al.add(673.4455);
        System.out.println(Test.sumOfList1(al));

        ArrayList<Number> al1=new ArrayList<Number>();
        al1.add(100);
        al1.add(200);
        System.out.println(Test.sumOfList1(al1));



    }
}
