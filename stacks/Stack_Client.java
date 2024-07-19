package stacks;
import java.util.*;
public class Stack_Client {
    public static void main(String[] args) throws Exception {
        Stack1 s = new Stack1();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s.peek());
        s.display();
        // System.out.println(s.pop());
        // s.Display();
        s.push(50);
        s.display();

        s.push(60) ; //index out of bound exception becuz length=5 
    }
    
}
