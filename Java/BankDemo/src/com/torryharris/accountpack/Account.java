package com.torryharris.accountpack;

import java.util.Random;

public class Account {
    protected int hero=76;
    private static long count;
    private final long accNo;
    private String accType;
    private double balance;

    static{
        count=0;
    }

    public static long getCount(){
        Random r=new Random();
        count=r.nextInt(1000)+2000;
        return count;
    }

    public Account(String accType, double balance) {
        this.accNo=getCount();
        this.accType = accType;
        this.balance = balance;
    }

    public void deposit(double amt){
        balance+=amt;
        System.out.println("!Amount "+amt+" Rs/- deposited successfully!");
    }

    public void withdraw(double amt){
        balance-=amt;
        System.out.println("Amount you withdrawn: "+amt+" Rs/-");
    }

    public double getBalance(){
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accNo=" + accNo +
                ", accType='" + accType + '\'' +
                ", balance=" + balance +
                '}';
    }
}
