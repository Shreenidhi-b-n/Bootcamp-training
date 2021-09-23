package com.torryharris.bankpack;

import com.torryharris.accountpack.Account;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account ac1=new Account("Savings",12000);
        System.out.println(ac1);
        ac1.deposit(3000);
        System.out.println("Your balance is "+ac1.getBalance());
        ac1.withdraw(6000);
        System.out.println("Your balance is "+ac1.getBalance()+"\n");

        Account ac2=new Account("Fixed deposit",52000);
        System.out.println(ac2);
        ac2.deposit(6000);
        System.out.println("Your balance is "+ac2.getBalance());
        ac2.withdraw(7000);
        System.out.println("Your balance is "+ac2.getBalance());

    }
}