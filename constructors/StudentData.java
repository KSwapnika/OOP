package constructors;

//Usage of Constructors "All types of Constructors"
public class StudentData {
    // Fields
    private String name;
    private int rollNumber;
    private int[] marks;

    // Default Constructor
    public StudentData() {
        name = "Unknown";
        rollNumber = 0;
        marks = new int[]{0, 0, 0};  // Default 3 subjects with 0 marks
        System.out.println("Default constructor called");
    }

    // Parameterized Constructor
    public StudentData(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        System.out.println("Parameterized constructor called");
    }

    // Overloaded Constructor (name and roll number only)
    public StudentData(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = new int[]{0, 0, 0};  // Assume default marks
        System.out.println("Overloaded constructor called");
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        // Using Default Constructor
        StudentData s1 = new StudentData();
        s1.displayDetails();

        // Using Parameterized Constructor
        int[] marksArray = {85, 90, 88};
        StudentData s2 = new StudentData("Alice", 101, marksArray);
        s2.displayDetails();

        // Using Overloaded Constructor
        StudentData s3 = new StudentData("Bob", 102);
        s3.displayDetails();
    }
}
