package com.torryharris.mainpack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a=100;
        //Boxing
        Integer i1=new Integer(a);
        System.out.println(i1);

        //Unboxing
        int b=i1.intValue();
        System.out.println(b);

        String s="180";
        int c=Integer.parseInt(s);
        int d=Integer.valueOf(s).intValue();

    }
}
