package com.company;


import java.util.Scanner;

public class Skillo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        try{
            String s = Integer.toString(n);
            System.out.println("Good job");
        } catch(Exception e){
            System.out.println("Wrong answer");
        }
    }
}