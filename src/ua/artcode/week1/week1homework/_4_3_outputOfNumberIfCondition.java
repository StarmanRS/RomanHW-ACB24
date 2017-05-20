package ua.artcode.week1.week1homework;

/**
 * Created by Lucas_Starman on 15.05.2017.
 */

//4.3. Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело.

import ua.artcode.MethodsContainer;

public class _4_3_outputOfNumberIfCondition {
    public static void main(String[] args) {

        int num = MethodsContainer.inputValueFromConsoleInt("Please input any positive number: ");

        if (num % 7 == 0) {
            System.out.println(num * 2);
        } else {
            System.out.println("Input number can't be devided by 7 without rest.");
        }
    }
}
