package inhertanceConcepts;

class Employee {
    String name;
    void work() {
        System.out.println(name + " is working...");
    }
}

class Programmer extends Employee {
    void code() {
        System.out.println(name + " is coding.");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        p.name = "Swapnika";
        p.work();
        p.code();
    }
}
