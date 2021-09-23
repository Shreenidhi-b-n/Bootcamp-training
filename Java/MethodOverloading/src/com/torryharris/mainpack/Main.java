package com.torryharris.mainpack;

import com.torryharris.utility.Average;
import com.torryharris.utility.Summation;
import com.torryharris.utility.Tax;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       /* Summation s=new Summation();
        System.out.println(s.add(70,06));
        System.out.println(s.add("Shreenidhi","BN"));
        System.out.println(s.add(10,78.4f,81.3333));

        Tax t=new Tax();
        System.out.println("\n"+t.tax_cal(2000,'s'));


        Scanner sc=new Scanner(System.in);
        Average a=new Average();
        System.out.println(a.calc_avg(60.6760,10,20,30));
        System.out.println(a.calc_avg(10,20,30));
        */
        Person p=new Person();
        p.fun(101,"Shree");
        p.fun(102,"nidhi");
        p.fun(103,"BN");
        //System.out.println(p);
        System.out.println(Person.getCount());
        Person.fun1();
        System.out.println(Person.getCount());

    }
}
