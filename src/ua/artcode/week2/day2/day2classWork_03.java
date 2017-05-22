package ua.artcode.week2.day2;

import ua.artcode.utils;

/**
 * Created by Lucas_Starman on 21.05.2017.
 */
public class day2classWork_03 {
    public static void main(String[] args) {

        int[] array = utils.generateArray(10, -78, 30);

        System.out.println("Generated array");
        utils.printArray(array);

        int minAbs = Math.abs(array[0]);

        for (int i = 1; i < array.length; i++) {
            if (Math.abs(array[i]) < minAbs) {
                minAbs = Math.abs(array[i]);
            }
        }

        System.out.println("Minimal absoluted element is " + minAbs);


    }
}
