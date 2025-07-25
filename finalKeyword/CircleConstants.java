package finalKeyword;

import java.util.Scanner;

public class CircleConstants {
    public static void main(String[] args) {
        final double PI = 3.14159;  // constant using final keyword

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;

        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);

        scanner.close();
    }
}
