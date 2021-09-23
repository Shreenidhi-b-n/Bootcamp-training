package com.torryharris.taxpack;

import com.torryharris.emppack.Employee;
import com.torryharris.emppack.Manager;
import com.torryharris.emppack.Programmer;

public class Tax {
    public static double taxCal(Employee emp){
        if(emp instanceof Manager)
            return(emp.getSal()*0.2);
        else
            if(emp instanceof Programmer)
                return(emp.getSal()*0.1);
            else
                return 0;

    }
}
