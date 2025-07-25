package anotherPackage;

import accessModifiers.ClassA;

public class ClassC extends ClassA {
    public void show() {
        // System.out.println(privateVar);     // ❌ Not accessible
        // System.out.println(defaultVar);     // ❌ Not accessible (package-private)
        System.out.println("protectedVar = " + protectedVar); // ✔️ Accessible via inheritance
        System.out.println("publicVar = " + publicVar);       // ✔️ Always accessible
    }
}
