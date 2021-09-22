package com.torryharris.mainpack;

public class Person {
    private static int count;
    private int id;
    private String name;
    public void fun(int id,String name){
        this.id=id;
        this.name=name;
        ++count;

        System.out.println(toString()+"Count: "+count);
    }
    public static void fun1(){
        count=100;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
