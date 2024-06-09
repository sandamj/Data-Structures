package DataStructures;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class FIFOQueueUsingArrayList<E> {

	private ArrayList<E> list;
	
	
	//Constructor to initialize the queue
	public FIFOQueueUsingArrayList() {
	list = new ArrayList<>();
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
		return list.remove(0);
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public int size() {
		return list.size();
	}
	
	public static void main(String[] args) {
		FIFOQueueUsingArrayList<Integer> q = new FIFOQueueUsingArrayList<>();
		
		q.enqueue(5);
		q.enqueue(4);
		q.enqueue(3);
		q.enqueue(2);
		q.enqueue(1);
		
		System.out.println("Dequeued element: " +q.dequeue());
		System.out.println("Dequeued element: " +q.dequeue());
		
		System.out.println("Size of the Queue: " +q.size());
		System.out.println("Queue is empty: " +q.isEmpty());

	}

}
