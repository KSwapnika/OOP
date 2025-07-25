package typeConversion;

import java.util.Scanner;

public class NarrowingConversion {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double value: ");
        double numDouble = scanner.nextDouble();

        int numInt = (int) numDouble; // Explicit casting

        System.out.println("Original double value: " + numDouble);
        System.out.println("After casting to int: " + numInt);

        scanner.close();
    }
}
