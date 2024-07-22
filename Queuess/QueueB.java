package Queuess;

public class QueueB {

    static class Queue {
        static int arr[];
        static int size;
        static int front;
        static int rear;

        //constructor 
        Queue(int n){
            arr= new int [n];
            size=n;
            rear=-1;
        }

        public static boolean isEmpty() {
            return rear==-1;}

        //add
        public static void add(int data){
            //check if the queue is already full
            if(rear==arr.length-1){
                System.out.println("Queue is already full");
            }
            rear=rear+1;
            arr[rear]=data;
        }
        //remove
        public static int remove(){
            //underflow
            if(rear == -1){
                System.out.println("The queue is empty ");
                return -1;
            }
           else{

            int frontItem= arr[front]; // get the front element
            front++;
            if(front>rear){
                front =0;
                rear=-1;
            }
            return frontItem;
           }
        }
        //peek
        public static int peek(){
            if(rear==-1){
                System.out.println("The queue is empty ");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String args[]){
        Queue q= new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

    }
    
}
