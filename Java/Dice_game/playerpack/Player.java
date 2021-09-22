package com.torryharris.playerpack;

public class Player {
    Dice d1;
    Dice d2;

    public Player() {
        this.d1 = new Dice();
        this.d2 = new Dice();
    }
    public int play(){
        return(d1.roll()+d2.roll());
    }
    public int getD1Score(){
        return(d1.getFvalue());
    }
    public int getD2Score(){
        return(d2.getFvalue());
    }

}
