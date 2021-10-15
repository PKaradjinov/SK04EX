package com.company;

import java.util.Scanner;

public class Exercises5 {

        public static void main(String[] args)
        {
            Scanner console = new Scanner(System.in);
            int num;

            System.out.print("Enter a number: ");
            num = console.nextInt();

            if(isEven(num))
            {
                System.out.println("Number is even");
            }
            else
            {
                System.out.println("Number is odd");
            }
        }

        public static boolean isEven(int number)
        {
            if(number % 2 == 0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }


