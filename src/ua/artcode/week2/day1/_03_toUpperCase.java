package ua.artcode.week2.day1;

import ua.artcode.MethodsContainer;
import ua.artcode.utils;

/**
 * Created by Lucas_Starman on 20.05.2017.
 */

//input size
//create string array
//loop for arr creation through scanner with message sout
//if charAt(0) == a, o, u .... array[i].word.toUpperCase()


public class _03_toUpperCase {
    public static void main(String[] args) {

        System.out.println("Please input size of array");
        int arrSize = MethodsContainer.inputValueFromConsoleInt("Input array size");

        String[] arr = new String[arrSize];

        for (int i = 0; i < arrSize; i++) {

            arr[i]= MethodsContainer.inputValueFromConsole("Input array element");

            if (symbolComparison(arr[i].charAt(0))) {
                arr[i] = arr[i].toUpperCase();
            }

         }

        utils.printArray(arr);

    }

    public static boolean symbolComparison(char letter) {
        if (letter == 'o' || letter == 'i' || letter == 'u' || letter == 'e' ) {
            return true;
        } else {
            return false;
        }
    }
}
