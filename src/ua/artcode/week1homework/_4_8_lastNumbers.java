package ua.artcode.week1homework;

/**
 * Created by Lucas_Starman on 16.05.2017.
 */

/*
4.8. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
			124    4    -   true
			1456   567  -   false
			1      2    -   false
			18     98   -   true
*/

import ua.artcode.utils.MethodsContainer;

public class _4_8_lastNumbers {
    public static void main(String[] args) {

        int num1 = MethodsContainer.inputValueFromConsoleInt("Please input first number");
        int num2 = MethodsContainer.inputValueFromConsoleInt("Please input second number");

        if ( num1 > 10 ) {
            num1 = num1 % 10;
        }
        if ( num2 > 10 ) {
            num2 = num2 % 10;
        }
        if (num1 > num2) {
            System.out.println(num1 + " > " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " < " + num2);
        } else {
            System.out.println(num1 + " = " + num2);
        }

    }
}

// чому вона не матюкається на 2 нулі?? Як може 0 < 0 бути? якщо не прописати умову з рівністю?? %)