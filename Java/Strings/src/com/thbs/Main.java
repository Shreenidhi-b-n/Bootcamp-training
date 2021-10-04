package com.thbs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s1="java pgm";
        String s2="java pgm";
        System.out.println(s1==s2);

        int i1=10;
        System.out.println(i1);
        String s3=String.valueOf(i1);
        System.out.println(s3);

        String s4="768799100";
        int i2=Integer.parseInt(s4);
        System.out.println(i2+1);

        String s5="Java is a high level object_oriented programming language.";
        String[] sarr=s5.split(" ");
        for(String s:sarr)
            System.out.println(s);

    }
}
