package com.company;

public class BiggestNumberLoops {
    public static void main(String[] args) {
        int[] array = {1, 0, 6, 8, -4, 10};
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }
}