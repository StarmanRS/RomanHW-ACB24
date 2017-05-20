package ua.artcode.week1.week1homework;

/**
 * Created by Lucas_Starman on 15.05.2017.
 */

//4.5. Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел. Если второе больше, то выводим сумму.

import ua.artcode.MethodsContainer;

public class _4_5_biggerSmallerNumber {
    public static void main(String[] args) {

        float num1 = MethodsContainer.inputValueFromConsoleFloat("Please input first number");
        float num2 = MethodsContainer.inputValueFromConsoleFloat("Please input second number");

        if (num1 > num2){
            System.out.println("Result of subtraction number2 from number1: " + (num1 - num2));
        } else {
            System.out.println("Result of sum number1 and number2: " + (num1 + num2));
        }
    }
}

//Чому вилітають ексепшени, якщо ввести число з точкою???
