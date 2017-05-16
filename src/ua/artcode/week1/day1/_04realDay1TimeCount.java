package ua.artcode.week1.day1;

import java.util.Scanner;

public class _04realDay1TimeCount {
    public static void main(String[] args) {

        int distance, velocity, hour, minute, second ;

        Scanner input = new Scanner(System.in);

        System.out.println("Please, input distance in meters: ");
        distance = input.nextInt();
        System.out.println("Please, input velocity in m by s: ");
        velocity = input.nextInt();

        //just for the better undrstanding


        second = distance / velocity;
        //second is an equivalent of spent time

        if (second < 60){
            hour = 0;
            minute = 0;
        } else if (second >= 60 && second < 3600) {
            hour = 0;
            minute = second / 60;
            second = second % 60;
        } else {
            hour = second / 3600;
            minute = (second % 3600) / 60;
            second = second % 60;
        }

        System.out.println("Time you'll need to pass this distance is: " + hour + " hour, " + minute + " minutes, "  + second + " seconds");
    }
}
