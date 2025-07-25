package inhertanceConcepts;

class Animal {
    void sound() {
        System.out.println("The animal makes a sound");
    }
 }
class Dog extends Animal {
    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println("The dog barks");
    }
 }
public class SingleInheritance {

	public static void main(String[] args) {
	   
	        Animal myAnimal = new Animal();  // Create an Animal object
	        Animal myDog = new Dog();        // Create a Dog object
	        
	        myAnimal.sound();  // Outputs: The animal makes a sound
	        myDog.sound();     // Outputs: The dog barks
     	}

	}