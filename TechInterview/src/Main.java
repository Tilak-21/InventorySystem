//Question: Write a program that takes in 5 numbers, stores them and outputs the largest, smallest and average of the numbers entered.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int average;
        int count = 0, sum = 0, num, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        System.out.println("Please enter 5 numbers:");


for(int i=0; i<5 ; i++)
        {
            num = scan.nextInt();
            sum += num;
            count++;

            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }

average = sum / 5;

        System.out.println("Your average is: " + average);
        System.out.println("Your maximum number is: " + max);
        System.out.println("Your minimum number is: " + min);
    }
}