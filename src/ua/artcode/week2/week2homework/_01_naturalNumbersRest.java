package ua.artcode.week2.week2homework;

/**
 * Created by Lucas_Starman on 22.05.2017.
 */

/*1)Даны натуральные числа от 35 до 87. Вывести на консоль те из них, которые при делении на 7 дают остаток 1, 2 или 5.*/

public class _01_naturalNumbersRest {
    public static void main(String[] args) {

        //numbers check and print using loop

        for (int i = 35; i <= 87; i++) {

            if (i % 7 == 1 || i % 7 == 2 || i % 7 == 5) {
                System.out.print(i + " ");
            }

        }

    }
}
