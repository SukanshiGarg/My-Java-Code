package Queues;

public class A4CircularQueueClient {
    public static void main(String[] args) throws Exception {
        A3CircularQueue.Queue q = new A3CircularQueue.Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.Display(); //output : 10 20 30 40 50

        System.out.println();


        System.out.println(" Dequeued : "+ q.dequeue()); 
        q.Display();

        System.out.println();


        q.enqueue(60);
        q.Display();

        System.out.println();

        System.out.println(q.GetFront());}}
