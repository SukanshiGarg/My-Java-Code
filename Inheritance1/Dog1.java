// This code demonstrates inheritance in Java by creating a Dog1 class that extends an Animal class,
// setting properties on a Dog1 instance, and calling methods inherited from Animal and overridden in Dog1.



package Inheritance1;

public class Dog1 extends Animal {
    @Override
    public void sayHello() {
        System.out.println("Woof");
    }

    public static void main(String[] args) {
        Dog1 obj = new Dog1();

        obj.setName("Oreo");                        // Set the name of the Dog1 instance
        obj.setAge(2);                              // Set the age of the Dog1 instance
        
        // Get and print the name and age of the Dog1 instance
        String name = obj.getName();
        int ageDog = obj.getAge();
        System.out.println("Name: " + name);
        System.out.println("Age: " + ageDog);

        obj.eats();                                       // Call the eats method from the Animal class
        obj.sayHello();                                   // Call the sayHello method overridden in the Dog1 class
    }
}
