package imp_concepts;

public class StaticVsInstanceDemo {
    
    // Static variable (shared by all instances)
    static int staticCounter = 0;

    // Instance variable (unique for each object)
    int instanceCounter = 0;

    // Constructor increments both counters
    public StaticVsInstanceDemo() {
        staticCounter++;
        instanceCounter++;
    }

    // Static method (can only access static members directly)
    static void showStatic() {
        System.out.println("Inside static method.");
        System.out.println("Static Counter: " + staticCounter);
        // System.out.println("Instance Counter: " + instanceCounter); // ❌ Not allowed
    }

    // Instance method (can access both static and instance members)
    void showInstance() {
        System.out.println("Inside instance method.");
        System.out.println("Static Counter: " + staticCounter);
        System.out.println("Instance Counter: " + instanceCounter);
    }

    public static void main(String[] args) {
        StaticVsInstanceDemo obj1 = new StaticVsInstanceDemo();
        StaticVsInstanceDemo obj2 = new StaticVsInstanceDemo();

        System.out.println("--- Static Method Call ---");
        StaticVsInstanceDemo.showStatic(); // Call static method using class name

        System.out.println("\n--- Instance Method Call ---");
        obj1.showInstance(); // Call instance method on obj1
        obj2.showInstance(); // Call instance method on obj2
    }
}
