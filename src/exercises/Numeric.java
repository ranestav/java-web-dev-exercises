package exercises;

import java.util.Scanner;

public class Numeric {

    public static void main(String[] args) {

        Scanner lengthInput = new Scanner(System.in);
        System.out.println("Please enter the length of a rectangle: ");
        double length = lengthInput.nextDouble();

        Scanner widthInput = new Scanner(System.in);
        System.out.println("Please enter the width of the rectangle: ");
        double width = widthInput.nextDouble();

        double area = length * width;

        System.out.println("The area of your rectangle is " + area);
    }
}
