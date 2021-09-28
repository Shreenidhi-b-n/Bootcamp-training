package com.torryharris.mainpack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Stack<Integer> s=new Stack<Integer>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        //System.out.println(s.pop());
        s.add(60);
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.search(840));
        System.out.println(s.contains(20));
    }
}
