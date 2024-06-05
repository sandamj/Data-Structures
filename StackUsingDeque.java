package DataStructures;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingDeque {
	Deque<Integer> stack = new ArrayDeque<>();;
	
	public void push(int value) {
		stack.addFirst(value);
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty.");
		}
		return stack.removeFirst();
	}
	public int top() {
		if(isEmpty()) {
			System.out.println("Stack is Empty.");
		}
		return stack.peek();
	
	}
	
	public boolean isEmpty(){
		return stack.isEmpty();
	}

	public int size() {
		return stack.size();
	}
	
	public static void main(String[] args) {
		StackUsingDeque stack = new StackUsingDeque();
        stack.push(15);
        stack.push(23);
        stack.push(21);
        stack.push(11);
        stack.push(33);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack size after popping: " + stack.size());
      

	}

}
