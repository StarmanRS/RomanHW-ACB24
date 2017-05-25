package ua.artcode.week2.week2homework;

/**
 * Created by Lucas_Starman on 22.05.2017.
 */

/*4)Найдите наибольшую цифру данного натурального числа.(109042 -> 9)*/

public class _04_maxDigit {
    public static void main(String[] args) {

        //random number generation
        int num = (int) (Math.random() * Math.pow(10, 7));
        System.out.println("Generated number is " + num);

        //generated int to string
        String snum = String.valueOf(num);
        String[] snumArr = snum.split("");

        int maxDigit = 0;

        //outer loop is for string element iteration
        for (int i = 0; i < snum.length(); i++) {
                if (Integer.valueOf(snumArr[i]) > maxDigit) {
                    maxDigit = Integer.valueOf(snumArr[i]);
                }

                if (maxDigit == 9) break;
        }

        System.out.println("The biggest digit in number is " + maxDigit);

    }
}

/*        //random number generation
        int num = (int) (Math.random() * Math.pow(10, 7));
        System.out.println("Generated number is " + num);

        //generated int to string
        String snum = num + "";

        int maxDigit = 0;

        //outer loop is for string element iteration
        for (int i = 0; i < snum.length(); i++) {
            //inner loop is for check max symbol
            for (int j = 0; j <= 9 ; j ++ ) {
                if ( (snum.charAt(i) + "").equals(j + "") && j > maxDigit ) {
                    maxDigit = j;
                    break;
                }
            }
        }

        System.out.println("The biggest digit in number is " + maxDigit);*/