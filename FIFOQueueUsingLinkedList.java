package DataStructures;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class FIFOQueueUsingLinkedList<E> {
private LinkedList<E> list;
	
	
	//Constructor to initialize the queue
	public FIFOQueueUsingLinkedList() {
	list = new LinkedList<>();
	}
	
	//Method to add element
	public void enqueue(E element) {
		list.add(element);
	}
	
	//Method to remove element
	public E dequeue() {
		if(isEmpty()) {
			throw new NoSuchElementException("Queue is empty.");
		}
		return list.removeFirst();
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public int size() {
		return list.size();
	}
	
	public static void main(String[] args) {
		FIFOQueueUsingLinkedList<Integer> q = new FIFOQueueUsingLinkedList<>();
		
		q.enqueue(6);
		q.enqueue(7);
		q.enqueue(8);

		
		System.out.println("Dequeued element: " +q.dequeue());
		System.out.println("Dequeued element: " +q.dequeue());
		
		System.out.println("Size of the Queue: " +q.size());
		
		q.enqueue(9);
		
		System.out.println("Dequeued element: " +q.dequeue());
		System.out.println("Dequeued element: " +q.dequeue());
		
		System.out.println("Queue is empty: " +q.isEmpty());

	}




}
