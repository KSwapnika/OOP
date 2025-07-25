package accessModifiers;

public class ClassB {
    public void display() {
        ClassA obj = new ClassA();
        // System.out.println(obj.privateVar); // ❌ Not accessible
        System.out.println("defaultVar = " + obj.defaultVar);     // ✔️ Same package
        System.out.println("protectedVar = " + obj.protectedVar); // ✔️ Same package
        System.out.println("publicVar = " + obj.publicVar);       // ✔️ Always accessible
    }
}
