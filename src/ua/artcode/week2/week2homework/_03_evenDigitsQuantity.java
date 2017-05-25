package ua.artcode.week2.week2homework;

/**
 * Created by Lucas_Starman on 22.05.2017.
 */

/*3)Найдите количество четных цифр данного натурального числа.*/

public class _03_evenDigitsQuantity {
    public static void main(String[] args) {

        //random number generation
        int num = (int) (Math.random() * Math.pow(10, 6));
        System.out.println("Generated number is " + num);

        //generated int to string
        String snum = String.valueOf(num);

        int counter = 0;

        for (int i = 0; i < snum.length(); i++) {

            if ((((int) snum.charAt(i)) != 0) && ((int) snum.charAt(i) % 2 == 0)) {
                System.out.println(snum.charAt(i)); //for visual check
                System.out.println(snum.charAt(i)!=0 ); //for visual check
// чому пропускає 0 як парну, якщо я виключаю його першою умовою іфа ????
                counter++;
            }
        }

        System.out.println("Amount of even digits in generated number is " + counter);

    }
}
