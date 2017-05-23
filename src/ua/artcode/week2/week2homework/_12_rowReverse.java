package ua.artcode.week2.week2homework;

/**
 * Created by Lucas_Starman on 23.05.2017.
 */

/*12)Реализовать метод, который делает реверс строки (StringBuffer не использовать)*/

public class _12_rowReverse {
    public static void main(String[] args) {

        String row = "We need to realize reverse of this row";
        System.out.println("Original text row is: " + row);

        row = rowReverse(row);

        System.out.println("Reversed row is: " + row);

    }

    private static String rowReverse(String row) {

        String newRow = "";

        for (int i = row.length() - 1; i >= 0; i--) {
            newRow = newRow + row.charAt(i);
        }

        return newRow;
    }
}

// reverse look like German ))