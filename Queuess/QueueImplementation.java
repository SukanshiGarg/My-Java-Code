package Queuess;

public class QueueImplementation {

    public static class Queue1{
        private int[] arr;
        private int front = 0;
        private int rear =0 ;
        private int size=0;

        public Queue1(){
            arr= new int [5];
        }

        public Queue1 (int n){
           arr= new int [n];
        }
        public boolean isEmpty()
        {
            return size ==0 ;
        }
        public boolean isFull(){
            return size == arr.length;
        }
        public void Enqueue(int item){
            if (isFull()){
                System.out.println("Queue is Full");
                return;
            }
            arr[rear]= item;
            rear++;
            size++;
        }
        public int size(){
            return size;
        }

        public int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty ");
                return -1;
            }
            int frontElement = arr[front];
            for(int i=front ; i< size-1; i++){
                arr[i]=arr[i+1];
            }
            rear--;
            size--;
            return frontElement;
        }

        public void Display(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return;
            }
            for(int i=front ; i< rear;i++){
                System.out.print(arr[i]+ " ");

            }
            System.out.println();

        }

        public int getFront(){
            if(isEmpty()){
                System.out.println("the queue is empty");
                return -1;
            }
            return arr[front];
        }



    }
}
