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

        if ((endNum - startNum) == 1) { // check if range consists of two numbers, assigning results and exit if true

            if (startNum % 2 == 0) {
                counter = endNum;
            } else {
                counter = startNum;
            }

        } else if ((endNum - startNum) > 1) { // check if range consists of more than 2 numbers

            int sumLoopStart = startNum; // start of sumLoop iteration if startNum is odd
            int sumLoopEnd = endNum; // end of sumLoop iteration if startNum is odd

            if (startNum % 2 == 0) { // shift (+1) of Start of sumLoop if startNum is even
                sumLoopStart = startNum + 1;
            }

            if (endNum % 2 == 0) {// shift (-1) of End of sumLoop if endNum is even
                sumLoopEnd = endNum - 1;
            }

            for (int i = sumLoopStart; i <= sumLoopEnd; i += 2) { // sum of range with step +2
                counter += i;
            }

        }

        System.out.println("Sum of all odd numbers in range is " + counter);

    }

}
