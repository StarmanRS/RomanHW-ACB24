package ua.artcode.week1.week1homework;

/**
 * Created by Lucas_Starman on 15.05.2017.
 */

//4.4. Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1

import ua.artcode.MethodsContainer;

public class _4_4_ifNumberBetween0and1 {
    public static void main(String[] args) {

        float num = MethodsContainer.inputValueFromConsoleFloat("Please input any number with floating point: ");

        if (0.0 <= num && num <= 1.0) {
            System.out.println("Input number is between 0 and 1");
        } else {
            System.out.println("Input number is out of range");
        }

    }
}

//чому не можна написати умову просто як (0.0 <= num <= 1.0) без логічного і???
//як розмежувати або чи можна вводити числа з крапкою з консолі?