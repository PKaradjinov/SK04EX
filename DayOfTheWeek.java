package com.company;
import java.util.Scanner;
public class DayOfTheWeek {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Въведи номер: ");
            int weekday = scanner.nextInt();

            if(weekday == 1) {

                System.out.println("Понеделник");

            } else if(weekday == 2) {

                System.out.println("Вторник");

            } else if(weekday == 3) {

                System.out.println("Сряда");

            } else if(weekday == 4) {

                System.out.println("Четвъртък");

            } else if(weekday == 5) {

                System.out.println("Петък");

            } else if(weekday == 6) {

                System.out.println("Събота");

            } else if(weekday == 7) {

                System.out.println("Неделя");

            } else {

                System.out.println("Моля въведете число между 1-7.");
            }
        }
    }

