import java.util.LinkedList;
import java.util.Queue;

public class QueueInsertDelete {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        enqueueElement(queue, 10);
        enqueueElement(queue, 20);
        enqueueElement(queue, 30);

        displayQueue(queue);

        dequeueElement(queue);
        dequeueElement(queue);

        displayQueue(queue);
    }

    private static void enqueueElement(Queue<Integer> queue, int element) {
        System.out.println("Enqueuing element: " + element);
        queue.add(element);
    }

    private static void dequeueElement(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
            System.out.println("Dequeuing element: " + queue.poll());
        }
    }

    private static void displayQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue elements: " + queue);
        }
    }
}
