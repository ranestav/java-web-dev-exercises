package exercises;

import java.util.ArrayList;

public class ArrayListPractice {

    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        int sum = 0;

        for(int num : numbers) {

            if(num % 2 == 0) {

                sum += num;
            }
        }
        System.out.println(sum);
    }
}
