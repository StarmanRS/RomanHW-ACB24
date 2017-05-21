package ua.artcode.week1.week1homework;

/**
 * Created by Lucas_Starman on 21.05.2017.
 */

/*1) Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
лить, является ли он прямоугольным. Ответ вывести в виде сообщения.*/

public class Additional_01_ifRectangular {
    public static void main(String[] args) {

        int side1 = ua.artcode.MethodsContainer.inputValueFromConsoleInt("Please input 1st side size of the triangle");
        int side2 = ua.artcode.MethodsContainer.inputValueFromConsoleInt("Please input 2nd side size of the triangle");
        int side3 = ua.artcode.MethodsContainer.inputValueFromConsoleInt("Please input 3rd side size of the triangle");

        if (sidesCompare(side1, side2, side3) || sidesCompare(side2, side1, side3) || sidesCompare(side3, side1, side2)) {
            System.out.println("Your triangle is priamougolnii )))");
        } else {
            System.out.println("Your triangle is not rectangular");
        }

    }

    public static boolean sidesCompare(int side1, int side2, int side3) {
        if (Math.pow(side1,2) == Math.pow(side2,2) + Math.pow(side3,2)) {
            return true;
        } else {
            return false;
        }
    }

}
