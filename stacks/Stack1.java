package stacks;

public class Stack1 {
    private int[] arr;
    private int idx = -1;  // Index of the top element, initialized to -1 (empty stack)

    // Default constructor: Initializes stack with size 5
    public Stack1() {
        arr = new int[5];
    }

    // Constructor with parameter: Initializes stack with custom size
    public Stack1(int n) {
        arr = new int[n];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return idx == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return idx == arr.length - 1;
    }

    // Method to push an element onto the stack
    // Time complexity: O(1)
    public void push(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Stack overflow");  // Throw exception if stack is full
        }
        idx++;
        arr[idx] = item;
    }

    // Method to pop the top element from the stack
    // Time complexity: O(1)
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack underflow");  // Throw exception if stack is empty
        }
        int poppedItem = arr[idx];
        idx--;
        return poppedItem;
    }

    // Method to peek at the top element of the stack without removing it
    // Time complexity: O(1)
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");  // Throw exception if stack is empty
        }
        return arr[idx];
    }

    // Method to get the current size of the stack
    // Time complexity: O(1)
    public int size() {
        return idx + 1;
    }

    // Method to display all elements in the stack
    // Time complexity: O(n)
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= idx; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method for testing the Stack1 class
    public static void main(String[] args) {
        try {
            Stack1 stack = new Stack1(5);

            stack.push(10);
            stack.push(20);
            stack.push(30);

            stack.display();  // Output: 10 20 30

            System.out.println("Popped element: " + stack.pop());  // Output: Popped element: 30

            System.out.println("Peeked element: " + stack.peek());  // Output: Peeked element: 20

            System.out.println("Is stack empty? " + stack.isEmpty());  // Output: Is stack empty? false

            System.out.println("Stack size: " + stack.size());  // Output: Stack size: 2
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
