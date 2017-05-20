package ua.artcode.week1.week1homework;

/**
 * Created by Lucas_Starman on 17.05.2017.
 */

/*
Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array. The array length will be at least 3.

midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]
*/

public class Array_08_midThree {
    public static void main(String[] args) {

        int[] nums = {4, 5, -4, 0, 8, -1, 7};
        int[] arr2 = new int[3];

        if (nums.length > 2) {
            arr2[0] = nums[(nums.length - 1) / 2 - 1];
            arr2[1] = nums[(nums.length - 1) / 2];
            arr2[2] = nums[(nums.length - 1) / 2 + 1];
        }

        System.out.println("Result array: ");

        int i = 0;
        do {
            System.out.print(arr2[i] + " ");
            i++;
        } while (i < arr2.length);
    }
}

