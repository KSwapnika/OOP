package bufferreaders;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try {
            // Create BufferedReader object to read from standard input
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Read a string
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            // Read an integer
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());

            // Read a double
            System.out.print("Enter your percentage: ");
            double percentage = Double.parseDouble(reader.readLine());

            // Display the values
            System.out.println("\n--- Output ---");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Percentage: " + percentage);
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
            e.printStackTrace();
        }
    }
}
