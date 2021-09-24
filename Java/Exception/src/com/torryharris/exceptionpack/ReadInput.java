package com.torryharris.exceptionpack;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadInput {

    public static void readInp(){
        InputStreamReader isr=null;
        BufferedReader br=null;

        String s1,s2;

        isr=new InputStreamReader(System.in);
        br=new BufferedReader(isr);

        System.out.println("Enter two numbers:");
        //try without auto close option or manual close
        try {
            s1=br.readLine();
            s2=br.readLine();
            int res=Integer.parseInt(s1)/Integer.parseInt(s2);
            System.out.println(res);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                isr.close();
                br.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }

    //try with auto close option
    public static void readInp1(){

        System.out.println("Enter two numbers:");

        try(InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);){
            String s1=br.readLine();
            String s2=br.readLine();
            int res=Integer.parseInt(s1)/Integer.parseInt(s2);
            System.out.println(res);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readInp2() throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter two numbers");
        String s1=br.readLine();
        String s2=br.readLine();
        int res=Integer.parseInt(s1)/Integer.parseInt(s2);
        System.out.println(res);
    }

    public static String readInp3() throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter two numbers");
        String s1=br.readLine();
        String s2=br.readLine();
        int res=Integer.parseInt(s1)/Integer.parseInt(s2);
        return("Result: "+res);
    }

    public static String readInp4(){
        try(InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);){
            System.out.println("Enter two strings:");
            String s1=br.readLine();
            String s2=br.readLine();
            return s1+s2;
        } catch (IOException e) {
            return ("Exception catched is: "+e);
        }
    }

}
