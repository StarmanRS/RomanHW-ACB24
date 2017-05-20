package ua.artcode.week1.week1homework;

/**
 * Created by Lucas_Starman on 17.05.2017.
 */

/*
Given an int array length 2, return true if it does not contain a 2 or 3.

no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
*/

public class Array_05_no23 {
    public static void main(String[] args) {

        int[] arr = {2, 9};
        boolean marker = true;

        for (int i = 0; i < arr.length; i++ ) {
            if (arr[i] == 2 || arr [i] == 3) {
                marker = false;
            }
        }

        System.out.println("Result is: " + marker);
    }
}

