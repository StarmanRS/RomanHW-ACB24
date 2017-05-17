package ua.artcode.week1homework;

/**
 * Created by Lucas_Starman on 17.05.2017.
 */

/*

Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
*/
public class Array_04_middleWay {
    public static void main(String[] args) {

        int[] arr1 = {4, 5, 9};
        int[] arr2 = {8, -5, 0};
        int[] arrMiddle = {arr1[1], arr2[1]};

        System.out.print(arrMiddle[0] + " " + arrMiddle[1]);

    }
}
