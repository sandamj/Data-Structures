package DataStructures;

import java.util.ArrayList;

public class StackUsingArrayList {
	
	private ArrayList<Integer> stack;
	
	public StackUsingArrayList() {
		stack = new ArrayList<Integer>();
	}
	
	public void push(Integer a) {
		stack.add(a);
	}
	
	public Integer pop() {
		if(stack.size() ==0) {
			System.out.println("Stack is empty.");
		}
		return stack.remove(stack.size()-1);
	}

	public Integer peek() {
		if(stack.size() ==0) {
			System.out.println("Stack is empty");
		}
		return stack.get(stack.size()-1);
	}
	
	public boolean isEmpty() {
		return (stack.size() ==0);
	}
	
	public int size() {
		return stack.size();
	}
	
	public String toString() {
		return ""+stack.toString();
	}
	
	public static void main(String[] args) {
		StackUsingArrayList list = new StackUsingArrayList();
		
		list.push(15);
		list.push(32);
		list.push(6);
		list.push(11);
		list.push(65);
		
		System.out.println("Stack is: "+list);
		System.out.println("Stack size is: " +list.size());
		
		System.out.println("Peek operation: "+list.peek());
		System.out.println("Stack after peek operation: "+list);
		
		System.out.println("pop operation: "+list.pop());
		System.out.println("Stack after peek operation: "+list);
		
		System.out.println("Is the stack empty: "+list.isEmpty());
		
		
		
	}

}
