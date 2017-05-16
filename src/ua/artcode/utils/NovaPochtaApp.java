package ua.artcode.utils;

/**
 * Created by Lucas_Starman on 14.05.2017.
 */
import java.util.Objects;
import java.util.Scanner;

public class NovaPochtaApp {
    public static void main(String[] args) {

        //init post data
        // at least 3 products codes
        // codes init
        // products names init
        String code1 = "fg89", code2 = "yu64", code3 = "ojo9";
        String product1 = "table", product2 = "wheel", product3 = "bottle";

        Scanner input = new Scanner(System.in);

        System.out.println("Please, input your code: ");

        //input or init user code
        String userCode = input.nextLine();


        //compare products with user code
        //thus Strings cannot be compaerd correctly () we have to use other methods
        if (Objects.equals(userCode, code1) || userCode.equals(code2) || userCode.equals(code3) ) {
            System.out.print("Your package is at the stock, please receive your ");
                if (userCode.equals(code1)){
                    System.out.println(product1 + ".");
                } else if (userCode.equals(code2)) {
                    System.out.println(product2 + ".");
                } else if (userCode.equals(code3)){
                    System.out.println(product3 + ".");
            }
        } else {
            System.out.println("Your package on the other stok yet");
        }


    }

    //examples of methods creation
    public static String getSuccessMessage(String c, String n){
        String message = "Your code is " + c + ", product is " + n;
        return message;
    }
    //message для того, щоб написати "Введіть значення" в консолі
    public static String inputValueFromConsole(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
