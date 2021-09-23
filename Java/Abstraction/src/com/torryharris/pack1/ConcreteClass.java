package com.torryharris.pack1;

public class ConcreteClass implements Interface1,Interface2{

    @Override
    public void method1() {
        System.out.println(Interface1.b);
    }

    @Override
    public int method2() {
        System.out.println(Interface2.a+1);
        return 202;
    }

    @Override
    public double method7() {
        return 6060;
    }

    @Override
    public void method4() {
        System.out.println(Interface2.a);
    }
}
