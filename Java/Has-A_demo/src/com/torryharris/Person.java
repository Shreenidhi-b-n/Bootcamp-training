package com.torryharris;

public class Person {
    private int PersonId;
    private String PersonName;
    private Address addr;

    public Person(int PersonId,String PersonName,Address addr) {
        this.PersonId=PersonId;
        this.PersonName=PersonName;
        this.addr=addr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "PersonId=" + PersonId +
                ", PersonName='" + PersonName + '\'' +
                ", addr=" + addr +
                '}';
    }
}
