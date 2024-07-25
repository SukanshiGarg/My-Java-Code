// This code demonstrates multi-level inheritance in Java by creating a child class instance,
// invoking its method, and observing the constructor calls in the inheritance hierarchy.

package MultiLevel_Inheritence_Demo;

public class test {

    public static void main(String[] args) {
        child ch = new child();
        System.out.println(ch.hasSuperPowers());

        // Expected output:
        // This is the grandparent constructor!
        // false

        child ch1 = new child();
        ch1.setName("Sukanshi Garg");
        ch1.setAge(20);
        
        String name=ch1.getName();
        int age=ch1.getAge();
        System.out.println("The child's name is : "+ name);
        System.out.println("The child's age is "+ age);

        ch1.childMethod();



    }
}
