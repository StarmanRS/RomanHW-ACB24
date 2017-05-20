package ua.artcode.week1.week1homework;

/**
 * Created by Lucas_Starman on 16.05.2017.
 */

import ua.artcode.MethodsContainer;

//4.7. Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем результат деления (целую часть от деления  и остачу)
//в другом случае выводим false и показываем результат деления (целую часть от деления  и остачу)

public class _4_7_twoNumbersDivision {
    public static void main(String[] args) {

        int num1 = MethodsContainer.inputValueFromConsoleInt("Please input first number");
        int num2 = MethodsContainer.inputValueFromConsoleInt("Please input second number");
        boolean marker = false;

        if (num1 % num2 == 0) {
            marker = true;
            messageForUser(marker, num1, num2);

        } else if (num2 % num1 == 0) {
            marker = true;
            messageForUser(marker, num2, num1);

        } else if (num1 % num2 != 0) {
            marker = false;
            messageForUser(marker, num1, num2);

        } else if (num2 % num1 != 0) {
            marker = false;
            messageForUser(marker, num2, num1);
        }

    }

    public static void messageForUser(boolean marker, int num1, int num2) {
        System.out.println("Condition is " + marker);
        System.out.println("Entire part of division is " + num1 / num2);
        System.out.println("The rest of division is " + num1 % num2);
    }
}

//чому залишок від ділення меньшого на більше = діленому???
//2-га частина умови завдання неоднозначна..