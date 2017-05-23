package ua.artcode.week2.week2homework;

/**
 * Created by Lucas_Starman on 23.05.2017.
 */

/*10) Найти слово, стоящее в тексте под номером 3 и вывести его первую букву.
        (Example: Hello world and you!
    			text.split( ) -> return array of words)*/

public class _10_thirdWordSearch {
    public static void main(String[] args) {

        String text = "Everything will be fine";
        System.out.println("The text is: " + text);

        String[] array = text.split(" ");

        System.out.println("The third word in the text is: " + array[2]);
        System.out.println("It's first letter is: " + array[2].charAt(0));

    }
}
