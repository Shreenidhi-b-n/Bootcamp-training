package com.torryharris.mainpack;

import com.torryharris.custpack.Customer;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Map<Integer,String> m=new HashMap<Integer,String>();
        m.put(2,"mother");
        m.put(4,"Father");
        m.put(6,null);
        m.put(null,null);
        System.out.println(m);

        Map<Integer,String> lm=new LinkedHashMap<Integer,String>();
        lm.put(1,"mother");
        lm.put(2,"Father");
        lm.put(3,null);
        lm.put(null,null);
        System.out.println(lm);

        Map<Integer,String> tm=new TreeMap<Integer,String>();
        tm.put(1,"mother");
        tm.put(2,"Father");
        tm.put(3,null);
        System.out.println(tm);

        Map<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(1,"mother");
        ht.put(2,"Father");
        ht.put(3,"Bro");
        System.out.println(ht);

        Map<String,Integer> hm=new HashMap<String,Integer>();
        hm.put("laptop",50000);
        hm.put("table",32000);
        hm.put("chair",12530);
        hm.put("mobile",18900);*/

        HashMap<Customer,Integer> cmap=new HashMap<Customer, Integer>();
        cmap.put(new Customer(101,"Shreenidhi"),25000);
        cmap.put(new Customer(102,"Sanjana"),24000);

        for(Customer c:cmap.keySet())
            System.out.println(c+"  "+cmap.get(c));


    }
}
