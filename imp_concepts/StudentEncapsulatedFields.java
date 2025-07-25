package imp_concepts;

public class StudentEncapsulatedFields {
    // 🔒 Encapsulated fields (private)
    private String name;
    private int rollNumber;
    private double percentage;

    // ✅ Public getter and setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ✅ Public getter and setter for rollNumber
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        if (rollNumber > 0) {
            this.rollNumber = rollNumber;
        } else {
            System.out.println("Invalid Roll Number!");
        }
    }

    // ✅ Public getter and setter for percentage
    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        if (percentage >= 0 && percentage <= 100) {
            this.percentage = percentage;
        } else {
            System.out.println("Invalid percentage!");
        }
    }

    // Instance method to display student info
    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Percentage: " + percentage + "%");
    }
}
