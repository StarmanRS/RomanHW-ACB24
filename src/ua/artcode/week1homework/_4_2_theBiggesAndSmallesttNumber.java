package ua.artcode.week1homework;

/**
 * Created by Lucas_Starman on 14.05.2017.
 */

//4.2. Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее

import ua.artcode.utils.MethodsContainer;

public class _4_2_theBiggesAndSmallesttNumber {
    public static void main(String[] args) {

        int num1, num2, num3;
        int maxNum = 0;
        int minNum = 0;
        //boolean condition = true;

        System.out.println("Please, input three numbers.");

        num1 = MethodsContainer.inputValueFromConsoleInt("First: ");
        num2 = MethodsContainer.inputValueFromConsoleInt("Second: ");
        num3 = MethodsContainer.inputValueFromConsoleInt("Third: ");

        //Just for check of input:
        System.out.println(num1 + " " + num2 + " " + +num3);

        //greatest number check
        if (num1 >= num2 && num1 >= num3) {
            maxNum = num1;
        }
        if (num2 >= num1 && num2 >= num3) {
            maxNum = num2;
        }
        if (num3 >= num1 && num3 >= num2) {
            maxNum = num3;
        }

        //smallest number check
        if (num1 <= num2 && num1 <= num3) {
            minNum = num1;
        }
        if (num2 <= num1 && num2 <= num3) {
            minNum = num2;
        }
        if (num3 <= num1 && num3 <= num2) {
            minNum = num3;
        }

/*      // var 2
        switch(condition){
            case num1 < num2 && num1 < num3: minNum = num1;
            break;
            case num2 < num1 && num2 < num3: minNum = num1;
            break;
            case num3 < num1 && num3 < num2: minNum = num1;
            break;
        }
*/
        messageForUser(maxNum, "greatest");
        messageForUser(minNum, "smallest");

    }

    // method declaration for message
    public static String messageForUser(int message, String description) {
        System.out.println("Number " + message + " is the " + description + " among input");
        return null;
    }
}

/* Питання, що виникли:
- чому switch(true){
case1: не приймає як умову num1 < num2 && num1 < num3
???

- що таке assigned value is never used??????
}
*/