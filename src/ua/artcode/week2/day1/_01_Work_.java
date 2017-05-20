package ua.artcode.week2.day1;

import java.util.Scanner;

/**
 * Created by Lucas_Starman on 20.05.2017.
 */
public class _01_Work_ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input array size");

        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter value #" + (i + 1));
            numbers[i] = scanner.nextInt();

            numbers[i] = numbers[i] > 0 ? (int) Math.pow(numbers[i], 3) : 0;
        }

    }
}
