package ua.artcode.week1homework;

/**
 * Created by Lucas_Starman on 17.05.2017.
 */

/*
Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.

makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
*/

public class Array_07_makeMiddle {
    public static void main(String[] args) {

        int[] arr1 = {4, 5, -4, 0, 8, -1};
        int[] arr2 = new int[2];

        arr2[0] = arr1[arr1.length / 2 - 1];
        arr2[1] = arr1[arr1.length / 2];

        System.out.println("Result array: ");

        int i = 0;
        do {
            System.out.print(arr2[i] + " ");
            i++;
        } while (i < arr2.length);
    }
}

