package com.torryharris.mainpack;

import sun.reflect.generics.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        //Set collection
        Set s1=new HashSet();
        s1.add("hello");
        s1.add(24);
        s1.add('s');
        s1.add(3262.565);
        s1.add(23.56f);
        System.out.println(s1);


        Set<String> s2=new HashSet<String>();
        s2.add("Good boy");
        s2.add("good evening");
        s2.add("good morning");
        s2.add("good morning");
        System.out.println(s2);

        Set<String> s3=new LinkedHashSet<String>();
        s3.add("hello");
        s3.add("good news");
        s3.add("happy journey");
        System.out.println(s3);

        Set<String> s4=new TreeSet<String>();
        s4.add("Sanjana");
        s4.add("Shreenidhi");
        s4.add("vikas");
        s4.add("prathap");
        s4.add("Abhi");
        s4.add("Manoj");
        System.out.println(s4);


    }
}
