package ua.artcode.week2.week2homework;

import java.util.Scanner;

/**
 * Created by Lucas_Starman on 23.05.2017.
 */

/*16) Посчитать колличество букв 'a' в строке (искомый символ может быть разным)*/

public class _16_quantityOfSymbolInRow {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please input your text");
        String text = scan.nextLine();

        System.out.println("Please input one symbol for search");
        String symbol = scan.nextLine();

        int counter = 0;

        for (int i = 0; i < text.length(); i++) {
            if ((text.charAt(i) + "").equals(symbol)) {
                counter += 1;
            }
        }

        System.out.println("Symbol " + "'" + symbol + "'" + " appears " + counter + " time in this text.");

    }
}
