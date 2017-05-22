package ua.artcode.week2.week2homework;

/**
 * Created by Lucas_Starman on 20.05.2017.
 */
public class calculator {
    public static void main(String[] args) {

        System.out.println("Hello in Calculator application!");

        while (true) {

            //greeting
            System.out.println("Are you planning to do something here? 0 / 1");

            //user intentions reading from console, simple check for correct input, kick off back to start if not
            int userChoice = ua.artcode.MethodsContainer.inputValueFromConsoleIntNoMessage();

            if (userChoice == 0) {
                System.out.println("Good bye");
                break;
            }

            if (userChoice != 1) {
                System.out.println("Wrong input");
                continue;
            }

            //operand1 reading from console, operations menu sout
            int operand1 = ua.artcode.MethodsContainer.inputValueFromConsoleInt("Please, input fist operand");

            System.out.println("Please choose the operation by its number:");
            System.out.println("1 - +");
            System.out.println("2 - -");
            System.out.println("3 - *");
            System.out.println("4 - /");

            //operation index chosen by user reading form console, simple check for correct input, kick off back to start if not
            int operation = ua.artcode.MethodsContainer.inputValueFromConsoleIntNoMessage();

            if (operation != 1 && operation != 2 && operation != 3 && operation != 4) {
                System.out.println("Wrong input");
                continue;
            }

            //operand2 reading from console
            int operand2 = ua.artcode.MethodsContainer.inputValueFromConsoleInt("Please, input second operand");

//            int result = 0;

            //chosen operation performing using method (not very effective method - but just for method creation experience )
            operation(operand1, operand2, operation);

        }
    }

    public static void resultMessage (int result) {
        //just for sout repeating row
        System.out.println("The result of choosed operation is: " + result);
    }

    public static void operation(int oper1, int oper2, int operationNumber) {
        //just for method creation experience
        int result = 0;
        switch (operationNumber) {
            case 1:
                result = oper1 + oper2;
                resultMessage(result);
                break;
            case 2:
                result = oper1 - oper2;
                resultMessage(result);
                break;
            case 3:
                result = oper1 * oper2;
                resultMessage(result);
                break;
            case 4:
                result = oper1 / oper2;
                resultMessage(result);
                break;
        }
    }
}
