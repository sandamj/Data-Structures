package DataStructures;

public class CircularQueue<T> {
     private int capacity;
	    private Object[] queue;
	    private int front;
	    private int rear;
	    private int size;

	    public CircularQueue(int capacity) {
	        this.capacity = capacity;
	        this.queue = new Object[capacity];
	        this.front = 0;
	        this.rear = -1;
	        this.size = 0;
	    }

	    public void enqueue(T item) {
	        if (isFull()) {
	            System.out.println("Queue is full.");
	            return;
	        }
	        rear = (rear + 1) % capacity;
	        queue[rear] = item;
	        size++;
	    }

	    public T dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	            return null;
	        }
	        T removedItem = (T) queue[front];
	        front = (front + 1) % capacity;
	        size--;
	        return removedItem;
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }

	    public boolean isFull() {
	        return size == capacity;
	    }

	    public int size() {
	        return size;
	    }


    public static void main(String[] args) {
    	CircularQueue<Integer> q = new CircularQueue<>(5);
        q.enqueue(15);
        q.enqueue(17);
        q.enqueue(19);
        q.enqueue(21);
        q.enqueue(23);
        //q.engueue(25); Can't enqueue because the queue is full

        
        System.out.println("Circular Queue is: " +q);
        System.out.println("Dequeued item: " + q.dequeue());
        System.out.println("Dequeued item: " + q.dequeue());
        System.out.println("Front item: " + q.dequeue());
        System.out.println("Is queue empty? " + q.isEmpty());
    }
}


