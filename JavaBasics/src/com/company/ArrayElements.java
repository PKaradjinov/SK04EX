package com.company;

//Write program to print sum of a given array elements

class Test {
    static int arr[] = {112, 31, 4, 55};

    static int sum() {
        int sum = 0; // initialize sum
        int i;

        for (i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum of given array is " + sum());
    }
}
