package com.company;

import java.util.Scanner;

//Write a Java method to find the smallest number among three numbers
public class Exercises1 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number\n");
        int num1 = scan.nextInt();
        System.out.print("Enter the second number\n");
        int num2 = scan.nextInt();
        System.out.print("Enter the Third number\n");
        int num3 = scan.nextInt();

        smallestNumber(num1, num2, num3);
    }

    static void smallestNumber(int num1, int num2, int num3) {//method definition
        if (num1 <= num2 && num1 <= num3) {
            System.out.println(num1 + " is the smallest number");

        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println(num2 + " is the smallest number");

        } else {
            System.out.println(num3 + " is the smallest number");

        }

    }
}
