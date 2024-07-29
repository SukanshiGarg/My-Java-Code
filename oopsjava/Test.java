package oopsjava;

public class Test {
    public static void main(String args[]) {
        int x = 10; // Step 1: Declare and initialize variable x
        System.out.println(multiplyBy10(x)); // Step 2: Call multiplyBy10 and print the result   o/p: 100
        System.out.println(x); // Step 3: Print the value of x    o/p: 10
    }

    public static int multiplyBy10(int x) {
        return x * 10; // Multiply the argument by 10 and return the result
    }
}
