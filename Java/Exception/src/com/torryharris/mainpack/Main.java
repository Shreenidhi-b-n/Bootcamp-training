package com.torryharris.mainpack;

import com.torryharris.exceptionpack.ReadInput;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int res=0;
        try{
            int n1=Integer.parseInt(args[0]); //cmd line arguments.
            int n2=Integer.parseInt(args[1]);
            res=n1/n2;
        }
        catch(ArithmeticException e){
            System.out.println("Denominator is zero "+e.getMessage());
        }
        catch(NumberFormatException e){
            System.out.println("You have given other than number "+e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You have not gave input "+e.getMessage());
        }
        finally {
            System.out.println(res);
        }

        ReadInput.readInp();
        ReadInput.readInp1();
        try {
            ReadInput.readInp2();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            String s=ReadInput.readInp3();
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(ReadInput.readInp4());

    }
}
