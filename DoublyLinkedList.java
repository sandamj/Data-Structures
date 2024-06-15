package DataStructures;

public class DoublyLinkedList {

	  //Inner Node class
    private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    //Insert a new node at the beginning.
    public void insertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    //Insert a new node at the end.
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        newNode.prev = last;
    }

    //Insert a new node in the middle.
    public void insertMiddle(int data, int position) {
        if (position <= 1) {
            insertBeginning(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            insertEnd(data);
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

    //Delete a node from the beginning.
    public void deleteFront() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
    }

    //Delete a node from the end.
    public void deleteEnd() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        if (last.prev != null) {
            last.prev.next = null;
        } else {
            head = null;
        }
    }

    //Delete a node from the middle.
    public void deleteMiddle(int position) {
        if (head == null || position <= 1) {
            deleteFront();
            return;
        }

        Node current = head;
        for (int i = 1; i < position && current != null; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            deleteEnd();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

   
    //Display the output
    public void display() {
        Node current = head; 
        while (current != null) {
            System.out.print(current.data + ",");
            current = current.next;
        }
        System.out.println(" ");
    }
    
    
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		
		list.insertBeginning(9);
		list.insertBeginning(8);
		
		list.insertEnd(7);
		list.insertEnd(5);
		
		list.insertMiddle(4,3);
		list.insertMiddle(6, 4);
		
		System.out.print("List after adding elements: ");
		list.display();
		
		System.out.println("List after deleting front element: ");
		list.deleteFront();
		list.display();
		
		System.out.println("List after deleting end element: ");
		list.deleteEnd();
		list.display();
		
		System.out.print("List after deleting elements: ");
		list.display();
	}

	}


