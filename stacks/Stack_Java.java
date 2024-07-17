package stacks;
import java.util.*;
public class Stack_Java {
    public static void main(String[] args) {
       Stack<Integer> st = new Stack<>();
       st.push(10);
       st.push(20);
       st.push(30);
       st.push(40 );
       st.push(50);
       st.push(60);
       st.push(70);

       System.out.println(st.peek());
       System.out.println(st);
       System.out.println(st.pop());
       System.out.println(st);
       System.out.println(st.isEmpty());
       System.out.println(st.size());
        
    }
    
}
/*
 package stacks;

import java.util.*;

public class Stack_Java {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> st = new Stack<>();
        
        // Push elements onto the stack
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);

        // Print the element at the top of the stack without removing it (peek)
        System.out.println(st.peek());  // Output: 70
        
        // Print the entire stack
        System.out.println(st);  // Output: [10, 20, 30, 40, 50, 60, 70]
        
        // Remove and return the element at the top of the stack (pop)
        System.out.println(st.pop());  // Output: 70
        
        // Print the stack after popping an element
        System.out.println(st);  // Output: [10, 20, 30, 40, 50, 60]
        
        // Check if the stack is empty
        System.out.println(st.isEmpty());  // Output: false
        
        // Get the size of the stack
        System.out.println(st.size());  // Output: 6
    }
}

 */
