package basic_concepts;

import java.util.Scanner;

public class StudentDetails {

   public static void main(String[] args) {
        
        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Accept student details
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter gender (M/F): ");
        char gender = scanner.next().charAt(0);

        System.out.print("Enter percentage: ");
        double percentage = scanner.nextDouble();

        // Display formatted output
        System.out.println("\n--- Student Details ---");
        System.out.printf("Name       : %s%n", name);
        System.out.printf("Roll No    : %d%n", rollNumber);
        System.out.printf("Age        : %d years%n", age);
        System.out.printf("Gender     : %c%n", gender);
        System.out.printf("Percentage : %.2f%%%n", percentage);

        // Close the scanner
        scanner.close();
    }
}
