package ua.artcode.week1homework;

/**
 * Created by Lucas_Starman on 17.05.2017.
 */

/* Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.

        firstLast6([1, 2, 6]) → true
        firstLast6([6, 1, 2, 3]) → true
        firstLast6([13, 6, 1, 2, 3]) → false

        */
import ua.artcode.rsClassesAtArtCode.MethodsContainer;

public class Array_01_firstLast6 {
    public static void main(String[] args) {

        int[] arr = new int[3];

        for (int i = 0; i<3; i++) {
            arr[i] = MethodsContainer.inputValueFromConsoleInt("Please input " + i + " element of array:" );
        }

        if (arr[0] == 6 || arr[arr.length - 1] == 6) {
            System.out.println("Result is: " + true);
        }

    }
}
