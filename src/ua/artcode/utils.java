package ua.artcode;

/**
 * Created by Lucas_Starman on 20.05.2017.
 */
public class utils {

    public static void printArray(int[] numbers) {
        System.out.print("[ ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }

    public static void printArray(String[] numbers) {
        System.out.print("[ ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }

    public static void printArray(double[] numbers) {
        System.out.print("[ ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }

    public static int[] generateArray(int size, int from, int to) {

        to++;

        int[] tempArray = new int[size];

        for (int i = 0; i < size; i++) {
            tempArray[i] = (int) (Math.random() * (to - from) + from);
        }
        return tempArray;
    }

    public static int[] generateArrayIntFromTo (int from, int to) {

        int[] tempArray = new int[(to - from) + 1];

        for (int i = 0; i < tempArray.length ; i++) {
            tempArray[i] = from;
            from += 1;
        }
        return  tempArray;
    }

    public static double[] generateArrayDouble(int size, int from, int to) {

        to++;

        double[] tempArray = new double[size];

        for (int i = 0; i < size; i++) {
            tempArray[i] = Math.random() * (to - from) + from;
        }
        return tempArray;
    }
}
