package ua.artcode.week2.day2;

import ua.artcode.utils;

import java.util.Scanner;

/**
 * Created by Lucas_Starman on 21.05.2017.
 */
public class day2classWork_01_min_max_inArray {
    public static void main(String[] args) {

//        int[] arr = ua.artcode.utils.generateArray(10, 3, 79);
//        ua.artcode.utils.printArray(arr);

        Scanner scan = new Scanner(System.in);

        System.out.println("Please input array size");
        int size = scan.nextInt();

        System.out.println("Please input begin number of range");
        int from = scan.nextInt();

        System.out.println("Please input end number of range");
        int to = scan.nextInt();

        int[] generatedArray = ua.artcode.utils.generateArray(size, from, to);

        utils.printArray(generatedArray);

        int tempMax = generatedArray[0];
        int tempMin = generatedArray[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < generatedArray.length; i++) {

            if (generatedArray[i] > tempMax) {
                tempMax = generatedArray[i];
                maxIndex = i;
            }

            if (generatedArray[i] < tempMin) {
                tempMin = generatedArray[i];
                minIndex = i;
            }
        }

        System.out.println("Index of maximal number in array is " + maxIndex );
        System.out.println("Index of minimal number in array is " + minIndex );

        generatedArray[maxIndex] = tempMin;
        generatedArray[minIndex] = tempMax;

        utils.printArray(generatedArray);

    }
}
