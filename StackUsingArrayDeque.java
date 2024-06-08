package DataStructures;

import java.util.ArrayDeque;
import java.util.Stack;

public class StackUsingArrayDeque<T> {
	private Stack<T> stack;
	
	public boolean isEmpty() {
		return (stack.size() ==0);
	}
	

	public static void main(String[] args) {
		ArrayDeque<Integer> dq = new ArrayDeque<>();
		
		dq.add(3);
		dq.add(7);
		dq.addFirst(5);
		dq.addFirst(6);
		dq.addLast(1);
		
		dq.pop();
		
		System.out.println("Array deque is: "+dq);
		System.out.println("Last element is: " +dq.getLast());
		System.out.println("Array size is: "+dq.size());
		System.out.println("Popped element is: " +dq.pop());
		
		 

	}

}
