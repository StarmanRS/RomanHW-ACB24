package ua.artcode.week1homework;

/**
 * Created by Lucas_Starman on 17.05.2017.
 */

/*
Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.

fix23([1, 2, 3]) → [1, 2, 0]
fix23([2, 3, 5]) → [2, 0, 5]
fix23([1, 2, 1]) → [1, 2, 1]
*/
public class Array_06_fix23 {
    public static void main(String[] args) {

        int[] arr = {2, 2, 3};
        int i;

        //in this conditions array has to have at least 3 elements..
        for (i = 0; i < arr.length - 1; i++) {

            if (arr[i] == 2 && arr[i + 1] == 3) {

                arr[i + 1] = 0;
                System.out.println("arr " + (i + 1) + " is now " + arr[i + 1]);
            }
        }

        i = 0;
        while (i < arr.length) {

            System.out.print(arr[i] + " ");
            i++;
        }

    }
}

