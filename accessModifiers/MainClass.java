package accessModifiers;

import anotherPackage.ClassC;

public class MainClass {
    public static void main(String[] args) {
        ClassA objA = new ClassA();
        objA.showAccess();

        ClassB objB = new ClassB();
        objB.display();

        ClassC objC = new ClassC();
        objC.show();
    }
}
