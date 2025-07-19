package basic_concepts;

import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();  // Accepts both integer and decimal inputs

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the scanner
        scanner.close();
    }
}
