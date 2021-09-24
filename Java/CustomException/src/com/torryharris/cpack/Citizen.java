package com.torryharris.cpack;

import com.torryharris.exceptionpack.InvalidAgeException;

public class Citizen {
    private long adhaarNo;
    private String name;
    private int age;

    public Citizen(long adhaarNo,String name,int age) {
        this.adhaarNo = adhaarNo;
        this.name = name;
        this.age = age;
    }

    public String getLicense() throws InvalidAgeException{
        if(age<18)
            throw new InvalidAgeException("License can't be issued for kids");
        else
            if((age<=75)&&(age>=18))
                return("License issued Successfully");
            else
                throw new InvalidAgeException("License can't be issued for seniors");

    }

    @Override
    public String toString() {
        return "Citizen{" +
                "adhaarNo=" + adhaarNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
