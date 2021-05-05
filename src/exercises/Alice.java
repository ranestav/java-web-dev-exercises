package exercises;

import java.util.Scanner;

public class Alice {

    public static String alice = "Alice was beginning to get very tired of " +
            "sitting by her sister on the bank, and of having nothing to do: " +
            "once or twice she had peeped into the book her sister was reading, " +
            "but it had no pictures or conversations in it, 'and what is the use of a book,' " +
            "thought Alice 'without pictures or conversation?";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a search term: ");
        String search = input.nextLine();

        if(alice.toLowerCase().contains(search.toLowerCase())) {
            System.out.println("Search term was found!");
            System.out.println("the index of " + search + " is " + alice.indexOf(search));
            System.out.println("the length of " + search + " is " + search.length());
            String newAlice = alice.replace(search, "");
            System.out.println(newAlice);

        } else {
            System.out.println("Search term was not found.");
        }
    }
}
