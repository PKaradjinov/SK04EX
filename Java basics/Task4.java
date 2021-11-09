package com.company;

//Find biggest element of an array and print it in the console
public class Task4 {
    public static void main(String[] args) {

        int[] arr = new int[]{23, 6, 7, 100, 88};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("The biggest element of an array is: " + max);
    }
}

