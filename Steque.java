package DataStructures;

public class Steque<Item>{
	private Node first;
	private Node last;
	
	private class Node{
		Item item;
		Node next;
		
	}
	
	//Create an empty steque
	public Steque() {
		first = null;
		last = null;
	}
	
	//push item
	public void push(Item item) {
		Node oldfirst = first;
		Node first = new Node();
		first.item = item;
		first.next = oldfirst;
		if(last == null)
			last = first;
	}

	// pop element
	 public Item pop() {
	        if (isEmpty()) throw new RuntimeException("Steque underflow");
	        Item item = first.item;
	        first = first.next;
	       
	        return item;
	    }
	
	boolean isEmpty() {
		return first==null || last == null;
	}
	
	//enqueue element
	public void enqueue(Item item) {
        Node oldlast = last;
        Node last = new Node();
        last.item = item;
        last.next = null;
        if (first == null)
        	first = last;
        else 
        	oldlast.next =last;
    }
	
	public static void main(String[] args) {
		Steque<Integer> steque = new Steque<>();
        steque.push(5);
        steque.push(6);
        steque.push(7);
        steque.enqueue(3);
        

      
        System.out.println("Popped item: " + steque.pop());

        while (!steque.isEmpty()) {
	        System.out.println(steque.pop());
	    }
        }

	}



