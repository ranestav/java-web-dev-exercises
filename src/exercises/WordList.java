package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class WordList {

    public static ArrayList<String> words = new ArrayList<>();

    public static void main(String[] args) {

        words.add("fffff");
        words.add("eeeee");
        words.add("vvvvv");
        words.add("ddddd");
        words.add("sda");
        words.add("asda");
        words.add("wert");
        words.add("mmmmm");
        words.add("ergerghe");
        words.add("qasfhewrhjtyr");
        words.add("ferbsdfbwserghwser");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word length: ");
        int length = input.nextInt();

        for(String word : words) {

            if(word.length() == length) {

                System.out.println(word);
            }
        }
    }
}
