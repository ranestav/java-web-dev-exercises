package exercises;

import java.util.Scanner;

public class MPG {

    public static void main(String[] args) {

        Scanner milesInput = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double miles = milesInput.nextDouble();

        Scanner gasInput = new Scanner(System.in);
        System.out.println("How much gas have you used, in gallons?");
        double gas = gasInput.nextDouble();

        double milesPerGallon = miles / gas;

        System.out.println("You are getting " + milesPerGallon + " miles per gallon.");
    }
}
