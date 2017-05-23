package ua.artcode.week2.week2homework;

import java.util.Scanner;

/**
 * Created by Lucas_Starman on 22.05.2017.
 */

/*8)Составить расписание на неделю.
Пользователь вводит порядковый номер дня недели и у него на экране отображается то, что запланировано на этот день.*/

public class _08_weekSchedule {
    public static void main(String[] args) {

        //schedule creation
        String monday = "1) get up 2) go to work 3) go home";
        String tuesday = "1) vacation";
        String wednesday = "1) go shopping 2) go fishing";
        String thursday = "1) biking 2) go to work";
        String friday = "1) swimming";
        String saturday = "1) sleep 2) Forsage";
        String sunday = "1) sleep 2) Kalinki-Malinki";

        Scanner scan = new Scanner(System.in);

        out:

        while (true) {

            System.out.println("Please enter number of the day of the week form 1 to 7");

            int dayNum = scan.nextInt();

            switch (dayNum) {
                case 1:
                    System.out.println("Here is the schedule for the " + dayNum + " day" + " of the week " + "(Monday)");
                    System.out.println(monday + "\n");
                    break;
                case 2:
                    System.out.println("Here is the schedule for the " + dayNum + " day" + " of the week " + "(Tuesday)");
                    System.out.println(tuesday + "\n");
                    break;
                case 3:
                    System.out.println("Here is the schedule for the " + dayNum + " day" + " of the week " + "(Wednesday)");
                    System.out.println(wednesday + "\n");
                    break;
                case 4:
                    System.out.println("Here is the schedule for the " + dayNum + " day" + " of the week " + "(Thursday)");
                    System.out.println(thursday + "\n");
                    break;
                case 5:
                    System.out.println("Here is the schedule for the " + dayNum + " day" + " of the week " + "(Friday)");
                    System.out.println(friday + "\n");
                    break;
                case 6:
                    System.out.println("Here is the schedule for the " + dayNum + " day" + " of the week " + "(Saturday)");
                    System.out.println(saturday + "\n");
                    break;
                case 7:
                    System.out.println("Here is the schedule for the " + dayNum + " day" + " of the week" + "(Sunday)");
                    System.out.println(sunday + "\n");
                    break;
                default:
                    System.out.println("Wrong input" + "\n");
            }


            while (true) {

                System.out.println("Do you want to view schedule for any other day, 0/1?");
                int answer = scan.nextInt();

                if (answer == 0) {
                    System.out.println("Good bye!");
                    break out;
                } else if (answer != 1) {
                    System.out.println("Wrong input" + "\n");
                } else {
                    System.out.println();
                    break;
                }
            }
        }

    }
}
