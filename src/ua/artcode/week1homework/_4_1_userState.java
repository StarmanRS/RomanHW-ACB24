package ua.artcode.week1homework;

/**
 * Created by Lucas_Starman on 14.05.2017.
 */

import java.util.Scanner;

//4.1. Пользователь вводит параметр с консоли (текущий час от 0 до 24)
//Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")

public class _4_1_userState {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, input number from 0 to 24");
        int hourNum = sc.nextInt();

        if (hourNum > 9 && hourNum <= 18) {
            System.out.println("I'm at work");
        } else {
            System.out.println("I'm relaxing");
        }
    }
}
