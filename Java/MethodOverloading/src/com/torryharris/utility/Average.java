package com.torryharris.utility;

public class Average {

    public int calc_avg(int ...numbers){
        int sum=0;
        for(int n:numbers)
            sum+=n;

        return(sum/numbers.length);
    }

    public int calc_avg(double a,int ...numbers){
        int sum=(int)a;
        for(int n:numbers)
            sum+=n;

        return(sum/(numbers.length+1));
    }
}
