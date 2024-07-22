package Queuess;

public class QueueClient {
    public static void main(String[] args) {
        QueueImplementation.Queue1 queue = new QueueImplementation.Queue1(5);

        System.out.println("Enqueuing elements:");
        queue.Enqueue(10);
        queue.Enqueue(20);
        queue.Enqueue(30);
        queue.Enqueue(40);
        queue.Enqueue(50);
        queue.Enqueue(60); // This should show "Queue is Full"

        System.out.println("Queue contents after enqueuing:");
        queue.Display();

        System.out.println("Dequeue an element: " + queue.dequeue());
        System.out.println("Queue contents after dequeuing:");
        queue.Display();

        System.out.println("Front element: " + queue.getFront());

        System.out.println("Queue size: " + queue.size());

        System.out.println("Dequeue all elements:");
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }

        System.out.println("Queue contents after dequeuing all elements:");
        queue.Display();
    }
}
