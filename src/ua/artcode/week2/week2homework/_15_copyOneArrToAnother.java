package ua.artcode.week2.week2homework;

/**
 * Created by Lucas_Starman on 23.05.2017.
 */

/*15) Заданы два массива одинаковой длинны с любыми значениями, скопировать данные из первого массива во второй*/

public class _15_copyOneArrToAnother {
    public static void main(String[] args) {

        int[] array1 = {-78, 0, 56, -5, 47, 23, 1};

        System.out.println("First array:");
        ua.artcode.utils.printArray(array1);

        int[] array2 = new int[7];

        System.out.println("Second array as is:");
        ua.artcode.utils.printArray(array2);

        for (int i = 0; i < array1.length; i++) {

            array2[i] = array1[i];

        }

        System.out.println("Second array after copy from first:");
        ua.artcode.utils.printArray(array2);

    }
}
