package exercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;

public class CountingCharacters {

    public static void main(String[] args) throws IOException {

        Path filePath = Path.of("D:/", "LaunchCodeStuff", "java-practice", "Intro-and-setup", "java-web-dev-exercises", "src", "exercises", "myString");

        String myString = Files.readString(filePath);

        char[] myStringCharacters = myString.toLowerCase().toCharArray();

        HashMap<Character, Integer> characterMap = new HashMap<>();

        characterMap.put('a', 0);
        characterMap.put('b', 0);
        characterMap.put('c', 0);
        characterMap.put('d', 0);
        characterMap.put('e', 0);
        characterMap.put('f', 0);
        characterMap.put('g', 0);
        characterMap.put('h', 0);
        characterMap.put('i', 0);
        characterMap.put('j', 0);
        characterMap.put('k', 0);
        characterMap.put('l', 0);
        characterMap.put('m', 0);
        characterMap.put('n', 0);
        characterMap.put('o', 0);
        characterMap.put('p', 0);
        characterMap.put('q', 0);
        characterMap.put('r', 0);
        characterMap.put('s', 0);
        characterMap.put('t', 0);
        characterMap.put('u', 0);
        characterMap.put('v', 0);
        characterMap.put('w', 0);
        characterMap.put('x', 0);
        characterMap.put('y', 0);
        characterMap.put('z', 0);

        for(char character : myStringCharacters) {

            if(characterMap.containsKey(character)) {

                characterMap.put(character, characterMap.get(character) + 1);
            }
        }

        for (char i : characterMap.keySet()) {
            System.out.println("key: " + i + " value: " + characterMap.get(i));
        }
    }
}
