package basic_concepts;

class Student {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
public class Class_Object_Structure 
{
	    public static void main(String[] args) 
	    {
	        Student s1 = new Student();
	        s1.name = "Alice";
	        s1.age = 20;
	        s1.displayInfo();
	    }
	
	
}
