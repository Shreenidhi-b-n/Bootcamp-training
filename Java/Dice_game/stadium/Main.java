package com.torryharris.stadium;
import com.torryharris.playerpack.Player;

public class Main {

    public static void main(String[] args) {
        Player p1=new Player();
        int p1score=p1.play();
        int p1d1Score=p1.getD1Score();
        int p1d2Score=p1.getD2Score();
        System.out.println("P1 scored:"+p1score);
        System.out.println("P1 d1: "+p1d1Score+"   "+"p1 d2: "+p1d2Score);

        Player p2=new Player();
        int p2score=p2.play();
        int p2d1Score=p2.getD1Score();
        int p2d2Score=p2.getD2Score();
        System.out.println("P2 scored:"+p2score);
        System.out.println("P2 d1: "+p2d1Score+"   "+"p2 d2: "+p2d2Score);

        if(p1score>p2score)
            System.out.println("P1 won the game!!!");
        else
        if(p1score==p2score)
            System.out.println("Game Draw!!!");
        else
            System.out.println("P2 won the game!!!");

    }
}
