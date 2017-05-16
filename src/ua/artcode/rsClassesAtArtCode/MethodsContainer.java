package ua.artcode.rsClassesAtArtCode;

/**
 * Created by Lucas_Starman on 14.05.2017.
 */

import java.util.Scanner;

public class MethodsContainer {
    public static void main(String[] args) {

    }
    public static int inputValueFromConsoleInt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }

    public static float inputValueFromConsoleFloat(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextFloat();
    }

    public static String inputValueFromConsole(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

}
