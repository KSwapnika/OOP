package operatorPrecedance;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept three numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        // Calculate average using a single expression
        double average = (num1 + num2 + num3) / 3;

        // Display the result
        System.out.println("The average is: " + average);

        scanner.close();
    }
}
