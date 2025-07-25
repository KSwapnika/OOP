package staticKeyword;

class Counter {
    static int count = 0; // shared among all objects

    Counter() {
        count++;
        System.out.println("Count is: " + count);
    }
}
public class StaticMembers {
	    public static void main(String[] args) {
	        new Counter();
	        new Counter();
	        new Counter();
	    }
	
}


