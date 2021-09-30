package com.torryharris.mainpack;


import com.torryharris.comparatorpack.AgeComparator;
import com.torryharris.ppack.Person;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Person> al=new ArrayList<Person>();
        al.add(new Person(201,"Sridhara",25));
        al.add(new Person(202,"Prathap",22));
        al.add(new Person(203,"Bharath",23));

        System.out.println(al);
        Collections.sort(al,new AgeComparator());
        System.out.println(al);

    }
}
