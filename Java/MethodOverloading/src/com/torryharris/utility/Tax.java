package com.torryharris.utility;

public class Tax {

    public double tax_cal(long amt,char status){
        return(amt*0.1);
    }

    public double tax_cal(long amt){
        return((int)(amt*0.25));
    }
}
