package ua.artcode.week1homework;

/**
 * Created by Lucas_Starman on 17.05.2017.
 */

/*
We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.

unlucky1([1, 3, 4, 5]) → true
unlucky1([2, 1, 3, 4, 5]) → true
unlucky1([1, 1, 1]) → false
*/

public class Array_09_unlucky1 {
    public static void main(String[] args) {

        int[] arr = {2, 1, 3, 0, 1, 3, 1};
        boolean marker = false;

        if (arr[0] == 1 && arr[1] == 3 || arr[1] == 1 && arr[2] == 3 || arr[arr.length - 2] == 1 && arr[arr.length] == 3) {
            marker = true;
            System.out.println(marker + ", unlucky 1 is present");
        }
    }

}

