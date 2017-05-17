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

        int[] a = {4, 5, -4, 0, 8, -1};
        int[] b = new int[2];

        b[0] = a[a.length / 2 - 1];
        b[1] = a[a.length / 2];

        System.out.println("Result array: ");

        int i = 0;
        do {
            System.out.print(b[i] + " ");
            i++;
        } while (i < b.length);
    }
}

