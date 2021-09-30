package com.torryharris.mainpack;

import com.torryharris.gpack.Test;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Test<String,String> t=new Test<String,String>("good","morning");
        System.out.println(t);

        Integer[] arr={1,2,3,4,5};
        Test.printArray(arr);


    }
}
