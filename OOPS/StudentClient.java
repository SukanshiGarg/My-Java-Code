package OOPS;

public class StudentClient {

    public static void main(String[] args) {
        // Creating an instance of Student
        Student s = new Student();
        
        // Accessing and printing initial values (null for name, 0 for age)
        System.out.println(s.name);  // Output: null
        System.out.println(s.age);   // Output: 0
        
        // Setting values for name and age
        s.name = "Sukanshi Garg";
        s.age = 19;
        
        // Calling Intro_yourSelf() method
        s.Intro_yourSelf();  // Output: Hello, my name is Sukanshi Garg and I am 19 years old.
        
        // Creating another instance of Student
        Student s1 = new Student();
        
        // Setting values for name and age for s1
        s1.name = "Priyansh Garg";
        s1.age = 21;
        
        // Calling Intro_yourSelf() method for s1
        s1.Intro_yourSelf();  // Output: Hello, my name is Priyansh Garg and I am 21 years old.
    }
}
