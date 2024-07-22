package Queues;

public class A3CircularQueue {
    public static class Queue{
        private int []arr;
        private int front=0;
        private int rear=0;
        private int size=0;

        public Queue()
        {    //default constructor
            arr=new int[5];
        }

        public Queue(int n)
        {  //constructor
            arr=new int[n];
        }
        public boolean isEmpty(){
            return size==0;
        }
        public boolean isFull(){
            return size==arr.length;
        }
        public void enqueue(int item) throws Exception{
            if(isFull()){
                throw new Exception("Bklol Queue full h ");
            }
            int idx= (front+size)% arr.length;
            arr[idx]=item;
            size++;
        }

        public int size(){
            return size;
        }

        public int dequeue() throws Exception{
            if(isEmpty()){
                     throw new Exception("Queue khali hai ");
            }
            int frontElement=arr[front];
            front=(front+1) % arr.length;
            size--;
            return frontElement;
        }
        public int GetFront() {
            int rv = arr[front];
    
            return rv;
        }
    
        public void Display() {
            for (int i = 0; i < size; i++) {
                int idx = (front + i) % arr.length;
                System.out.print(arr[idx] + " ");
    
            }
        }
    }

}