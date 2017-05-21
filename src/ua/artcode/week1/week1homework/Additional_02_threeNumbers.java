package ua.artcode.week1.week1homework;

import java.util.Scanner;

/**
 * Created by Lucas_Starman on 21.05.2017.
 */

/*2) Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
тельные заменить на 0.*/

public class Additional_02_threeNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please input first number");
        int num1 = cubic(scan.nextInt());

        System.out.println("Please input second number");
        int num2 = cubic(scan.nextInt());

        System.out.println("Please input third number");
        int num3 = cubic(scan.nextInt());

        //int num1 = scan.nextInt();
        // num1 > 0 ? num1 = Math.pow(num1, 3) : num1 = num1 * 1;   що тут не так, що невірно записано в умові?????

        System.out.println(num1 + " " + num2 + " " + num3);

    }

    public static int cubic(int num) {
        if (num > 0) {
            num = num * num * num;
            return  num;
        } else {
            return num = 0;
        }
    }

}
