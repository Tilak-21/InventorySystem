//Question: Write a program that takes in 5 numbers, stores them and outputs the largest, smallest and average of the numbers entered.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        int num;
        int avg = 0, sum = 0, SIZE = 5, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        System.out.println("Enter 5 numbers: ");


        for(int i = 0; i < SIZE; i++) {
            num = numbers.nextInt();
            sum += num;


            if(num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }

        }

        avg = sum / SIZE;

        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
        System.out.println("Avg: " + avg);


    }
}