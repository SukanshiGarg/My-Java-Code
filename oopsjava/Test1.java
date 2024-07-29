package oopsjava;

public class Test1 {
    public static void main(String[] args) {
        String a = "Vipul";
        System.out.println(upper(a));
        System.out.println(a);
    }
    public static String  upper(String str) {
        return str.toUpperCase();
    }
    
}
//strings are immutable 
//Since strings are immutable in Java, calling toUpperCase() on a does not change the original string.
// a copy of a is passed to string str 



/*
 Key Points
Immutability of Strings: Strings in Java are immutable, 
meaning once a String object is created, 
it cannot be modified. 
Any method that seems to modify a string actually creates a new string.

Pass-by-Value:

Like all objects in Java,
 when you pass a string to a method,
  you are passing a reference to the object,
   but the reference itself is passed by value. 
The original reference remains unchanged in the calling method.
 */
