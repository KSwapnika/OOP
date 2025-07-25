package accessModifiers;

public class ClassA {

    private int privateVar = 1;
    int defaultVar = 2;           // (default)
    protected int protectedVar = 3;
    public int publicVar = 4;

    public void showAccess() {
        System.out.println("Inside ClassA:");
        System.out.println("privateVar = " + privateVar);
        System.out.println("defaultVar = " + defaultVar);
        System.out.println("protectedVar = " + protectedVar);
        System.out.println("publicVar = " + publicVar);
    }
}
