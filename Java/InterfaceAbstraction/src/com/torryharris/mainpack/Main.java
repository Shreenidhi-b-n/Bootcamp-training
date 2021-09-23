package com.torryharris.mainpack;

import com.torryharris.vpack.Car;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car c1=new Car(2021,"A",50,100,"Diesel");
        System.out.println(c1.start());
        int increvalue=c1.increSpeed(50);

        if(increvalue==-1){
            System.out.println("Alert");
        }
        else
            System.out.println("Enjoy your drive");
        System.out.println(c1.stop());
    }
}
