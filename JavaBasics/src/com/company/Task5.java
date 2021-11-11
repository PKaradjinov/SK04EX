package com.company;

import java.util.Collections;
import java.util.LinkedList;

//Reverse the order of the elements in a LinkedList using algorithm
public class Task5 {

    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(new Integer(1));
        ll.add(new Integer(2));
        ll.add(new Integer(3));
        ll.add(new Integer(4));
        ll.add(new Integer(5));
        System.out.println("Before reversing: " + ll);
        Collections.reverse(ll);
        System.out.println("After reversing: " + ll);
    }
}
