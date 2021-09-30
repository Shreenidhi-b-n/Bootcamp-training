package com.torryharris.gpack;

public class Test <T,U>{
    private T ob1;
    private U ob2;

    public Test(T ob1, U ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    public static <T> void printArray(T[] t){
        for(T i:t)
            System.out.print(i+" ");
    }

    @Override
    public String toString() {
        return "Test{" +
                "ob1=" + ob1 +
                ", ob2=" + ob2 +
                '}';
    }

    public T getOb1() {
        return ob1;
    }

    public U getOb2() {
        return ob2;
    }

}
