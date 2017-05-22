package ua.artcode.week2.day2;

import ua.artcode.utils;

/**
 * Created by Lucas_Starman on 21.05.2017.
 */
public class day2classWork_02_nagatives_byMath_abs {
    public static void main(String[] args) {

        int[] array = utils.generateArray(10, -78, -5);

        System.out.println("Generated array");
        ua.artcode.utils.printArray(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = Math.abs(array[i]);
            }
        }

        System.out.println("Result array");
        ua.artcode.utils.printArray(array);

    }
}
