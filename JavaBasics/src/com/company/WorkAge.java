package com.company;
import java.util.Scanner;
public class WorkAge {
//Write Java program to allow the user to input his/her age.
// Then the program will show if the person is eligible to work.
// A person who is eligible to work must be older than or equal to 16 years old
// Example: Enter you age: 16 You are eligible to ork.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведи години:");
        int age = scanner.nextInt();
            if( age >= 16) {
                System.out.println("Годен за работа.");

    } else if(age > 1 && age <= 16) {

        System.out.println("Негоден за работа.");


    } else
        System.out.println("Моля въведете число между 1-16.");
    }
}
