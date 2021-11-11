package com.company;

import java.util.Scanner;

public class Exercises3 {
//Write a Java method to display the middle character of a string Note : a ) If the length of the string is odd there will be two middle b ) If the length of the string is even there will be one middle Find biggest element of an array and print it in the console
    public static void main(String[] args) {

                Scanner in = new Scanner(System.in);
                System.out.print("Input a string: ");
                String str = in.nextLine();
                System.out.print("The middle character in the string: " + middle(str)+"\n");
            }
            public static String middle(String str)
            {
                int position;
                int length;
                if (str.length() % 2 == 0)
                {
                    position = str.length() / 2 - 1;
                    length = 2;
                }
                else
                {
                    position = str.length() / 2;
                    length = 1;
                }
                return str.substring(position, position + length);
            }
        }
