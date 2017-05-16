package ua.artcode.week1.day1;

import java.util.Scanner;

public class _03realDay1WeightRecomendation {
    public static void main(String[] args) {

        int height, weight;
        int coef = 100;

        Scanner input = new Scanner(System.in);

        System.out.println("Please, input your height in centimeters: ");
        height = input.nextInt();

        System.out.println("Please, input your weight in kilos: ");
        weight = input.nextInt();

        if (weight > height - coef) {
            System.out.println("You have to loose some weight, kabanina!!!");
        } else if (weight < height - coef){
            System.out.println("Take care, bratha, you are too thin!!!");
        } else {
            System.out.println("Your weight is perfect, keep on!!!");
        }
    }
}
