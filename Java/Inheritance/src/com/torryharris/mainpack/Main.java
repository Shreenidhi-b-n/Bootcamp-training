package com.torryharris.mainpack;

import com.torryharris.emppack.Employee;
import com.torryharris.emppack.Manager;
import com.torryharris.emppack.Programmer;
import com.torryharris.taxpack.Tax;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Employee emp1=new Employee(100,"Shree",25000);
        System.out.println(emp1.getDetails());

        Manager m=new Manager(104,"Balkrishna",62000,"HR",20);
        System.out.println(m.getDetails());

        Programmer p=new Programmer(200,"Rajkumar",45000,18,"C, Java");
        System.out.println(p.getDetails());

        //Upcasting
        Employee emp2=new Manager(190,"Suresh",21000,"HR",10);
        System.out.println(emp2.getDetails());

        //Downcasting
        Manager m1=(Manager)emp2;
        System.out.println(m1.getDetails());

        Employee[] emp=new Employee[3];
        emp[0]=new Employee(100,"Shree",25000);
        emp[1]=new Manager(190,"Suresh",21000,"HR",10);
        emp[2]=new Programmer(200,"Rajkumar",45000,18,"C, Java");

        for(Employee e:emp){
            System.out.println(e.getDetails()+" Tax paid: "+ Tax.taxCal(e));
        }

    }
}
