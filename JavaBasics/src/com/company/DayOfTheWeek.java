package com.company;

import java.util.Scanner;
//Write a program to print the days of the week based on the user digit 1 7 input. 
//The message should be “The [user input digit] st/nd/rd/th the day of the week is [the day of the week]” Hint: Use switch case.

public class DayOfTheWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int weekday = scanner.nextInt();

        switch (weekday) {
            case 1:
                System.out.println("The "+weekday+ "st the day of the week is Monday");
                break;
            case 2:
                System.out.println("The "+weekday+ "nd the day of the week is Tuesday");
                break;
            case 3:
                System.out.println("The "+weekday+ "rd the day of the week is Wednesday");
                break;
            case 4:
                System.out.println("The "+weekday+ "th the day of the week is Thursday");
                break;
            case 5:
                System.out.println("The "+weekday+ "th the day of the week is Friday");
                break;
            case 6:
                System.out.println("The "+weekday+ "th the day of the week is Saturday");
                break;
            case 7:
                System.out.println("The "+weekday+ "nd the day of the week is Sunday");
                break;
            default:
                System.out.println("Please enter number from 1 to 7!");
                break;
        }
    }
}

