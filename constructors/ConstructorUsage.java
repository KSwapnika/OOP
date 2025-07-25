package constructors;

class Book {
    String title;
    int pages;
    // Default Constructor
    Book(){
    	System.out.println("Iam in Default Construtor");
    }
    // parameterized Constructor
    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    void show() {
        System.out.println("Title: " + title + ", Pages: " + pages);
    }
}

public class ConstructorUsage {
	    public static void main(String[] args) {
	    	Book b0 = new Book();
	        Book b1 = new Book("Java Basics", 250);
	        b1.show();
	    }
}

