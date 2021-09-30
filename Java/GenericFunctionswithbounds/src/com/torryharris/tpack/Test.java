package com.torryharris.tpack;

import java.util.List;

public class Test {
    public static Number sumOfList(List<? extends Number> list){
        double s=0.0;
        for(Number n:list)
            s+=n.doubleValue();
        return s;
    }

    public static Number sumOfList1(List<? super Double> list){
        double s=0.0;
        for(Object n:list)
            s+=((Number)n).doubleValue();
        return s;
    }
}
