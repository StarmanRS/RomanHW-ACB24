package ua.artcode.week2.week2homework;

/**
 * Created by Lucas_Starman on 22.05.2017.
 */

/*2)Найдите произведение цифр числа. (57 -> 5*7 = 35)*/

public class _02_digitsMultiplication {
    public static void main(String[] args) {

        //current realization is for 2-digits numbers only

        int num = (int) (Math.random()*90 + 10);
        System.out.println("Generated number is " + num);

        System.out.println("Result of multiplying num's digits is " + ((num / 10) * (num % 10)));

    }
}
