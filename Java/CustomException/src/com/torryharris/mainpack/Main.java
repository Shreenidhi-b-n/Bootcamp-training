package com.torryharris.mainpack;

import com.torryharris.cpack.Citizen;
import com.torryharris.emppack.Employee;
import com.torryharris.exceptionpack.InsufficientLeaveException;
import com.torryharris.exceptionpack.InvalidAgeException;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* Employee emp=new Employee(200,18);
        System.out.println(emp);

        try {
            System.out.println(emp.applyLeave(24));
        } catch (InsufficientLeaveException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(emp);
*/
        Citizen c=new Citizen(2021,"Vikas",23);
        System.out.println(c);

        try {
            System.out.println(c.getLicense());
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

    }
}
