package ua.artcode.week1homework;

/**
 * Created by Lucas_Starman on 15.05.2017.
 */

//4.6. Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19

import ua.artcode.utils.MethodsContainer;

public class _4_6_outSumOfTwoIfInRange {
    public static void main(String[] args) {

        int num1 = MethodsContainer.inputValueFromConsoleInt("Please input first number");
        int num2 = MethodsContainer.inputValueFromConsoleInt("Please input second number");
        int sum = num1 + num2;

        if (sum > 11 && sum <=19){
            System.out.println("Sum of two input numbers is " + sum);
        } else {
            System.out.println("There's no result.");
        }
    }
}
