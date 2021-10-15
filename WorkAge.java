package com.company;
import java.util.Scanner;
public class WorkAge {

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


