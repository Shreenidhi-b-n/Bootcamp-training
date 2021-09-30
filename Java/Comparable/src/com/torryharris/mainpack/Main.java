package com.torryharris.mainpack;

import com.torryharris.spack.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Shreenidhi BN",83));
        al.add(new Student(102,"Sanjana S Rao",98));
        al.add(new Student(103,"Abhi",70));

        System.out.println("Before sorting");
        for(Student s:al)
            System.out.println(s);

        Collections.sort(al);
        System.out.println("After sorting");
        for(Student s:al)
            System.out.println(s);



    }
}
