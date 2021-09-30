package com.torryharris.mainpack;

import com.torryharris.ipack.Item;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue<Item> q=new PriorityQueue<Item>();
        q.add(new Item(302,"abhi"));
        q.add(new Item(301,"vikas"));
        q.add(new Item(306,"sumanth"));
        q.add(new Item(307,"prathap"));

        for(Item i:q)
            System.out.println(i);


    }
}
