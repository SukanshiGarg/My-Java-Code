package Queues;
import java.util.*;
public class A6ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        System.out.println(st);
        reverse(st);
        System.out.println(st);


    }
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            System.out.println("the stack is empty");
            return;
        }
        int x= st.pop();
        reverse(st);

        insert(st,x);

    }

    public static void insert(Stack<Integer> st, int item){
        //base condition jesi hit hofi ham apna ITEM insert kar denge
        if(st.isEmpty()){
            st.push(item);
            return;
        }
        else{
            //remove the top element and insert at bottom
            int top = st.pop();
            //call recursively
            insert(st,item);
            //Push the removed item back to the top 
            st.push(top);
        }
    }
    
}
