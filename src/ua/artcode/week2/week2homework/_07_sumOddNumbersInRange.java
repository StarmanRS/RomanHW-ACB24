package ua.artcode.week2.week2homework;

import java.util.Scanner;

/**
 * Created by Lucas_Starman on 22.05.2017.
 */

/*7)Необходимо суммировать все нечётные целые числа в диапазоне, который введёт пользователь с клавиатуры.*/

public class _07_sumOddNumbersInRange {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please input start of range");
        int startNum = scan.nextInt();

        System.out.println("Please input end of range");
        int endNum = scan.nextInt();

        int counter = 0;

        /* //v1 check each element of range, wastes time for each check if range is too long

        for (int i = startNum; i <= endNum ; i++) {
            if (i % 2 != 0) {
                counter += i;
            }
        }

        */

        //v2 check range length, check fist and last, just sum up with step 2

        if ((endNum - startNum) == 1) {

            if (startNum % 2 == 0) {
                counter = endNum;
            } else {
                counter = startNum;
            }

        } else if ((endNum - startNum) > 1) {

            int sumLoopStart = startNum;
            int sumLoopEnd = endNum;

            if (startNum % 2 == 0) {
                sumLoopStart = startNum + 1;
            }

            if (endNum % 2 == 0) {
                sumLoopEnd = endNum - 1;
            }

            for (int i = sumLoopStart; i <= sumLoopEnd; i += 2) {
                counter += i;
            }

        }

        System.out.println("Sum of all odd numbers in range is " + counter);

    }

}
