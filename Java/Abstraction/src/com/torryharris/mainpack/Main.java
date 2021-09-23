package com.torryharris.mainpack;

import com.torryharris.emppack.Employee;
import com.torryharris.emppack.Manager;
import com.torryharris.emppack.Programmer;
import com.torryharris.pack1.ConcreteClass;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Manager m1=new Manager(209,"Rama",51000,"HR",20);
        System.out.println(m1.getDetails());

        Employee[] emp=new Employee[3];
        emp[0]=new Programmer(521,"Krishna",21000,25,"C, Java");
        emp[1]=new Manager(190,"Suresh",21000,"HR",10);
        emp[2]=new Programmer(200,"Rajkumar",45000,18,"C, Java");

        for(Employee e:emp){
            System.out.println(e.getDetails());
        }

        ConcreteClass c=new ConcreteClass();
        c.method4();
        System.out.println(c.method2());
        c.method1();

    }
}
