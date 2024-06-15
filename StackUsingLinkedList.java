package DataStructures;

public class StackUsingLinkedList {
	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public class Stack{
		private Node top;
		
		public Stack() {
			this.top = null;
		}
		
		//push a new element on top
		public void push(int data) {
			Node newNode = new Node(data);
			newNode.next = top;
			top = newNode;
		}
		
		//pop an element
		public int pop() {
			if(isEmpty()) {
				System.out.println("Stack is empty");
			}
			int data = top.data;
			top = top.next;
			return data;
		}
		
		//peek the top element
		public int peek() {
			if(isEmpty()) {
				System.out.println("Stack is empty ");
			}
			return top.data;
		}
		
		public boolean isEmpty() {
			return top == null;
		}
		
		//print the stack element
		public void printStack() {
			Node current = top ;
			while(current != null) {
				System.out.print(current.data + " ");
				current = current.next;
			}
			System.out.println(" ");
		}
	}
	
	

	public static void main(String[] args) {
		StackUsingLinkedList stackInstance = new StackUsingLinkedList();
		Stack stack = stackInstance.new Stack();
		
		stack.push(9);
		stack.push(8);
		stack.push(7);
		
		System.out.println("Stack after pushes: ");
        stack.printStack();
        
        System.out.println("Peek top element: " + stack.peek());
        
        System.out.println("Pop element: " + stack.pop()); 
        System.out.println("Pop element: " + stack.pop());
        
        System.out.println("Is stack empty? " + stack.isEmpty());
	}


	}



	

