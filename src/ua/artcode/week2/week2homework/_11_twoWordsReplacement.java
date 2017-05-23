package ua.artcode.week2.week2homework;

/**
 * Created by Lucas_Starman on 23.05.2017.
 */

/*11)Реализовать метод, который меняет местами слова в строке, состоящей из двух слов.*/

public class _11_twoWordsReplacement {
    public static void main(String[] args) {

        String text = "firstWord secondWord";
        System.out.println("Original text is: " + text);

        text = wordsReplacement(text);

        System.out.println("Text after words replacement: " + text);

    }

    public static String wordsReplacement(String textOfTwoWords) {

        String[] wordsArray = textOfTwoWords.split(" ");
        textOfTwoWords = wordsArray[1] + " " + wordsArray[0];

        return textOfTwoWords;
    }

}
