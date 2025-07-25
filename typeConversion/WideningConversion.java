package typeConversion;

public class WideningConversion {

    public static void main(String[] args) {
        int numInt = 150;
        long numLong = numInt;       // int to long
        float numFloat = numLong;    // long to float

        System.out.println("Integer value: " + numInt);
        System.out.println("Long value: " + numLong);
        System.out.println("Float value: " + numFloat);
    }
}
