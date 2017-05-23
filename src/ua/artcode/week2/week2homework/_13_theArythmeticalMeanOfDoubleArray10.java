package ua.artcode.week2.week2homework;

/**
 * Created by Lucas_Starman on 23.05.2017.
 */

/*13)Найдите среднее арифметическое массива из 10 элементов типа double.*/

public class _13_theArythmeticalMeanOfDoubleArray10 {
    public static void main(String[] args) {

        System.out.println("Here is generated array of doubles");

        double[] array = ua.artcode.utils.generateArrayDouble(10, 20, 30);
        ua.artcode.utils.printArray(array);

        double sumOfArrElements = 0;

        for (int i = 0; i < array.length; i++) {
            sumOfArrElements += array[i];
        }

        double arythMean = sumOfArrElements / array.length;

        System.out.println("The arythmetical mean of array elements is: " + arythMean);
    }
}
