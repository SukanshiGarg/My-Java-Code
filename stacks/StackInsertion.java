package stacks;
import java.util.*;

public class StackInsertion {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println(st);  // Prints the stack before insertion
        Insert(st, -6);          // Inserting -6 into the stack
        System.out.println(st);  // Prints the stack after insertion
    }

    public static void Insert(Stack<Integer> st, int item) {
        if (st.isEmpty()) {
            st.push(item);      // Base case: if stack is empty, push the item
            return;
        }
        int x = st.pop();       // Recursive case: pop the top element
        Insert(st, item);       // Recursively insert the item
        st.push(x);             // Push the popped element back onto the stack
    }
}

