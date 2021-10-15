package com.company;

import java.util.Scanner;

public class BuildThreeAngles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Въведете ъгъл алфа в градуси");
        int alpha = sc.nextInt();
        System.out.println("Въведете ъгъл бета в градуси");
        int beta = sc.nextInt();
        System.out.println("Въведете ъгъл гама в градуси");
        int gama = sc.nextInt();


        int sum = alpha + beta + gama;

        if(sum != 180 || alpha <= 0 || beta <= 0 || gama <= 0 ){
            System.out.println("Не може да се създаде такъв триъгълник");
            System.exit(0);
        }
        if(alpha == 60 && beta == 60 && gama == 60){
            System.out.println("Триъгълника е равностранен");
            System.exit(0);
        }
        if(alpha == beta || alpha == gama || beta == gama){
            System.out.println("Триъгълника е равнобедрен");
            System.exit(0);
        }
        if(alpha == 90 || beta == 90 || gama == 90){
            System.out.println("Триъгълника е правоъгълен");
            System.exit(0);
        }
        if(alpha > 90 || beta > 90 || gama > 90) {
            System.out.println("Триъгълника е тъпоъгълен");
            System.exit(0);
        }

        if(alpha < 90 && beta < 90 && gama < 90){
            System.out.println("Триъгълника е остроъгълен");
            System.exit(0);
        }
        if(alpha != beta && alpha != gama && beta != gama){
            System.out.println("Триъгълника е разностранен");
            System.exit(0);
        }
    }
}