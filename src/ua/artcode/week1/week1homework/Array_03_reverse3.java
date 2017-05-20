package ua.artcode.week1.week1homework;

/**
 * Created by Lucas_Starman on 17.05.2017.
 */

/*
Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
*/

public class Array_03_reverse3 {
    public static void main(String[] args) {

        int[] arr = {-8, 0, 89};
        int container;

        container = arr[arr.length - 1];
        arr[arr.length - 1] = arr[0];
        arr[0] = container;

        System.out.println("Result array is: ");
        for (int i=0; i<3; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
//it's not clear to me meaning of return in the task condition??

