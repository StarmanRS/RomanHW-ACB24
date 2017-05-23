package ua.artcode.week2.week2homework;

/**
 * Created by Lucas_Starman on 22.05.2017.
 */

/*3)Найдите количество четных цифр данного натурального числа.*/

public class _03_evenDigitsQuantity {
    public static void main(String[] args) {

        //random number generation
        int num = (int) (Math.random() * Math.pow(10, 6));
        System.out.println("Generated number is " + num);

        //generated int to string
        String snum = num + "";

        int counter = 0;

        //outer loop is for string element iteration
        for (int i = 0; i < snum.length(); i++) {
/*            //inner loop is for check for accordance with even symbol
            for (int j = 0; j <= 8; j += 2) {
                if (!((snum.charAt(i) + "").equals("0")) && (snum.charAt(i) + "").equals(j + "")) {
                    counter++;
                    break;
                }
            }*/
            if (!(String.valueOf(snum.charAt(i)).equals("0")) &&
                 (String.valueOf(snum.charAt(i)).equals("2") ||
                  String.valueOf(snum.charAt(i)).equals("4") ||
                  String.valueOf(snum.charAt(i)).equals("6") ||
                  String.valueOf(snum.charAt(i)).equals("8"))) {
                counter++;
            }

        }

        System.out.println("Amount of even digits in generated number is " + counter);

    }
}
