package DataStructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class FIFOQueueUsinfDeque<E> {
private Deque<E> deque;
	
	
	//Constructor to initialize the queue
	public FIFOQueueUsinfDeque() {
		deque = new ArrayDeque<>();
	}
	
	//Method to add element
	public void enqueue(E element) {
		deque.addLast(element);
	}
	
	//Method to remove element
	public E dequeue() {
		if(isEmpty()) {
			throw new NoSuchElementException("Queue is empty.");
		}
		return deque.removeFirst();
	}
	
	public boolean isEmpty() {
		return deque.isEmpty();
	}
	
	public E peek() {
		if(isEmpty()) {
			throw new NoSuchElementException("Queue is empty.");
		}
		return deque.peek();
	}
	
	public int size() {
		return deque.size();
	}
	
	public static void main(String[] args) {
		FIFOQueueUsinfDeque<Integer> q = new FIFOQueueUsinfDeque<>();
		
		q.enqueue(4);
		q.enqueue(6);
		q.enqueue(8);

		
		System.out.println("Dequeued element: " +q.dequeue());
		System.out.println("Dequeued element: " +q.dequeue());
		
		System.out.println("Peek element: " +q.peek());
		System.out.println("Size of the Queue: " +q.size());
		
		q.enqueue(9);
		
		System.out.println("Dequeued element: " +q.dequeue());
		System.out.println("Dequeued element: " +q.dequeue());
		
		System.out.println("Queue is empty: " +q.isEmpty());

	}
	

}
