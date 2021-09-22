package com.torryharris.playerpack;

import java.util.Random;

public class Dice {
    private int fvalue;

    public int roll(){
        Random rand=new Random();
        fvalue=((int)rand.nextInt(5)+1);
        return fvalue;
    }

    public int getFvalue() {
        return fvalue;
    }
}
