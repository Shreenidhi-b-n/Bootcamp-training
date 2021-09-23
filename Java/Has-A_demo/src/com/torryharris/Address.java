package com.torryharris;

public class Address {
    private int doorNo;
    private String street;
    private String city;
    private String state;
    private int pin;

    public Address(int doorNo,String street,String city,String state,int pin) {
    this.doorNo=doorNo;
    this.street=street;
    this.city=city;
    this.state=state;
    this.pin=pin;
    }

    @Override
    public String toString() {
        return "Address{" +
                "doorNo=" + doorNo +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pin=" + pin +
                '}';
    }
}
