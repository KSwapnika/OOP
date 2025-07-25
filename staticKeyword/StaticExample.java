package staticKeyword;

class Student {
    int id;
    String name;
    static String college;

    static {
        college = "KLH University"; // static block to initialize static variable
    }

    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Alice");
        Student s2 = new Student(2, "Bob");
        s1.display();
        s2.display();

        Student.changeCollege("XYZ University");
        s1.display();
        s2.display();
    }
}
