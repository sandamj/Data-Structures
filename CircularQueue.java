package DataStructures;

public class CircularQueue {
     int maxSize;
     int[] queueArray;
     int front;
     int rear;

    public CircularQueue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = -1;
        rear = -1;
    }

    public void enqueue(int item) {
        if (isEmpty()) {
            front = 0;
            rear = 0;
            queueArray[rear] = item;
        } else {
            rear = (rear + 1) % maxSize;
            if (rear == front) {
                System.out.println("Queue is full. Cannot enqueue.");
                rear = (rear - 1 + maxSize) % maxSize;
            } else {
                queueArray[rear] = item;
            }
        }
    }

    public int dequeue() {
        int item = -1;
        if (!isEmpty()) {
            item = queueArray[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % maxSize;
            }
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
        }
        return item;
    }

    public int peek() {
        if (!isEmpty()) {
            return queueArray[front];
        } else {
            System.out.println("Queue is empty. No peek value.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public static void main(String[] args) {
        CircularQueue c = new CircularQueue(5);
        c.enqueue(9);
        c.enqueue(8);
        c.enqueue(7);

        System.out.println("Peek: " + c.peek());
        System.out.println("Dequeue: " + c.dequeue());
        System.out.println("Peek after dequeue: " + c.peek());
        
    }
}


