package imp_concepts;

public class TestingEncapsulationMain {
    public static void main(String[] args) {
        StudentEncapsulatedFields student = new StudentEncapsulatedFields();

        // Setting values using setters
        student.setName("Swapnika");
        student.setRollNumber(101);
        student.setPercentage(87.5);

        // Getting and displaying values using getters
        student.displayStudentInfo();

        // Trying to set invalid percentage
        student.setPercentage(120);  // Will show error message
    }
}
