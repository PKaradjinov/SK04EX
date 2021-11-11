package com.company;

import java.util.Scanner;
//Write a program to print the days of the week based on the user digit 1 7 input. 
//The message should be “The [user input digit] standard the day of the week is [the day of the week]” Hint: Use switch case.

public class DayOfTheWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int weekday = scanner.nextInt();

        switch (weekday) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Please enter number from 1 to 7!");
                break;
        }
    }
}

