package com;

public class FibonacciNumbers {
    public static void generateFib(int n){
        //initialising 1st two numbers in the series
        int num1 = 0; int num2 = 1;
        int count =0;
        while (count < n){
            System.out.print(num1 + " ");
            int num3 = num1+num2; // caluculating the next term
            //Swapping 1st and 2nd number with 2nd and next number respectively
            num1 = num2;
            num2 = num3;
            count++;
        }
    }


}
