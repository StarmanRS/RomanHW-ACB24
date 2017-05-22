package ua.artcode.week2.day2;

import ua.artcode.utils;

import java.util.Scanner;

/**
 * Created by Lucas_Starman on 21.05.2017.
 */
public class day2classWork_05_strings_test {
    public static void main(String[] args) {

    String testString1 = "allo";
    String testString2 = "Allo";

    boolean res = testString1.equalsIgnoreCase(testString2);

        System.out.println(res);

        System.out.println (testString1.replace("l", "m"));

    }
}
