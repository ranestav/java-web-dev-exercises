package exercises;

public class ArrayPractice {

    public static int[] arr = {1, 1, 2, 3, 5, 8};

    public static void main(String[] args) {

        for(int i : arr) {

            if(i % 2 != 0) {

                System.out.println(i);
            }
        }
    }

}
