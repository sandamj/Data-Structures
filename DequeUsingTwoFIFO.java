package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class DequeUsingTwoFIFO {
	Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

   // Push an element to the front of the deque
   public void pushFront(int element){
       q1.add(element);
   }

   // Push an element to the back of the deque
   public void pushBack(int element){
       q2.add(element);
   }

   // Pop an element from the front of the deque
   public int popFront(){
	   if(isEmpty()) {
		   System.out.println("Deque is empty.");
       return (Integer) null;
   }
	   if (q1.isEmpty()) {
           while (q2.isEmpty()) {
               q1.add(q2.poll());
           }
       }
       return q1.poll();
   
   }

   private boolean isEmpty() {
	   return false;
}

// Pop an element from the back of the deque
   public int popBack(){
	   if (isEmpty()) {
           System.out.println("Deque is empty. Cannot remove from rear.");
           return (Integer) null;
       }
       if (q2.isEmpty()) {
           while (!q1.isEmpty()) {
               q2.add(q1.poll());
           }
       }
       return q2.poll();
   }
   
   
   public int size(){
       return q1.size() + q2.size()  ;
   }

   public static void main(String[] args){
       DequeUsingTwoFIFO deque = new DequeUsingTwoFIFO();
       deque.pushBack(9);
       deque.pushBack(8);
       deque.pushFront(5);
       deque.pushFront(6);
      
       System.out.println("Popped element from front: " + deque.popFront()); 
       System.out.println("Popped element from back: " + deque.popBack()); 
       System.out.println("Size of deque after popping: " + deque.size());
   }
	

	}


