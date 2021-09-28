package com.torryharris.mainpack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<String> al=new ArrayList<String>();
        al.add("good");
        al.add("morning");
        al.add("good");
        al.add("happy coding");
        System.out.println(al);
        al.remove(1);

        for(String s:al)
            System.out.print(s+"  ");

        System.out.println();
        Iterator<String> it=al.iterator();
        while(it.hasNext())
            System.out.print(it.next().toUpperCase()+"    ");
        ArrayList<Integer> al2=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            int e=sc.nextInt();
            al2.add(e);
        }

        int sum=0;
        Iterator<Integer> it1=al2.iterator();
        while(it1.hasNext())
            sum+=it1.next();
        System.out.println("Sum of elements are: "+sum);

    }
}
