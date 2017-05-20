package ua.artcode.week2.day1;

import java.util.Scanner;

/**
 * Created by Lucas_Starman on 20.05.2017.
 */
public class _02_Task_Two_Nums {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please input anysymbol 1");
        String v1 = sc.nextLine();
        System.out.println("Please input anysymbol 2");
        String v2 = sc.nextLine();

        if (v1.length() != v2.length()) {
            System.out.println("Not equals");
            return;
        }

        for (int i = 0; i < v1.length(); i++) {
            if (v1.charAt(i) != v2.charAt(i)) {
                System.out.println("Not equals");
                return;
            }
        }

        System.out.println("Equals");
        return;

    }
}
