package com.torryharris.mainpack;

import java.util.Enumeration;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vector<String> v=new Vector<String>();
        v.add("Mother");
        v.add("Father");
        v.add("Suma Nanjundaiah");
        System.out.println(v);

        Enumeration<String> e=v.elements();

        while(e.hasMoreElements())
            System.out.println(e.nextElement());



    }
}
