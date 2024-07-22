package Queues;
// do without using extra stack
import java.util.Stack;
public class A5InsertAtBottomOfStack{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);

        System.out.println(st);
        insert(st,-9);
        System.out.println(st);
    }
    public static void insert(Stack<Integer> st, int item){
        //base condition 
        if(st.isEmpty()){
            st.push(item);
            return;
        }
        //Pop all the elements from the stack one by one
        int top = st.pop();

        //recursively insert the item at the bottom
        insert(st,item);

        //push all the popped elements back onto the stack 
        st.push(top);
    
    }

    

}
