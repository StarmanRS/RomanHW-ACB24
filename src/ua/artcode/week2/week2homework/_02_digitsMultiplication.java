package ua.artcode.week2.week2homework;

import java.util.Scanner;

/**
 * Created by Lucas_Starman on 22.05.2017.
 */

/*2)Найдите произведение цифр числа. (57 -> 5*7 = 35)*/

public class _02_digitsMultiplication {
    public static void main(String[] args) {

        //current realization is for 2-digits numbers only

        Scanner scan = new Scanner(System.in);

        System.out.println("Please, input any number");

        long num = scan.nextLong();        //receiving number from console
        String snum = String.valueOf(num);  //casting number to string
        String[] sNumArr = snum.split(""); //split casted to string number into string array

        long multiResult = 1;

        for (int i = 0; i < snum.length(); i++) {
            multiResult = multiResult * Integer.valueOf(sNumArr[i]); //check each element casted to int from string
        }

        System.out.println("Result of multiplying num's digits is " + multiResult);

        //коли ввожу число з 10 цифр і більше, чомусь викидає ексепшен,
        // не розумію чому, вроді воно навіть за межі інта не вилазить
    }
}
