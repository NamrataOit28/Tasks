import java.util.Scanner;
interface QueueOperations {
    void enqueue(int element);
    int dequeue();
    void display();
    boolean isEmpty();
    boolean isFull();
}

class MyQueue implements QueueOperations {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;

    public MyQueue(int size) {
        maxSize = size;
        front = 0;
        rear = 0;
        queueArray = new int[maxSize];
    }
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + element);
            return;
        }
        queueArray[rear] = element;
        rear = (rear + 1) % maxSize;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int element = queueArray[front];
        front = (front + 1) % maxSize;
        return element;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int i = front;
        while (i!= rear) {
            System.out.print(queueArray[i] + " ");
            i = (i + 1) % maxSize;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }
}

public class Queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the queue:");
        int size = scanner.nextInt();
        MyQueue queue = new MyQueue(size);

        while (true) {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to enqueue:");
                    int element = scanner.nextInt();
                    queue.enqueue(element);
                    break;
                case 2:
                    int dequeuedElement = queue.dequeue();
                    if (dequeuedElement!= -1) {
                        System.out.println("Dequeued element: " + dequeuedElement);
                    }
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}