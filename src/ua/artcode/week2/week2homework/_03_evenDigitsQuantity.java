package ua.artcode.week2.week2homework;

/**
 * Created by Lucas_Starman on 22.05.2017.
 */

/*3)Найдите количество четных цифр данного натурального числа.*/

public class _03_evenDigitsQuantity {
    public static void main(String[] args) {


        int num = (int) (Math.random() * Math.pow(10, 6));  //random number generation
        System.out.println("Generated number is " + num);   //for visual check

        String snum = String.valueOf(num);  //generated int to string
        String[] tempArr = snum.split("");

        int counter = 0;

        for (int i = 0; i < snum.length(); i++) {   //loop for check each element

                if ((Integer.valueOf(tempArr[i]) != 0) && (Integer.valueOf(tempArr[i]) % 2 == 0)) { //if digit !=0 && %2==0 counter++

                    counter++;
            }
        }

        System.out.println("Amount of even digits in generated number is " + counter);

    }
}
