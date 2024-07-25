// This code demonstrates inheritance in Java by creating a Dog class that extends an Animal class,
// setting properties on a Dog instance, and calling methods inherited from Animal.

package Inheritance1;

public class Dog extends Animal {
    
    public static void main(String[] args) {
        
        Dog obj1 = new Dog(); // Create an instance of Dog
        obj1.setName("Indie Dog"); // Set the name of the Dog instance
        obj1.setAge(2); // Set the age of the Dog instance
        obj1.eats(); // Call the eats method from the Animal class
        obj1.sayHello(); // Call the sayHello method from the Animal class
    }
    
}
