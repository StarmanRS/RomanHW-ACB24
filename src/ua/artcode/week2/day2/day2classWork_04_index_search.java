package ua.artcode.week2.day2;

import ua.artcode.utils;

import java.util.Scanner;

/**
 * Created by Lucas_Starman on 21.05.2017.
 */
public class day2classWork_04_index_search {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input array size");
        int size = scan.nextInt();

        int[] generatedArray = utils.generateArray(size, 0, 10);

        utils.printArray(generatedArray);

        int searchedIndex = -1;

        for (int i = 0; i < generatedArray.length; i++) {

            if (generatedArray[i] == 5) {
                searchedIndex = i;
                break;
            }

        }

        if (searchedIndex > 0) {
            System.out.println("Index of first 5 is " + searchedIndex);
        } else {
            System.out.println("The result is " + searchedIndex );
        }



    }
}
