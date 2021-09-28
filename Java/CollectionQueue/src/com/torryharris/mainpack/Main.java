package com.torryharris.mainpack;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Queue<Integer> q=new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
        System.out.println(q.peek());

    }
}
